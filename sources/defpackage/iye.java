package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iye extends iyb {
    public static iye b;
    private static final jyi e = jyi.b;
    private static final jyi f = jyi.a;
    public jpg c;
    public jjw d;

    public iye() {
        new Rect();
    }

    private final int e(int i, jyi jyiVar) {
        int g;
        jpg jpgVar = this.c;
        jpg jpgVar2 = null;
        if (jpgVar == null) {
            ffkj.c("layoutResult");
            jpgVar = null;
        }
        int j = jpgVar.j(i);
        jpg jpgVar3 = this.c;
        if (jpgVar3 == null) {
            ffkj.c("layoutResult");
            jpgVar3 = null;
        }
        if (jyiVar != jpgVar3.r(j)) {
            jpg jpgVar4 = this.c;
            if (jpgVar4 == null) {
                ffkj.c("layoutResult");
            } else {
                jpgVar2 = jpgVar4;
            }
            return jpgVar2.j(i);
        }
        jpg jpgVar5 = this.c;
        if (jpgVar5 == null) {
            ffkj.c("layoutResult");
        } else {
            jpgVar2 = jpgVar5;
        }
        g = jpgVar2.g(i, false);
        return g - 1;
    }

    @Override // defpackage.iyg
    public final int[] c(int i) {
        int f2;
        jpg jpgVar = null;
        if (a().length() > 0 && i < a().length()) {
            try {
                jjw jjwVar = this.d;
                if (jjwVar == null) {
                    ffkj.c("node");
                    jjwVar = null;
                }
                iam b2 = jjwVar.b();
                int round = Math.round(b2.e - b2.c);
                int f3 = ffmk.f(0, i);
                jpg jpgVar2 = this.c;
                if (jpgVar2 == null) {
                    ffkj.c("layoutResult");
                    jpgVar2 = null;
                }
                int h = jpgVar2.h(f3);
                jpg jpgVar3 = this.c;
                if (jpgVar3 == null) {
                    ffkj.c("layoutResult");
                    jpgVar3 = null;
                }
                float e2 = jpgVar3.e(h) + round;
                jpg jpgVar4 = this.c;
                if (jpgVar4 == null) {
                    ffkj.c("layoutResult");
                    jpgVar4 = null;
                }
                jpg jpgVar5 = this.c;
                if (jpgVar5 == null) {
                    ffkj.c("layoutResult");
                    jpgVar5 = null;
                }
                if (e2 < jpgVar4.e(jpgVar5.f() - 1)) {
                    jpg jpgVar6 = this.c;
                    if (jpgVar6 == null) {
                        ffkj.c("layoutResult");
                    } else {
                        jpgVar = jpgVar6;
                    }
                    f2 = jpgVar.i(e2);
                } else {
                    jpg jpgVar7 = this.c;
                    if (jpgVar7 == null) {
                        ffkj.c("layoutResult");
                    } else {
                        jpgVar = jpgVar7;
                    }
                    f2 = jpgVar.f();
                }
                return b(f3, e(f2 - 1, f) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.iyg
    public final int[] d(int i) {
        int i2;
        jpg jpgVar = null;
        if (a().length() > 0 && i > 0) {
            try {
                jjw jjwVar = this.d;
                if (jjwVar == null) {
                    ffkj.c("node");
                    jjwVar = null;
                }
                iam b2 = jjwVar.b();
                int round = Math.round(b2.e - b2.c);
                int g = ffmk.g(a().length(), i);
                jpg jpgVar2 = this.c;
                if (jpgVar2 == null) {
                    ffkj.c("layoutResult");
                    jpgVar2 = null;
                }
                int h = jpgVar2.h(g);
                jpg jpgVar3 = this.c;
                if (jpgVar3 == null) {
                    ffkj.c("layoutResult");
                    jpgVar3 = null;
                }
                float e2 = jpgVar3.e(h) - round;
                if (e2 > 0.0f) {
                    jpg jpgVar4 = this.c;
                    if (jpgVar4 == null) {
                        ffkj.c("layoutResult");
                    } else {
                        jpgVar = jpgVar4;
                    }
                    i2 = jpgVar.i(e2);
                } else {
                    i2 = 0;
                }
                if (g == a().length() && i2 < h) {
                    i2++;
                }
                return b(e(i2, e), g);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }
}
