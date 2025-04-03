package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elgw implements dhqs {
    final /* synthetic */ kfb a;

    public elgw(kfb kfbVar) {
        this.a = kfbVar;
    }

    @Override // defpackage.dhqs
    public final void a(dhre dhreVar) {
        if (dhreVar.m()) {
            this.a.b(dhreVar.i());
        } else if (dhreVar.h() != null) {
            this.a.c(dhreVar.h());
        } else {
            this.a.c(new Exception("Task failed with unknown result"));
        }
    }
}
