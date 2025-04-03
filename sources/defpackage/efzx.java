package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efzx {
    private static final enru b = enru.c("com/google/android/libraries/user/profile/photopicker/common/account/PhotoPickerAccount");
    public emxc a = emux.a;
    private final Account c;

    public efzx(Context context, Account account, efzv efzvVar) {
        this.c = account;
        a(efzvVar.a());
        AccountManager.get(context).addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: efzw
            @Override // android.accounts.OnAccountsUpdateListener
            public final void onAccountsUpdated(Account[] accountArr) {
                efzx.this.a(accountArr);
            }
        }, null, false);
    }

    public final void a(Account[] accountArr) {
        emxc emxcVar;
        ((enrr) ((enrr) b.e()).h("com/google/android/libraries/user/profile/photopicker/common/account/PhotoPickerAccount", "updateAccountId", 63, "PhotoPickerAccount.java")).q("Updating account id");
        int i = 0;
        while (true) {
            if (i >= accountArr.length) {
                emxcVar = emux.a;
                break;
            } else {
                if (accountArr[i].equals(this.c)) {
                    emxcVar = emxc.j(Integer.valueOf(i));
                    break;
                }
                i++;
            }
        }
        this.a = emxcVar;
    }
}
