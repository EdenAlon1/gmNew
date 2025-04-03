package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.ob;
import defpackage.oc;
import defpackage.od;
import defpackage.og;
import defpackage.op;
import defpackage.os;
import defpackage.pt;
import defpackage.pu;
import defpackage.pv;
import defpackage.pw;
import defpackage.px;
import defpackage.tz;
import defpackage.ua;
import defpackage.yw;
import defpackage.zu;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionMenuView extends ua implements oc, os {
    public od a;
    public boolean b;
    public pt c;
    public ob d;
    public yw e;
    private Context f;
    private int g;
    private op h;
    private boolean i;
    private int j;
    private int k;
    private int l;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static final pw k() {
        pw pwVar = new pw();
        pwVar.gravity = 16;
        return pwVar;
    }

    public static final pw l(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return k();
        }
        pw pwVar = layoutParams instanceof pw ? new pw((pw) layoutParams) : new pw(layoutParams);
        if (pwVar.gravity <= 0) {
            pwVar.gravity = 16;
        }
        return pwVar;
    }

    @Override // defpackage.os
    public final void a(od odVar) {
        this.a = odVar;
    }

    @Override // defpackage.oc
    public final boolean b(og ogVar) {
        return this.a.z(ogVar, 0);
    }

    @Override // defpackage.ua, android.view.ViewGroup
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final pw generateLayoutParams(AttributeSet attributeSet) {
        return new pw(getContext(), attributeSet);
    }

    @Override // defpackage.ua, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof pw;
    }

    public final Menu d() {
        if (this.a == null) {
            Context context = getContext();
            od odVar = new od(context);
            this.a = odVar;
            odVar.p(new px(this));
            pt ptVar = new pt(context);
            this.c = ptVar;
            ptVar.s();
            pt ptVar2 = this.c;
            op opVar = this.h;
            if (opVar == null) {
                opVar = new pv();
            }
            ptVar2.e = opVar;
            this.a.h(this.c, this.f);
            this.c.l(this);
        }
        return this.a;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final void e() {
        pt ptVar = this.c;
        if (ptVar != null) {
            ptVar.q();
        }
    }

    public final void f(op opVar, ob obVar) {
        this.h = opVar;
        this.d = obVar;
    }

    public final void g(int i) {
        if (this.g != i) {
            this.g = i;
            if (i == 0) {
                this.f = getContext();
            } else {
                this.f = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ua, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ tz generateDefaultLayoutParams() {
        return k();
    }

    public final void h(pt ptVar) {
        this.c = ptVar;
        ptVar.l(this);
    }

    protected final boolean i(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof pu)) {
            z = ((pu) childAt).c();
        }
        return (i <= 0 || !(childAt2 instanceof pu)) ? z : ((pu) childAt2).d() | z;
    }

    public final boolean j() {
        pt ptVar = this.c;
        return ptVar != null && ptVar.o();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        pt ptVar = this.c;
        if (ptVar != null) {
            ptVar.f(false);
            if (this.c.o()) {
                this.c.m();
                this.c.p();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // defpackage.ua, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        if (!this.i) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = i4 - i2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean a = zu.a(this);
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i5 = i7 / 2;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                pw pwVar = (pw) childAt.getLayoutParams();
                if (pwVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (i(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i6 = getPaddingLeft() + pwVar.leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - pwVar.rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i12 = i5 - (measuredHeight / 2);
                    childAt.layout(i6, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + pwVar.leftMargin) + pwVar.rightMargin;
                    i(i9);
                    i11++;
                }
            }
            i9++;
        }
        if (childCount == 1) {
            if (i10 == 0) {
                View childAt2 = getChildAt(0);
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i13 = i5 - (measuredHeight2 / 2);
                int i14 = (i8 / 2) - (measuredWidth2 / 2);
                childAt2.layout(i14, i13, measuredWidth2 + i14, measuredHeight2 + i13);
                return;
            }
            childCount = 1;
        }
        int i15 = i11 - (i10 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (a) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                pw pwVar2 = (pw) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !pwVar2.a) {
                    int i17 = width2 - pwVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + pwVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            pw pwVar3 = (pw) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !pwVar3.a) {
                int i20 = paddingLeft + pwVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + pwVar3.rightMargin + max;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v46 */
    @Override // defpackage.ua, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r30, int r31) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuView.onMeasure(int, int):void");
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.k = (int) (56.0f * f);
        this.l = (int) (f * 4.0f);
        this.f = context;
        this.g = 0;
    }

    @Override // defpackage.ua, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ua, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ tz generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return l(layoutParams);
    }

    @Override // defpackage.ua, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return l(layoutParams);
    }
}
