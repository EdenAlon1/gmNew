package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.folsom.internal.IKeyRetrievalService;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfhn extends dfwc {
    private final dfgp a;

    public dfhn(Context context, Looper looper, dfvs dfvsVar, dfsm dfsmVar, dftw dftwVar, dfgp dfgpVar) {
        super(context, looper, 172, dfvsVar, dfsmVar, dftwVar);
        this.a = dfgpVar;
    }

    @Override // defpackage.dfwc, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dfqr
    public final int a() {
        return 19609000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IKeyRetrievalService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.auth.folsom.internal.IKeyRetrievalService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.auth.key.retrieval.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putString("SECURITY_DOMAIN", this.a.a);
        bundle.putString("UTM_SOURCE", null);
        bundle.putString("UTM_MEDIUM", null);
        bundle.putString("UTM_CAMPAIGN", null);
        bundle.putString("SESSION_ID", null);
        bundle.putInt("CALLER_ID", 0);
        bundle.putBoolean("OFFER_RESET", false);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gK() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] gL() {
        return dfiu.j;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final boolean i() {
        return true;
    }
}
