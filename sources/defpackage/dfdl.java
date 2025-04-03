package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.internal.IAuthService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfdl extends dfwc {
    private final Bundle a;

    public dfdl(Context context, Looper looper, dfvs dfvsVar, dfbf dfbfVar, dfsm dfsmVar, dftw dftwVar) {
        super(context, looper, 16, dfvsVar, dfsmVar, dftwVar);
        this.a = dfbfVar == null ? new Bundle() : new Bundle(dfbfVar.a);
    }

    @Override // defpackage.dfwc, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dfqr
    public final int a() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IAuthService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Bundle g() {
        return this.a;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gK() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.dfqr
    public final boolean h() {
        dfvs dfvsVar = ((dfwc) this).u;
        Account account = dfvsVar.a;
        if (TextUtils.isEmpty(account != null ? account.name : null)) {
            return false;
        }
        if (((dfvr) dfvsVar.d.get(dfbe.b)) == null) {
            return !dfvsVar.b.isEmpty();
        }
        throw null;
    }
}
