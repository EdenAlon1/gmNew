package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmxz {
    public final String a;
    public final boolean b;
    public final ffix c;

    public dmxz(String str, boolean z, ffix ffixVar) {
        this.a = str;
        this.b = z;
        this.c = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmxz)) {
            return false;
        }
        dmxz dmxzVar = (dmxz) obj;
        return ffkj.e(this.a, dmxzVar.a) && this.b == dmxzVar.b && ffkj.e(this.c, dmxzVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ExpandableListButtonUiData(text=" + this.a + ", isListExpanded=" + this.b + ", onClick=" + this.c + ")";
    }
}
