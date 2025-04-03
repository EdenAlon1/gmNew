package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffue extends CancellationException implements ffrw {
    public final transient ffud a;

    public ffue(String str, Throwable th, ffud ffudVar) {
        super(str);
        this.a = ffudVar;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // defpackage.ffrw
    public final /* bridge */ /* synthetic */ Throwable a() {
        if (!ffso.a) {
            return null;
        }
        String message = getMessage();
        message.getClass();
        return new ffue(message, this, this.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ffue) {
            ffue ffueVar = (ffue) obj;
            if (ffkj.e(ffueVar.getMessage(), getMessage()) && ffkj.e(ffueVar.a, this.a) && ffkj.e(ffueVar.getCause(), getCause())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (ffso.a) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int hashCode = (message.hashCode() * 31) + this.a.hashCode();
        Throwable cause = getCause();
        return (hashCode * 31) + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.a;
    }
}
