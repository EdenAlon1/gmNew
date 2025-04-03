package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dccx implements erqj {
    final /* synthetic */ dccz a;

    public dccx(dccz dcczVar) {
        this.a = dcczVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        if (this.a.e()) {
            this.a.j = null;
            return;
        }
        if (bool.booleanValue()) {
            this.a.c();
        } else {
            this.a.a();
        }
        this.a.j = null;
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        this.a.j = null;
    }
}
