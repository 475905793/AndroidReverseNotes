package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class aqg extends btd {
    public ato vLK;
    public lm vLL;
    public bdu vLM;
    public String wuf;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(28494);
        b bVar;
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(28494);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            if (this.wuf != null) {
                aVar.e(2, this.wuf);
            }
            if (this.vLL != null) {
                aVar.iy(3, this.vLL.computeSize());
                this.vLL.writeFields(aVar);
            }
            if (this.vLK != null) {
                aVar.iy(4, this.vLK.computeSize());
                this.vLK.writeFields(aVar);
            }
            if (this.vLM != null) {
                aVar.iy(5, this.vLM.computeSize());
                this.vLM.writeFields(aVar);
            }
            AppMethodBeat.o(28494);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.wuf != null) {
                ix += e.a.a.b.b.a.f(2, this.wuf);
            }
            if (this.vLL != null) {
                ix += e.a.a.a.ix(3, this.vLL.computeSize());
            }
            if (this.vLK != null) {
                ix += e.a.a.a.ix(4, this.vLK.computeSize());
            }
            if (this.vLM != null) {
                ix += e.a.a.a.ix(5, this.vLM.computeSize());
            }
            AppMethodBeat.o(28494);
            return ix;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(28494);
                throw bVar;
            }
            AppMethodBeat.o(28494);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            aqg aqg = (aqg) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            byte[] bArr;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(aVar4, baseResponse, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        aqg.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(28494);
                    return 0;
                case 2:
                    aqg.wuf = aVar3.BTU.readString();
                    AppMethodBeat.o(28494);
                    return 0;
                case 3:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        lm lmVar = new lm();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = lmVar.populateBuilderWithField(aVar4, lmVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        aqg.vLL = lmVar;
                    }
                    AppMethodBeat.o(28494);
                    return 0;
                case 4:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        ato ato = new ato();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = ato.populateBuilderWithField(aVar4, ato, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        aqg.vLK = ato;
                    }
                    AppMethodBeat.o(28494);
                    return 0;
                case 5:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bdu bdu = new bdu();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bdu.populateBuilderWithField(aVar4, bdu, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        aqg.vLM = bdu;
                    }
                    AppMethodBeat.o(28494);
                    return 0;
                default:
                    AppMethodBeat.o(28494);
                    return -1;
            }
        } else {
            AppMethodBeat.o(28494);
            return -1;
        }
    }
}
