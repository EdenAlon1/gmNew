package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyvj {
    public final dnym a;
    public final cyvi b;

    public cyvj(dnym dnymVar, cyvi cyviVar) {
        this.a = dnymVar;
        this.b = cyviVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyvj)) {
            return false;
        }
        cyvj cyvjVar = (cyvj) obj;
        return ffkj.e(this.a, cyvjVar.a) && ffkj.e(this.b, cyvjVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AvatarUiData(avatar=" + this.a + ", flags=" + this.b + ")";
    }
}
