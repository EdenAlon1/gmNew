package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uia extends RuntimeException {
    private final drlh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uia(drlh drlhVar) {
        super("Attempted to add " + new ffkb(drlhVar.getClass()).c() + " with size " + drlhVar.a() + ",but attachments limit was reached.");
        drlhVar.getClass();
        int i = fflc.a;
        this.a = drlhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uia) && ffkj.e(this.a, ((uia) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "AttachmentsLimitReached(attemptedMediaAdd=" + this.a + ")";
    }
}
