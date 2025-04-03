package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmsj {
    public final int a;
    public final ffjn b;

    public dmsj(int i, ffjn ffjnVar) {
        this.a = i;
        this.b = ffjnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmsj)) {
            return false;
        }
        dmsj dmsjVar = (dmsj) obj;
        return this.a == dmsjVar.a && ffkj.e(this.b, dmsjVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "VoiceInputErrorUiData(errorMessage=" + this.a + ", onError=" + this.b + ")";
    }
}
