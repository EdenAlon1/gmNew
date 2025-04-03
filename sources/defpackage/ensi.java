package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ensi extends Exception {
    public ensi(Throwable th, ensy ensyVar, StackTraceElement[] stackTraceElementArr) {
        super(ensyVar.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
