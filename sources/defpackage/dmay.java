package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmay implements dmba {
    public final String a;
    public final dmci b;
    private final int c;

    /* JADX WARN: Multi-variable type inference failed */
    public dmay() {
        this(null, 0 == true ? 1 : 0, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmay)) {
            return false;
        }
        dmay dmayVar = (dmay) obj;
        int i = dmayVar.c;
        return ffkj.e(this.a, dmayVar.a) && ffkj.e(this.b, dmayVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Star(count=0, contentDescription=" + this.a + ", style=" + this.b + ")";
    }

    public /* synthetic */ dmay(String str, dmci dmciVar, int i) {
        dmciVar = (i & 4) != 0 ? new dmci(null) : dmciVar;
        str = (i & 2) != 0 ? null : str;
        dmciVar.getClass();
        this.c = 0;
        this.a = str;
        this.b = dmciVar;
    }
}
