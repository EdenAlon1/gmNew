package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.ISignInService;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfed extends dfwc {
    public final GoogleSignInOptions a;

    public dfed(Context context, Looper looper, dfvs dfvsVar, GoogleSignInOptions googleSignInOptions, dfrc dfrcVar, dfrd dfrdVar) {
        super(context, looper, 91, dfvsVar, dfrcVar, dfrdVar);
        dfdy dfdyVar = googleSignInOptions != null ? new dfdy(googleSignInOptions) : new dfdy();
        dfdyVar.b = dgpa.a();
        if (!dfvsVar.c.isEmpty()) {
            Iterator it = dfvsVar.c.iterator();
            while (it.hasNext()) {
                dfdyVar.c((Scope) it.next(), new Scope[0]);
            }
        }
        this.a = dfdyVar.a();
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
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
