package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrl {
    private final lpz a;

    public lrl(lpz lpzVar) {
        this.a = lpzVar;
    }

    public final boolean a(int i) {
        return this.a.c(i);
    }

    public final boolean b(int... iArr) {
        for (int i : iArr) {
            if (this.a.c(i)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lrl) {
            return this.a.equals(((lrl) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
