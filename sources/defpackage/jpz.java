package defpackage;

import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpz {
    public final Layout a;
    private final List b;
    private final List c;
    private final boolean[] d;
    private char[] e;

    public jpz(Layout layout) {
        this.a = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int P = ffpc.P(this.a.getText(), '\n', i, 4);
            i = P < 0 ? this.a.getText().length() : P + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < this.a.getText().length());
        this.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.d = new boolean[this.b.size()];
        this.b.size();
    }

    private final float g(int i, boolean z) {
        Layout layout = this.a;
        int g = ffmk.g(i, layout.getLineEnd(layout.getLineForOffset(i)));
        return z ? this.a.getPrimaryHorizontal(g) : this.a.getSecondaryHorizontal(g);
    }

    public final float a(int i, boolean z, boolean z2) {
        int i2 = i;
        if (!z2) {
            return g(i, z);
        }
        int a = jpx.a(this.a, i2);
        int lineStart = this.a.getLineStart(a);
        int lineEnd = this.a.getLineEnd(a);
        if (i2 != lineStart && i2 != lineEnd) {
            return g(i, z);
        }
        if (i2 == 0 || i2 == this.a.getText().length()) {
            return g(i, z);
        }
        boolean z3 = true;
        int b = b(i2, true);
        boolean f = f(b);
        int d = d(lineEnd, lineStart);
        int c = c(b);
        int i3 = lineStart - c;
        int i4 = d - c;
        Bidi e = e(b);
        Bidi createLineBidi = e != null ? e.createLineBidi(i3, i4) : null;
        int i5 = 0;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = this.a.isRtlCharAt(lineStart);
            if (!z && f != isRtlCharAt) {
                z3 = f;
            } else if (f) {
                z3 = false;
            }
            return (i2 != lineStart ? z3 : !z3) ? this.a.getLineRight(a) : this.a.getLineLeft(a);
        }
        int runCount = createLineBidi.getRunCount();
        jpy[] jpyVarArr = new jpy[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            jpyVarArr[i6] = new jpy(createLineBidi.getRunStart(i6) + lineStart, createLineBidi.getRunLimit(i6) + lineStart, createLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) createLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, jpyVarArr, 0, runCount);
        if (i2 == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i8 = -1;
                    break;
                }
                if (jpyVarArr[i8].a == i2) {
                    break;
                }
                i8++;
            }
            jpy jpyVar = jpyVarArr[i8];
            if (z || f == jpyVar.c) {
                f = !f;
            }
            if (i8 != 0) {
                i5 = i8;
            } else if (f) {
                return this.a.getLineLeft(a);
            }
            return (i5 != ffdo.B(jpyVarArr) || f) ? f ? this.a.getPrimaryHorizontal(jpyVarArr[i5 - 1].a) : this.a.getPrimaryHorizontal(jpyVarArr[i5 + 1].a) : this.a.getLineRight(a);
        }
        if (i2 > d) {
            i2 = d(i2, lineStart);
        }
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i9 = -1;
                break;
            }
            if (jpyVarArr[i9].b == i2) {
                break;
            }
            i9++;
        }
        jpy jpyVar2 = jpyVarArr[i9];
        if (!z && f != jpyVar2.c) {
            f = !f;
        }
        if (i9 != 0) {
            i5 = i9;
        } else if (f) {
            return this.a.getLineLeft(a);
        }
        return (i5 != ffdo.B(jpyVarArr) || f) ? f ? this.a.getPrimaryHorizontal(jpyVarArr[i5 - 1].b) : this.a.getPrimaryHorizontal(jpyVarArr[i5 + 1].b) : this.a.getLineRight(a);
    }

    public final int b(int i, boolean z) {
        int m = ffdx.m(this.b, Integer.valueOf(i));
        int i2 = m < 0 ? -(m + 1) : m + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) this.b.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public final int c(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) this.b.get(i - 1)).intValue();
    }

    public final int d(int i, int i2) {
        while (i > i2) {
            int i3 = i - 1;
            char charAt = this.a.getText().charAt(i3);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760) {
                if (ffkj.a(charAt, 8192) >= 0 && ffkj.a(charAt, 8202) <= 0) {
                    if (charAt == 8199) {
                        charAt = 8199;
                    } else {
                        continue;
                    }
                }
                if (charAt != 8287 && charAt != 12288) {
                    break;
                }
            }
            i = i3;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r3.getRunCount() == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.text.Bidi e(int r11) {
        /*
            r10 = this;
            boolean[] r0 = r10.d
            boolean r0 = r0[r11]
            if (r0 == 0) goto Lf
            java.util.List r0 = r10.c
            java.lang.Object r11 = r0.get(r11)
            java.text.Bidi r11 = (java.text.Bidi) r11
            return r11
        Lf:
            r0 = 0
            if (r11 != 0) goto L14
            r1 = r0
            goto L22
        L14:
            java.util.List r1 = r10.b
            int r2 = r11 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List r2 = r10.b
            java.lang.Object r2 = r2.get(r11)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r10.e
            if (r3 == 0) goto L37
            int r4 = r3.length
            if (r4 >= r8) goto L39
        L37:
            char[] r3 = new char[r8]
        L39:
            r4 = r3
            android.text.Layout r3 = r10.a
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r4, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r4, r0, r8)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L5d
            boolean r9 = r10.f(r11)
            java.text.Bidi r3 = new java.text.Bidi
            r6 = 0
            r7 = 0
            r5 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r0 = r3.getRunCount()
            if (r0 != r1) goto L5e
        L5d:
            r3 = r2
        L5e:
            java.util.List r0 = r10.c
            r0.set(r11, r3)
            boolean[] r0 = r10.d
            r0[r11] = r1
            if (r3 == 0) goto L70
            char[] r11 = r10.e
            if (r4 != r11) goto L6f
            r4 = r2
            goto L70
        L6f:
            r4 = r11
        L70:
            r10.e = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jpz.e(int):java.text.Bidi");
    }

    public final boolean f(int i) {
        return this.a.getParagraphDirection(this.a.getLineForOffset(c(i))) == -1;
    }
}
