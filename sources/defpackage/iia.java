package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iia {
    public static final void a(List list, icv icvVar) {
        int i;
        float f;
        int i2;
        ihy ihyVar;
        ihy ihyVar2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        List list2 = list;
        icv icvVar2 = icvVar;
        int a = icvVar2.a();
        icvVar2.l();
        icvVar2.m(a);
        ihy ihyVar3 = list2.isEmpty() ? ihf.a : (ihy) list2.get(0);
        int size = list2.size();
        float f13 = 0.0f;
        int i3 = 0;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        while (i3 < size) {
            ihy ihyVar4 = (ihy) list2.get(i3);
            if (ihyVar4 instanceof ihf) {
                icvVar2.c();
                i = size;
                f = f13;
                i2 = i3;
                ihyVar2 = ihyVar4;
                f14 = f18;
                f17 = f14;
                f15 = f19;
            } else {
                if (ihyVar4 instanceof ihs) {
                    ihs ihsVar = (ihs) ihyVar4;
                    float f20 = ihsVar.a;
                    f16 += f20;
                    float f21 = ihsVar.b;
                    f17 += f21;
                    ((ibc) icvVar2).a.rMoveTo(f20, f21);
                    i = size;
                    f = f13;
                    i2 = i3;
                    f19 = f16;
                    f18 = f17;
                } else {
                    if (ihyVar4 instanceof ihj) {
                        ihj ihjVar = (ihj) ihyVar4;
                        float f22 = ihjVar.a;
                        float f23 = ihjVar.b;
                        icvVar2.f(f22, f23);
                        f17 = f23;
                        f18 = f17;
                        f16 = f22;
                        f19 = f16;
                    } else {
                        if (ihyVar4 instanceof ihr) {
                            ihr ihrVar = (ihr) ihyVar4;
                            icvVar2.i(ihrVar.a, ihrVar.b);
                            f16 += ihrVar.a;
                            f12 = ihrVar.b;
                        } else {
                            if (ihyVar4 instanceof ihi) {
                                ihi ihiVar = (ihi) ihyVar4;
                                icvVar2.e(ihiVar.a, ihiVar.b);
                                f5 = ihiVar.a;
                                f6 = ihiVar.b;
                            } else if (ihyVar4 instanceof ihq) {
                                ihq ihqVar = (ihq) ihyVar4;
                                icvVar2.i(ihqVar.a, f13);
                                f16 += ihqVar.a;
                            } else if (ihyVar4 instanceof ihh) {
                                ihh ihhVar = (ihh) ihyVar4;
                                icvVar2.e(ihhVar.a, f17);
                                f16 = ihhVar.a;
                            } else if (ihyVar4 instanceof ihw) {
                                ihw ihwVar = (ihw) ihyVar4;
                                icvVar2.i(f13, ihwVar.a);
                                f12 = ihwVar.a;
                            } else if (ihyVar4 instanceof ihx) {
                                ihx ihxVar = (ihx) ihyVar4;
                                icvVar2.e(f16, ihxVar.a);
                                f17 = ihxVar.a;
                            } else {
                                if (ihyVar4 instanceof ihp) {
                                    ihp ihpVar = (ihp) ihyVar4;
                                    icvVar2.h(ihpVar.a, ihpVar.b, ihpVar.c, ihpVar.d, ihpVar.e, ihpVar.f);
                                    f9 = ihpVar.c + f16;
                                    f10 = ihpVar.d + f17;
                                    f16 += ihpVar.e;
                                    f11 = ihpVar.f;
                                } else {
                                    if (ihyVar4 instanceof ihg) {
                                        ihg ihgVar = (ihg) ihyVar4;
                                        icvVar.d(ihgVar.a, ihgVar.b, ihgVar.c, ihgVar.d, ihgVar.e, ihgVar.f);
                                        float f24 = ihgVar.c;
                                        f4 = ihgVar.d;
                                        float f25 = ihgVar.e;
                                        float f26 = ihgVar.f;
                                        f16 = f25;
                                        f17 = f26;
                                        i = size;
                                        f = f13;
                                        i2 = i3;
                                        ihyVar2 = ihyVar4;
                                        f15 = f24;
                                    } else if (ihyVar4 instanceof ihu) {
                                        if (ihyVar3.h) {
                                            f7 = f16 - f15;
                                            f8 = f17 - f14;
                                        } else {
                                            f7 = f13;
                                            f8 = f7;
                                        }
                                        ihu ihuVar = (ihu) ihyVar4;
                                        icvVar.h(f7, f8, ihuVar.a, ihuVar.b, ihuVar.c, ihuVar.d);
                                        f9 = ihuVar.a + f16;
                                        f10 = ihuVar.b + f17;
                                        f16 += ihuVar.c;
                                        f11 = ihuVar.d;
                                    } else {
                                        if (ihyVar4 instanceof ihl) {
                                            if (ihyVar3.h) {
                                                f17 = (f17 + f17) - f14;
                                                f16 = (f16 + f16) - f15;
                                            }
                                            ihl ihlVar = (ihl) ihyVar4;
                                            icvVar.d(f16, f17, ihlVar.a, ihlVar.b, ihlVar.c, ihlVar.d);
                                            float f27 = ihlVar.a;
                                            f14 = ihlVar.b;
                                            float f28 = ihlVar.c;
                                            float f29 = ihlVar.d;
                                            f16 = f28;
                                            f17 = f29;
                                            i = size;
                                            f = f13;
                                            i2 = i3;
                                            ihyVar2 = ihyVar4;
                                            f15 = f27;
                                        } else if (ihyVar4 instanceof iht) {
                                            iht ihtVar = (iht) ihyVar4;
                                            icvVar.j(ihtVar.a, ihtVar.b, ihtVar.c, ihtVar.d);
                                            float f30 = ihtVar.a + f16;
                                            float f31 = ihtVar.b + f17;
                                            f16 += ihtVar.c;
                                            f17 += ihtVar.d;
                                            f15 = f30;
                                            f14 = f31;
                                        } else if (ihyVar4 instanceof ihk) {
                                            ihk ihkVar = (ihk) ihyVar4;
                                            icvVar.g(ihkVar.a, ihkVar.b, ihkVar.c, ihkVar.d);
                                            float f32 = ihkVar.a;
                                            float f33 = ihkVar.b;
                                            f5 = ihkVar.c;
                                            f6 = ihkVar.d;
                                            f15 = f32;
                                            f14 = f33;
                                        } else if (ihyVar4 instanceof ihv) {
                                            if (ihyVar3.i) {
                                                f2 = f17 - f14;
                                                f3 = f16 - f15;
                                            } else {
                                                f2 = f13;
                                                f3 = f2;
                                            }
                                            ihv ihvVar = (ihv) ihyVar4;
                                            icvVar.j(f3, f2, ihvVar.a, ihvVar.b);
                                            float f34 = f3 + f16;
                                            f4 = f2 + f17;
                                            f16 += ihvVar.a;
                                            f17 += ihvVar.b;
                                            f15 = f34;
                                            i = size;
                                            f = f13;
                                            i2 = i3;
                                            ihyVar2 = ihyVar4;
                                        } else if (ihyVar4 instanceof ihm) {
                                            if (ihyVar3.i) {
                                                f17 = (f17 + f17) - f14;
                                                f16 = (f16 + f16) - f15;
                                            }
                                            ihm ihmVar = (ihm) ihyVar4;
                                            icvVar.g(f16, f17, ihmVar.a, ihmVar.b);
                                            i = size;
                                            f = f13;
                                            i2 = i3;
                                            f15 = f16;
                                            ihyVar2 = ihyVar4;
                                            f16 = ihmVar.a;
                                            f14 = f17;
                                            f17 = ihmVar.b;
                                        } else {
                                            if (ihyVar4 instanceof iho) {
                                                double d = f16;
                                                iho ihoVar = (iho) ihyVar4;
                                                float f35 = ihoVar.f + f16;
                                                float f36 = ihoVar.g + f17;
                                                ihyVar = ihyVar4;
                                                f = 0.0f;
                                                i2 = i3;
                                                i = size;
                                                b(icvVar, d, f17, f35, f36, ihoVar.a, ihoVar.b, ihoVar.c, ihoVar.d, ihoVar.e);
                                                f15 = f35;
                                                f16 = f15;
                                                f14 = f36;
                                                f17 = f14;
                                            } else {
                                                i = size;
                                                f = f13;
                                                i2 = i3;
                                                ihyVar = ihyVar4;
                                                if (ihyVar instanceof ihe) {
                                                    ihe iheVar = (ihe) ihyVar;
                                                    ihyVar2 = ihyVar;
                                                    b(icvVar, f16, f17, iheVar.f, iheVar.g, iheVar.a, iheVar.b, iheVar.c, iheVar.d, iheVar.e);
                                                    float f37 = iheVar.f;
                                                    f14 = iheVar.g;
                                                    f17 = f14;
                                                    f15 = f37;
                                                }
                                            }
                                            ihyVar2 = ihyVar;
                                        }
                                        i3 = i2 + 1;
                                        list2 = list;
                                        icvVar2 = icvVar;
                                        size = i;
                                        ihyVar3 = ihyVar2;
                                        f13 = f;
                                    }
                                    f14 = f4;
                                    i3 = i2 + 1;
                                    list2 = list;
                                    icvVar2 = icvVar;
                                    size = i;
                                    ihyVar3 = ihyVar2;
                                    f13 = f;
                                }
                                f17 += f11;
                                f15 = f9;
                                f14 = f10;
                            }
                            f17 = f6;
                            f16 = f5;
                        }
                        f17 += f12;
                    }
                    i = size;
                    f = f13;
                    i2 = i3;
                }
                ihyVar2 = ihyVar4;
                i3 = i2 + 1;
                list2 = list;
                icvVar2 = icvVar;
                size = i;
                ihyVar3 = ihyVar2;
                f13 = f;
            }
            f16 = f15;
            i3 = i2 + 1;
            list2 = list;
            icvVar2 = icvVar;
            size = i;
            ihyVar3 = ihyVar2;
            f13 = f;
        }
    }

    private static final void b(icv icvVar, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double cos = Math.cos(d11);
        double sin = Math.sin(d11);
        double d12 = (((-d) * sin) + (d2 * cos)) / d6;
        double d13 = (((-d3) * sin) + (d4 * cos)) / d6;
        double d14 = d12 - d13;
        double d15 = ((d * cos) + (d2 * sin)) / d10;
        double d16 = ((d3 * cos) + (d4 * sin)) / d10;
        double d17 = d15 - d16;
        double d18 = (d17 * d17) + (d14 * d14);
        if (d18 == eobe.a) {
            return;
        }
        double d19 = (1.0d / d18) - 0.25d;
        if (d19 < eobe.a) {
            double sqrt = (float) (Math.sqrt(d18) / 1.99999d);
            b(icvVar, d, d2, d3, d4, d10 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d19);
        double d20 = (d12 + d13) / 2.0d;
        double d21 = d17 * sqrt2;
        double d22 = (d15 + d16) / 2.0d;
        double d23 = sqrt2 * d14;
        if (z == z2) {
            d8 = d22 - d23;
            d9 = d20 + d21;
        } else {
            d8 = d22 + d23;
            d9 = d20 - d21;
        }
        double d24 = d9;
        double atan2 = Math.atan2(d12 - d9, d15 - d8);
        double atan22 = Math.atan2(d13 - d9, d16 - d8) - atan2;
        if (z2 != (atan22 >= eobe.a)) {
            atan22 += atan22 > eobe.a ? -6.283185307179586d : 6.283185307179586d;
        }
        double d25 = d8 * d10;
        double d26 = d24 * d6;
        double d27 = d25 * cos;
        double d28 = d26 * sin;
        double d29 = d25 * sin;
        double d30 = d26 * cos;
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(d11);
        double sin2 = Math.sin(d11);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d31 = -d10;
        double d32 = d31 * cos2;
        double d33 = d32 * sin3;
        double d34 = d6 * sin2;
        double d35 = d34 * cos3;
        double d36 = d31 * sin2;
        double d37 = d6 * cos2;
        double d38 = (sin3 * d36) + (cos3 * d37);
        double d39 = d2;
        double d40 = atan22;
        double d41 = d33 - d35;
        int i = 0;
        double d42 = d38;
        double d43 = atan2;
        double d44 = d;
        while (i < ceil) {
            int i2 = i;
            double d45 = d43 + (d40 / ceil);
            double sin4 = Math.sin(d45);
            double cos4 = Math.cos(d45);
            double d46 = d45 - d43;
            double tan = Math.tan(d46 / 2.0d);
            double sin5 = (Math.sin(d46) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
            double d47 = d39 + (d42 * sin5);
            int i3 = ceil;
            double d48 = d29 + d30 + (d10 * sin2 * cos4) + (d37 * sin4);
            double d49 = ((d27 - d28) + ((d10 * cos2) * cos4)) - (d34 * sin4);
            d42 = (sin4 * d36) + (cos4 * d37);
            d41 = (d32 * sin4) - (d34 * cos4);
            icvVar.d((float) (d44 + (d41 * sin5)), (float) d47, (float) (d49 - (sin5 * d41)), (float) (d48 - (sin5 * d42)), (float) d49, (float) d48);
            i = i2 + 1;
            d43 = d45;
            d44 = d49;
            cos2 = cos2;
            d36 = d36;
            d39 = d48;
            ceil = i3;
            sin2 = sin2;
            d10 = d5;
        }
    }
}
