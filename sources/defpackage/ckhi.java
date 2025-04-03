package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckhi implements ckhh {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;

    public ckhi(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
    }

    private static eolu i() {
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.RCS_PROVISIONING;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        return eoluVar;
    }

    @Override // defpackage.ckhh
    public final void a(eoxa eoxaVar) {
        akxl akxlVar = (akxl) this.a.b();
        eolu i = i();
        i.copyOnWrite();
        eolv eolvVar = (eolv) i.instance;
        eolv eolvVar2 = eolv.a;
        eolvVar.aI = eoxaVar;
        eolvVar.e |= 8;
        akxlVar.j(i);
    }

    @Override // defpackage.ckhh
    public final void b(eqws eqwsVar) {
        akxl akxlVar = (akxl) this.a.b();
        eolu i = i();
        i.copyOnWrite();
        eolv eolvVar = (eolv) i.instance;
        eolv eolvVar2 = eolv.a;
        eolvVar.aG = eqwsVar.aa;
        eolvVar.e |= 1;
        akxlVar.j(i);
    }

    @Override // defpackage.ckhh
    public final void c(eqws eqwsVar, double d) {
        akxl akxlVar = (akxl) this.a.b();
        eolu i = i();
        i.copyOnWrite();
        eolv eolvVar = (eolv) i.instance;
        eolv eolvVar2 = eolv.a;
        eolvVar.aG = eqwsVar.aa;
        eolvVar.e |= 1;
        akxlVar.p(i, d);
    }

    @Override // defpackage.ckhh
    public final void d(eqxg eqxgVar) {
        akxl akxlVar = (akxl) this.a.b();
        eolu i = i();
        i.copyOnWrite();
        eolv eolvVar = (eolv) i.instance;
        eolv eolvVar2 = eolv.a;
        eqxgVar.getClass();
        eolvVar.aH = eqxgVar;
        eolvVar.e |= 4;
        akxlVar.j(i);
    }

    @Override // defpackage.ckhh
    public final void e(eqxm eqxmVar) {
        akxl akxlVar = (akxl) this.a.b();
        eolu i = i();
        i.copyOnWrite();
        eolv eolvVar = (eolv) i.instance;
        eolv eolvVar2 = eolv.a;
        eqxmVar.getClass();
        eolvVar.aP = eqxmVar;
        eolvVar.e |= 4096;
        akxlVar.j(i);
    }

    @Override // defpackage.ckhh
    public final void f(eqxo eqxoVar) {
        akxn a = ((akyb) this.c.b()).a();
        eolu i = i();
        i.copyOnWrite();
        eolv eolvVar = (eolv) i.instance;
        eolv eolvVar2 = eolv.a;
        eqxoVar.getClass();
        eolvVar.cF = eqxoVar;
        eolvVar.i |= 4;
        a.j(i, alal.LOG_SPEC_RCS_PROVISIONING_SCHEDULED_EVENTS);
    }

    @Override // defpackage.ckhh
    public final void g(eqxq eqxqVar) {
        akxl akxlVar = (akxl) this.a.b();
        eolu i = i();
        i.copyOnWrite();
        eolv eolvVar = (eolv) i.instance;
        eolv eolvVar2 = eolv.a;
        eqxqVar.getClass();
        eolvVar.br = eqxqVar;
        eolvVar.f |= 262144;
        akxlVar.j(i);
    }

    @Override // defpackage.ckhh
    public final void h(ckhg ckhgVar, int i, djrm djrmVar) {
        akxl akxlVar = (akxl) this.a.b();
        eqwl eqwlVar = (eqwl) eqwm.a.createBuilder();
        eqwlVar.copyOnWrite();
        eqwm eqwmVar = (eqwm) eqwlVar.instance;
        eqwmVar.c = ckhgVar.a.a.N;
        eqwmVar.b |= 1;
        eqwlVar.copyOnWrite();
        eqwm eqwmVar2 = (eqwm) eqwlVar.instance;
        eqwmVar2.d = ckhgVar.b.a.N;
        eqwmVar2.b |= 2;
        eqwlVar.copyOnWrite();
        eqwm eqwmVar3 = (eqwm) eqwlVar.instance;
        eqwmVar3.e = i - 1;
        eqwmVar3.b |= 4;
        eqpc b = ((dijt) this.b.b()).b(djrmVar);
        eqwlVar.copyOnWrite();
        eqwm eqwmVar4 = (eqwm) eqwlVar.instance;
        b.getClass();
        eqwmVar4.f = b;
        eqwmVar4.b |= 8;
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.AVAILABILITY_LOG;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqwm eqwmVar5 = (eqwm) eqwlVar.build();
        eqwmVar5.getClass();
        eolvVar2.ao = eqwmVar5;
        eolvVar2.d |= 128;
        akxlVar.j(eoluVar);
    }
}
