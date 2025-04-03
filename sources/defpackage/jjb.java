package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjb {
    public final String a;
    public final ffbv b;

    public jjb(String str, ffbv ffbvVar) {
        this.a = str;
        this.b = ffbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjb)) {
            return false;
        }
        jjb jjbVar = (jjb) obj;
        return ffkj.e(this.a, jjbVar.a) && ffkj.e(this.b, jjbVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        ffbv ffbvVar = this.b;
        return (hashCode * 31) + (ffbvVar != null ? ffbvVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
