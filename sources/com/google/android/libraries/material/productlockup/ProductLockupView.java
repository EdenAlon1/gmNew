package com.google.android.libraries.material.productlockup;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.dwnk;
import defpackage.dwnl;
import defpackage.dwnm;
import defpackage.ku;
import defpackage.kvo;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ProductLockupView extends ViewGroup {
    private static final Pattern d = Pattern.compile(String.format(" %1$s|%1$s ", "Google"));
    private static final int[] e = {1};
    private static final int[] f = {2};
    private static final int[] g = {1, 2};
    private static Typeface h;
    final ImageView a;
    final TextView b;
    dwnl c;
    private final dwnl i;
    private final dwnl j;
    private Drawable k;
    private int l;
    private String m;
    private boolean n;
    private boolean o;
    private boolean p;

    public ProductLockupView(Context context) {
        this(context, null);
    }

    private final int c() {
        if (this.m.isEmpty()) {
            return 0;
        }
        return Math.max(this.b.getPaint().getFontMetricsInt().top + this.b.getBaseline(), 0);
    }

    private final int d(dwnl dwnlVar) {
        return Math.round(dwnlVar.e * (true != this.o ? 0.15f : 1.0f));
    }

    private final void e(View view, int i, int i2, int i3, int i4) {
        int[] iArr = kvo.a;
        boolean z = false;
        if (getLayoutDirection() == 1 && !this.n) {
            z = true;
        }
        int measuredWidth = z ? getMeasuredWidth() - i3 : i;
        if (z) {
            i3 = getMeasuredWidth() - i;
        }
        view.layout(measuredWidth, i2, i3, i4);
    }

    private final void f() {
        this.a.measure(View.MeasureSpec.makeMeasureSpec(this.c.c, 1073741824), View.MeasureSpec.makeMeasureSpec(this.c.d, 1073741824));
    }

    private final void g() {
        this.b.setTextSize(0, this.c.a);
        TextView textView = this.b;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        textView.measure(makeMeasureSpec, makeMeasureSpec);
    }

    private final void h(int i) {
        dwnl dwnlVar;
        if (i == -1) {
            dwnlVar = null;
        } else if (i == 0 || i == 1) {
            dwnlVar = this.i;
        } else {
            if (i != 2) {
                throw new IllegalStateException(a.h(i, "Unrecognized sizingMode: "));
            }
            dwnlVar = this.j;
        }
        this.c = dwnlVar;
    }

    private final boolean i(int i, boolean z) {
        int i2;
        if (z) {
            dwnl dwnlVar = this.c;
            i2 = dwnlVar.c + d(dwnlVar);
        } else {
            i2 = 0;
        }
        g();
        return i2 + this.b.getMeasuredWidth() <= i;
    }

    public final void a(int i) {
        int i2;
        if (i == 0) {
            this.a.setImageDrawable(this.k);
            return;
        }
        ImageView imageView = this.a;
        if (i == 1) {
            i2 = R.color.google_black;
        } else if (i == 2) {
            i2 = R.color.google_white;
        } else {
            if (i != 3) {
                throw new IllegalStateException(a.h(i, "Unrecognized logoColor: "));
            }
            i2 = R.color.google_grey700;
        }
        Drawable mutate = this.k.mutate();
        mutate.setTint(getContext().getColor(i2));
        imageView.setImageDrawable(mutate);
    }

    public final void b(String str) {
        String str2;
        String trim = (str == null ? "" : str).trim();
        this.m = trim;
        this.o = d.matcher(trim).find();
        boolean z = true;
        if (!TextUtils.isEmpty(str) && !Charset.forName(VCardConfig.DEFAULT_INTERMEDIATE_CHARSET).newEncoder().canEncode(str)) {
            z = false;
        }
        this.n = z;
        TextView textView = this.b;
        if (this.m.startsWith("Google")) {
            str2 = this.m.substring(6).trim();
        } else if (this.m.endsWith("Google")) {
            str2 = this.m.substring(0, r0.length() - 6).trim();
        } else {
            str2 = this.m;
        }
        textView.setText(str2);
        setContentDescription(this.m.isEmpty() ? "Google" : this.m);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 0;
        if (this.a.getVisibility() != 8) {
            int measuredWidth = (this.b.getVisibility() == 8 || this.p) ? 0 : this.b.getMeasuredWidth() + d(this.c);
            int c = this.c.b + c();
            e(this.a, measuredWidth, c, measuredWidth + this.a.getMeasuredWidth(), c + this.a.getMeasuredHeight());
        }
        if (this.b.getVisibility() != 8) {
            if (this.a.getVisibility() != 8 && this.p) {
                i5 = this.a.getMeasuredWidth() + d(this.c);
            }
            int i6 = i5;
            int measuredWidth2 = i6 + this.b.getMeasuredWidth();
            TextView textView = this.b;
            e(textView, i6, 0, measuredWidth2, textView.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int[] iArr;
        ImageView imageView = this.a;
        int size = View.MeasureSpec.getSize(i);
        imageView.setVisibility(0);
        this.b.setVisibility(0);
        this.p = this.m.startsWith("Google");
        boolean endsWith = this.m.endsWith("Google");
        int i3 = this.l;
        if (i3 == -1) {
            iArr = null;
        } else if (i3 == 0) {
            iArr = g;
        } else if (i3 == 1) {
            iArr = e;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException(a.h(i3, "Unrecognized sizingMode: "));
            }
            iArr = f;
        }
        if (this.p || endsWith) {
            for (int i4 : iArr) {
                h(i4);
                if (i(size, true)) {
                    f();
                    g();
                    break;
                }
            }
        }
        int length = iArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                h(1);
                this.p = true;
                f();
                this.b.setVisibility(8);
                break;
            }
            h(iArr[i5]);
            if (i(size, false)) {
                g();
                this.a.setVisibility(8);
                break;
            }
            i5++;
        }
        boolean z = this.a.getVisibility() == 0;
        boolean z2 = this.b.getVisibility() == 0;
        int measuredWidth = z ? this.a.getMeasuredWidth() : 0;
        if (z2) {
            measuredWidth += this.b.getMeasuredWidth();
        }
        if (z && z2) {
            measuredWidth += d(this.c);
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(this.a.getMeasuredHeight() + this.c.b + c(), this.b.getMeasuredHeight()), 1073741824));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        dwnk dwnkVar = (dwnk) parcelable;
        super.onRestoreInstanceState(dwnkVar.getSuperState());
        this.m = dwnkVar.a;
        this.o = dwnkVar.b;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        dwnk dwnkVar = new dwnk(super.onSaveInstanceState());
        dwnkVar.a = this.m;
        dwnkVar.b = this.o;
        return dwnkVar;
    }

    public ProductLockupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.productLockupViewStyle);
    }

    public ProductLockupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (h == null) {
            h = Typeface.createFromAsset(context.getAssets(), "ProductSans-Regular.ttf");
        }
        this.i = new dwnl(getResources(), R.dimen.product_name_text_size, R.dimen.logo_margin_top, R.dimen.logo_width, R.dimen.logo_height, R.dimen.separation_margin);
        this.j = new dwnl(getResources(), R.dimen.product_name_text_size_small, R.dimen.logo_margin_top_small, R.dimen.logo_width_small, R.dimen.logo_height_small, R.dimen.separation_margin_small);
        LayoutInflater.from(context).inflate(R.layout.product_lockup_view, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R.id.logo);
        imageView.getClass();
        this.a = imageView;
        TextView textView = (TextView) findViewById(R.id.product_name);
        textView.getClass();
        this.b = textView;
        textView.setTypeface(h);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dwnm.a, i, R.style.Widget_GoogleMaterial_ProductLockupView);
        if (obtainStyledAttributes.hasValue(2)) {
            this.k = obtainStyledAttributes.getDrawable(2);
        } else {
            this.k = ku.a(context, R.drawable.googlelogo_standard_color_74x24);
        }
        int i2 = obtainStyledAttributes.getInt(1, 0);
        this.l = i2;
        h(i2);
        textView.setTextColor(obtainStyledAttributes.getColor(4, 0));
        b(obtainStyledAttributes.getString(0));
        a(obtainStyledAttributes.getInt(3, 0));
        obtainStyledAttributes.recycle();
    }
}
