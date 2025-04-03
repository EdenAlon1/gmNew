package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.car.app.model.Alert;
import defpackage.a;
import defpackage.cpn;
import defpackage.kpq;
import defpackage.onu;
import defpackage.onw;
import defpackage.oof;
import defpackage.ooj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final cpn a;
    public final List b;
    public boolean c;
    public int d;
    private final Handler e;
    private boolean f;
    private int g;
    private final Runnable h;

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final void ag(Preference preference) {
        synchronized (this) {
            super.P();
            if (preference.D == this) {
                preference.w(null);
            }
            if (this.b.remove(preference)) {
                String str = preference.s;
                if (str != null) {
                    this.a.put(str, Long.valueOf(preference.eS()));
                    this.e.removeCallbacks(this.h);
                    this.e.post(this.h);
                }
                if (this.c) {
                    preference.D();
                }
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void B() {
        super.F();
        this.c = true;
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).B();
        }
    }

    @Override // androidx.preference.Preference
    public final void D() {
        super.P();
        this.c = false;
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).D();
        }
    }

    public final void ab() {
        synchronized (this) {
            List list = this.b;
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ag((Preference) list.get(0));
                }
            }
        }
        A();
    }

    public final void ac(int i) {
        if (i != Integer.MAX_VALUE && !S()) {
            Log.e("PreferenceGroup", String.valueOf(getClass().getSimpleName()).concat(" should have a key defined if it contains an expandable preference"));
        }
        this.d = i;
    }

    public boolean ad() {
        return true;
    }

    public final void ae(Preference preference) {
        long a;
        if (this.b.contains(preference)) {
            return;
        }
        if (preference.s != null) {
            PreferenceGroup preferenceGroup = this;
            while (true) {
                PreferenceGroup preferenceGroup2 = preferenceGroup.D;
                if (preferenceGroup2 == null) {
                    break;
                } else {
                    preferenceGroup = preferenceGroup2;
                }
            }
            String str = preference.s;
            if (preferenceGroup.l(str) != null) {
                Log.e("PreferenceGroup", a.a(str, "Found duplicated key: \"", "\". This can cause unintended behaviour, please use unique keys for every preference."));
            }
        }
        if (preference.p == Integer.MAX_VALUE) {
            if (this.f) {
                int i = this.g;
                this.g = i + 1;
                preference.I(i);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).f = this.f;
            }
        }
        int binarySearch = Collections.binarySearch(this.b, preference);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        preference.X(j());
        synchronized (this) {
            this.b.add(binarySearch, preference);
        }
        oof oofVar = this.k;
        String str2 = preference.s;
        if (str2 == null || !this.a.containsKey(str2)) {
            a = oofVar.a();
        } else {
            a = ((Long) this.a.get(str2)).longValue();
            this.a.remove(str2);
        }
        preference.l = a;
        preference.m = true;
        try {
            preference.C(oofVar);
            preference.m = false;
            preference.w(this);
            if (this.c) {
                preference.B();
            }
            A();
        } catch (Throwable th) {
            preference.m = false;
            throw th;
        }
    }

    public final void af(Preference preference) {
        ag(preference);
        A();
    }

    @Override // androidx.preference.Preference
    protected final Parcelable e() {
        return new onw(super.e(), this.d);
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(onw.class)) {
            super.g(parcelable);
            return;
        }
        onw onwVar = (onw) parcelable;
        this.d = onwVar.a;
        super.g(onwVar.getSuperState());
    }

    public final int k() {
        return this.b.size();
    }

    public final Preference l(CharSequence charSequence) {
        Preference l;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.s, charSequence)) {
            return this;
        }
        int k = k();
        for (int i = 0; i < k; i++) {
            Preference o = o(i);
            if (TextUtils.equals(o.s, charSequence)) {
                return o;
            }
            if ((o instanceof PreferenceGroup) && (l = ((PreferenceGroup) o).l(charSequence)) != null) {
                return l;
            }
        }
        return null;
    }

    public final Preference o(int i) {
        return (Preference) this.b.get(i);
    }

    @Override // androidx.preference.Preference
    public final void x(Bundle bundle) {
        super.x(bundle);
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).x(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void y(Bundle bundle) {
        super.y(bundle);
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).y(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void z(boolean z) {
        super.z(z);
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).X(z);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new cpn();
        this.e = new Handler(Looper.getMainLooper());
        this.f = true;
        this.g = 0;
        this.c = false;
        this.d = Alert.DURATION_SHOW_INDEFINITELY;
        this.h = new onu(this);
        this.b = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ooj.i, i, i2);
        this.f = kpq.h(obtainStyledAttributes, 2, 2, true);
        if (obtainStyledAttributes.hasValue(1)) {
            ac(kpq.k(obtainStyledAttributes, 1, 1));
        }
        obtainStyledAttributes.recycle();
    }
}
