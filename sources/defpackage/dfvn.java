package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfvn extends dfvh {
    public final IBinder g;
    final /* synthetic */ BaseGmsClient h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfvn(BaseGmsClient baseGmsClient, int i, IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.h = baseGmsClient;
        this.g = iBinder;
    }

    @Override // defpackage.dfvh
    protected final void a(ConnectionResult connectionResult) {
        dfwb dfwbVar = this.h.t;
        if (dfwbVar != null) {
            dfwbVar.a(connectionResult);
        }
        System.currentTimeMillis();
    }

    @Override // defpackage.dfvh
    protected final boolean c() {
        try {
            IBinder iBinder = this.g;
            dfwv.n(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.h.c().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.h.c() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface b = this.h.b(this.g);
            if (b == null || !(this.h.F(2, 4, b) || this.h.F(3, 4, b))) {
                return false;
            }
            BaseGmsClient baseGmsClient = this.h;
            baseGmsClient.o = null;
            dfwa dfwaVar = baseGmsClient.s;
            if (dfwaVar == null) {
                return true;
            }
            dfwaVar.a.onConnected(null);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
