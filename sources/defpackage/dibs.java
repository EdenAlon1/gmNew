package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.ChannelImpl;
import com.google.android.gms.wearable.internal.ChannelStreamCallbacks;
import com.google.android.gms.wearable.internal.IWearableService;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dibs extends dibk {
    final /* synthetic */ ChannelImpl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dibs(ChannelImpl channelImpl, dfre dfreVar) {
        super(dfreVar);
        this.a = channelImpl;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ dfrl a(Status status) {
        return new dibt(status, null);
    }

    @Override // defpackage.dfsd
    protected final /* bridge */ /* synthetic */ void b(dfqk dfqkVar) {
        ChannelStreamCallbacks channelStreamCallbacks = new ChannelStreamCallbacks();
        ((IWearableService) ((difp) dfqkVar).w()).getChannelOutputStream(new difh(this, channelStreamCallbacks), channelStreamCallbacks, this.a.a);
    }
}
