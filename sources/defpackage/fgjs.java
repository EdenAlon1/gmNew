package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgjs implements dhqs {
    final /* synthetic */ ffrf a;

    public fgjs(ffrf ffrfVar) {
        this.a = ffrfVar;
    }

    @Override // defpackage.dhqs
    public final void a(dhre dhreVar) {
        Exception h = dhreVar.h();
        if (h != null) {
            this.a.w(ffci.a(h));
        } else if (((dhrm) dhreVar).d) {
            this.a.h(null);
        } else {
            this.a.w(dhreVar.i());
        }
    }
}
