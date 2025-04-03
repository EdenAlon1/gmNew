package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkgg implements Runnable {
    final /* synthetic */ dkgi a;

    public dkgg(dkgi dkgiVar) {
        this.a = dkgiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.f(this.a.a());
        } catch (Exception e) {
            dkty.i(e, "Error while referring: %s", e.getMessage());
            this.a.c(new dkgj("Error while rejecting refer: ".concat(String.valueOf(e.getMessage())), e));
        }
    }
}
