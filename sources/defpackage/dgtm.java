package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.kids.internal.IParentalControlsService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgtm extends dfwc {
    public dgtm(Context context, Looper looper, dfvs dfvsVar, dfsm dfsmVar, dftw dftwVar) {
        super(context, looper, 42, dfvsVar, dfsmVar, dftwVar);
    }

    @Override // defpackage.dfwc, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dfqr
    public final int a() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        iBinder.getClass();
        return IParentalControlsService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.kids.internal.IParentalControlsService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.kids.parentalcontrols.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gK() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] gL() {
        return new Feature[]{dgsk.a};
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final boolean i() {
        return false;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String y() {
        return (dfyw.c() && true == ((DevicePolicyManager) this.c.getSystemService(DevicePolicyManager.class)).isProfileOwnerApp("com.google.android.gms.supervision")) ? "com.google.android.gms.supervision" : "com.google.android.gms";
    }
}
