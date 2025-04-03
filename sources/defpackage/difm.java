package defpackage;

import com.google.android.gms.wearable.internal.SendMessageResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class difm extends diff {
    public difm(dfse dfseVar) {
        super(dfseVar);
    }

    @Override // com.google.android.gms.wearable.internal.AbstractWearableCallbacks, com.google.android.gms.wearable.internal.IWearableCallbacks
    public final void onSendMessage(SendMessageResponse sendMessageResponse) {
        a(new diei(difd.a(sendMessageResponse.a), sendMessageResponse.b));
    }
}
