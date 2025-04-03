package defpackage;

import android.os.Bundle;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfof extends dfod {
    public dfof(int i, Bundle bundle) {
        super(i, 1, bundle);
    }

    @Override // defpackage.dfod
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(GroupManagementRequest.DATA_TAG);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // defpackage.dfod
    public final boolean b() {
        return false;
    }
}
