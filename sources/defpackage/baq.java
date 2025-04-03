package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class baq implements bjt {
    final /* synthetic */ ayq a;
    final /* synthetic */ bar b;

    public baq(bar barVar, ayq ayqVar) {
        this.b = barVar;
        this.a = ayqVar;
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
        ayq ayqVar = this.a;
        if (ayqVar.b.f) {
            return;
        }
        int a = ((bdk) ayqVar.a.get(0)).a();
        if (th instanceof avl) {
            this.b.b.b(new ayk(a, (avl) th));
        } else {
            this.b.b.b(new ayk(a, new avl("Failed to submit capture request", th)));
        }
        this.b.f.a();
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.f.a();
    }
}
