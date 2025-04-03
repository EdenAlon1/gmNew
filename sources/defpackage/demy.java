package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class demy {
    public final String a;
    public final ffix b;

    public demy(String str, ffix ffixVar) {
        this.a = str;
        this.b = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof demy)) {
            return false;
        }
        demy demyVar = (demy) obj;
        return ffkj.e(this.a, demyVar.a) && ffkj.e(this.b, demyVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DropdownMenuItemUiData(text=" + this.a + ", onClick=" + this.b + ")";
    }
}
