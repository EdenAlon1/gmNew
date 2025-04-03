package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfvo extends dfvh {
    final /* synthetic */ BaseGmsClient g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfvo(BaseGmsClient baseGmsClient, int i, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.g = baseGmsClient;
    }

    @Override // defpackage.dfvh
    protected final void a(ConnectionResult connectionResult) {
        this.g.i.a(connectionResult);
        System.currentTimeMillis();
    }

    @Override // defpackage.dfvh
    protected final boolean c() {
        this.g.i.a(ConnectionResult.a);
        return true;
    }
}
