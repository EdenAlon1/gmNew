package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.apps.messaging.R;
import defpackage.kpq;
import defpackage.omv;
import defpackage.omw;
import defpackage.onk;
import defpackage.ooj;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    private String F;
    private boolean G;
    public CharSequence[] g;
    public CharSequence[] h;
    public String i;

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, kpq.b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    @Override // androidx.preference.Preference
    protected final Parcelable e() {
        Parcelable e = super.e();
        if (this.v) {
            return e;
        }
        omv omvVar = new omv(e);
        omvVar.a = this.i;
        return omvVar;
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(omv.class)) {
            super.g(parcelable);
            return;
        }
        omv omvVar = (omv) parcelable;
        super.g(omvVar.getSuperState());
        o(omvVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        o(u((String) obj));
    }

    public final int k(String str) {
        CharSequence[] charSequenceArr;
        if (str != null && (charSequenceArr = this.h) != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(this.h[length].toString(), str)) {
                    return length;
                }
            }
        }
        return -1;
    }

    public final CharSequence l() {
        CharSequence[] charSequenceArr;
        int k = k(this.i);
        if (k < 0 || (charSequenceArr = this.g) == null) {
            return null;
        }
        return charSequenceArr[k];
    }

    @Override // androidx.preference.Preference
    public final CharSequence m() {
        onk onkVar = this.E;
        if (onkVar != null) {
            return onkVar.a(this);
        }
        CharSequence l = l();
        CharSequence m = super.m();
        String str = this.F;
        if (str != null) {
            if (l == null) {
                l = "";
            }
            String format = String.format(str, l);
            if (!TextUtils.equals(format, m)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return m;
    }

    @Override // androidx.preference.Preference
    public final void n(CharSequence charSequence) {
        super.n(charSequence);
        if (charSequence == null) {
            this.F = null;
        } else {
            this.F = charSequence.toString();
        }
    }

    public final void o(String str) {
        boolean equals = TextUtils.equals(this.i, str);
        if (equals && this.G) {
            return;
        }
        this.i = str;
        this.G = true;
        Y(str);
        if (equals) {
            return;
        }
        d();
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ooj.e, i, 0);
        this.g = kpq.j(obtainStyledAttributes, 2, 0);
        this.h = kpq.j(obtainStyledAttributes, 3, 1);
        if (kpq.h(obtainStyledAttributes, 4, 4, false)) {
            if (omw.a == null) {
                omw.a = new omw();
            }
            K(omw.a);
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ooj.g, i, 0);
        this.F = kpq.g(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }
}
