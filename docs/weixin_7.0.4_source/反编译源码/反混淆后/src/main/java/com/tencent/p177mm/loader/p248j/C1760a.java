package com.tencent.p177mm.loader.p248j;

import android.os.Build.VERSION;
import android.os.Bundle;
import com.tencent.smtt.sdk.TbsDownloader;

/* renamed from: com.tencent.mm.loader.j.a */
public final class C1760a {
    public static String BUILD_TAG;
    public static String CLIENT_VERSION;
    public static String COMMAND;
    public static String HOSTNAME;
    public static String OWNER;
    public static String PATCH_ENABLED;
    public static String REV;
    public static String SVNPATH;
    public static String TIME;
    public static String eSg = ("android-" + VERSION.SDK_INT);
    public static String eSh;

    /* renamed from: Uk */
    public static String m3621Uk() {
        return eSh == null ? REV : REV + "." + eSh;
    }

    /* renamed from: Ul */
    public static String m3622Ul() {
        return REV;
    }

    /* renamed from: Um */
    public static boolean m3623Um() {
        return !"false".equalsIgnoreCase(PATCH_ENABLED);
    }

    /* renamed from: m */
    public static void m3624m(Bundle bundle) {
        if (bundle != null) {
            PATCH_ENABLED = bundle.getBoolean("com.tencent.mm.BuildInfo.PATCH_ENABLED") ? "true" : "false";
            REV = bundle.getString("com.tencent.mm.BuildInfo.BUILD_REV");
            CLIENT_VERSION = "0x" + Integer.toHexString(bundle.getInt(TbsDownloader.TBS_METADATA));
            TIME = bundle.getString("com.tencent.mm.BuildInfo.BUILD_TIME");
            HOSTNAME = bundle.getString("com.tencent.mm.BuildInfo.BUILD_HOSTNAME");
            BUILD_TAG = bundle.getString("com.tencent.mm.BuildInfo.BUILD_TAG");
            OWNER = bundle.getString("com.tencent.mm.BuildInfo.BUILD_OWNER");
            COMMAND = bundle.getString("com.tencent.mm.BuildInfo.BUILD_COMMAND");
            SVNPATH = bundle.getString("com.tencent.mm.BuildInfo.BUILD_SVNPATH");
        }
    }
}
