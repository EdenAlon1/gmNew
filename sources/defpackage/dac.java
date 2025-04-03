package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dac implements cyq {
    public final float a;
    public final float b;
    public final Object c;

    public dac() {
        this(0.0f, (Object) null, 7);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ dcr a(dbv dbvVar) {
        Object obj = this.c;
        return new ddf(this.a, this.b, obj == null ? null : (cyb) dbvVar.b().invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dac)) {
            return false;
        }
        dac dacVar = (dac) obj;
        return dacVar.a == this.a && dacVar.b == this.b && ffkj.e(dacVar.c, this.c);
    }

    public final int hashCode() {
        Object obj = this.c;
        return ((((obj != null ? obj.hashCode() : 0) * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(this.b);
    }

    public dac(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    public /* synthetic */ dac(float f, Object obj, int i) {
        this(1 != (i & 1) ? 0.0f : 1.0f, (i & 2) != 0 ? 1500.0f : f, (i & 4) != 0 ? null : obj);
    }
}
