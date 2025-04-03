package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.auth.IAuthManagerService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfaa implements dfab {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;

    public dfaa(String str, Context context) {
        this.a = str;
        this.b = context;
    }

    @Override // defpackage.dfab
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) {
        Bundle requestGoogleAccountsAccess = IAuthManagerService.Stub.asInterface(iBinder).requestGoogleAccountsAccess(this.a);
        dfac.l(requestGoogleAccountsAccess);
        String string = requestGoogleAccountsAccess.getString("Error");
        Intent intent = (Intent) requestGoogleAccountsAccess.getParcelable("userRecoveryIntent");
        PendingIntent pendingIntent = (PendingIntent) requestGoogleAccountsAccess.getParcelable("userRecoveryPendingIntent");
        if (dfgl.SUCCESS.equals(dfgl.a(string))) {
            return true;
        }
        dfac.i(this.b, "requestGoogleAccountsAccess", string, intent, pendingIntent);
        throw new dezu("Invalid state. Shouldn't happen");
    }
}
