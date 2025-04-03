package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idg {
    public static final idg a = new idg();
    public final long b;
    public final long c;
    public final float d;

    public idg(long j, long j2, float f) {
        this.b = j;
        this.c = j2;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idg)) {
            return false;
        }
        long j = this.b;
        idg idgVar = (idg) obj;
        long j2 = idgVar.b;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && iak.i(this.c, idgVar.c) && this.d == idgVar.d;
    }

    public final int hashCode() {
        long j = ibw.a;
        return (((ffco.a(this.b) * 31) + iaj.a(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "Shadow(color=" + ((Object) ibw.g(this.b)) + ", offset=" + ((Object) iak.h(this.c)) + ", blurRadius=" + this.d + ')';
    }

    public /* synthetic */ idg() {
        this(iby.d(4278190080L), 0L, 0.0f);
    }
}
