package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndv {
    private final byte[] a = new byte[10];
    private boolean b;
    private int c;
    private long d;
    private int e;
    private int f;
    private int g;

    public final void a(ndu nduVar, ndt ndtVar) {
        if (this.c > 0) {
            nduVar.o(this.d, this.e, this.f, this.g, ndtVar);
            this.c = 0;
        }
    }

    public final void b() {
        this.b = false;
        this.c = 0;
    }

    public final void c(ndu nduVar, long j, int i, int i2, int i3, ndt ndtVar) {
        lti.d(this.g <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(nduVar, ndtVar);
            }
        }
    }

    public final void d(ncp ncpVar) {
        if (this.b) {
            return;
        }
        ncpVar.i(this.a, 0, 10);
        ncpVar.k();
        byte[] bArr = this.a;
        int[] iArr = nbp.a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.b = true;
        }
    }
}
