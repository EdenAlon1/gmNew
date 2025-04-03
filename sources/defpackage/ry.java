package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ry {
    public Typeface b;
    public boolean c;
    private final TextView d;
    private yr e;
    private yr f;
    private yr g;
    private yr h;
    private yr i;
    private yr j;
    private final sf k;
    public int a = 0;
    private int l = -1;
    private String m = null;

    public ry(TextView textView) {
        this.d = textView;
        this.k = new sf(textView);
    }

    public static void f(TextView textView, Typeface typeface, int i) {
        String fontVariationSettings;
        cnq cnqVar = rx.a;
        fontVariationSettings = textView.getFontVariationSettings();
        if (!TextUtils.isEmpty(fontVariationSettings)) {
            rx.a(textView, null);
        }
        textView.setTypeface(typeface, i);
        if (TextUtils.isEmpty(fontVariationSettings)) {
            return;
        }
        rx.a(textView, fontVariationSettings);
    }

    public static final void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        kyi.a(editorInfo, textView.getText());
    }

    private static yr s(Context context, qu quVar, int i) {
        ColorStateList a = quVar.a(context, i);
        if (a == null) {
            return null;
        }
        yr yrVar = new yr();
        yrVar.d = true;
        yrVar.a = a;
        return yrVar;
    }

    private final void t(Drawable drawable, yr yrVar) {
        if (drawable == null || yrVar == null) {
            return;
        }
        ww.h(drawable, yrVar, this.d.getDrawableState());
    }

    private final void u(boolean z) {
        Typeface typeface = this.b;
        if (typeface != null) {
            if (this.l == -1) {
                this.d.setTypeface(typeface, this.a);
            } else {
                this.d.setTypeface(typeface);
            }
        } else if (z) {
            this.d.setTypeface(null);
        }
        String str = this.m;
        if (str != null) {
            rx.a(this.d, str);
        }
    }

    private final boolean v(Context context, yt ytVar) {
        String n;
        Typeface create;
        Typeface create2;
        int i;
        Typeface typeface;
        Typeface create3;
        Typeface typeface2;
        int[] iArr = kt.a;
        this.a = ytVar.c(2, this.a);
        if (Build.VERSION.SDK_INT >= 28) {
            int c = ytVar.c(11, -1);
            this.l = c;
            if (c != -1) {
                this.a &= 2;
            }
        }
        if (ytVar.q(13)) {
            this.m = ytVar.n(13);
        }
        if (!ytVar.q(10) && !ytVar.q(12)) {
            if (!ytVar.q(1)) {
                if (Build.VERSION.SDK_INT < 28 || (i = this.l) == -1 || (typeface = this.b) == null) {
                    return false;
                }
                create3 = Typeface.create(typeface, i, (2 & this.a) != 0);
                this.b = create3;
                return true;
            }
            this.c = false;
            int c2 = ytVar.c(1, 1);
            if (c2 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else {
                if (c2 != 2) {
                    if (c2 == 3) {
                        typeface2 = Typeface.MONOSPACE;
                    }
                    return true;
                }
                typeface2 = Typeface.SERIF;
            }
            this.b = typeface2;
            return true;
        }
        Typeface typeface3 = null;
        this.b = null;
        int i2 = true == ytVar.q(12) ? 12 : 10;
        int i3 = this.l;
        int i4 = this.a;
        if (!context.isRestricted()) {
            rv rvVar = new rv(this, i3, i4, new WeakReference(this.d));
            try {
                int i5 = this.a;
                int resourceId = ytVar.b.getResourceId(i2, 0);
                if (resourceId != 0) {
                    if (ytVar.c == null) {
                        ytVar.c = new TypedValue();
                    }
                    Context context2 = ytVar.a;
                    TypedValue typedValue = ytVar.c;
                    WeakHashMap weakHashMap = kpp.a;
                    if (!context2.isRestricted()) {
                        typeface3 = kpp.e(context2, resourceId, typedValue, i5, rvVar, true, false);
                    }
                }
                if (typeface3 != null) {
                    if (Build.VERSION.SDK_INT < 28 || this.l == -1) {
                        this.b = typeface3;
                    } else {
                        create2 = Typeface.create(Typeface.create(typeface3, 0), this.l, (this.a & 2) != 0);
                        this.b = create2;
                    }
                }
                this.c = this.b == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.b == null && (n = ytVar.n(i2)) != null) {
            if (Build.VERSION.SDK_INT < 28 || this.l == -1) {
                this.b = Typeface.create(n, this.a);
            } else {
                create = Typeface.create(Typeface.create(n, 0), this.l, (2 & this.a) != 0);
                this.b = create;
            }
        }
        return true;
    }

    public final int a() {
        return this.k.a();
    }

    public final int b() {
        return this.k.b();
    }

    public final int c() {
        return this.k.c();
    }

    public final int d() {
        return this.k.a;
    }

    public final void e() {
        if (this.e != null || this.f != null || this.g != null || this.h != null) {
            Drawable[] compoundDrawables = this.d.getCompoundDrawables();
            t(compoundDrawables[0], this.e);
            t(compoundDrawables[1], this.f);
            t(compoundDrawables[2], this.g);
            t(compoundDrawables[3], this.h);
        }
        if (this.i == null && this.j == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        t(compoundDrawablesRelative[0], this.i);
        t(compoundDrawablesRelative[2], this.j);
    }

    public final void g() {
        this.k.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x027e, code lost:
    
        if (r5 != null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02ce, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02cc, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02ca, code lost:
    
        if (r5 != null) goto L165;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0348  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.util.AttributeSet r23, int r24) {
        /*
            Method dump skipped, instructions count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry.h(android.util.AttributeSet, int):void");
    }

    public final void i(Context context, int i) {
        yt j = yt.j(context, i, kt.z);
        if (j.q(14)) {
            j(j.p(14, false));
        }
        if (j.q(0) && j.b(0, -1) == 0) {
            this.d.setTextSize(0, 0.0f);
        }
        boolean v = v(context, j);
        j.o();
        u(v);
    }

    final void j(boolean z) {
        this.d.setAllCaps(z);
    }

    public final void k(int i, int i2, int i3, int i4) {
        sf sfVar = this.k;
        if (sfVar.k()) {
            DisplayMetrics displayMetrics = sfVar.i.getResources().getDisplayMetrics();
            sfVar.g(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (sfVar.i()) {
                sfVar.e();
            }
        }
    }

    public final void l(int[] iArr, int i) {
        sf sfVar = this.k;
        if (sfVar.k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = sfVar.i.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                sfVar.f = sf.l(iArr2);
                if (!sfVar.j()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: ".concat(String.valueOf(Arrays.toString(iArr))));
                }
            } else {
                sfVar.g = false;
            }
            if (sfVar.i()) {
                sfVar.e();
            }
        }
    }

    public final void m(int i) {
        sf sfVar = this.k;
        if (sfVar.k()) {
            if (i == 0) {
                sfVar.a = 0;
                sfVar.d = -1.0f;
                sfVar.e = -1.0f;
                sfVar.c = -1.0f;
                sfVar.f = new int[0];
                sfVar.b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(a.h(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = sfVar.i.getResources().getDisplayMetrics();
            sfVar.g(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (sfVar.i()) {
                sfVar.e();
            }
        }
    }

    public final void n(int i, float f) {
        if (zu.c || o()) {
            return;
        }
        this.k.f(i, f);
    }

    public final boolean o() {
        return this.k.h();
    }

    public final int[] p() {
        return this.k.f;
    }

    public final void q() {
        if (zu.c) {
            return;
        }
        g();
    }
}
