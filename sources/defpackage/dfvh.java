package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.ims.util.common.RcsIntents;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class dfvh extends dfvj {
    public final int a;
    public final Bundle b;
    final /* synthetic */ BaseGmsClient c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected dfvh(BaseGmsClient baseGmsClient, int i, Bundle bundle) {
        super(baseGmsClient, true);
        this.c = baseGmsClient;
        this.a = i;
        this.b = bundle;
    }

    protected abstract void a(ConnectionResult connectionResult);

    protected abstract boolean c();

    @Override // defpackage.dfvj
    protected final /* bridge */ /* synthetic */ void d() {
        if (this.a != 0) {
            this.c.gJ(1, null);
            Bundle bundle = this.b;
            a(new ConnectionResult(this.a, bundle != null ? (PendingIntent) bundle.getParcelable(RcsIntents.EXTRA_PENDING_INTENT) : null));
        } else {
            if (c()) {
                return;
            }
            this.c.gJ(1, null);
            a(new ConnectionResult(8, null));
        }
    }

    @Override // defpackage.dfvj
    protected final void b() {
    }
}
