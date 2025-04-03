package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.internal.AbstractContactsSyncServiceCallbacks;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhhj extends AbstractContactsSyncServiceCallbacks {
    final /* synthetic */ dhri a;

    public dhhj(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.people.contactssync.internal.AbstractContactsSyncServiceCallbacks, com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public final void onStatus(Status status) {
        dfup.c(status, true, this.a);
    }
}
