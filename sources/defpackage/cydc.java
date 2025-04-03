package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cydc {
    private final ffbr a;

    public cydc(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    private final void f(eprx eprxVar) {
        akxl akxlVar = (akxl) this.a.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BANNER_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        epry epryVar = (epry) eprxVar.build();
        epryVar.getClass();
        eolvVar2.be = epryVar;
        eolvVar2.e |= 1073741824;
        akxlVar.j(eoluVar);
    }

    private final void g(int i) {
        eprx eprxVar = (eprx) epry.a.createBuilder();
        eprxVar.copyOnWrite();
        epry epryVar = (epry) eprxVar.instance;
        epryVar.e = 1;
        epryVar.b |= 1;
        epsc epscVar = (epsc) epse.a.createBuilder();
        epscVar.copyOnWrite();
        epse epseVar = (epse) epscVar.instance;
        epseVar.c = i - 1;
        epseVar.b |= 1;
        eprxVar.copyOnWrite();
        epry epryVar2 = (epry) eprxVar.instance;
        epse epseVar2 = (epse) epscVar.build();
        epseVar2.getClass();
        epryVar2.d = epseVar2;
        epryVar2.c = 2;
        f(eprxVar);
    }

    public final void a() {
        g(3);
    }

    public final void b() {
        g(2);
    }

    public final void c(int i) {
        eprx eprxVar = (eprx) epry.a.createBuilder();
        eprxVar.copyOnWrite();
        epry epryVar = (epry) eprxVar.instance;
        epryVar.e = 1;
        epryVar.b |= 1;
        eprz eprzVar = (eprz) epsb.a.createBuilder();
        eprzVar.copyOnWrite();
        epsb epsbVar = (epsb) eprzVar.instance;
        epsbVar.c = i - 1;
        epsbVar.b |= 1;
        eprxVar.copyOnWrite();
        epry epryVar2 = (epry) eprxVar.instance;
        epsb epsbVar2 = (epsb) eprzVar.build();
        epsbVar2.getClass();
        epryVar2.d = epsbVar2;
        epryVar2.c = 3;
        f(eprxVar);
    }

    public final void d() {
        g(5);
    }

    public final void e() {
        g(4);
    }
}
