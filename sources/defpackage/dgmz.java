package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.gmscompliance.IGmsDeviceComplianceService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgmz extends dfwc {
    public dgmz(Context context, Looper looper, dfvs dfvsVar, dfsm dfsmVar, dftw dftwVar) {
        super(context, looper, 257, dfvsVar, dfsmVar, dftwVar);
    }

    @Override // defpackage.dfwc, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dfqr
    public final int a() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IGmsDeviceComplianceService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.gmscompliance.IGmsDeviceComplianceService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.gmscompliance.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gK() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] gL() {
        return dgll.b;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final boolean i() {
        return true;
    }
}
