package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.ChannelStreamCallbacks;
import com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class difh extends diff {
    private final ChannelStreamCallbacks a;

    public difh(dfse dfseVar, ChannelStreamCallbacks channelStreamCallbacks) {
        super(dfseVar);
        this.a = channelStreamCallbacks;
    }

    @Override // com.google.android.gms.wearable.internal.AbstractWearableCallbacks, com.google.android.gms.wearable.internal.IWearableCallbacks
    public final void onGetChannelOutputStream(GetChannelOutputStreamResponse getChannelOutputStreamResponse) {
        dibw dibwVar;
        if (getChannelOutputStreamResponse.b != null) {
            dibwVar = new dibw(new ParcelFileDescriptor.AutoCloseOutputStream(getChannelOutputStreamResponse.b));
            this.a.setListener(new dibv(dibwVar));
        } else {
            dibwVar = null;
        }
        a(new dibt(new Status(getChannelOutputStreamResponse.a), dibwVar));
    }
}
