package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.credentials.internal.ICredentialsService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfbv extends dfwc {
    private final dfbb a;

    public dfbv(Context context, Looper looper, dfvs dfvsVar, dfbb dfbbVar, dfrc dfrcVar, dfrd dfrdVar) {
        super(context, looper, 68, dfvsVar, dfrcVar, dfrdVar);
        dfba dfbaVar = new dfba(dfbbVar == null ? dfbb.a : dfbbVar);
        dfbaVar.b = dgpa.a();
        this.a = new dfbb(dfbaVar);
    }

    @Override // defpackage.dfwc, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dfqr
    public final int a() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return ICredentialsService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        dfbb dfbbVar = this.a;
        bundle.putBoolean("force_save_dialog", dfbbVar.c);
        bundle.putString("log_session_id", dfbbVar.d);
        return bundle;
    }
}
