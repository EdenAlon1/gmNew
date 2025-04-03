package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nbg implements mzv, nau {
    public int i;
    public SurfaceTexture j;
    private byte[] m;
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final nbe c = new nbe();
    public final naw d = new naw();
    public final lvb e = new lvb();
    public final lvb f = new lvb();
    public final float[] g = new float[16];
    public final float[] h = new float[16];
    private volatile int k = 0;
    private int l = -1;

    @Override // defpackage.nau
    public final void a(long j, float[] fArr) {
        this.d.c.e(j, fArr);
    }

    @Override // defpackage.nau
    public final void b() {
        this.e.f();
        naw nawVar = this.d;
        nawVar.c.f();
        nawVar.d = false;
        this.b.set(true);
    }

    @Override // defpackage.mzv
    public final void c(long j, long j2, lqc lqcVar, MediaFormat mediaFormat) {
        this.e.e(j2, Long.valueOf(j));
        byte[] bArr = lqcVar.A;
        byte[] bArr2 = this.m;
        int i = this.l;
        this.m = bArr;
        int i2 = lqcVar.B;
        if (i2 == -1) {
            i2 = 0;
        }
        this.l = i2;
        if (i == i2 && Arrays.equals(bArr2, this.m)) {
            return;
        }
        byte[] bArr3 = this.m;
        nbb a = bArr3 != null ? nbc.a(bArr3, this.l) : null;
        if (a == null || !nbe.a(a)) {
            int i3 = this.l;
            int i4 = 1;
            lti.a(true);
            lti.a(true);
            lti.a(true);
            lti.a(true);
            lti.a(true);
            float radians = (float) Math.toRadians(180.0d);
            float radians2 = (float) Math.toRadians(360.0d);
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i5 < 36) {
                float f = radians / 36.0f;
                float f2 = radians / 2.0f;
                int i8 = i5 + 1;
                int i9 = 0;
                while (i9 < 73) {
                    float f3 = radians;
                    int i10 = 0;
                    while (i10 < 2) {
                        float f4 = (i8 * f) - f2;
                        float f5 = (i5 * f) - f2;
                        float f6 = (radians2 / 72.0f) * i9;
                        int i11 = i6 + 1;
                        float f7 = radians2;
                        double d = (f6 + 3.1415927f) - (radians2 / 2.0f);
                        double sin = Math.sin(d) * 50.0d;
                        double d2 = i10 == 0 ? f5 : f4;
                        fArr[i6] = -((float) (sin * Math.cos(d2)));
                        fArr[i11] = (float) (Math.sin(d2) * 50.0d);
                        int i12 = i6 + 3;
                        float f8 = f;
                        int i13 = i8;
                        fArr[i6 + 2] = (float) (Math.cos(d) * 50.0d * Math.cos(d2));
                        fArr2[i7] = f6 / f7;
                        int i14 = i7 + 2;
                        fArr2[i7 + 1] = ((i5 + i10) * f8) / f3;
                        if (i9 == 0) {
                            if (i10 == 0) {
                                i10 = 0;
                                System.arraycopy(fArr, i6, fArr, i12, 3);
                                i6 += 6;
                                System.arraycopy(fArr2, i7, fArr2, i14, 2);
                                i7 += 4;
                            }
                            i6 = i12;
                            i7 = i14;
                        } else {
                            if (i9 == 72 && i10 == 1) {
                                i10 = 1;
                                System.arraycopy(fArr, i6, fArr, i12, 3);
                                i6 += 6;
                                System.arraycopy(fArr2, i7, fArr2, i14, 2);
                                i7 += 4;
                            }
                            i6 = i12;
                            i7 = i14;
                        }
                        i10++;
                        f = f8;
                        i8 = i13;
                        radians2 = f7;
                    }
                    i9++;
                    radians = f3;
                    radians2 = radians2;
                }
                i5 = i8;
                i4 = 1;
            }
            int i15 = i4;
            nba nbaVar = new nba(0, fArr, fArr2, i15);
            nba[] nbaVarArr = new nba[i15];
            nbaVarArr[0] = nbaVar;
            naz nazVar = new naz(nbaVarArr);
            a = new nbb(nazVar, nazVar, i3);
        }
        this.f.e(j2, a);
    }
}
