package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmoe {
    public final boolean a;
    public final boolean b;

    public dmoe() {
        this(3);
    }

    public static /* synthetic */ dmoe a(dmoe dmoeVar, boolean z, int i) {
        boolean z2 = (i & 1) != 0 ? dmoeVar.a : false;
        if ((i & 2) != 0) {
            z = dmoeVar.b;
        }
        return new dmoe(z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmoe)) {
            return false;
        }
        dmoe dmoeVar = (dmoe) obj;
        return this.a == dmoeVar.a && this.b == dmoeVar.b;
    }

    public final int hashCode() {
        return (dmod.a(this.a) * 31) + dmod.a(this.b);
    }

    public final String toString() {
        return "Flags(enableDraftContentsCheck=" + this.a + ", enableInvertedColors=" + this.b + ")";
    }

    public dmoe(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public /* synthetic */ dmoe(int i) {
        this(1 == (i & 1), false);
    }
}
