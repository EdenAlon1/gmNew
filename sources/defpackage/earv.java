package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class earv implements earu {
    private static final entd a = entd.c("GnpSdk");
    private final Context b;

    public earv(Context context) {
        context.getClass();
        this.b = context;
    }

    private final Set c() {
        Object[] parcelableArray;
        easb.a(this.b, "android.permission.GET_ACCOUNTS");
        a.o().q("Try to retrieve accounts list from Accounts ContentProvider.");
        ContentResolver contentResolver = this.b.getContentResolver();
        contentResolver.getClass();
        ContentProviderClient acquireContentProviderClient = contentResolver.acquireContentProviderClient("com.google.android.gms.auth.accounts");
        try {
            if (acquireContentProviderClient == null) {
                throw new eart();
            }
            try {
                Set set = null;
                Bundle call = acquireContentProviderClient.call("get_accounts", "com.google", null);
                if (call == null) {
                    throw new IllegalStateException("Received null bundle when fetching device accounts via GMS Core.");
                }
                if (kqq.b()) {
                    parcelableArray = call.getParcelableArray("accounts", Account.class);
                    Account[] accountArr = (Account[]) parcelableArray;
                    if (accountArr != null) {
                        set = ffdo.N(accountArr);
                    }
                } else {
                    Parcelable[] parcelableArray2 = call.getParcelableArray("accounts");
                    if (parcelableArray2 != null) {
                        ArrayList arrayList = new ArrayList(parcelableArray2.length);
                        for (Parcelable parcelable : parcelableArray2) {
                            parcelable.getClass();
                            arrayList.add((Account) parcelable);
                        }
                        set = ffdx.ar(arrayList);
                    }
                }
                if (set == null) {
                    set = ffen.a;
                }
                return set;
            } catch (Exception e) {
                throw new eart(e);
            }
        } finally {
            acquireContentProviderClient.release();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.LinkedHashMap, java.util.Map] */
    @Override // defpackage.earu
    public final eafl a() {
        Object a2;
        try {
            AccountManager accountManager = AccountManager.get(this.b);
            Set<Account> c = c();
            a2 = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(c, 10)), 16));
            for (Account account : c) {
                ffcf ffcfVar = new ffcf(account.name, accountManager.getPreviousName(account));
                a2.put(ffcfVar.a, ffcfVar.b);
            }
        } catch (Throwable th) {
            a2 = ffci.a(th);
        }
        return eafm.a(a2);
    }

    @Override // defpackage.earu
    public final Set b() {
        Set c = c();
        ArrayList arrayList = new ArrayList(ffdx.n(c, 10));
        Iterator it = c.iterator();
        while (it.hasNext()) {
            arrayList.add(((Account) it.next()).name);
        }
        return ffdx.ar(arrayList);
    }
}
