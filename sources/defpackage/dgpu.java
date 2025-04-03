package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgpu extends dgps {
    public dgpu(int i, Bundle bundle) {
        super(i, bundle);
    }

    @Override // defpackage.dgps
    public final void b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(GroupManagementRequest.DATA_TAG);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle2));
        }
        this.b.b(bundle2);
    }
}
