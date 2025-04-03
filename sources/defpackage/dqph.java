package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqph {
    public dqnw a;
    public dqnz b;

    public dqph() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqph)) {
            return false;
        }
        dqph dqphVar = (dqph) obj;
        return this.a == dqphVar.a && this.b == dqphVar.b;
    }

    public final int hashCode() {
        dqnw dqnwVar = this.a;
        int hashCode = dqnwVar == null ? 0 : dqnwVar.hashCode();
        dqnz dqnzVar = this.b;
        return (hashCode * 31) + (dqnzVar != null ? dqnzVar.hashCode() : 0);
    }

    public final String toString() {
        return "ModifierPreferences(gender=" + this.a + ", skinTone=" + this.b + ")";
    }

    public dqph(dqnw dqnwVar, dqnz dqnzVar) {
        this.a = dqnwVar;
        this.b = dqnzVar;
    }

    public /* synthetic */ dqph(byte[] bArr) {
        this(null, null);
    }
}
