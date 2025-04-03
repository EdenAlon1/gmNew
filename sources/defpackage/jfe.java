package defpackage;

import android.graphics.Outline;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jfe {
    public boolean a;
    private boolean b = true;
    private final Outline c;
    private icr d;
    private icv e;
    private icv f;
    private boolean g;
    private icv h;
    private iao i;
    private float j;
    private long k;
    private long l;
    private boolean m;

    public jfe() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.c = outline;
        this.k = 0L;
        this.l = 0L;
    }

    private final void g() {
        if (this.a) {
            this.k = 0L;
            this.j = 0.0f;
            this.f = null;
            this.a = false;
            this.g = false;
            icr icrVar = this.d;
            if (icrVar == null || !this.m || Float.intBitsToFloat((int) (this.l >> 32)) <= 0.0f || Float.intBitsToFloat((int) (this.l & 4294967295L)) <= 0.0f) {
                this.c.setEmpty();
                return;
            }
            this.b = true;
            if (icrVar instanceof icp) {
                iam iamVar = ((icp) icrVar).a;
                this.k = (Float.floatToRawIntBits(iamVar.b) << 32) | (Float.floatToRawIntBits(iamVar.c) & 4294967295L);
                float f = iamVar.d - iamVar.b;
                this.l = (Float.floatToRawIntBits(iamVar.e - iamVar.c) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
                this.c.setRect(Math.round(iamVar.b), Math.round(iamVar.c), Math.round(iamVar.d), Math.round(iamVar.e));
                return;
            }
            if (!(icrVar instanceof icq)) {
                if (icrVar instanceof ico) {
                    h(((ico) icrVar).a);
                    return;
                }
                return;
            }
            iao iaoVar = ((icq) icrVar).a;
            long j = iaoVar.e >> 32;
            float f2 = iaoVar.a;
            float intBitsToFloat = Float.intBitsToFloat((int) j);
            this.k = (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(iaoVar.b) & 4294967295L);
            float b = iaoVar.b();
            this.l = (Float.floatToRawIntBits(iaoVar.a()) & 4294967295L) | (Float.floatToRawIntBits(b) << 32);
            if (iap.c(iaoVar)) {
                this.c.setRoundRect(Math.round(iaoVar.a), Math.round(iaoVar.b), Math.round(iaoVar.c), Math.round(iaoVar.d), intBitsToFloat);
                this.j = intBitsToFloat;
                return;
            }
            icv icvVar = this.e;
            if (icvVar == null) {
                icvVar = new ibc((byte[]) null);
                this.e = icvVar;
            }
            icvVar.k();
            icvVar.s(iaoVar);
            h(icvVar);
        }
    }

    private final void h(icv icvVar) {
        if (Build.VERSION.SDK_INT > 28 || icvVar.o()) {
            if (Build.VERSION.SDK_INT >= 30) {
                jff.a.a(this.c, icvVar);
            } else {
                this.c.setConvexPath(((ibc) icvVar).a);
            }
            this.g = !this.c.canClip();
        } else {
            this.b = false;
            this.c.setEmpty();
            this.g = true;
        }
        this.f = icvVar;
    }

    public final Outline a() {
        g();
        if (this.m && this.b) {
            return this.c;
        }
        return null;
    }

    public final icv b() {
        g();
        return this.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (java.lang.Float.intBitsToFloat((int) (r5.e >> 32)) == r0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.ibt r15) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jfe.c(ibt):void");
    }

    public final boolean d() {
        return !this.g;
    }

    public final boolean e(long j) {
        icr icrVar;
        if (this.m && (icrVar = this.d) != null) {
            return jfv.a(icrVar, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        return true;
    }

    public final boolean f(icr icrVar, float f, boolean z, float f2, long j) {
        this.c.setAlpha(f);
        boolean e = ffkj.e(this.d, icrVar);
        boolean z2 = !e;
        if (!e) {
            this.d = icrVar;
            this.a = true;
        }
        this.l = j;
        boolean z3 = false;
        if (icrVar != null && (z || f2 > 0.0f)) {
            z3 = true;
        }
        if (this.m != z3) {
            this.m = z3;
            this.a = true;
        }
        return z2;
    }
}
