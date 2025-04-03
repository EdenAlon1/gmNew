package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xen {
    public final fgdj a;
    public final fgdj b;
    public final fgdj c;
    public final zqv d;

    public xen(fgdj fgdjVar, zqv zqvVar, fgdj fgdjVar2, fgdj fgdjVar3) {
        fgdjVar.getClass();
        fgdjVar2.getClass();
        fgdjVar3.getClass();
        this.a = fgdjVar;
        this.d = zqvVar;
        this.b = fgdjVar2;
        this.c = fgdjVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xen)) {
            return false;
        }
        xen xenVar = (xen) obj;
        return ffkj.e(this.a, xenVar.a) && ffkj.e(this.d, xenVar.d) && ffkj.e(this.b, xenVar.b) && ffkj.e(this.c, xenVar.c);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.d.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "BottomContentUiData(composeRowHolderUiData=" + this.a + ", messageListInsets=" + this.d + ", toolstoneUiData=" + this.b + ", stickyMessageUiData=" + this.c + ")";
    }
}
