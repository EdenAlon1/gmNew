package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ay {
    public final ba b;
    private final az i;
    public int a = 0;
    private int j = 8;
    public int[] c = new int[8];
    public int[] d = new int[8];
    public float[] e = new float[8];
    public int f = -1;
    public int g = -1;
    public boolean h = false;

    public ay(az azVar, ba baVar) {
        this.i = azVar;
        this.b = baVar;
    }

    public final float a(be beVar) {
        int i = this.f;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.c[i] == beVar.a) {
                return this.e[i];
            }
            i = this.d[i];
        }
        return 0.0f;
    }

    final float b(int i) {
        int i2 = this.f;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.e[i2];
            }
            i2 = this.d[i2];
        }
        return 0.0f;
    }

    public final float c(be beVar) {
        int i = this.f;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.a) {
            int i4 = this.c[i];
            if (i4 == beVar.a) {
                if (i == this.f) {
                    this.f = this.d[i];
                } else {
                    int[] iArr = this.d;
                    iArr[i3] = iArr[i];
                }
                this.b.a[i4].a(this.i);
                this.a--;
                this.c[i] = -1;
                if (this.h) {
                    this.g = i;
                }
                return this.e[i];
            }
            i2++;
            i3 = i;
            i = this.d[i];
        }
        return 0.0f;
    }

    final be d(int i) {
        int i2 = this.f;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.b.a[this.c[i2]];
            }
            i2 = this.d[i2];
        }
        return null;
    }

    public final void e(be beVar, float f) {
        if (f == 0.0f) {
            return;
        }
        int i = this.f;
        if (i == -1) {
            this.f = 0;
            this.e[0] = f;
            this.c[0] = beVar.a;
            this.d[0] = -1;
            this.a++;
            if (this.h) {
                return;
            }
            this.g++;
            return;
        }
        int i2 = -1;
        for (int i3 = 0; i != -1 && i3 < this.a; i3++) {
            int i4 = this.c[i];
            int i5 = beVar.a;
            if (i4 == i5) {
                float[] fArr = this.e;
                float f2 = fArr[i] + f;
                fArr[i] = f2;
                if (f2 == 0.0f) {
                    if (i == this.f) {
                        this.f = this.d[i];
                    } else {
                        int[] iArr = this.d;
                        iArr[i2] = iArr[i];
                    }
                    this.b.a[i4].a(this.i);
                    if (this.h) {
                        this.g = i;
                    }
                    this.a--;
                    return;
                }
                return;
            }
            if (i4 < i5) {
                i2 = i;
            }
            i = this.d[i];
        }
        int i6 = this.g;
        int i7 = i6 + 1;
        if (this.h) {
            int[] iArr2 = this.c;
            if (iArr2[i6] != -1) {
                i6 = iArr2.length;
            }
        } else {
            i6 = i7;
        }
        int length = this.c.length;
        if (i6 >= length && this.a < length) {
            int i8 = 0;
            while (true) {
                int[] iArr3 = this.c;
                if (i8 >= iArr3.length) {
                    break;
                }
                if (iArr3[i8] == -1) {
                    i6 = i8;
                    break;
                }
                i8++;
            }
        }
        int length2 = this.c.length;
        if (i6 >= length2) {
            int i9 = this.j;
            int i10 = i9 + i9;
            this.j = i10;
            this.h = false;
            this.g = length2 - 1;
            this.e = Arrays.copyOf(this.e, i10);
            this.c = Arrays.copyOf(this.c, this.j);
            this.d = Arrays.copyOf(this.d, this.j);
            i6 = length2;
        }
        int[] iArr4 = this.c;
        iArr4[i6] = beVar.a;
        this.e[i6] = f;
        if (i2 != -1) {
            int[] iArr5 = this.d;
            iArr5[i6] = iArr5[i2];
            iArr5[i2] = i6;
        } else {
            this.d[i6] = this.f;
            this.f = i6;
        }
        this.a++;
        if (!this.h) {
            this.g++;
        }
        int i11 = this.g;
        int length3 = iArr4.length;
        if (i11 >= length3) {
            this.h = true;
            this.g = length3 - 1;
        }
    }

    public final void f(be beVar, float f) {
        if (f == 0.0f) {
            c(beVar);
            return;
        }
        int i = this.f;
        if (i == -1) {
            this.f = 0;
            this.e[0] = f;
            this.c[0] = beVar.a;
            this.d[0] = -1;
            this.a++;
            if (this.h) {
                return;
            }
            this.g++;
            return;
        }
        int i2 = -1;
        for (int i3 = 0; i != -1 && i3 < this.a; i3++) {
            int i4 = this.c[i];
            int i5 = beVar.a;
            if (i4 == i5) {
                this.e[i] = f;
                return;
            }
            if (i4 < i5) {
                i2 = i;
            }
            i = this.d[i];
        }
        int i6 = this.g;
        int i7 = i6 + 1;
        if (this.h) {
            int[] iArr = this.c;
            if (iArr[i6] != -1) {
                i6 = iArr.length;
            }
        } else {
            i6 = i7;
        }
        int length = this.c.length;
        if (i6 >= length && this.a < length) {
            int i8 = 0;
            while (true) {
                int[] iArr2 = this.c;
                if (i8 >= iArr2.length) {
                    break;
                }
                if (iArr2[i8] == -1) {
                    i6 = i8;
                    break;
                }
                i8++;
            }
        }
        int length2 = this.c.length;
        if (i6 >= length2) {
            int i9 = this.j;
            int i10 = i9 + i9;
            this.j = i10;
            this.h = false;
            this.g = length2 - 1;
            this.e = Arrays.copyOf(this.e, i10);
            this.c = Arrays.copyOf(this.c, this.j);
            this.d = Arrays.copyOf(this.d, this.j);
            i6 = length2;
        }
        int[] iArr3 = this.c;
        iArr3[i6] = beVar.a;
        this.e[i6] = f;
        if (i2 != -1) {
            int[] iArr4 = this.d;
            iArr4[i6] = iArr4[i2];
            iArr4[i2] = i6;
        } else {
            this.d[i6] = this.f;
            this.f = i6;
        }
        int i11 = this.a + 1;
        this.a = i11;
        if (!this.h) {
            this.g++;
        }
        if (i11 >= iArr3.length) {
            this.h = true;
        }
    }

    final void g(az azVar, az azVar2) {
        int i = this.f;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
                int i3 = this.c[i];
                be beVar = azVar2.a;
                if (i3 == beVar.a) {
                    float f = this.e[i];
                    c(beVar);
                    ay ayVar = azVar2.d;
                    int i4 = ayVar.f;
                    for (int i5 = 0; i4 != -1 && i5 < ayVar.a; i5++) {
                        e(this.b.a[ayVar.c[i4]], ayVar.e[i4] * f);
                        i4 = ayVar.d[i4];
                    }
                    azVar.b += azVar2.b * f;
                    azVar2.a.a(azVar);
                    i = this.f;
                } else {
                    i = this.d[i];
                }
            }
            return;
        }
    }

    public final String toString() {
        int i = this.f;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            String str2 = str.concat(" -> ") + this.e[i] + " : ";
            be beVar = this.b.a[this.c[i]];
            Objects.toString(beVar);
            str = str2.concat(String.valueOf(beVar));
            i = this.d[i];
        }
        return str;
    }
}
