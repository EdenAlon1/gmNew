package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kka implements kjf {
    final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    final /* synthetic */ ConstraintLayout h;

    public kka(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    private static final boolean c(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    @Override // defpackage.kjf
    public final void a() {
        int childCount = this.a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.a.getChildAt(i);
            if (childAt instanceof kkm) {
                throw null;
            }
        }
        int size = this.a.b.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
            }
        }
    }

    @Override // defpackage.kjf
    public final void b(kiu kiuVar, kje kjeVar) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int baseline;
        int max;
        int max2;
        int i;
        int i2;
        if (kiuVar == null) {
            return;
        }
        if (kiuVar.ar == 8) {
            kjeVar.c = 0;
            kjeVar.d = 0;
            kjeVar.e = 0;
            return;
        }
        if (kiuVar.ae != null) {
            int i3 = kjeVar.i;
            int i4 = kjeVar.j;
            int i5 = kjeVar.a;
            int i6 = kjeVar.b;
            int i7 = this.b + this.c;
            int i8 = this.d;
            View view = (View) kiuVar.aq;
            int i9 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i9 == 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            } else if (i9 == 1) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i8, -2);
            } else if (i9 == 2) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i8, -2);
                int i10 = kiuVar.C;
                int i11 = kjeVar.h;
                if (i11 == 1 || i11 == 2) {
                    int measuredHeight = view.getMeasuredHeight();
                    int h = kiuVar.h();
                    if (kjeVar.h == 2 || i10 != 1 || measuredHeight == h || (view instanceof kkm) || kiuVar.e()) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kiuVar.j(), 1073741824);
                    }
                }
            } else if (i9 != 3) {
                makeMeasureSpec = 0;
            } else {
                int i12 = this.f;
                kit kitVar = kiuVar.T;
                int i13 = kitVar != null ? kitVar.f : 0;
                kit kitVar2 = kiuVar.V;
                if (kitVar2 != null) {
                    i13 += kitVar2.f;
                }
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(i12, i8 + i13, -1);
            }
            int i14 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i14 == 0) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            } else if (i14 == 1) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i7, -2);
            } else if (i14 == 2) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i7, -2);
                int i15 = kiuVar.D;
                int i16 = kjeVar.h;
                if (i16 == 1 || i16 == 2) {
                    int measuredWidth = view.getMeasuredWidth();
                    int j = kiuVar.j();
                    if (kjeVar.h == 2 || i15 != 1 || measuredWidth == j || (view instanceof kkm) || kiuVar.f()) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(kiuVar.h(), 1073741824);
                    }
                }
            } else if (i14 != 3) {
                makeMeasureSpec2 = 0;
            } else {
                int i17 = this.g;
                int i18 = kiuVar.T != null ? kiuVar.U.f : 0;
                if (kiuVar.V != null) {
                    i18 += kiuVar.W.f;
                }
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i17, i7 + i18, -1);
            }
            kiv kivVar = (kiv) kiuVar.ae;
            if (kivVar != null && kja.b(this.h.f, 256) && view.getMeasuredWidth() == kiuVar.j() && view.getMeasuredWidth() < kivVar.j() && view.getMeasuredHeight() == kiuVar.h() && view.getMeasuredHeight() < kivVar.h() && view.getBaseline() == kiuVar.al && !kiuVar.U() && c(kiuVar.R, makeMeasureSpec, kiuVar.j()) && c(kiuVar.S, makeMeasureSpec2, kiuVar.h())) {
                kjeVar.c = kiuVar.j();
                kjeVar.d = kiuVar.h();
                kjeVar.e = kiuVar.al;
                return;
            }
            boolean z = i3 == 3;
            boolean z2 = i4 == 3;
            boolean z3 = i4 == 4 || i4 == 1;
            boolean z4 = i3 == 4 || i3 == 1;
            boolean z5 = z && kiuVar.ah > 0.0f;
            boolean z6 = z2 && kiuVar.ah > 0.0f;
            if (view != null) {
                kjz kjzVar = (kjz) view.getLayoutParams();
                int i19 = kjeVar.h;
                if (i19 != 1 && i19 != 2 && z && kiuVar.C == 0 && z2 && kiuVar.D == 0) {
                    i = -1;
                    baseline = 0;
                    max = 0;
                    max2 = 0;
                } else {
                    if ((view instanceof kkp) && (kiuVar instanceof kjb)) {
                        ((kkp) view).b((kjb) kiuVar, makeMeasureSpec, makeMeasureSpec2);
                    } else {
                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                    }
                    kiuVar.G(makeMeasureSpec, makeMeasureSpec2);
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    int i20 = kiuVar.F;
                    max = i20 > 0 ? Math.max(i20, measuredWidth2) : measuredWidth2;
                    int i21 = kiuVar.G;
                    if (i21 > 0) {
                        max = Math.min(i21, max);
                    }
                    int i22 = kiuVar.I;
                    max2 = i22 > 0 ? Math.max(i22, measuredHeight2) : measuredHeight2;
                    boolean z7 = z4;
                    int i23 = kiuVar.J;
                    if (i23 > 0) {
                        max2 = Math.min(i23, max2);
                    }
                    if (!kja.b(this.h.f, 1)) {
                        if (z5 && z3) {
                            max = (int) ((max2 * kiuVar.ah) + 0.5f);
                        } else if (z6 && z7) {
                            max2 = (int) ((max / kiuVar.ah) + 0.5f);
                        }
                    }
                    if (measuredWidth2 != max || measuredHeight2 != max2) {
                        if (measuredWidth2 != max) {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                        }
                        if (measuredHeight2 != max2) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                        }
                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                        kiuVar.G(makeMeasureSpec, makeMeasureSpec2);
                        max = view.getMeasuredWidth();
                        max2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i = -1;
                }
                boolean z8 = baseline != i;
                kjeVar.g = (max == kjeVar.a && max2 == kjeVar.b) ? false : true;
                boolean z9 = z8 | kjzVar.ag;
                if (z9) {
                    if (baseline == -1) {
                        i2 = -1;
                        kjeVar.c = max;
                        kjeVar.d = max2;
                        kjeVar.f = z9;
                        kjeVar.e = i2;
                    }
                    if (kiuVar.al != baseline) {
                        kjeVar.g = true;
                    }
                }
                i2 = baseline;
                kjeVar.c = max;
                kjeVar.d = max2;
                kjeVar.f = z9;
                kjeVar.e = i2;
            }
        }
    }
}
