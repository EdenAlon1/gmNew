package defpackage;

import android.text.SpannableString;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eayt extends eayw {
    public final emxc a;
    public final SpannableString b;
    public final emxc c;

    public eayt(emxc emxcVar, SpannableString spannableString, emxc emxcVar2) {
        this.a = emxcVar;
        this.b = spannableString;
        this.c = emxcVar2;
    }

    @Override // defpackage.eayw
    public final SpannableString a() {
        return this.b;
    }

    @Override // defpackage.eayw
    public final emxc b() {
        return this.c;
    }

    @Override // defpackage.eayw
    public final emxc c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eayw) {
            eayw eaywVar = (eayw) obj;
            if (this.a.equals(eaywVar.c()) && this.b.equals(eaywVar.a()) && this.c.equals(eaywVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.c;
        SpannableString spannableString = this.b;
        return "DeactivatedAccountsDialogInfo{title=" + this.a.toString() + ", explanation=" + spannableString.toString() + ", actionButtonSpec=" + emxcVar.toString() + "}";
    }
}
