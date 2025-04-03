package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feim implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ fein b;

    public feim(fein feinVar, int i) {
        this.a = i;
        this.b = feinVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = ffbo.a;
            fekl feklVar = this.b.o;
            int i2 = this.a;
            emxf.b(i2 > 0, "numMessages must be > 0");
            if (((feqv) feklVar).b()) {
                return;
            }
            ((feqv) feklVar).e += i2;
            ((feqv) feklVar).a();
        } catch (Throwable th) {
            this.b.b(th);
        }
    }
}
