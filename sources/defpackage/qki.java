package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qki implements qlf {
    private int a;

    public qki(int i) {
        this.a = i;
    }

    @Override // defpackage.qlf
    public final /* bridge */ /* synthetic */ Object a(qlk qlkVar, float f) {
        int i;
        char c;
        int i2;
        float f2;
        int argb;
        float f3;
        ArrayList arrayList = new ArrayList();
        int q = qlkVar.q();
        if (q == 1) {
            qlkVar.h();
        }
        while (qlkVar.o()) {
            arrayList.add(Float.valueOf((float) qlkVar.a()));
        }
        int i3 = 2;
        char c2 = 0;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.a = 2;
        }
        if (q == 1) {
            qlkVar.j();
        }
        int i4 = this.a;
        if (i4 == -1) {
            i4 = arrayList.size() / 4;
            this.a = i4;
        }
        float[] fArr = new float[i4];
        int[] iArr = new int[i4];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = this.a * 4;
            if (i5 >= i) {
                break;
            }
            int i8 = i5 / 4;
            double floatValue = ((Float) arrayList.get(i5)).floatValue();
            int i9 = i5 % 4;
            if (i9 == 0) {
                float f4 = (float) floatValue;
                if (i8 <= 0 || fArr[i8 - 1] < f4) {
                    fArr[i8] = f4;
                } else {
                    fArr[i8] = f4 + 0.01f;
                }
            } else if (i9 == 1) {
                i6 = (int) (floatValue * 255.0d);
            } else if (i9 == 2) {
                i7 = (int) (floatValue * 255.0d);
            } else if (i9 == 3) {
                iArr[i8] = Color.argb(PrivateKeyType.INVALID, i6, i7, (int) (floatValue * 255.0d));
            }
            i5++;
        }
        qim qimVar = new qim(fArr, iArr);
        if (arrayList.size() <= i) {
            return qimVar;
        }
        float[] fArr2 = qimVar.a;
        int[] iArr2 = qimVar.b;
        int size = (arrayList.size() - i) / 2;
        float[] fArr3 = new float[size];
        float[] fArr4 = new float[size];
        int i10 = 0;
        while (i < arrayList.size()) {
            if (i % 2 == 0) {
                fArr3[i10] = ((Float) arrayList.get(i)).floatValue();
            } else {
                fArr4[i10] = ((Float) arrayList.get(i)).floatValue();
                i10++;
            }
            i++;
        }
        float[] fArr5 = qimVar.a;
        int length = fArr5.length;
        if (length == 0) {
            fArr5 = fArr3;
        } else if (size != 0) {
            int i11 = length + size;
            float[] fArr6 = new float[i11];
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                float f5 = i13 < fArr5.length ? fArr5[i13] : Float.NaN;
                float f6 = i14 < size ? fArr3[i14] : Float.NaN;
                if (Float.isNaN(f6) || f5 < f6) {
                    fArr6[i15] = f5;
                    i13++;
                } else {
                    i14++;
                    if (Float.isNaN(f5) || f6 < f5) {
                        fArr6[i15] = f6;
                    } else {
                        i13++;
                        fArr6[i15] = f5;
                        i12++;
                    }
                }
            }
            fArr5 = i12 == 0 ? fArr6 : Arrays.copyOf(fArr6, i11 - i12);
        }
        int length2 = fArr5.length;
        int[] iArr3 = new int[length2];
        int i16 = 0;
        while (i16 < length2) {
            float f7 = fArr5[i16];
            int binarySearch = Arrays.binarySearch(fArr2, f7);
            int binarySearch2 = Arrays.binarySearch(fArr3, f7);
            if (binarySearch < 0 || binarySearch2 > 0) {
                c = c2;
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                float f8 = fArr4[binarySearch2];
                if (iArr2.length < i3 || f7 == fArr2[c]) {
                    i2 = iArr2[c];
                } else {
                    int i17 = 1;
                    while (true) {
                        int length3 = fArr2.length;
                        if (i17 >= length3) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f2 = fArr2[i17];
                        if (f2 >= f7 || i17 == length3 - 1) {
                            break;
                        }
                        i17++;
                    }
                    int i18 = i17 - 1;
                    float f9 = fArr2[i18];
                    int i19 = iArr2[i17];
                    int i20 = iArr2[i18];
                    float f10 = (f7 - f9) / (f2 - f9);
                    i2 = Color.argb((int) (f8 * 255.0f), qln.a(f10, Color.red(i20), Color.red(i19)), qln.a(f10, Color.green(i20), Color.green(i19)), qln.a(f10, Color.blue(i20), Color.blue(i19)));
                }
                iArr3[i16] = i2;
            } else {
                int i21 = iArr2[binarySearch];
                if (size >= i3 && f7 > fArr3[c2]) {
                    int i22 = 1;
                    while (i22 < size) {
                        float f11 = fArr3[i22];
                        if (f11 < f7) {
                            c = c2;
                            if (i22 != size - 1) {
                                i22++;
                                c2 = c;
                            }
                        } else {
                            c = c2;
                        }
                        if (f11 <= f7) {
                            f3 = fArr4[i22];
                        } else {
                            int i23 = i22 - 1;
                            float f12 = fArr3[i23];
                            float f13 = f11 - f12;
                            float f14 = f7 - f12;
                            float f15 = fArr4[i23];
                            float f16 = fArr4[i22];
                            PointF pointF = qlr.a;
                            f3 = f15 + ((f14 / f13) * (f16 - f15));
                        }
                        argb = Color.argb((int) (f3 * 255.0f), Color.red(i21), Color.green(i21), Color.blue(i21));
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                c = c2;
                argb = Color.argb((int) (fArr4[c] * 255.0f), Color.red(i21), Color.green(i21), Color.blue(i21));
                iArr3[i16] = argb;
            }
            i16++;
            c2 = c;
            i3 = 2;
        }
        return new qim(fArr5, iArr3);
    }
}
