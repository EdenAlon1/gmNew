package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clls extends cljx {
    static final emwd a = new cllr();
    static final Function b = new cllv();
    private final cqoh c;

    public clls(cqoh cqohVar) {
        this.c = cqohVar;
    }

    @Override // defpackage.cljx
    public final void b(clrv clrvVar, cotd cotdVar) {
        clqc clqcVar = clrvVar.e;
        if (clqcVar == null) {
            clqcVar = clqc.a;
        }
        if ((clqcVar.b & 8) != 0) {
            emwd emwdVar = a;
            clqc clqcVar2 = clrvVar.e;
            if (clqcVar2 == null) {
                clqcVar2 = clqc.a;
            }
            clqb b2 = clqb.b(clqcVar2.f);
            if (b2 == null) {
                b2 = clqb.FALLBACK_UNKNOWN;
            }
            cotf cotfVar = (cotf) emwdVar.fP(b2);
            cotdVar.copyOnWrite();
            cotg cotgVar = (cotg) cotdVar.instance;
            cotg cotgVar2 = cotg.a;
            cotgVar.f = cotfVar.e;
            cotgVar.b |= 8;
        }
    }

    @Override // defpackage.cljx
    public final void c(clrv clrvVar, cotd cotdVar) {
        if ((clrvVar.b & 1) != 0) {
            eydq eydqVar = clrvVar.c;
            if (eydqVar == null) {
                eydqVar = eydq.a;
            }
            eyee eyeeVar = eydqVar.c;
            cotdVar.copyOnWrite();
            cotg cotgVar = (cotg) cotdVar.instance;
            cotg cotgVar2 = cotg.a;
            eyeeVar.getClass();
            cotgVar.b |= 2;
            cotgVar.d = eyeeVar;
        }
    }

    @Override // defpackage.cljx
    public final void d(cotd cotdVar) {
        eyja b2 = eykj.b(this.c.f());
        cotdVar.copyOnWrite();
        cotg cotgVar = (cotg) cotdVar.instance;
        cotg cotgVar2 = cotg.a;
        b2.getClass();
        cotgVar.e = b2;
        cotgVar.b |= 4;
    }
}
