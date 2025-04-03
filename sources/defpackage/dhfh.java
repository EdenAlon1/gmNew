package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhfh extends dhfk {
    final /* synthetic */ dhri a;

    public dhfh(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // defpackage.dhfk, com.google.android.gms.mobstore.IMobStoreFileCallbacks
    public final void onFileDescriptorOpened(Status status, OpenFileDescriptorResponse openFileDescriptorResponse) {
        dfup.b(status, openFileDescriptorResponse, this.a);
    }
}
