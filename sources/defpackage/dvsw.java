package defpackage;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvsw extends dvtq {
    public final View a;
    public final emxc b;
    public final CharSequence c;
    public final View.OnClickListener d;
    public final CharSequence e;
    public final emxc f;
    public final emxc g;
    public final CharSequence h;
    public final emxc i;
    public final View.OnClickListener j;
    public final PopupWindow.OnDismissListener k;
    public final View.OnClickListener l;
    public final float m;
    public final int n;
    public final int o;
    public final int p;

    public dvsw(View view, emxc emxcVar, CharSequence charSequence, View.OnClickListener onClickListener, CharSequence charSequence2, emxc emxcVar2, emxc emxcVar3, CharSequence charSequence3, emxc emxcVar4, View.OnClickListener onClickListener2, PopupWindow.OnDismissListener onDismissListener, View.OnClickListener onClickListener3, int i, int i2, int i3, float f) {
        this.a = view;
        this.b = emxcVar;
        this.c = charSequence;
        this.d = onClickListener;
        this.e = charSequence2;
        this.f = emxcVar2;
        this.g = emxcVar3;
        this.h = charSequence3;
        this.i = emxcVar4;
        this.j = onClickListener2;
        this.k = onDismissListener;
        this.l = onClickListener3;
        this.n = i;
        this.o = i2;
        this.p = i3;
        this.m = f;
    }

    @Override // defpackage.dvtq
    public final float a() {
        return this.m;
    }

    @Override // defpackage.dvtq
    public final View.OnClickListener b() {
        return this.j;
    }

    @Override // defpackage.dvtq
    public final View.OnClickListener c() {
        return this.d;
    }

    @Override // defpackage.dvtq
    public final View.OnClickListener d() {
        return this.l;
    }

    @Override // defpackage.dvtq
    public final View e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        CharSequence charSequence;
        View.OnClickListener onClickListener;
        CharSequence charSequence2;
        CharSequence charSequence3;
        View.OnClickListener onClickListener2;
        PopupWindow.OnDismissListener onDismissListener;
        View.OnClickListener onClickListener3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvtq) {
            dvtq dvtqVar = (dvtq) obj;
            if (this.a.equals(dvtqVar.e()) && this.b.equals(dvtqVar.h()) && ((charSequence = this.c) != null ? charSequence.equals(dvtqVar.m()) : dvtqVar.m() == null) && ((onClickListener = this.d) != null ? onClickListener.equals(dvtqVar.c()) : dvtqVar.c() == null) && ((charSequence2 = this.e) != null ? charSequence2.equals(dvtqVar.l()) : dvtqVar.l() == null) && this.f.equals(dvtqVar.i()) && this.g.equals(dvtqVar.j()) && ((charSequence3 = this.h) != null ? charSequence3.equals(dvtqVar.k()) : dvtqVar.k() == null) && this.i.equals(dvtqVar.g()) && ((onClickListener2 = this.j) != null ? onClickListener2.equals(dvtqVar.b()) : dvtqVar.b() == null) && ((onDismissListener = this.k) != null ? onDismissListener.equals(dvtqVar.f()) : dvtqVar.f() == null) && ((onClickListener3 = this.l) != null ? onClickListener3.equals(dvtqVar.d()) : dvtqVar.d() == null) && this.n == dvtqVar.p() && this.o == dvtqVar.o() && this.p == dvtqVar.n() && Float.floatToIntBits(this.m) == Float.floatToIntBits(dvtqVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dvtq
    public final PopupWindow.OnDismissListener f() {
        return this.k;
    }

    @Override // defpackage.dvtq
    public final emxc g() {
        return this.i;
    }

    @Override // defpackage.dvtq
    public final emxc h() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        CharSequence charSequence = this.c;
        int hashCode2 = ((hashCode * 1000003) ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003;
        View.OnClickListener onClickListener = this.d;
        int hashCode3 = (hashCode2 ^ (onClickListener == null ? 0 : onClickListener.hashCode())) * 1000003;
        CharSequence charSequence2 = this.e;
        int hashCode4 = (((((hashCode3 ^ (charSequence2 == null ? 0 : charSequence2.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        CharSequence charSequence3 = this.h;
        int hashCode5 = (((hashCode4 ^ (charSequence3 == null ? 0 : charSequence3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003;
        View.OnClickListener onClickListener2 = this.j;
        int hashCode6 = (hashCode5 ^ (onClickListener2 == null ? 0 : onClickListener2.hashCode())) * 1000003;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        int hashCode7 = (hashCode6 ^ (onDismissListener == null ? 0 : onDismissListener.hashCode())) * 1000003;
        View.OnClickListener onClickListener3 = this.l;
        return ((((((((hashCode7 ^ (onClickListener3 != null ? onClickListener3.hashCode() : 0)) * 1000003) ^ this.n) * 1000003) ^ this.o) * 1000003) ^ this.p) * 1000003) ^ Float.floatToIntBits(this.m);
    }

    @Override // defpackage.dvtq
    public final emxc i() {
        return this.f;
    }

    @Override // defpackage.dvtq
    public final emxc j() {
        return this.g;
    }

    @Override // defpackage.dvtq
    public final CharSequence k() {
        return this.h;
    }

    @Override // defpackage.dvtq
    public final CharSequence l() {
        return this.e;
    }

    @Override // defpackage.dvtq
    public final CharSequence m() {
        return this.c;
    }

    @Override // defpackage.dvtq
    public final int n() {
        return this.p;
    }

    @Override // defpackage.dvtq
    public final int o() {
        return this.o;
    }

    @Override // defpackage.dvtq
    public final int p() {
        return this.n;
    }

    public final String toString() {
        int i = this.n;
        View.OnClickListener onClickListener = this.l;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        View.OnClickListener onClickListener2 = this.j;
        emxc emxcVar = this.i;
        CharSequence charSequence = this.h;
        emxc emxcVar2 = this.g;
        emxc emxcVar3 = this.f;
        CharSequence charSequence2 = this.e;
        View.OnClickListener onClickListener3 = this.d;
        CharSequence charSequence3 = this.c;
        emxc emxcVar4 = this.b;
        return "TooltipModel{targetView=" + this.a.toString() + ", backgroundColor=" + String.valueOf(emxcVar4) + ", titleText=" + String.valueOf(charSequence3) + ", targetViewClickListener=" + String.valueOf(onClickListener3) + ", detailText=" + String.valueOf(charSequence2) + ", textColor=" + String.valueOf(emxcVar3) + ", titleColor=" + String.valueOf(emxcVar2) + ", actionText=" + String.valueOf(charSequence) + ", actionTextColor=" + String.valueOf(emxcVar) + ", actionListener=" + String.valueOf(onClickListener2) + ", dismissListener=" + String.valueOf(onDismissListener) + ", userClickedListener=" + String.valueOf(onClickListener) + ", tapDismissalType=" + (i != 1 ? "ANYWHERE" : "INTERNAL") + ", placement=" + (this.o != 1 ? "BELOW" : "ABOVE") + ", alignment=" + (this.p != 1 ? "CENTER" : "START") + ", maxWidthPercentage=" + this.m + "}";
    }
}
