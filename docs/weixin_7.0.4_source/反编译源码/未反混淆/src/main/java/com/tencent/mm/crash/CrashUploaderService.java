package com.tencent.mm.crash;

import android.content.Intent;
import android.os.Build;
import com.facebook.appevents.AppEventsConstants;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.c;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.a.r;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.service.MMIntentService;
import com.tencent.sqlitelint.config.SharePluginInfo;
import com.tencent.ttpic.baseutils.IOUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import junit.framework.Assert;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public class CrashUploaderService extends MMIntentService {
    static final HashMap<String, Integer> ewT;

    public CrashUploaderService() {
        super("CrashUploaderService");
        AppMethodBeat.i(126230);
        if (f.DEBUG) {
            ab.e("MicroMsg.CrashUploaderService", "CrashUploaderService Name : %s", CrashUploaderService.class.getName());
            Assert.assertTrue("CrashUploaderService name mismatch!!!", ".crash.CrashUploaderService".equals(CrashUploaderService.class.getName()));
        }
        AppMethodBeat.o(126230);
    }

    static {
        AppMethodBeat.i(126234);
        HashMap hashMap = new HashMap(16);
        ewT = hashMap;
        hashMap.put("exception", Integer.valueOf(10001));
        ewT.put("anr", Integer.valueOf(10002));
        ewT.put("handler", Integer.valueOf(10003));
        ewT.put(SharePluginInfo.ISSUE_KEY_SQL, Integer.valueOf(10004));
        ewT.put("permission", Integer.valueOf(10005));
        AppMethodBeat.o(126234);
    }

    public final void onHandleIntent(Intent intent) {
        AppMethodBeat.i(126231);
        if (intent == null) {
            AppMethodBeat.o(126231);
            return;
        }
        File file;
        String stringExtra = intent.getStringExtra("INTENT_EXTRA_EXCEPTION_MSG");
        String stringExtra2 = intent.getStringExtra("INTENT_EXTRA_USER_NAME");
        String stringExtra3 = intent.getStringExtra("INTENT_EXTRA_SDCARD_PATH");
        String stringExtra4 = intent.getStringExtra("INTENT_EXTRA_DATA_PATH");
        String stringExtra5 = intent.getStringExtra("INTENT_EXTRA_UIN");
        int i = 0;
        try {
            i = Integer.decode(intent.getStringExtra("INTENT_EXTRA_CLIENT_VERSION")).intValue();
        } catch (Error e) {
        }
        String stringExtra6 = intent.getStringExtra("INTENT_EXTRA_DEVICE_TYPE");
        String stringExtra7 = intent.getStringExtra("INTENT_EXTRA_HOST");
        String stringExtra8 = intent.getStringExtra("INTENT_EXTRA_TAG");
        if (stringExtra8 == null || stringExtra8.length() == 0) {
            stringExtra8 = "exception";
        }
        String str = (stringExtra2 + "," + stringExtra6 + "_" + i + "_" + Build.CPU_ABI + ",") + "exception,time_" + bo.anT() + ",error_" + stringExtra;
        try {
            file = new File(stringExtra3);
            if (file.exists()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (bo.gb(file2.lastModified()) > 2592000000L) {
                            file2.delete();
                        }
                    }
                }
            } else {
                file.mkdirs();
            }
            l(stringExtra3 + "crash_" + new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date()) + ".txt", str, stringExtra5);
        } catch (Exception e2) {
        }
        file = new File(stringExtra4);
        if (!file.exists()) {
            file.mkdir();
        }
        stringExtra = stringExtra4 + stringExtra5;
        File file3 = new File(stringExtra);
        if (file3.length() > 262144) {
            file3.delete();
        }
        l(stringExtra, str, stringExtra5);
        byte[] f = e.f(stringExtra, 0, -1);
        if (bo.cb(f)) {
            AppMethodBeat.o(126231);
            return;
        }
        if (a(stringExtra2, f, i, stringExtra6, stringExtra7, stringExtra8)) {
            file3.delete();
        }
        AppMethodBeat.o(126231);
    }

    private static void l(String str, String str2, String str3) {
        AppMethodBeat.i(126232);
        if (!new File(str).exists()) {
            StringBuilder stringBuilder = new StringBuilder();
            if (bo.isNullOrNil(str3) || str3.equals(AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                stringBuilder.append("uin[" + Integer.toString((Build.DEVICE + Build.FINGERPRINT + Build.MANUFACTURER + Build.MODEL).hashCode()) + "] ");
            } else {
                stringBuilder.append("uin[" + str3 + "] ");
            }
            stringBuilder.append(ab.getSysInfo());
            stringBuilder.append(" BRAND:[" + Build.BRAND + "] ");
            stringBuilder.append(IOUtils.LINE_SEPARATOR_UNIX);
            e.e(str, stringBuilder.toString().getBytes());
        }
        e.e(str, (str2 + IOUtils.LINE_SEPARATOR_UNIX).getBytes());
        AppMethodBeat.o(126232);
    }

    private static boolean a(String str, byte[] bArr, int i, String str2, String str3, String str4) {
        AppMethodBeat.i(126233);
        String toLowerCase = g.x(String.format("weixin#$()%d%d", new Object[]{Integer.valueOf(i), Integer.valueOf(bArr.length)}).getBytes()).toLowerCase();
        byte[] compress = r.compress(bArr);
        PByteArray pByteArray = new PByteArray();
        c.a(pByteArray, compress, toLowerCase.getBytes());
        StringBuilder append = new StringBuilder().append(str3).append("/cgi-bin/mmsupport-bin/stackreport?version=").append(Integer.toHexString(i)).append("&devicetype=").append(str2).append("&filelength=").append(r0).append("&sum=").append(toLowerCase).append("&reporttype=1&NewReportType=").append(bo.h((Integer) ewT.get(str4)));
        if (!(str == null || str.equals(""))) {
            append.append("&username=").append(str);
        }
        try {
            DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost(append.toString());
            ByteArrayEntity byteArrayEntity = new ByteArrayEntity(pByteArray.value);
            byteArrayEntity.setContentType("binary/octet-stream");
            httpPost.setEntity(byteArrayEntity);
            ab.i("MicroMsg.CrashUploaderService", bo.convertStreamToString(defaultHttpClient.execute(httpPost).getEntity().getContent()));
            AppMethodBeat.o(126233);
            return true;
        } catch (Exception e) {
            ab.printErrStackTrace("MicroMsg.CrashUploaderService", e, "", new Object[0]);
            AppMethodBeat.o(126233);
            return false;
        }
    }

    public final String getTag() {
        return "MicroMsg.CrashUploaderService";
    }
}
