package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqut extends dquu {
    public final String a;
    private final int b;

    public dqut(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.dquu
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dquu
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqut)) {
            return false;
        }
        dqut dqutVar = (dqut) obj;
        return ffkj.e(this.a, dqutVar.a) && this.b == dqutVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Header(description=" + this.a + ", categoryId=" + this.b + ")";
    }
}
