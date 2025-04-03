package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bkk extends bkn {
    private final Throwable a;

    public bkk(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.bkn, java.util.concurrent.Future
    public final Object get() {
        throw new ExecutionException(this.a);
    }

    public final String toString() {
        return super.toString() + "[status=FAILURE, cause=[" + this.a + "]]";
    }
}
