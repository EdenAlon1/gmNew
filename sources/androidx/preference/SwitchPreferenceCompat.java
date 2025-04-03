package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import com.google.android.apps.messaging.R;
import defpackage.kpq;
import defpackage.ooi;
import defpackage.ooj;
import defpackage.oop;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private final oop c;
    private CharSequence d;
    private CharSequence e;

    public SwitchPreferenceCompat(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ad(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.h(this.d);
            switchCompat.requestLayout();
            if (switchCompat.isChecked()) {
                switchCompat.e();
            }
            switchCompat.g(this.e);
            switchCompat.requestLayout();
            if (!switchCompat.isChecked()) {
                switchCompat.d();
            }
            switchCompat.setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(ooi ooiVar) {
        super.a(ooiVar);
        ad(ooiVar.C(R.id.switchWidget));
        ac(ooiVar);
    }

    @Override // androidx.preference.Preference
    public final void b(View view) {
        E();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            ad(view.findViewById(R.id.switchWidget));
            ab(view.findViewById(android.R.id.summary));
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchPreferenceCompatStyle);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = new oop(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ooj.m, i, i2);
        o(kpq.g(obtainStyledAttributes, 7, 0));
        l(kpq.g(obtainStyledAttributes, 6, 1));
        this.d = kpq.g(obtainStyledAttributes, 9, 3);
        d();
        this.e = kpq.g(obtainStyledAttributes, 8, 4);
        d();
        ((TwoStatePreference) this).b = kpq.h(obtainStyledAttributes, 5, 2, false);
        obtainStyledAttributes.recycle();
    }
}
