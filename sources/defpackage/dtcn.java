package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtcn {
    public final String a;

    public dtcn(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dtcn) && ffkj.e(this.a, ((dtcn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChipData(text=" + this.a + ")";
    }
}
