package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deud {
    public int[] a;
    public long[] b;
    private final deua c;
    private boolean[] d;
    private long[] e;

    public deud(deua deuaVar) {
        this.c = deuaVar;
    }

    private static final boolean A(int i, int i2, deub deubVar) {
        return i == i2 + (-1) && deubVar.a() != 0;
    }

    private final int B(deuh deuhVar, int i) {
        deua deuaVar = this.c;
        int r = this.c.r(deuaVar.aE() + deuaVar.az() + deuhVar.topMargin + deuhVar.bottomMargin + i, deuhVar.height);
        int size = View.MeasureSpec.getSize(r);
        int i2 = deuhVar.l;
        if (size > i2) {
            return View.MeasureSpec.makeMeasureSpec(i2, View.MeasureSpec.getMode(r));
        }
        int i3 = deuhVar.j;
        return size < i3 ? View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(r)) : r;
    }

    private final int C(deuh deuhVar, int i) {
        deua deuaVar = this.c;
        int s = this.c.s(deuaVar.aB() + deuaVar.aC() + deuhVar.leftMargin + deuhVar.rightMargin + i, deuhVar.width);
        int size = View.MeasureSpec.getSize(s);
        int i2 = deuhVar.k;
        if (size > i2) {
            return View.MeasureSpec.makeMeasureSpec(i2, View.MeasureSpec.getMode(s));
        }
        int i3 = deuhVar.i;
        return size < i3 ? View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(s)) : s;
    }

    static final long i(int i, int i2) {
        return (i & 4294967295L) | (i2 << 32);
    }

    public static final int k(long j) {
        return (int) (j >> 32);
    }

    private final void n(View view, int i) {
        boolean z;
        deuh deuhVar = (deuh) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = deuhVar.i;
        boolean z2 = true;
        if (measuredWidth >= i2 && measuredWidth <= (i2 = deuhVar.k)) {
            z = false;
        } else {
            measuredWidth = i2;
            z = true;
        }
        int i3 = deuhVar.j;
        if (measuredHeight < i3) {
            measuredHeight = i3;
        } else {
            int i4 = deuhVar.l;
            if (measuredHeight > i4) {
                measuredHeight = i4;
            } else {
                z2 = z;
            }
        }
        if (z2) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            s(i, makeMeasureSpec, makeMeasureSpec2, view);
            this.c.n(i, view);
        }
    }

    private final void o(int i, int i2, deub deubVar, int i3, int i4, boolean z) {
        int i5;
        float f;
        int i6;
        double d;
        double d2;
        float f2 = deubVar.f;
        float f3 = 0.0f;
        if (f2 <= 0.0f || i3 < (i5 = deubVar.a)) {
            return;
        }
        float f4 = (i3 - i5) / f2;
        deubVar.a = i4 + deubVar.b;
        int i7 = 0;
        if (!z) {
            deubVar.c = Integer.MIN_VALUE;
        }
        boolean z2 = false;
        int i8 = 0;
        float f5 = 0.0f;
        while (i7 < deubVar.d) {
            int i9 = deubVar.k + i7;
            View l = this.c.l(i9);
            if (l.getVisibility() != 8) {
                deuh deuhVar = (deuh) l.getLayoutParams();
                int c = this.c.c();
                f = f3;
                if (c == 0 || c == 1) {
                    int measuredWidth = l.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i9];
                    }
                    int measuredHeight = l.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = k(jArr2[i9]);
                    }
                    if (!this.d[i9]) {
                        float f6 = deuhVar.a;
                        if (f6 > f) {
                            float f7 = measuredWidth + (f6 * f4);
                            if (i7 == deubVar.d - 1) {
                                f7 += f5;
                                f5 = f;
                            }
                            int round = Math.round(f7);
                            int i10 = deuhVar.k;
                            if (round > i10) {
                                this.d[i9] = true;
                                deubVar.f -= deuhVar.a;
                                z2 = true;
                                round = i10;
                            } else {
                                f5 += f7 - round;
                                double d3 = f5;
                                if (d3 > 1.0d) {
                                    round++;
                                    d = d3 - 1.0d;
                                } else if (d3 < -1.0d) {
                                    round--;
                                    d = d3 + 1.0d;
                                }
                                f5 = (float) d;
                            }
                            int B = B(deuhVar, deubVar.i);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            l.measure(makeMeasureSpec, B);
                            int measuredWidth2 = l.getMeasuredWidth();
                            int measuredHeight2 = l.getMeasuredHeight();
                            s(i9, makeMeasureSpec, B, l);
                            this.c.n(i9, l);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                    }
                    int max = Math.max(i8, measuredHeight + deuhVar.topMargin + deuhVar.bottomMargin + this.c.b(l));
                    deubVar.a += measuredWidth + deuhVar.leftMargin + deuhVar.rightMargin;
                    i6 = max;
                } else {
                    int measuredHeight3 = l.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = k(jArr3[i9]);
                    }
                    int measuredWidth3 = l.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i9];
                    }
                    if (!this.d[i9]) {
                        float f8 = deuhVar.a;
                        if (f8 > f) {
                            float f9 = measuredHeight3 + (f8 * f4);
                            if (i7 == deubVar.d - 1) {
                                f9 += f5;
                                f5 = f;
                            }
                            int round2 = Math.round(f9);
                            int i11 = deuhVar.l;
                            if (round2 > i11) {
                                this.d[i9] = true;
                                deubVar.f -= deuhVar.a;
                                z2 = true;
                                round2 = i11;
                            } else {
                                f5 += f9 - round2;
                                double d4 = f5;
                                if (d4 > 1.0d) {
                                    round2++;
                                    d2 = d4 - 1.0d;
                                } else if (d4 < -1.0d) {
                                    round2--;
                                    d2 = d4 + 1.0d;
                                }
                                f5 = (float) d2;
                            }
                            int C = C(deuhVar, deubVar.i);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            l.measure(C, makeMeasureSpec2);
                            int measuredWidth4 = l.getMeasuredWidth();
                            int measuredHeight4 = l.getMeasuredHeight();
                            s(i9, C, makeMeasureSpec2, l);
                            this.c.n(i9, l);
                            measuredWidth3 = measuredWidth4;
                            measuredHeight3 = measuredHeight4;
                        }
                    }
                    i6 = Math.max(i8, measuredWidth3 + deuhVar.leftMargin + deuhVar.rightMargin + this.c.b(l));
                    deubVar.a += measuredHeight3 + deuhVar.topMargin + deuhVar.bottomMargin;
                }
                deubVar.c = Math.max(deubVar.c, i6);
                i8 = i6;
            } else {
                f = f3;
            }
            i7++;
            f3 = f;
        }
        if (!z2 || i5 == deubVar.a) {
            return;
        }
        o(i, i2, deubVar, i3, i4, true);
    }

    private final void p(int i, int i2, deub deubVar, int i3, int i4, boolean z) {
        float f;
        int i5;
        int i6 = deubVar.a;
        float f2 = deubVar.g;
        float f3 = 0.0f;
        if (f2 <= 0.0f || i3 > i6) {
            return;
        }
        float f4 = (i6 - i3) / f2;
        deubVar.a = i4 + deubVar.b;
        int i7 = 0;
        if (!z) {
            deubVar.c = Integer.MIN_VALUE;
        }
        boolean z2 = false;
        int i8 = 0;
        float f5 = 0.0f;
        while (i7 < deubVar.d) {
            int i9 = deubVar.k + i7;
            View l = this.c.l(i9);
            if (l.getVisibility() != 8) {
                deuh deuhVar = (deuh) l.getLayoutParams();
                int c = this.c.c();
                f = f3;
                if (c == 0 || c == 1) {
                    int measuredWidth = l.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i9];
                    }
                    int measuredHeight = l.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = k(jArr2[i9]);
                    }
                    if (!this.d[i9]) {
                        float f6 = deuhVar.b;
                        if (f6 > f) {
                            float f7 = measuredWidth - (f6 * f4);
                            if (i7 == deubVar.d - 1) {
                                f7 += f5;
                                f5 = f;
                            }
                            int round = Math.round(f7);
                            int i10 = deuhVar.i;
                            if (round < i10) {
                                this.d[i9] = true;
                                deubVar.g -= deuhVar.b;
                                z2 = true;
                                round = i10;
                            } else {
                                f5 += f7 - round;
                                double d = f5;
                                if (d > 1.0d) {
                                    round++;
                                    f5 -= 1.0f;
                                } else if (d < -1.0d) {
                                    round--;
                                    f5 += 1.0f;
                                }
                            }
                            int B = B(deuhVar, deubVar.i);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            l.measure(makeMeasureSpec, B);
                            int measuredWidth2 = l.getMeasuredWidth();
                            int measuredHeight2 = l.getMeasuredHeight();
                            s(i9, makeMeasureSpec, B, l);
                            this.c.n(i9, l);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                    }
                    int max = Math.max(i8, measuredHeight + deuhVar.topMargin + deuhVar.bottomMargin + this.c.b(l));
                    deubVar.a += measuredWidth + deuhVar.leftMargin + deuhVar.rightMargin;
                    i5 = max;
                } else {
                    int measuredHeight3 = l.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = k(jArr3[i9]);
                    }
                    int measuredWidth3 = l.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i9];
                    }
                    if (!this.d[i9]) {
                        float f8 = deuhVar.b;
                        if (f8 > f) {
                            float f9 = measuredHeight3 - (f8 * f4);
                            if (i7 == deubVar.d - 1) {
                                f9 += f5;
                                f5 = f;
                            }
                            int round2 = Math.round(f9);
                            int i11 = deuhVar.j;
                            if (round2 < i11) {
                                this.d[i9] = true;
                                deubVar.g -= deuhVar.b;
                                z2 = true;
                                round2 = i11;
                            } else {
                                f5 += f9 - round2;
                                double d2 = f5;
                                if (d2 > 1.0d) {
                                    round2++;
                                    f5 -= 1.0f;
                                } else if (d2 < -1.0d) {
                                    round2--;
                                    f5 += 1.0f;
                                }
                            }
                            int C = C(deuhVar, deubVar.i);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            l.measure(C, makeMeasureSpec2);
                            int measuredWidth4 = l.getMeasuredWidth();
                            int measuredHeight4 = l.getMeasuredHeight();
                            s(i9, C, makeMeasureSpec2, l);
                            this.c.n(i9, l);
                            measuredWidth3 = measuredWidth4;
                            measuredHeight3 = measuredHeight4;
                        }
                    }
                    i5 = Math.max(i8, measuredWidth3 + deuhVar.leftMargin + deuhVar.rightMargin + this.c.b(l));
                    deubVar.a += measuredHeight3 + deuhVar.topMargin + deuhVar.bottomMargin;
                }
                deubVar.c = Math.max(deubVar.c, i5);
                i8 = i5;
            } else {
                f = f3;
            }
            i7++;
            f3 = f;
        }
        if (!z2 || i6 == deubVar.a) {
            return;
        }
        p(i, i2, deubVar, i3, i4, true);
    }

    private final void q(View view, int i, int i2) {
        deuh deuhVar = (deuh) view.getLayoutParams();
        int min = Math.min(Math.max(((i - deuhVar.leftMargin) - deuhVar.rightMargin) - this.c.b(view), deuhVar.i), deuhVar.k);
        long[] jArr = this.e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? k(jArr[i2]) : view.getMeasuredHeight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        s(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.c.n(i2, view);
    }

    private final void r(View view, int i, int i2) {
        deuh deuhVar = (deuh) view.getLayoutParams();
        int min = Math.min(Math.max(((i - deuhVar.topMargin) - deuhVar.bottomMargin) - this.c.b(view), deuhVar.j), deuhVar.l);
        long[] jArr = this.e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        s(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.c.n(i2, view);
    }

    private final void s(int i, int i2, int i3, View view) {
        long[] jArr = this.b;
        if (jArr != null) {
            jArr[i] = i(i2, i3);
        }
        long[] jArr2 = this.e;
        if (jArr2 != null) {
            jArr2[i] = i(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private static final void t(List list, deub deubVar, int i, int i2) {
        deubVar.i = i2;
        deubVar.l = i;
        list.add(deubVar);
    }

    private static final int u(deuh deuhVar, boolean z) {
        return z ? deuhVar.bottomMargin : deuhVar.rightMargin;
    }

    private static final int v(deuh deuhVar, boolean z) {
        return z ? deuhVar.rightMargin : deuhVar.bottomMargin;
    }

    private static final int w(deuh deuhVar, boolean z) {
        return z ? deuhVar.topMargin : deuhVar.leftMargin;
    }

    private static final int x(deuh deuhVar, boolean z) {
        return z ? deuhVar.leftMargin : deuhVar.topMargin;
    }

    private static final int y(deuh deuhVar, boolean z) {
        return z ? deuhVar.height : deuhVar.width;
    }

    private static final int z(View view, boolean z) {
        return z ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    public final void a(List list, int i) {
        int i2 = this.a[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.a;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.b;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    public final void b(int i, int i2, int i3) {
        int size;
        int aB;
        int aC;
        int i4;
        int i5;
        int g = this.c.g();
        boolean[] zArr = this.d;
        if (zArr == null) {
            this.d = new boolean[Math.max(g, 10)];
        } else {
            int length = zArr.length;
            if (length < g) {
                this.d = new boolean[Math.max(length + length, g)];
            } else {
                Arrays.fill(zArr, false);
            }
        }
        if (i3 >= this.c.g()) {
            return;
        }
        int c = this.c.c();
        if (c == 0 || c == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int j = this.c.j();
            if (mode != 1073741824) {
                size = Math.min(j, size);
            }
            deua deuaVar = this.c;
            aB = deuaVar.aB();
            aC = deuaVar.aC();
        } else {
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = this.c.j();
            }
            deua deuaVar2 = this.c;
            aB = deuaVar2.aE();
            aC = deuaVar2.az();
        }
        int i6 = aB + aC;
        int i7 = size;
        int[] iArr = this.a;
        int i8 = iArr != null ? iArr[i3] : 0;
        List m = this.c.m();
        int size2 = m.size();
        while (i8 < size2) {
            deub deubVar = (deub) m.get(i8);
            if (deubVar.a < i7) {
                i4 = i;
                i5 = i2;
                o(i4, i5, deubVar, i7, i6, false);
            } else {
                i4 = i;
                i5 = i2;
                p(i4, i5, deubVar, i7, i6, false);
            }
            i8++;
            i = i4;
            i2 = i5;
        }
    }

    public final void c(int i) {
        int[] iArr = this.a;
        if (iArr == null) {
            this.a = new int[Math.max(i, 10)];
            return;
        }
        int length = iArr.length;
        if (length < i) {
            this.a = Arrays.copyOf(this.a, Math.max(length + length, i));
        }
    }

    public final void d(int i) {
        long[] jArr = this.b;
        if (jArr == null) {
            this.b = new long[Math.max(i, 10)];
            return;
        }
        int length = jArr.length;
        if (length < i) {
            this.b = Arrays.copyOf(this.b, Math.max(length + length, i));
        }
    }

    public final void e(int i) {
        long[] jArr = this.e;
        if (jArr == null) {
            this.e = new long[Math.max(i, 10)];
            return;
        }
        int length = jArr.length;
        if (length < i) {
            this.e = Arrays.copyOf(this.e, Math.max(length + length, i));
        }
    }

    public final void f(View view, deub deubVar, int i, int i2, int i3, int i4) {
        deuh deuhVar = (deuh) view.getLayoutParams();
        int a = this.c.a();
        int i5 = deuhVar.g;
        if (i5 != -1) {
            a = i5;
        }
        int i6 = deubVar.c;
        if (a == 0 || a == 4) {
            view.layout(i, i2 + deuhVar.topMargin, i3, i4 + deuhVar.topMargin);
            return;
        }
        if (a == 3) {
            int max = Math.max(deubVar.h - view.getBaseline(), deuhVar.topMargin);
            view.layout(i, i2 + max, i3, i4 + max);
        } else if (a == 1) {
            int i7 = i2 + i6;
            view.layout(i, (i7 - view.getMeasuredHeight()) - deuhVar.bottomMargin, i3, i7 - deuhVar.bottomMargin);
        } else if (a == 2) {
            int measuredHeight = i2 + ((((i6 - view.getMeasuredHeight()) + deuhVar.topMargin) - deuhVar.bottomMargin) / 2);
            view.layout(i, measuredHeight, i3, view.getMeasuredHeight() + measuredHeight);
        }
    }

    public final void g(View view, deub deubVar, boolean z, int i, int i2, int i3, int i4) {
        deuh deuhVar = (deuh) view.getLayoutParams();
        int a = this.c.a();
        int i5 = deuhVar.g;
        if (i5 != -1) {
            a = i5;
        }
        int i6 = deubVar.c;
        if (a == 0 || a == 4 || a == 3) {
            if (z) {
                view.layout(i - deuhVar.rightMargin, i2, i3 - deuhVar.rightMargin, i4);
                return;
            } else {
                view.layout(i + deuhVar.leftMargin, i2, i3 + deuhVar.leftMargin, i4);
                return;
            }
        }
        if (a == 1) {
            if (z) {
                view.layout((i - i6) + view.getMeasuredWidth() + deuhVar.leftMargin, i2, (i3 - i6) + view.getMeasuredWidth() + deuhVar.leftMargin, i4);
                return;
            } else {
                view.layout(((i + i6) - view.getMeasuredWidth()) - deuhVar.rightMargin, i2, ((i3 + i6) - view.getMeasuredWidth()) - deuhVar.rightMargin, i4);
                return;
            }
        }
        if (a == 2) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int measuredWidth = (((i6 - view.getMeasuredWidth()) + marginLayoutParams.getMarginStart()) - marginLayoutParams.getMarginEnd()) / 2;
            if (z) {
                view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
            } else {
                view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
            }
        }
    }

    public final void h(int i) {
        int i2;
        if (i >= this.c.g()) {
            return;
        }
        deua deuaVar = this.c;
        int c = deuaVar.c();
        if (deuaVar.a() != 4) {
            for (deub deubVar : deuaVar.m()) {
                for (Integer num : deubVar.j) {
                    View l = this.c.l(num.intValue());
                    if (c == 0 || c == 1) {
                        r(l, deubVar.c, num.intValue());
                    } else {
                        q(l, deubVar.c, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.a;
        List m = deuaVar.m();
        int size = m.size();
        for (int i3 = iArr != null ? iArr[i] : 0; i3 < size; i3++) {
            deub deubVar2 = (deub) m.get(i3);
            int i4 = deubVar2.d;
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = deubVar2.k + i5;
                if (i5 < this.c.g()) {
                    View l2 = this.c.l(i6);
                    if (l2.getVisibility() != 8 && ((i2 = ((deuh) l2.getLayoutParams()).g) == -1 || i2 == 4)) {
                        if (c == 0 || c == 1) {
                            r(l2, deubVar2.c, i6);
                        } else {
                            q(l2, deubVar2.c, i6);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f4, code lost:
    
        if (r5 < (r13 + (r4 > 0 ? r14 + r4 : r14))) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x032a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(defpackage.deuc r27, int r28, int r29, int r30, int r31, java.util.List r32) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deud.j(deuc, int, int, int, int, java.util.List):void");
    }

    public final void l(deuc deucVar, int i, int i2, int i3, List list) {
        j(deucVar, i, i2, i3, -1, list);
    }

    public final void m(deuc deucVar, int i, int i2, int i3, List list) {
        j(deucVar, i, i2, i3, -1, list);
    }
}
