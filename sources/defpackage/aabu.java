package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabu implements zsu {
    public final aacb a;
    public final boolean b;
    public final String c;

    public aabu(aacb aacbVar, boolean z, String str) {
        this.a = aacbVar;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aabu)) {
            return false;
        }
        aabu aabuVar = (aabu) obj;
        return ffkj.e(this.a, aabuVar.a) && this.b == aabuVar.b && ffkj.e(this.c, aabuVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "GalleryBubbleArgs(content=" + this.a + ", isHighlighted=" + this.b + ", contentDescription=" + this.c + ")";
    }
}
