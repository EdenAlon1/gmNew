package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoaf {
    public final int a;
    public final int b;
    public final int c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final enyr h;
    public final enyr i;

    public eoaf(int i, int i2, enyr enyrVar, enyr enyrVar2, enxq enxqVar, enxq enxqVar2) {
        this.a = i;
        this.b = i2;
        this.d = enxqVar.a;
        this.e = enxqVar.b;
        this.f = enxqVar2.a;
        this.g = enxqVar2.b;
        this.h = enyrVar;
        this.i = enyrVar2;
        double d = eobe.a;
        double sqrt = Math.sqrt(enyrVar.c(enyrVar2));
        enxv enxvVar = enzn.b;
        int i3 = 30;
        if (sqrt > eobe.a) {
            int exponent = Math.getExponent(sqrt / enxvVar.a);
            int i4 = enxvVar.b;
            i3 = Math.max(0, Math.min(30, -exponent));
        }
        this.c = i3;
    }

    public final String toString() {
        return "shape " + this.a + " edge " + this.b;
    }
}
