package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cenn {
    public final int a;
    public final String b;

    public cenn(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cenn)) {
            return false;
        }
        cenn cennVar = (cenn) obj;
        return this.a == cennVar.a && ffkj.e(this.b, cennVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "StageNestingLevelData(nestingLevel=" + this.a + ", stageNameAndDuration=" + this.b + ")";
    }
}
