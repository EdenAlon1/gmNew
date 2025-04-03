package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.text.Layout$TextInclusionStrategy;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jlf implements jmf {
    public final jwx a;
    public final jqh b;
    public final CharSequence c;
    public final List d;
    private final int e;
    private final int f;
    private final long g;

    /* JADX WARN: Removed duplicated region for block: B:145:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jlf(defpackage.jwx r24, int r25, int r26, long r27) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jlf.<init>(jwx, int, int, long):void");
    }

    static /* synthetic */ jqh l(jlf jlfVar, int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7) {
        return jlfVar.o(i, i2, truncateAt, i3, i4, i5, i6, i7, jlfVar.c);
    }

    private final jqh o(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        jwx jwxVar = this.a;
        return new jqh(charSequence, f(), i(), i, truncateAt, jwxVar.g, jwv.a(jwxVar.a), i3, i5, i6, i7, i4, i2, jwxVar.e);
    }

    private final void p(ibt ibtVar) {
        Canvas a = iav.a(ibtVar);
        if (k()) {
            a.save();
            a.clipRect(0.0f, 0.0f, f(), b());
        }
        jqh jqhVar = this.b;
        if (a.getClipBounds(jqhVar.j)) {
            int i = jqhVar.g;
            if (i != 0) {
                a.translate(0.0f, i);
            }
            jqg jqgVar = jqj.a;
            jqgVar.a = a;
            jqhVar.e.draw(jqgVar);
            int i2 = jqhVar.g;
            if (i2 != 0) {
                a.translate(0.0f, -i2);
            }
        }
        if (k()) {
            a.restore();
        }
    }

    @Override // defpackage.jmf
    public final float a() {
        return e(0);
    }

    @Override // defpackage.jmf
    public final float b() {
        return this.b.h();
    }

    @Override // defpackage.jmf
    public final float c(int i, boolean z) {
        float f;
        if (!z) {
            return this.b.g(i, false);
        }
        f = this.b.f(i, false);
        return f;
    }

    @Override // defpackage.jmf
    public final float d() {
        return e(g() - 1);
    }

    public final float e(int i) {
        return this.b.b(i);
    }

    @Override // defpackage.jmf
    public final float f() {
        return jzk.b(this.g);
    }

    @Override // defpackage.jmf
    public final int g() {
        return this.b.f;
    }

    @Override // defpackage.jmf
    public final long h(iam iamVar, int i, jpd jpdVar) {
        jqp jqnVar;
        int i2;
        int[] iArr;
        boolean a = joy.a(i, 0);
        RectF c = icz.c(iamVar);
        boolean z = !a && joy.a(i, 1);
        jqh jqhVar = this.b;
        final jle jleVar = new jle(jpdVar);
        if (Build.VERSION.SDK_INT >= 34) {
            iArr = jqhVar.e.getRangeForRect(c, z ? new jql(new jqs(jqhVar.r(), jqhVar.q())) : new GraphemeClusterSegmentFinder(jqhVar.r(), jqhVar.a), new Layout$TextInclusionStrategy() { // from class: jpt
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) ffjm.this.a(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            Layout layout = jqhVar.e;
            jpz p = jqhVar.p();
            if (z) {
                jqnVar = new jqs(jqhVar.r(), jqhVar.q());
            } else {
                CharSequence r = jqhVar.r();
                jqnVar = Build.VERSION.SDK_INT >= 29 ? new jqn(r, jqhVar.a) : new jqo(r);
            }
            int lineForVertical = layout.getLineForVertical((int) c.top);
            int[] iArr2 = null;
            if (c.top <= jqhVar.c(lineForVertical) || (lineForVertical = lineForVertical + 1) < jqhVar.f) {
                int i3 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) c.bottom);
                if (lineForVertical2 == 0) {
                    if (c.bottom >= jqhVar.e(0)) {
                        lineForVertical2 = 0;
                    }
                }
                int a2 = jqi.a(jqhVar, layout, p, i3, c, jqnVar, jleVar, true);
                while (true) {
                    i2 = i3;
                    if (a2 != -1 || i2 >= lineForVertical2) {
                        break;
                    }
                    i3 = i2 + 1;
                    a2 = jqi.a(jqhVar, layout, p, i3, c, jqnVar, jleVar, true);
                }
                if (a2 != -1) {
                    int i4 = lineForVertical2;
                    int a3 = jqi.a(jqhVar, layout, p, i4, c, jqnVar, jleVar, false);
                    while (a3 == -1 && i2 < i4) {
                        i4--;
                        a3 = jqi.a(jqhVar, layout, p, i4, c, jqnVar, jleVar, false);
                    }
                    if (a3 != -1) {
                        iArr2 = new int[]{jqnVar.f(a2 + 1), jqnVar.b(a3 - 1)};
                    }
                }
            }
            iArr = iArr2;
        }
        if (iArr == null) {
            return jpm.a;
        }
        long a4 = jpn.a(iArr[0], iArr[1]);
        long j = jpm.a;
        return a4;
    }

    public final jxa i() {
        return this.a.c;
    }

    @Override // defpackage.jmf
    public final jyi j(int i) {
        return this.b.s(i) ? jyi.b : jyi.a;
    }

    @Override // defpackage.jmf
    public final boolean k() {
        return this.b.d;
    }

    @Override // defpackage.jmf
    public final void m(ibt ibtVar, long j, idg idgVar, jyk jykVar, ifs ifsVar) {
        int i = i().a;
        jxa i2 = i();
        i2.c(j);
        i2.e(idgVar);
        i2.f(jykVar);
        i2.d(ifsVar);
        i2.a(3);
        p(ibtVar);
        i().a(i);
    }

    @Override // defpackage.jmf
    public final void n(ibt ibtVar, ibq ibqVar, float f, idg idgVar, jyk jykVar, ifs ifsVar) {
        int i = i().a;
        jxa i2 = i();
        float f2 = f();
        float b = b();
        i2.b(ibqVar, (Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), f);
        i2.e(idgVar);
        i2.f(jykVar);
        i2.d(ifsVar);
        i2.a(3);
        p(ibtVar);
        i().a(i);
    }
}
