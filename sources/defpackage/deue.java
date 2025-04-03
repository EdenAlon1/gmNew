package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deue extends vt {
    private static final int[] b = {R.attr.listDivider};
    public Drawable a;
    private int c;

    public deue(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b);
        this.a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        c();
    }

    private final boolean d() {
        return (this.c & 1) > 0;
    }

    private final boolean e() {
        return (this.c & 2) > 0;
    }

    @Override // defpackage.vt
    public final void a(Rect rect, View view, RecyclerView recyclerView, wo woVar) {
        int gp = recyclerView.gp(view);
        if (gp == 0) {
            return;
        }
        if (!d() && !e()) {
            rect.set(0, 0, 0, 0);
            return;
        }
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.o;
        ArrayList arrayList = new ArrayList(flexboxLayoutManager.d.size());
        int size = flexboxLayoutManager.d.size();
        for (int i = 0; i < size; i++) {
            deub deubVar = (deub) flexboxLayoutManager.d.get(i);
            if (deubVar.d != 0) {
                arrayList.add(deubVar);
            }
        }
        int i2 = flexboxLayoutManager.a;
        int I = flexboxLayoutManager.I(gp);
        if ((I == -1 || I >= flexboxLayoutManager.d.size() || ((deub) flexboxLayoutManager.d.get(I)).k != gp) && gp != 0 && (arrayList.size() == 0 || ((deub) arrayList.get(arrayList.size() - 1)).l != gp - 1)) {
            if (flexboxLayoutManager.q()) {
                if (!e()) {
                    rect.left = 0;
                    rect.right = 0;
                } else if (flexboxLayoutManager.c) {
                    rect.right = this.a.getIntrinsicWidth();
                    rect.left = 0;
                } else {
                    rect.left = this.a.getIntrinsicWidth();
                    rect.right = 0;
                }
            } else if (!d()) {
                rect.top = 0;
                rect.bottom = 0;
            } else if (i2 == 3) {
                rect.bottom = this.a.getIntrinsicHeight();
                rect.top = 0;
            } else {
                rect.top = this.a.getIntrinsicHeight();
                rect.bottom = 0;
            }
        }
        if (arrayList.size() == 0 || flexboxLayoutManager.I(gp) == 0) {
            return;
        }
        if (flexboxLayoutManager.q()) {
            if (d()) {
                rect.top = this.a.getIntrinsicHeight();
                rect.bottom = 0;
                return;
            } else {
                rect.top = 0;
                rect.bottom = 0;
                return;
            }
        }
        if (e()) {
            if (flexboxLayoutManager.c) {
                rect.right = this.a.getIntrinsicWidth();
                rect.left = 0;
            } else {
                rect.left = this.a.getIntrinsicWidth();
                rect.right = 0;
            }
        }
    }

    @Override // defpackage.vt
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int left;
        int intrinsicWidth;
        int max;
        int bottom;
        int i;
        int i2;
        int top;
        int intrinsicHeight;
        int left2;
        int right;
        int i3;
        int i4;
        int i5;
        if (d()) {
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.o;
            int i6 = flexboxLayoutManager.a;
            int left3 = recyclerView.getLeft() - recyclerView.getPaddingLeft();
            int right2 = recyclerView.getRight() + recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = recyclerView.getChildAt(i7);
                vy vyVar = (vy) childAt.getLayoutParams();
                if (i6 == 3) {
                    intrinsicHeight = childAt.getBottom() + vyVar.bottomMargin;
                    top = this.a.getIntrinsicHeight() + intrinsicHeight;
                } else {
                    top = childAt.getTop() - vyVar.topMargin;
                    intrinsicHeight = top - this.a.getIntrinsicHeight();
                }
                if (!flexboxLayoutManager.q()) {
                    left2 = childAt.getLeft() - vyVar.leftMargin;
                    right = childAt.getRight();
                    i3 = vyVar.rightMargin;
                } else if (flexboxLayoutManager.c) {
                    i5 = Math.min(childAt.getRight() + vyVar.rightMargin + this.a.getIntrinsicWidth(), right2);
                    i4 = childAt.getLeft() - vyVar.leftMargin;
                    this.a.setBounds(i4, intrinsicHeight, i5, top);
                    this.a.draw(canvas);
                } else {
                    left2 = Math.max((childAt.getLeft() - vyVar.leftMargin) - this.a.getIntrinsicWidth(), left3);
                    right = childAt.getRight();
                    i3 = vyVar.rightMargin;
                }
                int i8 = right + i3;
                i4 = left2;
                i5 = i8;
                this.a.setBounds(i4, intrinsicHeight, i5, top);
                this.a.draw(canvas);
            }
        }
        if (e()) {
            FlexboxLayoutManager flexboxLayoutManager2 = (FlexboxLayoutManager) recyclerView.o;
            int top2 = recyclerView.getTop() - recyclerView.getPaddingTop();
            int bottom2 = recyclerView.getBottom() + recyclerView.getPaddingBottom();
            int childCount2 = recyclerView.getChildCount();
            int i9 = flexboxLayoutManager2.a;
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt2 = recyclerView.getChildAt(i10);
                vy vyVar2 = (vy) childAt2.getLayoutParams();
                if (flexboxLayoutManager2.c) {
                    intrinsicWidth = childAt2.getRight() + vyVar2.rightMargin;
                    left = this.a.getIntrinsicWidth() + intrinsicWidth;
                } else {
                    left = childAt2.getLeft() - vyVar2.leftMargin;
                    intrinsicWidth = left - this.a.getIntrinsicWidth();
                }
                if (flexboxLayoutManager2.q()) {
                    max = childAt2.getTop() - vyVar2.topMargin;
                    bottom = childAt2.getBottom();
                    i = vyVar2.bottomMargin;
                } else if (i9 == 3) {
                    int min = Math.min(childAt2.getBottom() + vyVar2.bottomMargin + this.a.getIntrinsicHeight(), bottom2);
                    max = childAt2.getTop() - vyVar2.topMargin;
                    i2 = min;
                    this.a.setBounds(intrinsicWidth, max, left, i2);
                    this.a.draw(canvas);
                } else {
                    max = Math.max((childAt2.getTop() - vyVar2.topMargin) - this.a.getIntrinsicHeight(), top2);
                    bottom = childAt2.getBottom();
                    i = vyVar2.bottomMargin;
                }
                i2 = bottom + i;
                this.a.setBounds(intrinsicWidth, max, left, i2);
                this.a.draw(canvas);
            }
        }
    }

    public final void c() {
        this.c = 3;
    }
}
