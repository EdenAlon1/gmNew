package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.R;
import defpackage.kpq;
import defpackage.ond;
import defpackage.onf;
import defpackage.ong;
import defpackage.onh;
import defpackage.oni;
import defpackage.onj;
import defpackage.onk;
import defpackage.ooa;
import defpackage.ooe;
import defpackage.oof;
import defpackage.ooj;
import defpackage.vk;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public int A;
    public int B;
    public ong C;
    public PreferenceGroup D;
    public onk E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private List J;
    private boolean K;
    private onj L;
    private final View.OnClickListener M;
    private CharSequence a;
    private Drawable b;
    private Bundle c;
    private boolean d;
    private boolean e;
    private String f;
    private Object g;
    private boolean h;
    private boolean i;
    public final Context j;
    public oof k;
    public long l;
    public boolean m;
    public onh n;
    public oni o;
    public int p;
    public CharSequence q;
    public int r;
    public String s;
    public Intent t;
    public String u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public Preference(Context context) {
        this(context, null);
    }

    private final void k(View view, boolean z) {
        view.setEnabled(z);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                k(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    protected final void A() {
        ong ongVar = this.C;
        if (ongVar != null) {
            ongVar.b();
        }
    }

    public void B() {
        F();
    }

    public final void C(oof oofVar) {
        this.k = oofVar;
        if (!this.m) {
            this.l = oofVar.a();
        }
        if (V() && q().contains(this.s)) {
            h(null);
            return;
        }
        Object obj = this.g;
        if (obj != null) {
            h(obj);
        }
    }

    public void D() {
        P();
    }

    public final void E() {
        Intent intent;
        ooe ooeVar;
        if (T() && this.e) {
            c();
            oni oniVar = this.o;
            if (oniVar == null || !oniVar.a(this)) {
                oof oofVar = this.k;
                if ((oofVar == null || (ooeVar = oofVar.c) == null || !ooeVar.s(this)) && (intent = this.t) != null) {
                    this.j.startActivity(intent);
                }
            }
        }
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f)) {
            return;
        }
        Preference s = s(this.f);
        if (s != null) {
            if (s.J == null) {
                s.J = new ArrayList();
            }
            s.J.add(this);
            W(s.j());
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.f + "\" not found for preference \"" + this.s + "\" (title: \"" + ((Object) this.q) + "\"");
    }

    public void G(boolean z) {
        if (this.d != z) {
            this.d = z;
            z(j());
            d();
        }
    }

    public final void H(Drawable drawable) {
        if (this.b != drawable) {
            this.b = drawable;
            this.r = 0;
            d();
        }
    }

    public final void I(int i) {
        if (i != this.p) {
            this.p = i;
            A();
        }
    }

    public final void J(int i) {
        n(this.j.getString(i));
    }

    public final void K(onk onkVar) {
        this.E = onkVar;
        d();
    }

    public final void L(int i) {
        M(this.j.getString(i));
    }

    public final void M(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.q)) {
            return;
        }
        this.q = charSequence;
        d();
    }

    public final void N(boolean z) {
        if (this.w != z) {
            this.w = z;
            ong ongVar = this.C;
            if (ongVar != null) {
                ((ooa) ongVar).b();
            }
        }
    }

    public final void O(SharedPreferences.Editor editor) {
        if (this.k.a) {
            return;
        }
        editor.apply();
    }

    public final void P() {
        Preference s;
        List list;
        String str = this.f;
        if (str == null || (s = s(str)) == null || (list = s.J) == null) {
            return;
        }
        list.remove(this);
    }

    public final boolean Q(Object obj) {
        onh onhVar = this.n;
        return onhVar == null || onhVar.a(this, obj);
    }

    protected final boolean R(boolean z) {
        return !V() ? z : this.k.c().getBoolean(this.s, z);
    }

    public final boolean S() {
        return !TextUtils.isEmpty(this.s);
    }

    public boolean T() {
        return this.d && this.h && this.i;
    }

    public final boolean U() {
        oof oofVar;
        if (!this.w || (oofVar = this.k) == null) {
            return false;
        }
        if (this == oofVar.b) {
            return true;
        }
        PreferenceGroup preferenceGroup = this.D;
        if (preferenceGroup == null) {
            return false;
        }
        return preferenceGroup.U();
    }

    protected final boolean V() {
        return this.k != null && this.v && S();
    }

    public final void W(boolean z) {
        if (this.h == z) {
            this.h = !z;
            z(j());
            d();
        }
    }

    public final void X(boolean z) {
        if (this.i == z) {
            this.i = !z;
            z(j());
            d();
        }
    }

    protected final void Y(String str) {
        if (V() && !TextUtils.equals(str, u(null))) {
            SharedPreferences.Editor b = this.k.b();
            b.putString(this.s, str);
            O(b);
        }
    }

    public final void Z() {
        if (this.H) {
            this.H = false;
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(defpackage.ooi r10) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.a(ooi):void");
    }

    public final void aa() {
        if (this.e) {
            this.e = false;
            d();
        }
    }

    public void b(View view) {
        E();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.p;
        int i2 = preference2.p;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.q;
        CharSequence charSequence2 = preference2.q;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.q.toString());
    }

    public void d() {
        int indexOf;
        Object obj = this.C;
        if (obj == null || (indexOf = ((ooa) obj).a.indexOf(this)) == -1) {
            return;
        }
        ((vk) obj).r(indexOf, this);
    }

    protected Parcelable e() {
        this.K = true;
        return onf.EMPTY_STATE;
    }

    public long eS() {
        return this.l;
    }

    protected Object f(TypedArray typedArray, int i) {
        return null;
    }

    protected void g(Parcelable parcelable) {
        this.K = true;
        if (parcelable != onf.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public boolean j() {
        return !T();
    }

    public CharSequence m() {
        onk onkVar = this.E;
        return onkVar != null ? onkVar.a(this) : this.a;
    }

    public void n(CharSequence charSequence) {
        if (this.E != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.a, charSequence)) {
            return;
        }
        this.a = charSequence;
        d();
    }

    protected final int p(int i) {
        return !V() ? i : this.k.c().getInt(this.s, i);
    }

    public final SharedPreferences q() {
        oof oofVar = this.k;
        if (oofVar != null) {
            return oofVar.c();
        }
        return null;
    }

    public final Bundle r() {
        if (this.c == null) {
            this.c = new Bundle();
        }
        return this.c;
    }

    protected final Preference s(String str) {
        oof oofVar = this.k;
        if (oofVar == null) {
            return null;
        }
        return oofVar.d(str);
    }

    public CharSequence t() {
        return this.q;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence t = t();
        if (!TextUtils.isEmpty(t)) {
            sb.append(t);
            sb.append(' ');
        }
        CharSequence m = m();
        if (!TextUtils.isEmpty(m)) {
            sb.append(m);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    protected final String u(String str) {
        return !V() ? str : this.k.c().getString(this.s, str);
    }

    public final Set v(Set set) {
        return !V() ? set : this.k.c().getStringSet(this.s, set);
    }

    final void w(PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.D != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.D = preferenceGroup;
    }

    public void x(Bundle bundle) {
        Parcelable parcelable;
        if (!S() || (parcelable = bundle.getParcelable(this.s)) == null) {
            return;
        }
        this.K = false;
        g(parcelable);
        if (!this.K) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void y(Bundle bundle) {
        if (S()) {
            this.K = false;
            Parcelable e = e();
            if (!this.K) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (e != null) {
                bundle.putParcelable(this.s, e);
            }
        }
    }

    public void z(boolean z) {
        List list = this.J;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).W(z);
        }
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, kpq.b(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = Alert.DURATION_SHOW_INDEFINITELY;
        this.d = true;
        this.e = true;
        this.v = true;
        this.h = true;
        this.i = true;
        this.w = true;
        this.F = true;
        this.G = true;
        this.y = true;
        this.I = true;
        this.A = R.layout.preference;
        this.M = new ond(this);
        this.j = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ooj.g, i, i2);
        this.r = kpq.d(obtainStyledAttributes, 23, 0, 0);
        this.s = kpq.g(obtainStyledAttributes, 26, 6);
        this.q = kpq.f(obtainStyledAttributes, 34, 4);
        this.a = kpq.f(obtainStyledAttributes, 33, 7);
        this.p = kpq.k(obtainStyledAttributes, 28, 8);
        this.u = kpq.g(obtainStyledAttributes, 22, 13);
        this.A = kpq.d(obtainStyledAttributes, 27, 3, R.layout.preference);
        this.B = kpq.d(obtainStyledAttributes, 35, 9, 0);
        this.d = kpq.h(obtainStyledAttributes, 21, 2, true);
        this.e = kpq.h(obtainStyledAttributes, 30, 5, true);
        this.v = kpq.h(obtainStyledAttributes, 29, 1, true);
        this.f = kpq.g(obtainStyledAttributes, 19, 10);
        this.F = kpq.h(obtainStyledAttributes, 16, 16, this.e);
        this.G = kpq.h(obtainStyledAttributes, 17, 17, this.e);
        if (obtainStyledAttributes.hasValue(18)) {
            this.g = f(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.g = f(obtainStyledAttributes, 11);
        }
        this.I = kpq.h(obtainStyledAttributes, 31, 12, true);
        boolean hasValue = obtainStyledAttributes.hasValue(32);
        this.x = hasValue;
        if (hasValue) {
            this.y = kpq.h(obtainStyledAttributes, 32, 14, true);
        }
        this.H = kpq.h(obtainStyledAttributes, 24, 15, false);
        this.w = kpq.h(obtainStyledAttributes, 25, 25, true);
        this.z = kpq.h(obtainStyledAttributes, 20, 20, false);
        obtainStyledAttributes.recycle();
    }

    protected void c() {
    }

    protected void h(Object obj) {
    }
}
