package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djqg implements djjv {
    @Override // defpackage.djjv
    public final void h(djjt djjtVar) {
        ezaj a = djka.a(djjtVar.k);
        ezag f = djjtVar.f();
        int a2 = djjtVar.a();
        boolean z = djjtVar.d;
        dkty.o("Logging NIF selected: %s, %s, IPv%d, hasDns:%b", a, f, Integer.valueOf(a2), Boolean.valueOf(z));
        dikj dikjVar = djjtVar.i;
        ezae p = dikjVar.p(3, a, f, a2);
        p.copyOnWrite();
        ezak ezakVar = (ezak) p.instance;
        ezak ezakVar2 = ezak.a;
        ezakVar.b |= 16;
        ezakVar.g = z;
        dikjVar.m((ezak) p.build());
    }

    @Override // defpackage.djjv
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.djjv
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.djjv
    public final /* synthetic */ void m() {
    }

    @Override // defpackage.djjv
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.djjv
    public final /* synthetic */ void j(String str) {
    }

    @Override // defpackage.djjv
    public final /* synthetic */ void k(String str) {
    }
}
