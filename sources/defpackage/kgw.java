package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgw {
    protected final kgy b;
    private final kgx g;
    int a = 0;
    private int h = 8;
    public int[] c = new int[8];
    public int[] d = new int[8];
    public float[] e = new float[8];
    public int f = -1;
    private int i = -1;
    private boolean j = false;

    public kgw(kgx kgxVar, kgy kgyVar) {
        this.g = kgxVar;
        this.b = kgyVar;
    }

    public final float a(khe kheVar) {
        int i = this.f;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.c[i] == kheVar.c) {
                return this.e[i];
            }
            i = this.d[i];
        }
        return 0.0f;
    }

    public final float b(int i) {
        int i2 = this.f;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.e[i2];
            }
            i2 = this.d[i2];
        }
        return 0.0f;
    }

    public final float c(khe kheVar, boolean z) {
        int i = this.f;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.a) {
            if (this.c[i] == kheVar.c) {
                if (i == this.f) {
                    this.f = this.d[i];
                } else {
                    int[] iArr = this.d;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    kheVar.b(this.g);
                }
                kheVar.l--;
                this.a--;
                this.c[i] = -1;
                if (this.j) {
                    this.i = i;
                }
                return this.e[i];
            }
            i2++;
            i3 = i;
            i = this.d[i];
        }
        return 0.0f;
    }

    public final khe d(int i) {
        int i2 = this.f;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.b.a[this.c[i2]];
            }
            i2 = this.d[i2];
        }
        return null;
    }

    public final void e(khe kheVar, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f;
            if (i == -1) {
                this.f = 0;
                this.e[0] = f;
                this.c[0] = kheVar.c;
                this.d[0] = -1;
                kheVar.l++;
                kheVar.a(this.g);
                this.a++;
                if (this.j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int length = this.c.length;
                if (i2 >= length) {
                    this.j = true;
                    this.i = length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
                int i5 = this.c[i];
                int i6 = kheVar.c;
                if (i5 == i6) {
                    float[] fArr = this.e;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f) {
                            this.f = this.d[i];
                        } else {
                            int[] iArr = this.d;
                            iArr[i3] = iArr[i];
                        }
                        if (z) {
                            kheVar.b(this.g);
                        }
                        if (this.j) {
                            this.i = i;
                        }
                        kheVar.l--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.d[i];
            }
            int i7 = this.i;
            int i8 = i7 + 1;
            if (this.j) {
                int[] iArr2 = this.c;
                if (iArr2[i7] != -1) {
                    i7 = iArr2.length;
                }
            } else {
                i7 = i8;
            }
            int length2 = this.c.length;
            if (i7 >= length2 && this.a < length2) {
                int i9 = 0;
                while (true) {
                    int[] iArr3 = this.c;
                    if (i9 >= iArr3.length) {
                        break;
                    }
                    if (iArr3[i9] == -1) {
                        i7 = i9;
                        break;
                    }
                    i9++;
                }
            }
            int length3 = this.c.length;
            if (i7 >= length3) {
                int i10 = this.h;
                int i11 = i10 + i10;
                this.h = i11;
                this.j = false;
                this.i = length3 - 1;
                this.e = Arrays.copyOf(this.e, i11);
                this.c = Arrays.copyOf(this.c, this.h);
                this.d = Arrays.copyOf(this.d, this.h);
                i7 = length3;
            }
            this.c[i7] = kheVar.c;
            this.e[i7] = f;
            if (i3 != -1) {
                int[] iArr4 = this.d;
                iArr4[i7] = iArr4[i3];
                iArr4[i3] = i7;
            } else {
                this.d[i7] = this.f;
                this.f = i7;
            }
            kheVar.l++;
            kheVar.a(this.g);
            this.a++;
            if (!this.j) {
                this.i++;
            }
            int i12 = this.i;
            int length4 = this.c.length;
            if (i12 >= length4) {
                this.j = true;
                this.i = length4 - 1;
            }
        }
    }

    public final void f() {
        int i = this.f;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            khe kheVar = this.b.a[this.c[i]];
            if (kheVar != null) {
                kheVar.b(this.g);
            }
            i = this.d[i];
        }
        this.f = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }

    public final void g(khe kheVar, float f) {
        if (f == 0.0f) {
            c(kheVar, true);
            return;
        }
        int i = this.f;
        if (i == -1) {
            this.f = 0;
            this.e[0] = f;
            this.c[0] = kheVar.c;
            this.d[0] = -1;
            kheVar.l++;
            kheVar.a(this.g);
            this.a++;
            if (this.j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int length = this.c.length;
            if (i2 >= length) {
                this.j = true;
                this.i = length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
            int i5 = this.c[i];
            int i6 = kheVar.c;
            if (i5 == i6) {
                this.e[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.d[i];
        }
        int i7 = this.i;
        int i8 = i7 + 1;
        if (this.j) {
            int[] iArr = this.c;
            if (iArr[i7] != -1) {
                i7 = iArr.length;
            }
        } else {
            i7 = i8;
        }
        int length2 = this.c.length;
        if (i7 >= length2 && this.a < length2) {
            int i9 = 0;
            while (true) {
                int[] iArr2 = this.c;
                if (i9 >= iArr2.length) {
                    break;
                }
                if (iArr2[i9] == -1) {
                    i7 = i9;
                    break;
                }
                i9++;
            }
        }
        int length3 = this.c.length;
        if (i7 >= length3) {
            int i10 = this.h;
            int i11 = i10 + i10;
            this.h = i11;
            this.j = false;
            this.i = length3 - 1;
            this.e = Arrays.copyOf(this.e, i11);
            this.c = Arrays.copyOf(this.c, this.h);
            this.d = Arrays.copyOf(this.d, this.h);
            i7 = length3;
        }
        this.c[i7] = kheVar.c;
        this.e[i7] = f;
        if (i3 != -1) {
            int[] iArr3 = this.d;
            iArr3[i7] = iArr3[i3];
            iArr3[i3] = i7;
        } else {
            this.d[i7] = this.f;
            this.f = i7;
        }
        kheVar.l++;
        kheVar.a(this.g);
        int i12 = this.a + 1;
        this.a = i12;
        if (!this.j) {
            this.i++;
        }
        int length4 = this.c.length;
        if (i12 >= length4) {
            this.j = true;
        }
        if (this.i >= length4) {
            this.j = true;
            this.i = length4 - 1;
        }
    }

    public final String toString() {
        int i = this.f;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            String str2 = str.concat(" -> ") + this.e[i] + " : ";
            khe kheVar = this.b.a[this.c[i]];
            Objects.toString(kheVar);
            str = str2.concat(String.valueOf(kheVar));
            i = this.d[i];
        }
        return str;
    }
}
