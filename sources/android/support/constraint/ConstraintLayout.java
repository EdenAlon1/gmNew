package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import defpackage.au;
import defpackage.aw;
import defpackage.ax;
import defpackage.bh;
import defpackage.bi;
import defpackage.bj;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    final SparseArray a;
    final bi b;
    public aw c;
    private final ArrayList d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private int j;

    public ConstraintLayout(Context context) {
        super(context);
        this.a = new SparseArray();
        this.d = new ArrayList(100);
        this.b = new bi();
        this.e = 0;
        this.f = 0;
        this.g = Alert.DURATION_SHOW_INDEFINITELY;
        this.h = Alert.DURATION_SHOW_INDEFINITELY;
        this.i = true;
        this.j = 2;
        this.c = null;
        d(null);
    }

    private final bh b(int i) {
        View view;
        if (i == 0 || (view = (View) this.a.get(i)) == this) {
            return this.b;
        }
        if (view == null) {
            return null;
        }
        return ((au) view.getLayoutParams()).Y;
    }

    private final bh c(View view) {
        if (view == this) {
            return this.b;
        }
        if (view == null) {
            return null;
        }
        return ((au) view.getLayoutParams()).Y;
    }

    private final void d(AttributeSet attributeSet) {
        this.b.J = this;
        this.a.put(getId(), this);
        this.c = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ax.a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 16) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(16, this.e);
                } else if (index == 17) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(17, this.f);
                } else if (index == 14) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(14, this.g);
                } else if (index == 15) {
                    this.h = obtainStyledAttributes.getDimensionPixelOffset(15, this.h);
                } else if (index == 113) {
                    this.j = obtainStyledAttributes.getInt(113, this.j);
                } else if (index == 34) {
                    int resourceId = obtainStyledAttributes.getResourceId(34, 0);
                    aw awVar = new aw();
                    this.c = awVar;
                    awVar.g(getContext(), resourceId);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.b.ai = this.j;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof au;
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new au(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new au(getContext(), attributeSet);
    }

    protected final void hp() {
        this.b.D();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            au auVar = (au) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || auVar.Q || isInEditMode) {
                bh bhVar = auVar.Y;
                int b = bhVar.b();
                int c = bhVar.c();
                childAt.layout(b, c, bhVar.h() + b, bhVar.d() + c);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:229:0x0456, code lost:
    
        if (r10.height == (-1)) goto L234;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04b0 A[EDGE_INSN: B:257:0x04b0->B:258:0x04b0 BREAK  A[LOOP:2: B:210:0x0418->B:242:0x04aa], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r25, int r26) {
        /*
            Method dump skipped, instructions count: 1549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        boolean z = view instanceof Guideline;
        bh c = c(view);
        if (z && !(c instanceof bj)) {
            au auVar = (au) view.getLayoutParams();
            auVar.Y = new bj();
            auVar.Q = true;
            ((bj) auVar.Y).A(auVar.M);
            bh bhVar = auVar.Y;
        }
        this.a.put(view.getId(), view);
        this.i = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.b.F(c(view));
        this.i = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        this.i = true;
    }

    @Override // android.view.View
    public final void setId(int i) {
        this.a.remove(getId());
        super.setId(i);
        this.a.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new au(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.d = new ArrayList(100);
        this.b = new bi();
        this.e = 0;
        this.f = 0;
        this.g = Alert.DURATION_SHOW_INDEFINITELY;
        this.h = Alert.DURATION_SHOW_INDEFINITELY;
        this.i = true;
        this.j = 2;
        this.c = null;
        d(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.d = new ArrayList(100);
        this.b = new bi();
        this.e = 0;
        this.f = 0;
        this.g = Alert.DURATION_SHOW_INDEFINITELY;
        this.h = Alert.DURATION_SHOW_INDEFINITELY;
        this.i = true;
        this.j = 2;
        this.c = null;
        d(attributeSet);
    }
}
