package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elhm implements xl {
    final /* synthetic */ xl a;
    final /* synthetic */ String b = "searchViewTAG";
    final /* synthetic */ elhn c;

    public elhm(elhn elhnVar, xl xlVar) {
        this.a = xlVar;
        this.c = elhnVar;
    }

    @Override // defpackage.xl
    public final boolean a(String str) {
        if (ekyf.v()) {
            return false;
        }
        elhn elhnVar = this.c;
        elhnVar.a.b(this.b).close();
        return false;
    }

    @Override // defpackage.xl
    public final void b(String str) {
        if (ekyf.v()) {
            this.a.b(str);
            return;
        }
        elhn elhnVar = this.c;
        ekzm b = elhnVar.a.b(this.b);
        try {
            this.a.b(str);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
