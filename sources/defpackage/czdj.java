package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czdj {
    public final dlsr a;

    public czdj(dlsr dlsrVar) {
        this.a = dlsrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof czdj) && ffkj.e(this.a, ((czdj) obj).a);
    }

    public final int hashCode() {
        dlsr dlsrVar = this.a;
        if (dlsrVar == null) {
            return 0;
        }
        return dlsrVar.hashCode();
    }

    public final String toString() {
        return "TopbarUiData(goBackAction=" + this.a + ")";
    }
}
