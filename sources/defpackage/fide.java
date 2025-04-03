package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fide extends IllegalStateException {
    private final Throwable a;

    public fide(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
