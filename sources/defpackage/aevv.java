package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aevv {
    public final String a;
    public final CharSequence b;
    public final String c;
    public final String d;
    public final DialogInterface.OnClickListener e;
    public final DialogInterface.OnClickListener f;

    public aevv(String str, CharSequence charSequence, String str2, String str3, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        str.getClass();
        charSequence.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = charSequence;
        this.c = str2;
        this.d = str3;
        this.e = onClickListener;
        this.f = onClickListener2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aevv)) {
            return false;
        }
        aevv aevvVar = (aevv) obj;
        return ffkj.e(this.a, aevvVar.a) && ffkj.e(this.b, aevvVar.b) && ffkj.e(this.c, aevvVar.c) && ffkj.e(this.d, aevvVar.d) && ffkj.e(this.e, aevvVar.e) && ffkj.e(this.f, aevvVar.f);
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        DialogInterface.OnClickListener onClickListener = this.e;
        int hashCode2 = ((hashCode * 31) + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31;
        DialogInterface.OnClickListener onClickListener2 = this.f;
        return hashCode2 + (onClickListener2 != null ? onClickListener2.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateFlowDialogInfo(title=" + this.a + ", message=" + ((Object) this.b) + ", positiveButtonText=" + this.c + ", negativeButtonText=" + this.d + ", negativeButtonListener=" + this.e + ", positiveButtonListener=" + this.f + ")";
    }
}
