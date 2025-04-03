package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class imo extends CancellationException {
    public imo(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(imp.a);
        return this;
    }

    public /* synthetic */ imo() {
        super(null);
    }
}
