package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehrw extends LinearLayout {
    public TextView a;
    public ImageView b;
    public View c;
    public TextView d;
    public ImageView e;
    public final Drawable f;
    public final /* synthetic */ TabLayout g;
    private ehrt h;
    private int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, ehrw] */
    public ehrw(TabLayout tabLayout, Context context) {
        super(context);
        this.g = tabLayout;
        this.i = 2;
        int i = tabLayout.s;
        if (i != 0) {
            Drawable a = ku.a(context, i);
            this.f = a;
            if (a != null && a.isStateful()) {
                a.setState(getDrawableState());
            }
        } else {
            this.f = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        if (tabLayout.m != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList a2 = ehmx.a(tabLayout.m);
            boolean z = tabLayout.B;
            gradientDrawable = new RippleDrawable(a2, true == z ? null : gradientDrawable, true != z ? gradientDrawable2 : null);
        }
        setBackground(gradientDrawable);
        tabLayout.invalidate();
        setPaddingRelative(tabLayout.d, tabLayout.e, tabLayout.f, tabLayout.g);
        setGravity(17);
        setOrientation(!tabLayout.y ? 1 : 0);
        setClickable(true);
        kvo.t(this, kuh.a(getContext()));
    }

    private static final void e(View view) {
        if (view == null) {
            return;
        }
        view.addOnLayoutChangeListener(new ehrv(view));
    }

    public final void a(ehrt ehrtVar) {
        if (ehrtVar != this.h) {
            this.h = ehrtVar;
            b();
        }
    }

    final void b() {
        c();
        ehrt ehrtVar = this.h;
        boolean z = false;
        if (ehrtVar != null) {
            TabLayout tabLayout = ehrtVar.h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int a = tabLayout.a();
            if (a != -1 && a == ehrtVar.e) {
                z = true;
            }
        }
        setSelected(z);
    }

    public final void c() {
        int i;
        ViewParent parent;
        ehrt ehrtVar = this.h;
        View view = ehrtVar != null ? ehrtVar.f : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.c;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.c);
                }
                addView(view);
            }
            this.c = view;
            TextView textView = this.a;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.b;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.b.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.d = textView2;
            if (textView2 != null) {
                this.i = textView2.getMaxLines();
            }
            this.e = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.c;
            if (view3 != null) {
                removeView(view3);
                this.c = null;
            }
            this.d = null;
            this.e = null;
        }
        if (this.c == null) {
            if (this.b == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.google.android.apps.messaging.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.b = imageView2;
                addView(imageView2, 0);
            }
            if (this.a == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.google.android.apps.messaging.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.a = textView3;
                addView(textView3);
                this.i = this.a.getMaxLines();
            }
            this.a.setTextAppearance(this.g.h);
            if (!isSelected() || (i = this.g.j) == -1) {
                this.a.setTextAppearance(this.g.i);
            } else {
                this.a.setTextAppearance(i);
            }
            ColorStateList colorStateList = this.g.k;
            if (colorStateList != null) {
                this.a.setTextColor(colorStateList);
            }
            d(this.a, this.b, true);
            e(this.b);
            e(this.a);
        } else {
            TextView textView4 = this.d;
            if (textView4 != null || this.e != null) {
                d(textView4, this.e, false);
            }
        }
        if (ehrtVar == null || TextUtils.isEmpty(ehrtVar.d)) {
            return;
        }
        setContentDescription(ehrtVar.d);
    }

    public final void d(TextView textView, ImageView imageView, boolean z) {
        boolean z2;
        Drawable drawable;
        ehrt ehrtVar = this.h;
        Drawable mutate = (ehrtVar == null || (drawable = ehrtVar.b) == null) ? null : drawable.mutate();
        if (mutate != null) {
            mutate.setTintList(this.g.l);
            PorterDuff.Mode mode = this.g.o;
            if (mode != null) {
                mutate.setTintMode(mode);
            }
        }
        ehrt ehrtVar2 = this.h;
        CharSequence charSequence = ehrtVar2 != null ? ehrtVar2.c : null;
        if (imageView != null) {
            if (mutate != null) {
                imageView.setImageDrawable(mutate);
                imageView.setVisibility(0);
                setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z3 = !isEmpty;
        if (textView != null) {
            z2 = !isEmpty && this.h.g == 1;
            textView.setText(true != z3 ? null : charSequence);
            textView.setVisibility(true != z2 ? 8 : 0);
            if (!isEmpty) {
                setVisibility(0);
            }
        } else {
            z2 = false;
        }
        if (z && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int a = (z2 && imageView.getVisibility() == 0) ? (int) ehjg.a(getContext(), 8) : 0;
            if (this.g.y) {
                if (a != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(a);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (a != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = a;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        ehrt ehrtVar3 = this.h;
        CharSequence charSequence2 = ehrtVar3 != null ? ehrtVar3.d : null;
        if (true != z3) {
            charSequence = charSequence2;
        }
        setTooltipText(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f;
        int[] drawableState = getDrawableState();
        if (drawable != null && drawable.isStateful() && this.f.setState(drawableState)) {
            invalidate();
            this.g.invalidate();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        kxu kxuVar = new kxu(accessibilityNodeInfo);
        kxuVar.u(kxt.a(0, 1, this.h.e, 1, isSelected()));
        if (isSelected()) {
            kxuVar.s(false);
            kxuVar.ae(kxr.a);
        }
        kxuVar.L(getResources().getString(com.google.android.apps.messaging.R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.g.t;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.a != null) {
            float f = this.g.p;
            if (isSelected()) {
                TabLayout tabLayout = this.g;
                if (tabLayout.j != -1) {
                    f = tabLayout.q;
                }
            }
            int i4 = this.i;
            ImageView imageView = this.b;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.a;
                if (textView != null && textView.getLineCount() > 1) {
                    f = this.g.r;
                }
            } else {
                i4 = 1;
            }
            float textSize = this.a.getTextSize();
            int lineCount = this.a.getLineCount();
            int maxLines = this.a.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i4 != maxLines)) {
                if (this.g.x != 1 || f <= textSize || lineCount != 1 || ((layout = this.a.getLayout()) != null && layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                    this.a.setTextSize(0, f);
                    this.a.setMaxLines(i4);
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.h == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        this.h.b();
        return true;
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.a;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.c;
        if (view != null) {
            view.setSelected(z);
        }
    }
}
