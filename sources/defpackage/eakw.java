package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eakw {
    public final Account a;
    public final String b;

    public eakw(Account account, String str) {
        str.getClass();
        this.a = account;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eakw)) {
            return false;
        }
        eakw eakwVar = (eakw) obj;
        return ffkj.e(this.a, eakwVar.a) && ffkj.e(this.b, eakwVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AccountAndScope(account=" + this.a + ", scope=" + this.b + ")";
    }
}
