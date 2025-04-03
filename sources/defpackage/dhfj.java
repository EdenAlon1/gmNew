package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhfj extends dhfk {
    final /* synthetic */ dhri a;

    public dhfj(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // defpackage.dhfk, com.google.android.gms.mobstore.IMobStoreFileCallbacks
    public final void onRenamed(Status status) {
        dfup.a(status, this.a);
    }
}
