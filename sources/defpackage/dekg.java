package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dekg extends dekh {
    public final eixn a;
    public final Account b;
    public final boolean c;

    public dekg(eixn eixnVar, Account account, boolean z) {
        eixnVar.getClass();
        this.a = eixnVar;
        this.b = account;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dekg)) {
            return false;
        }
        dekg dekgVar = (dekg) obj;
        return ffkj.e(this.a, dekgVar.a) && ffkj.e(this.b, dekgVar.b) && this.c == dekgVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Account account = this.b;
        return ((hashCode + (account == null ? 0 : account.hashCode())) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "SelectedAccount(account=" + this.a + ", androidAccount=" + this.b + ", canShareAccountData=" + this.c + ")";
    }
}
