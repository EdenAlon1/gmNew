package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpck extends RuntimeException {
    private final Throwable a;

    public dpck(Throwable th) {
        super(th);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
