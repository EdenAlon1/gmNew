package defpackage;

import android.util.Log;
import com.google.android.apps.tachyon.clientapi.IGetMeetApiAvailabilityCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgeo extends IGetMeetApiAvailabilityCallback.Stub {
    final /* synthetic */ dhri a;

    public dgeo(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.apps.tachyon.clientapi.IGetMeetApiAvailabilityCallback
    public final void onResult(byte[] bArr) {
        try {
            this.a.b(new dgeg(true, true, ((esek) eyfy.parseFrom(esek.a, bArr, eyfc.a())).b));
        } catch (eygu | NullPointerException e) {
            Log.e("DuoStateFetcher", "Error getting Meet registered.", e);
            this.a.b(new dgeg(true, true, false));
        }
    }
}
