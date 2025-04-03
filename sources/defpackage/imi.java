package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imi {
    private final boolean a;
    private final int b;
    private final img[] c;
    private int d;
    private final float[] e;
    private final float[] f;
    private final float[] g;
    private final int h;

    public imi() {
        this(0, 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r23) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.imi.a(float):float");
    }

    public final void b(long j, float f) {
        int i = (this.d + 1) % 20;
        this.d = i;
        img[] imgVarArr = this.c;
        img imgVar = imgVarArr[i];
        if (imgVar == null) {
            imgVarArr[i] = new img(j, f);
        } else {
            imgVar.a = j;
            imgVar.b = f;
        }
    }

    public final void c() {
        ffdo.d(r0, null, 0, this.c.length);
        this.d = 0;
    }

    public imi(byte[] bArr) {
        this(true, 2);
    }

    public imi(boolean z, int i) {
        int i2;
        this.a = z;
        this.h = i;
        if (z) {
            if (i == 0) {
                throw null;
            }
            if (i == 1) {
                throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
            }
        }
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i3 == 0) {
            i2 = 3;
        } else {
            if (i3 != 1) {
                throw new ffcd();
            }
            i2 = 2;
        }
        this.b = i2;
        this.c = new img[20];
        this.e = new float[20];
        this.f = new float[20];
        this.g = new float[3];
    }

    public /* synthetic */ imi(int i, int i2) {
        this(false, i | (((i2 & 2) != 0 ? 0 : 1) ^ 1));
    }
}
