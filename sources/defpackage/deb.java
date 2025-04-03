package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class deb implements dik {
    public long a = 9205357640488583168L;
    public final hho b;
    public long c;
    private final jzn d;
    private final dfx e;
    private boolean f;
    private long g;
    private final ilx h;
    private final isw i;

    public deb(Context context, jzn jznVar, long j, ebe ebeVar) {
        this.d = jznVar;
        dfx dfxVar = new dfx(context, iby.b(j));
        this.e = dfxVar;
        this.b = new hic(ffcu.a, hhs.a);
        this.g = 0L;
        this.c = -1L;
        dea deaVar = new dea(this);
        iki ikiVar = ilv.a;
        imf imfVar = new imf(null, null, null, deaVar);
        this.h = imfVar;
        this.i = Build.VERSION.SDK_INT >= 31 ? new djo(imfVar, this, dfxVar) : new dgl(imfVar, this, dfxVar, ebeVar);
    }

    private final float h(long j) {
        int i = (int) (j & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat((int) (b() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        float f = 1.0f - intBitsToFloat;
        EdgeEffect a = this.e.a();
        return dfv.a(a) == 0.0f ? (-dfv.c(a, -intBitsToFloat2, f)) * Float.intBitsToFloat((int) (4294967295L & this.g)) : Float.intBitsToFloat(i);
    }

    private final float i(long j) {
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (b() & 4294967295L));
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        float f = 1.0f - intBitsToFloat;
        EdgeEffect c = this.e.c();
        return dfv.a(c) == 0.0f ? dfv.c(c, intBitsToFloat2, f) * Float.intBitsToFloat((int) (this.g >> 32)) : Float.intBitsToFloat(i);
    }

    private final float j(long j) {
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (b() & 4294967295L));
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect e = this.e.e();
        return dfv.a(e) == 0.0f ? (-dfv.c(e, -intBitsToFloat2, intBitsToFloat)) * Float.intBitsToFloat((int) (this.g >> 32)) : Float.intBitsToFloat(i);
    }

    private final float k(long j) {
        int i = (int) (j & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat((int) (b() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect g = this.e.g();
        return dfv.a(g) == 0.0f ? dfv.c(g, intBitsToFloat2, intBitsToFloat) * Float.intBitsToFloat((int) (4294967295L & this.g)) : Float.intBitsToFloat(i);
    }

    private final void l() {
        boolean z;
        dfx dfxVar = this.e;
        EdgeEffect edgeEffect = dfxVar.b;
        boolean z2 = false;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = dfxVar.c;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = dfxVar.d;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = dfxVar.e;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (!edgeEffect4.isFinished() || z) {
                z2 = true;
            }
        } else {
            z2 = z;
        }
        if (z2) {
            e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0232 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0223  */
    @Override // defpackage.dik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(long r21, int r23, defpackage.ffji r24) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deb.a(long, int, ffji):long");
    }

    public final long b() {
        long j = this.a;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = ias.b(this.g);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    @Override // defpackage.dik
    public final isw c() {
        return this.i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        if (r13.a(r14, r0) == r1) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.dik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r11, defpackage.ffjm r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deb.d(long, ffjm, ffgu):java.lang.Object");
    }

    public final void e() {
        this.b.b(ffcu.a);
    }

    public final void f(long j) {
        long j2 = this.g;
        boolean f = iar.f(j2, 0L);
        boolean f2 = iar.f(j, j2);
        this.g = j;
        if (!f2) {
            dfx dfxVar = this.e;
            long b = (ffln.b(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (ffln.b(Float.intBitsToFloat((int) (j >> 32))) << 32);
            dfxVar.a = b;
            EdgeEffect edgeEffect = dfxVar.b;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (b >> 32), (int) (b & 4294967295L));
            }
            EdgeEffect edgeEffect2 = dfxVar.c;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (b >> 32), (int) (b & 4294967295L));
            }
            EdgeEffect edgeEffect3 = dfxVar.d;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (b & 4294967295L), (int) (b >> 32));
            }
            EdgeEffect edgeEffect4 = dfxVar.e;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (b & 4294967295L), (int) (b >> 32));
            }
            EdgeEffect edgeEffect5 = dfxVar.f;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (b >> 32), (int) (b & 4294967295L));
            }
            EdgeEffect edgeEffect6 = dfxVar.g;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (b >> 32), (int) (b & 4294967295L));
            }
            EdgeEffect edgeEffect7 = dfxVar.h;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (b & 4294967295L), (int) (b >> 32));
            }
            EdgeEffect edgeEffect8 = dfxVar.i;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (b & 4294967295L), (int) (b >> 32));
            }
        }
        if (f || f2) {
            return;
        }
        l();
    }

    @Override // defpackage.dik
    public final boolean g() {
        dfx dfxVar = this.e;
        EdgeEffect edgeEffect = dfxVar.b;
        if (edgeEffect != null && dfv.a(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = dfxVar.c;
        if (edgeEffect2 != null && dfv.a(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = dfxVar.d;
        if (edgeEffect3 != null && dfv.a(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = dfxVar.e;
        return (edgeEffect4 == null || dfv.a(edgeEffect4) == 0.0f) ? false : true;
    }
}
