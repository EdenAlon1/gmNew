package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebl {
    public float a;
    public boolean b;
    public dza c;
    private dzm d;

    public ebl() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebl)) {
            return false;
        }
        ebl eblVar = (ebl) obj;
        if (Float.compare(this.a, eblVar.a) != 0 || this.b != eblVar.b || !ffkj.e(this.c, eblVar.c)) {
            return false;
        }
        dzm dzmVar = eblVar.d;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.a) * 31;
        int i = true != this.b ? 1237 : 1231;
        dza dzaVar = this.c;
        return (((floatToIntBits + i) * 31) + (dzaVar == null ? 0 : dzaVar.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }

    public /* synthetic */ ebl(byte[] bArr) {
        this.a = 0.0f;
        this.b = true;
        this.c = null;
        this.d = null;
    }
}
