package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cllq extends cljw {
    static final emwd a = new clkw();
    static final emwd b = new cllw();
    static final emwd c = new clkp();

    @Override // defpackage.cljw
    public final void b(awyz awyzVar, clsg clsgVar) {
        awui awuiVar = awyzVar.d;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        clns a2 = clkl.a(awuiVar, awyzVar.i);
        clsgVar.copyOnWrite();
        clsh clshVar = (clsh) clsgVar.instance;
        clsh clshVar2 = clsh.a;
        a2.getClass();
        clshVar.e = a2;
        clshVar.b |= 4;
    }

    @Override // defpackage.cljw
    public final void c(awyz awyzVar, clsg clsgVar) {
        clpb clpbVar = (clpb) clpc.b.createBuilder();
        clqw clqwVar = (clqw) clqx.a.createBuilder();
        String str = awyzVar.h;
        clqwVar.copyOnWrite();
        clqx clqxVar = (clqx) clqwVar.instance;
        str.getClass();
        clqxVar.b |= 1;
        clqxVar.c = str;
        clpbVar.copyOnWrite();
        clpc clpcVar = (clpc) clpbVar.instance;
        clqx clqxVar2 = (clqx) clqwVar.build();
        clqxVar2.getClass();
        clpcVar.d = clqxVar2;
        clpcVar.c |= 1;
        awui awuiVar = awyzVar.c;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        clqv b2 = cllk.b(awuiVar);
        clpbVar.copyOnWrite();
        clpc clpcVar2 = (clpc) clpbVar.instance;
        b2.getClass();
        clpcVar2.e = b2;
        clpcVar2.c |= 2;
        clpj clpjVar = (clpj) clpk.a.createBuilder();
        awul awulVar = awyzVar.k;
        if (awulVar == null) {
            awulVar = awul.a;
        }
        eyee eyeeVar = awulVar.d;
        clpjVar.copyOnWrite();
        clpk clpkVar = (clpk) clpjVar.instance;
        eyeeVar.getClass();
        clpkVar.b |= 2;
        clpkVar.d = eyeeVar;
        emwd emwdVar = c;
        awul awulVar2 = awyzVar.k;
        if (awulVar2 == null) {
            awulVar2 = awul.a;
        }
        awup awupVar = awulVar2.c;
        if (awupVar == null) {
            awupVar = awup.a;
        }
        clnm clnmVar = (clnm) emwdVar.fP(awupVar);
        clpjVar.copyOnWrite();
        clpk clpkVar2 = (clpk) clpjVar.instance;
        clnmVar.getClass();
        clpkVar2.c = clnmVar;
        clpkVar2.b |= 1;
        clpbVar.copyOnWrite();
        clpc clpcVar3 = (clpc) clpbVar.instance;
        clpk clpkVar3 = (clpk) clpjVar.build();
        clpkVar3.getClass();
        clpcVar3.a();
        clpcVar3.g.add(clpkVar3);
        if ((awyzVar.b & 4) != 0) {
            awui awuiVar2 = awyzVar.e;
            if (awuiVar2 == null) {
                awuiVar2 = awui.a;
            }
            clqv b3 = cllk.b(awuiVar2);
            clpbVar.copyOnWrite();
            clpc clpcVar4 = (clpc) clpbVar.instance;
            b3.getClass();
            clpcVar4.f = b3;
            clpcVar4.c |= 4;
        }
        if ((awyzVar.b & 128) != 0) {
            fayv fayvVar = awyzVar.j;
            if (fayvVar == null) {
                fayvVar = fayv.a;
            }
            clpbVar.copyOnWrite();
            clpc clpcVar5 = (clpc) clpbVar.instance;
            fayvVar.getClass();
            clpcVar5.i = fayvVar;
            clpcVar5.c |= 16;
        }
        clpc clpcVar6 = (clpc) clpbVar.build();
        clsgVar.copyOnWrite();
        clsh clshVar = (clsh) clsgVar.instance;
        clsh clshVar2 = clsh.a;
        clpcVar6.getClass();
        clshVar.f = clpcVar6;
        clshVar.b |= 8;
    }

    @Override // defpackage.cljw
    public final void d(awyz awyzVar, clsg clsgVar) {
        eydp eydpVar = (eydp) eydq.a.createBuilder();
        eyee eyeeVar = awyzVar.l;
        eydpVar.copyOnWrite();
        eydq eydqVar = (eydq) eydpVar.instance;
        eyeeVar.getClass();
        eydqVar.c = eyeeVar;
        eydq eydqVar2 = (eydq) eydpVar.build();
        clsgVar.copyOnWrite();
        clsh clshVar = (clsh) clsgVar.instance;
        clsh clshVar2 = clsh.a;
        eydqVar2.getClass();
        clshVar.c = eydqVar2;
        clshVar.b |= 1;
    }

    @Override // defpackage.cljw
    public final void e(clsg clsgVar) {
        clpy clpyVar = clpy.MESSAGING_METHOD_CHAT;
        clsgVar.copyOnWrite();
        clsh clshVar = (clsh) clsgVar.instance;
        clsh clshVar2 = clsh.a;
        clshVar.h = clpyVar.d;
        clshVar.b |= 32;
    }
}
