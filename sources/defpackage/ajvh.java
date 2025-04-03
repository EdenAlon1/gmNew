package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajvh {
    public final String a;
    public final int b;

    public ajvh(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajvh)) {
            return false;
        }
        ajvh ajvhVar = (ajvh) obj;
        return ffkj.e(this.a, ajvhVar.a) && jss.b(this.b, ajvhVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "StyledString(string=" + this.a + ", fontStyle=" + jss.a(this.b) + ")";
    }

    public /* synthetic */ ajvh(String str) {
        this(str, 0);
    }
}
