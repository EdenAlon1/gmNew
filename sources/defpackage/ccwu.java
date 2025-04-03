package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccwu extends RuntimeException {
    private final RuntimeException a;

    public ccwu(String str, ccvl ccvlVar, RuntimeException runtimeException) {
        super("Uncaught exception while CmsHandler for " + str + " was processing work item " + ccvlVar.b.a, runtimeException);
        this.a = runtimeException;
    }

    public final boolean equals(Object obj) {
        boolean j;
        ccwu ccwuVar = obj instanceof ccwu ? (ccwu) obj : null;
        if (ccwuVar == null) {
            return false;
        }
        j = ffpc.j(getMessage(), ccwuVar.getMessage(), false);
        return j && ffkj.e(this.a, ccwuVar.a);
    }

    @Override // java.lang.Throwable
    public final /* synthetic */ Throwable getCause() {
        return this.a;
    }
}
