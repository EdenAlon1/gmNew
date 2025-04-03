package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwot {
    public final String a;
    private final int b = 0;

    public cwot(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwot)) {
            return false;
        }
        cwot cwotVar = (cwot) obj;
        if (!ffkj.e(this.a, cwotVar.a)) {
            return false;
        }
        int i = cwotVar.b;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "ToastData(text=" + this.a + ", duration=0)";
    }
}
