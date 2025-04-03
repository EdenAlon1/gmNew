package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehat extends ehkm {
    private final int M;
    private final int N;
    private final int O;
    private final int P;
    private final List Q;
    public boolean a;

    public ehat(Context context) {
        super(context);
        this.Q = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.M = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.N = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.O = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.P = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // defpackage.ehkm
    protected final ehkh b(Context context) {
        return new ehas(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int i7 = i4 - i2;
                if (getLayoutDirection() == 1) {
                    int i8 = (i3 - i) - i5;
                    childAt.layout(i8 - childAt.getMeasuredWidth(), 0, i8, i7);
                } else {
                    childAt.layout(i5, 0, childAt.getMeasuredWidth() + i5, i7);
                }
                i5 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int c = super.c();
        int childCount = getChildCount();
        this.Q.clear();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE);
        int i7 = 0;
        if (this.d == 0) {
            if (h(this.c, c) && this.a) {
                View childAt = getChildAt(this.g);
                int i8 = this.P;
                if (childAt.getVisibility() != 8) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(this.O, Integer.MIN_VALUE), makeMeasureSpec);
                    i8 = Math.max(i8, childAt.getMeasuredWidth());
                }
                int i9 = c - (childAt.getVisibility() != 8 ? 1 : 0);
                int min = Math.min(size - (this.N * i9), Math.min(i8, this.O));
                int i10 = size - min;
                int min2 = Math.min(i10 / (i9 != 0 ? i9 : 1), this.M);
                int i11 = i10 - (i9 * min2);
                int i12 = 0;
                while (i12 < childCount) {
                    if (getChildAt(i12).getVisibility() != 8) {
                        i6 = i12 == this.g ? min : min2;
                        if (i11 > 0) {
                            i6++;
                            i11--;
                        }
                    } else {
                        i6 = 0;
                    }
                    this.Q.add(Integer.valueOf(i6));
                    i12++;
                }
            } else {
                int min3 = Math.min(size / (c != 0 ? c : 1), this.O);
                int i13 = size - (c * min3);
                for (int i14 = 0; i14 < childCount; i14++) {
                    if (getChildAt(i14).getVisibility() == 8) {
                        i5 = 0;
                    } else if (i13 > 0) {
                        i5 = min3 + 1;
                        i13--;
                    } else {
                        i5 = min3;
                    }
                    this.Q.add(Integer.valueOf(i5));
                }
            }
            i3 = 0;
            i4 = 0;
            while (i7 < childCount) {
                View childAt2 = getChildAt(i7);
                if (childAt2.getVisibility() != 8) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) this.Q.get(i7)).intValue(), 1073741824), makeMeasureSpec);
                    childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                    i3 += childAt2.getMeasuredWidth();
                    i4 = Math.max(i4, childAt2.getMeasuredHeight());
                }
                i7++;
            }
        } else {
            if (c == 0) {
                c = 1;
            }
            float f = size;
            float min4 = Math.min((c + 3) / 10.0f, 0.9f) * f;
            float f2 = c;
            float f3 = f / f2;
            int round = Math.round(min4 / f2);
            int round2 = Math.round(f3);
            int i15 = 0;
            int i16 = 0;
            while (i7 < childCount) {
                View childAt3 = getChildAt(i7);
                if (childAt3.getVisibility() != 8) {
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(round2, Integer.MIN_VALUE), makeMeasureSpec);
                    if (childAt3.getMeasuredWidth() < round) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(round, 1073741824), makeMeasureSpec);
                    }
                    i15 += childAt3.getMeasuredWidth();
                    i16 = Math.max(i16, childAt3.getMeasuredHeight());
                }
                i7++;
            }
            i3 = i15;
            i4 = i16;
        }
        setMeasuredDimension(i3, Math.max(i4, getSuggestedMinimumHeight()));
    }
}
