package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwxn {
    public static String a(Account account) {
        return account.type + ":" + account.name;
    }

    public static boolean b(String str) {
        return (str == null || str.isEmpty() || str.contains(":") || str.contains("|")) ? false : true;
    }
}
