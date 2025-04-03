package defpackage;

import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edxj implements edvo {
    private static final enru a = enru.c("com/google/android/libraries/privatetelemetry/mobalt/observations/CountObservationGenerator");
    private final edxz b;
    private final edxx c;
    private final edxm d;
    private final SecureRandom e;
    private final int f;
    private final int g;
    private final emsj h;
    private final emtc i;

    public edxj(edxz edxzVar, edxx edxxVar, edxm edxmVar, SecureRandom secureRandom, int i, int i2, emsj emsjVar, emtc emtcVar) {
        this.b = edxzVar;
        this.c = edxxVar;
        this.d = edxmVar;
        this.e = secureRandom;
        this.f = i;
        this.g = i2;
        this.h = emsjVar;
        this.i = emtcVar;
    }

    private final emsp b(int i, emto emtoVar) {
        emso emsoVar = (emso) emsp.a.createBuilder();
        emsoVar.copyOnWrite();
        ((emsp) emsoVar.instance).c = this.f;
        emsoVar.copyOnWrite();
        ((emsp) emsoVar.instance).d = this.g;
        int i2 = this.h.b;
        emsoVar.copyOnWrite();
        ((emsp) emsoVar.instance).e = i2;
        int i3 = this.i.f;
        emsoVar.copyOnWrite();
        ((emsp) emsoVar.instance).f = i3;
        emsoVar.copyOnWrite();
        ((emsp) emsoVar.instance).g = i;
        emsoVar.copyOnWrite();
        emsp emspVar = (emsp) emsoVar.instance;
        emtoVar.getClass();
        emspVar.h = emtoVar;
        emspVar.b |= 1;
        return (emsp) emsoVar.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final engw c(engw engwVar) {
        int i = engw.d;
        engr engrVar = new engr();
        engr engrVar2 = new engr();
        for (int i2 = 0; i2 < ((enou) engwVar).c; i2++) {
            int intValue = ((Integer) engwVar.get(i2)).intValue();
            emsk emskVar = (emsk) emsl.a.createBuilder();
            emsq emsqVar = (emsq) emsr.a.createBuilder();
            emsqVar.copyOnWrite();
            ((emsr) emsqVar.instance).b = intValue;
            emsr emsrVar = (emsr) emsqVar.build();
            emskVar.copyOnWrite();
            emsl emslVar = (emsl) emskVar.instance;
            emsrVar.getClass();
            emslVar.c = emsrVar;
            emslVar.b = 13;
            eyee a2 = edvn.a(this.e);
            emskVar.copyOnWrite();
            ((emsl) emskVar.instance).d = a2;
            engrVar2.h((emsl) emskVar.build());
        }
        emsk emskVar2 = (emsk) emsl.a.createBuilder();
        emte emteVar = emte.a;
        emskVar2.copyOnWrite();
        emsl emslVar2 = (emsl) emskVar2.instance;
        emteVar.getClass();
        emslVar2.c = emteVar;
        emslVar2.b = 10000;
        eyee a3 = edvn.a(this.e);
        emskVar2.copyOnWrite();
        ((emsl) emskVar2.instance).d = a3;
        engrVar2.h((emsl) emskVar2.build());
        engw g = engrVar2.g();
        int i3 = ((enou) g).c;
        int i4 = 0;
        boolean z = true;
        while (i4 < i3) {
            emsl emslVar3 = (emsl) g.get(i4);
            edxq edxqVar = (edxq) edxr.a.createBuilder();
            edxqVar.copyOnWrite();
            edxr edxrVar = (edxr) edxqVar.instance;
            emslVar3.getClass();
            edxrVar.d = emslVar3;
            edxrVar.b |= 1;
            if (z) {
                eyee a4 = edvn.a(this.e);
                edxqVar.copyOnWrite();
                ((edxr) edxqVar.instance).c = a4;
            }
            engrVar.h((edxr) edxqVar.build());
            i4++;
            z = false;
        }
        return engrVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01bb  */
    @Override // defpackage.edvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.util.List a(int r32, java.util.List r33) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edxj.a(int, java.util.List):java.util.List");
    }
}
