package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ficq {
    protected fico[] a;
    protected fico[] b;
    private fici c;
    private fico d;

    public ficq(fici ficiVar, fico ficoVar) {
        int i;
        int b;
        int[] iArr;
        this.c = ficiVar;
        this.d = ficoVar;
        int c = ficoVar.c();
        this.a = new fico[c];
        int i2 = 0;
        while (true) {
            i = c >> 1;
            if (i2 >= i) {
                break;
            }
            int i3 = i2 + i2;
            int[] iArr2 = new int[i3 + 1];
            iArr2[i3] = 1;
            this.a[i2] = new fico(this.c, iArr2);
            i2++;
        }
        while (i < c) {
            int i4 = i + i;
            int[] iArr3 = new int[i4 + 1];
            iArr3[i4] = 1;
            fico ficoVar2 = new fico(this.c, iArr3);
            fico[] ficoVarArr = this.a;
            fico ficoVar3 = this.d;
            int[] iArr4 = ficoVar2.c;
            int[] iArr5 = ficoVar3.c;
            int a = fico.a(iArr5);
            if (a == -1) {
                throw new ArithmeticException("Division by zero");
            }
            int length = iArr4.length;
            int[] iArr6 = new int[length];
            int a2 = ficoVar2.a.a(fico.d(iArr5));
            System.arraycopy(iArr4, 0, iArr6, 0, length);
            while (a <= fico.a(iArr6)) {
                int b2 = ficoVar2.a.b(fico.d(iArr6), a2);
                int a3 = fico.a(iArr6) - a;
                int a4 = fico.a(iArr5);
                if (a4 == -1) {
                    iArr = new int[1];
                } else {
                    int[] iArr7 = new int[a4 + a3 + 1];
                    System.arraycopy(iArr5, 0, iArr7, a3, a4 + 1);
                    iArr = iArr7;
                }
                iArr6 = fico.i(ficoVar2.h(iArr, b2), iArr6);
            }
            ficoVarArr[i] = new fico(ficoVar2.a, iArr6);
            i++;
        }
        int c2 = this.d.c();
        fico[] ficoVarArr2 = new fico[c2];
        int i5 = c2 - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            ficoVarArr2[i6] = new fico(this.a[i6]);
        }
        this.b = new fico[c2];
        while (i5 >= 0) {
            this.b[i5] = new fico(this.c, i5);
            i5--;
        }
        int i7 = 0;
        while (i7 < c2) {
            int i8 = i7 + 1;
            if (ficoVarArr2[i7].b(i7) == 0) {
                boolean z = false;
                int i9 = i8;
                while (i9 < c2) {
                    if (ficoVarArr2[i9].b(i7) != 0) {
                        a(ficoVarArr2, i7, i9);
                        a(this.b, i7, i9);
                        i9 = c2;
                        z = true;
                    }
                    i9++;
                }
                if (!z) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int a5 = this.c.a(ficoVarArr2[i7].b(i7));
            ficoVarArr2[i7].g(a5);
            this.b[i7].g(a5);
            for (int i10 = 0; i10 < c2; i10++) {
                if (i10 != i7 && (b = ficoVarArr2[i10].b(i7)) != 0) {
                    fico e = ficoVarArr2[i7].e(b);
                    fico e2 = this.b[i7].e(b);
                    ficoVarArr2[i10].f(e);
                    this.b[i10].f(e2);
                }
            }
            i7 = i8;
        }
    }

    private static void a(fico[] ficoVarArr, int i, int i2) {
        fico ficoVar = ficoVarArr[i];
        ficoVarArr[i] = ficoVarArr[i2];
        ficoVarArr[i2] = ficoVar;
    }
}
