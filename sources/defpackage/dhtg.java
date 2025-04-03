package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.time.trustedtime.dto.TimeSignalResult;
import com.google.android.gms.time.trustedtime.internal.IOnLatestTimeSignalCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhtg extends IOnLatestTimeSignalCallback.Stub {
    final /* synthetic */ dhri a;

    public dhtg(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.time.trustedtime.internal.IOnLatestTimeSignalCallback
    public final void onLatestTimeSignal(Status status, TimeSignalResult timeSignalResult) {
        dfup.b(status, timeSignalResult, this.a);
    }
}
