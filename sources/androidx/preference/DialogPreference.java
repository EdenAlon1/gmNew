package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.kpq;
import defpackage.ooc;
import defpackage.ooj;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public CharSequence a;
    public CharSequence b;
    public Drawable c;
    public CharSequence d;
    public CharSequence e;
    public int f;

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, kpq.b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    @Override // androidx.preference.Preference
    protected void c() {
        ooc oocVar = this.k.d;
        if (oocVar != null) {
            oocVar.p(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ooj.c, i, 0);
        String g = kpq.g(obtainStyledAttributes, 9, 0);
        this.a = g;
        if (g == null) {
            this.a = t();
        }
        this.b = kpq.g(obtainStyledAttributes, 8, 1);
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.c = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        this.d = kpq.g(obtainStyledAttributes, 11, 3);
        this.e = kpq.g(obtainStyledAttributes, 10, 4);
        this.f = kpq.d(obtainStyledAttributes, 7, 5, 0);
        obtainStyledAttributes.recycle();
    }
}
