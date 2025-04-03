package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbux implements ellh {
    final /* synthetic */ dbuw a;

    public dbux(dbuw dbuwVar) {
        this.a = dbuwVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        dbuw dbuwVar = this.a;
        ea h = dbuwVar.c.I().h("gaia_pairing_reset_primary");
        if (h != null) {
            cg cgVar = new cg(dbuwVar.c.I());
            cgVar.n(h);
            cgVar.c();
        }
        return elli.a;
    }
}
