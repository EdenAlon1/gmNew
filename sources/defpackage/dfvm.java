package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfvm implements dfvk {
    final /* synthetic */ BaseGmsClient a;

    public dfvm(BaseGmsClient baseGmsClient) {
        this.a = baseGmsClient;
    }

    @Override // defpackage.dfvk
    public final void a(ConnectionResult connectionResult) {
        if (connectionResult.b()) {
            BaseGmsClient baseGmsClient = this.a;
            baseGmsClient.o(null, baseGmsClient.z());
        } else {
            dfwb dfwbVar = this.a.t;
            if (dfwbVar != null) {
                dfwbVar.a(connectionResult);
            }
        }
    }
}
