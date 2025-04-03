package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iyd extends iyb {
    public static iyd b;
    private static final jyi d = jyi.b;
    private static final jyi e = jyi.a;
    public jpg c;

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
        int i2;
        if (a().length() > 0 && i < a().length()) {
            if (i < 0) {
                jpg jpgVar = this.c;
                if (jpgVar == null) {
                    ffkj.c("layoutResult");
                    jpgVar = null;
                }
                i2 = jpgVar.h(0);
            } else {
                jpg jpgVar2 = this.c;
                if (jpgVar2 == null) {
                    ffkj.c("layoutResult");
                    jpgVar2 = null;
                }
                int h = jpgVar2.h(i);
                i2 = e(h, d) == i ? h : h + 1;
            }
            jpg jpgVar3 = this.c;
            if (jpgVar3 == null) {
                ffkj.c("layoutResult");
                jpgVar3 = null;
            }
            if (i2 < jpgVar3.f()) {
                return b(e(i2, d), e(i2, e) + 1);
            }
        }
        return null;
    }

    @Override // defpackage.iyg
    public final int[] d(int i) {
        int i2;
        if (a().length() > 0 && i > 0) {
            if (i > a().length()) {
                jpg jpgVar = this.c;
                if (jpgVar == null) {
                    ffkj.c("layoutResult");
                    jpgVar = null;
                }
                i2 = jpgVar.h(a().length());
            } else {
                jpg jpgVar2 = this.c;
                if (jpgVar2 == null) {
                    ffkj.c("layoutResult");
                    jpgVar2 = null;
                }
                int h = jpgVar2.h(i);
                i2 = e(h, e) + 1 == i ? h : h - 1;
            }
            if (i2 >= 0) {
                return b(e(i2, d), e(i2, e) + 1);
            }
        }
        return null;
    }
}
