package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckbb extends ckev {
    private final String a;

    public ckbb(String str) {
        this.a = str;
    }

    @Override // defpackage.ckev
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ckev) {
            return this.a.equals(((ckev) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "LegacyTransactionId{transactionId=" + this.a + "}";
    }
}
