package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import java.text.Bidi;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqi {
    /* JADX WARN: Multi-variable type inference failed */
    public static final int a(jqh jqhVar, Layout layout, jpz jpzVar, int i, RectF rectF, jqp jqpVar, ffjm ffjmVar, boolean z) {
        int i2;
        jpy[] jpyVarArr;
        float f;
        int i3;
        jpy[] jpyVarArr2;
        int i4;
        int i5;
        int b;
        int i6;
        int g;
        float f2;
        int i7;
        int i8;
        int f3;
        int i9;
        float f4;
        Bidi createLineBidi;
        float c;
        float d;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i10 = lineEnd - lineStart;
        int i11 = i10 + i10;
        float[] fArr = new float[i11];
        int n = jqhVar.n(i);
        int k = jqhVar.k(i);
        int i12 = k - n;
        if (i11 < i12 + i12) {
            jwo.b("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        jpv jpvVar = new jpv(jqhVar);
        int i13 = 0;
        boolean z2 = jqhVar.o(i) == 1;
        int i14 = 0;
        while (n < k) {
            int i15 = n + 1;
            boolean s = jqhVar.s(n);
            if (z2 && !s) {
                c = jpvVar.a(n);
                d = jpvVar.b(i15);
            } else if (z2) {
                d = jpvVar.c(n);
                c = jpvVar.d(i15);
            } else if (s) {
                d = jpvVar.a(n);
                c = jpvVar.b(i15);
            } else {
                c = jpvVar.c(n);
                d = jpvVar.d(i15);
            }
            fArr[i14] = c;
            fArr[i14 + 1] = d;
            i14 += 2;
            n = i15;
        }
        int lineStart2 = jpzVar.a.getLineStart(i);
        int lineEnd2 = jpzVar.a.getLineEnd(i);
        int b2 = jpzVar.b(lineStart2, false);
        int c2 = jpzVar.c(b2);
        int i16 = lineStart2 - c2;
        int i17 = lineEnd2 - c2;
        Bidi e = jpzVar.e(b2);
        if (e == null || (createLineBidi = e.createLineBidi(i16, i17)) == null) {
            i2 = 0;
            jpyVarArr = new jpy[]{new jpy(lineStart2, lineEnd2, jpzVar.a.isRtlCharAt(lineStart2))};
        } else {
            int runCount = createLineBidi.getRunCount();
            jpyVarArr = new jpy[runCount];
            int i18 = 0;
            while (i18 < runCount) {
                int i19 = i13;
                Bidi bidi = createLineBidi;
                jpyVarArr[i18] = new jpy(createLineBidi.getRunStart(i18) + lineStart2, createLineBidi.getRunLimit(i18) + lineStart2, createLineBidi.getRunLevel(i18) % 2 == 1 ? 1 : i19);
                i18++;
                createLineBidi = bidi;
                i13 = i19;
            }
            i2 = i13;
        }
        ffmh ffmjVar = z ? new ffmj(i2, ffdo.B(jpyVarArr)) : new ffmh(ffdo.B(jpyVarArr), i2, -1);
        int i20 = ffmjVar.b;
        int i21 = ffmjVar.a;
        int i22 = ffmjVar.c;
        if ((i22 <= 0 || i21 > i20) && (i22 >= 0 || i20 > i21)) {
            return -1;
        }
        while (true) {
            jpy jpyVar = jpyVarArr[i21];
            boolean z3 = jpyVar.c;
            if (z3) {
                int i23 = (jpyVar.b - 1) - lineStart;
                f = fArr[i23 + i23];
            } else {
                int i24 = jpyVar.a - lineStart;
                f = fArr[i24 + i24];
            }
            float b3 = z3 ? b(jpyVar.a, lineStart, fArr) : b(jpyVar.b - 1, lineStart, fArr);
            if (z) {
                if (c(rectF, f, b3)) {
                    if ((jpyVar.c || rectF.left > f) && (!jpyVar.c || rectF.right < b3)) {
                        int i25 = jpyVar.a;
                        i8 = jpyVar.b;
                        while (i8 - i25 > 1) {
                            int i26 = (i8 + i25) / 2;
                            int i27 = i26 - lineStart;
                            float f5 = fArr[i27 + i27];
                            int i28 = i22;
                            if ((jpyVar.c || f5 <= rectF.left) && (!jpyVar.c || f5 >= rectF.right)) {
                                i25 = i26;
                            } else {
                                i8 = i26;
                            }
                            i22 = i28;
                        }
                        i3 = i22;
                        if (true != jpyVar.c) {
                            i8 = i25;
                        }
                    } else {
                        i8 = jpyVar.a;
                        i3 = i22;
                    }
                    int b4 = jqpVar.b(i8);
                    if (b4 != -1 && (f3 = jqpVar.f(b4)) < (i9 = jpyVar.b)) {
                        jpyVarArr2 = jpyVarArr;
                        g = ffmk.f(f3, jpyVar.a);
                        int g2 = ffmk.g(b4, i9);
                        RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        while (true) {
                            if (jpyVar.c) {
                                int i29 = (g2 - 1) - lineStart;
                                f4 = fArr[i29 + i29];
                            } else {
                                int i30 = g - lineStart;
                                f4 = fArr[i30 + i30];
                            }
                            rectF2.left = f4;
                            rectF2.right = jpyVar.c ? b(g, lineStart, fArr) : b(g2 - 1, lineStart, fArr);
                            if (!((Boolean) ffjmVar.a(rectF2, rectF)).booleanValue()) {
                                g = jqpVar.c(g);
                                if (g == -1 || g >= jpyVar.b) {
                                    break;
                                }
                                g2 = ffmk.g(jqpVar.b(g), jpyVar.b);
                            } else {
                                break;
                            }
                        }
                        i7 = g;
                    }
                } else {
                    i3 = i22;
                }
                jpyVarArr2 = jpyVarArr;
                i7 = -1;
            } else {
                i3 = i22;
                jpyVarArr2 = jpyVarArr;
                if (c(rectF, f, b3)) {
                    if ((jpyVar.c || rectF.right < b3) && (!jpyVar.c || rectF.left > f)) {
                        int i31 = jpyVar.a;
                        i4 = jpyVar.b;
                        while (i4 - i31 > 1) {
                            int i32 = (i4 + i31) / 2;
                            int i33 = i32 - lineStart;
                            float f6 = fArr[i33 + i33];
                            if ((jpyVar.c || f6 <= rectF.right) && (!jpyVar.c || f6 >= rectF.left)) {
                                i31 = i32;
                            } else {
                                i4 = i32;
                            }
                        }
                        i5 = 1;
                        if (true != jpyVar.c) {
                            i4 = i31;
                        }
                    } else {
                        i4 = jpyVar.b - 1;
                        i5 = 1;
                    }
                    int f7 = jqpVar.f(i4 + i5);
                    if (f7 != -1 && (b = jqpVar.b(f7)) > (i6 = jpyVar.a)) {
                        int f8 = ffmk.f(f7, i6);
                        g = ffmk.g(b, jpyVar.b);
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        while (true) {
                            if (jpyVar.c) {
                                int i34 = (g - 1) - lineStart;
                                f2 = fArr[i34 + i34];
                            } else {
                                int i35 = f8 - lineStart;
                                f2 = fArr[i35 + i35];
                            }
                            rectF3.left = f2;
                            rectF3.right = jpyVar.c ? b(f8, lineStart, fArr) : b(g - 1, lineStart, fArr);
                            if (!((Boolean) ffjmVar.a(rectF3, rectF)).booleanValue()) {
                                g = jqpVar.e(g);
                                if (g == -1 || g <= jpyVar.a) {
                                    break;
                                }
                                f8 = ffmk.f(jqpVar.f(g), jpyVar.a);
                            } else {
                                break;
                            }
                        }
                    }
                }
                i7 = -1;
            }
            if (i7 >= 0) {
                return i7;
            }
            if (i21 == i20) {
                return -1;
            }
            i21 += i3;
            jpyVarArr = jpyVarArr2;
            i22 = i3;
        }
    }

    private static final float b(int i, int i2, float[] fArr) {
        int i3 = i - i2;
        return fArr[i3 + i3 + 1];
    }

    private static final boolean c(RectF rectF, float f, float f2) {
        return f2 >= rectF.left && f <= rectF.right;
    }
}
