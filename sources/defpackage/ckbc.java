package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckbc extends ckew {
    private final eyee a;
    private final boolean b;

    public ckbc(eyee eyeeVar, boolean z) {
        if (eyeeVar == null) {
            throw new NullPointerException("Null transactionId");
        }
        this.a = eyeeVar;
        this.b = z;
    }

    @Override // defpackage.ckew
    public final eyee a() {
        return this.a;
    }

    @Override // defpackage.ckew
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ckew) {
            ckew ckewVar = (ckew) obj;
            if (this.a.equals(ckewVar.a()) && this.b == ckewVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "MmsMessage{transactionId=" + this.a.toString() + ", isArbitraryDataStored=" + this.b + "}";
    }
}
