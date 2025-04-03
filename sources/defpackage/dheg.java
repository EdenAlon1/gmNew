package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dheg extends dhek {
    private final Account a;

    public dheg(Account account) {
        if (account == null) {
            throw new NullPointerException("Null account");
        }
        this.a = account;
    }

    @Override // defpackage.dhek, defpackage.dfqm
    public final Account a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dhek) {
            return this.a.equals(((dhek) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "MdiSyncClientOptions{account=" + this.a.toString() + "}";
    }
}
