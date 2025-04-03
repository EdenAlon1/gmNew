package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjf {
    public final String a;
    public final ffix b;

    public jjf(String str, ffix ffixVar) {
        this.a = str;
        this.b = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjf)) {
            return false;
        }
        jjf jjfVar = (jjf) obj;
        return ffkj.e(this.a, jjfVar.a) && this.b == jjfVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CustomAccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
