package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.auth.IAuthManagerService;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dezv extends dfac {
    public static final /* synthetic */ int a = 0;

    @Deprecated
    public static Account[] a(Context context, final String[] strArr) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final dezq a2 = dezq.a(context);
        try {
            dfwv.n(context);
            dfwv.l("com.google");
            dfac.g(context, 8400000);
            return (Account[]) dfac.j(context, dfac.d, new dfab() { // from class: dezw
                public final /* synthetic */ String a = "com.google";

                @Override // defpackage.dfab
                public final Object a(IBinder iBinder) {
                    Parcelable[] parcelableArray;
                    String[] strArr2 = dfac.b;
                    IAuthManagerService asInterface = IAuthManagerService.Stub.asInterface(iBinder);
                    Bundle bundle = new Bundle();
                    bundle.putString("accountType", this.a);
                    bundle.putStringArray("account_features", strArr);
                    Bundle accounts = asInterface.getAccounts(bundle);
                    if (accounts == null || (parcelableArray = accounts.getParcelableArray("accounts")) == null) {
                        throw new IOException("Receive null result from service call.");
                    }
                    Account[] accountArr = new Account[parcelableArray.length];
                    for (int i = 0; i < parcelableArray.length; i++) {
                        accountArr[i] = (Account) parcelableArray[i];
                    }
                    a2.b(1708, 0, elapsedRealtime, SystemClock.elapsedRealtime());
                    return accountArr;
                }
            });
        } catch (Exception e) {
            a2.b(1708, 13, elapsedRealtime, SystemClock.elapsedRealtime());
            throw e;
        }
    }
}
