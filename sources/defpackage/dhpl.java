package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.ISignInCallbacks;
import com.google.android.gms.signin.internal.ISignInService;
import com.google.android.gms.signin.internal.SignInRequest;
import com.google.android.gms.signin.internal.SignInResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhpl extends dfwc implements dhpe {
    private final boolean a;
    private final dfvs v;
    private final Bundle w;
    private final Integer x;

    public dhpl(Context context, Looper looper, dfvs dfvsVar, Bundle bundle, dfrc dfrcVar, dfrd dfrdVar) {
        super(context, looper, 44, dfvsVar, dfrcVar, dfrdVar);
        this.a = true;
        this.v = dfvsVar;
        this.w = bundle;
        this.x = dfvsVar.h;
    }

    @Override // defpackage.dfwc, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dfqr
    public final int a() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return ISignInService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // defpackage.dhpe
    public final void e() {
        l(new dfvm(this));
    }

    @Override // defpackage.dhpe
    public final void f(ISignInCallbacks iSignInCallbacks) {
        try {
            Account account = this.v.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount a = "<<default account>>".equals(account.name) ? dfep.c(this.c).a() : null;
            Integer num = this.x;
            dfwv.n(num);
            ((ISignInService) w()).signIn(new SignInRequest(1, new ResolveAccountRequest(2, account, num.intValue(), a)), iSignInCallbacks);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                iSignInCallbacks.onSignInComplete(new SignInResponse(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Bundle g() {
        if (!this.c.getPackageName().equals(this.v.e)) {
            this.w.putString("com.google.android.gms.signin.internal.realClientPackageName", this.v.e);
        }
        return this.w;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.dfqr
    public final boolean h() {
        return this.a;
    }
}
