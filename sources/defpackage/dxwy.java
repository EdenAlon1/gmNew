package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxwy {
    public final dwqy a;
    public final dxwx b;

    public dxwy(dxwx dxwxVar, dwqy dwqyVar) {
        this.b = dxwxVar;
        this.a = dwqyVar;
    }

    public final void a(int i, String str, String str2, String str3) {
        long k = this.a.k();
        if (dxth.a(k)) {
            erih erihVar = (erih) erii.a.createBuilder();
            erihVar.copyOnWrite();
            erii eriiVar = (erii) erihVar.instance;
            eriiVar.b |= 524288;
            eriiVar.f = k;
            eriz erizVar = (eriz) erja.a.createBuilder();
            erizVar.copyOnWrite();
            erja erjaVar = (erja) erizVar.instance;
            erjaVar.c = erkd.a(i);
            erjaVar.b |= 1;
            erizVar.copyOnWrite();
            erja erjaVar2 = (erja) erizVar.instance;
            str.getClass();
            erjaVar2.b |= 2;
            erjaVar2.d = str;
            erizVar.copyOnWrite();
            erja erjaVar3 = (erja) erizVar.instance;
            str2.getClass();
            erjaVar3.b |= 4;
            erjaVar3.e = str2;
            erizVar.copyOnWrite();
            erja erjaVar4 = (erja) erizVar.instance;
            str3.getClass();
            erjaVar4.b |= 8;
            erjaVar4.f = str3;
            erihVar.copyOnWrite();
            erii eriiVar2 = (erii) erihVar.instance;
            erja erjaVar5 = (erja) erizVar.build();
            erjaVar5.getClass();
            eriiVar2.q = erjaVar5;
            eriiVar2.d |= 2;
            this.b.a((erii) erihVar.build(), erjx.a(1074));
        }
    }
}
