package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fggj extends RuntimeException {
    private final transient ffhd a;

    public fggj(ffhd ffhdVar) {
        this.a = ffhdVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.a.toString();
    }
}
