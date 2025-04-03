package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkmc implements erqj {
    final /* synthetic */ dkkj a;
    final /* synthetic */ dkme b;

    public dkmc(dkme dkmeVar, dkkj dkkjVar) {
        this.a = dkkjVar;
        this.b = dkmeVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dihz dihzVar = (dihz) obj;
        if (dihzVar == dihz.INFO_LOCALLY_AVAILABLE) {
            this.b.b.v((dklp) this.a);
        } else if (dihzVar == dihz.SERVER_ERROR) {
            dkty.q("Server error retrieving business info, rejecting session.", new Object[0]);
            this.a.j();
            this.a.aT(dkkh.BUSINESS_INFO_SERVER_ERROR);
        } else {
            dkty.q("Client error retrieving business info, rejecting session.", new Object[0]);
            this.a.j();
            this.a.aT(dkkh.BUSINESS_INFO_CLIENT_ERROR);
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        dkty.i(th, "Client error retrieving business info, rejecting session.", new Object[0]);
        this.a.j();
        this.a.aT(dkkh.BUSINESS_INFO_CLIENT_ERROR);
    }
}
