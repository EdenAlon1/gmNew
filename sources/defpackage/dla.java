package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dla implements dvw {
    final /* synthetic */ dly a;
    final /* synthetic */ ffji b;
    final /* synthetic */ ffix c;

    public dla(dly dlyVar, ffji ffjiVar, ffix ffixVar) {
        this.a = dlyVar;
        this.b = ffjiVar;
        this.c = ffixVar;
    }

    @Override // defpackage.dvw
    public final float a(float f, float f2) {
        return 0.0f;
    }

    @Override // defpackage.dvw
    public final float b(float f) {
        Object obj;
        dly dlyVar = this.a;
        float c = dlyVar.c();
        dmu k = dlyVar.k();
        if (Float.isNaN(c)) {
            throw new IllegalArgumentException("The offset provided to computeTarget must not be NaN.");
        }
        boolean z = Math.abs(f) > 0.0f;
        boolean z2 = z && f > 0.0f;
        if (z) {
            if (Math.abs(f) >= Math.abs(((Number) this.c.invoke()).floatValue())) {
                obj = k.c(c, z2);
                obj.getClass();
            } else {
                ffji ffjiVar = this.b;
                Object c2 = k.c(c, false);
                c2.getClass();
                float a = k.a(c2);
                Object c3 = k.c(c, true);
                c3.getClass();
                float a2 = k.a(c3);
                float abs = Math.abs(((Number) ffjiVar.invoke(Float.valueOf(Math.abs(a - a2)))).floatValue());
                if (true != z2) {
                    a = a2;
                }
                obj = (Math.abs(a - c) < abs ? !z2 : z2) ? c3 : c2;
            }
        } else {
            obj = k.b(c);
            obj.getClass();
        }
        return this.a.k().a(obj) - c;
    }
}
