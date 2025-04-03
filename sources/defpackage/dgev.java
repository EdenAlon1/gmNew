package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.tachyon.contacts.reachability.IReachabilityInviteLinkCallback;
import com.google.android.gms.duokit.GenerateInviteLinkResponse;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgev extends IReachabilityInviteLinkCallback.Stub {
    final /* synthetic */ dhri a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dgew c;

    public dgev(dgew dgewVar, dhri dhriVar, boolean z) {
        this.a = dhriVar;
        this.b = z;
        this.c = dgewVar;
    }

    @Override // com.google.android.apps.tachyon.contacts.reachability.IReachabilityInviteLinkCallback
    public final void onFinished(Map map) {
        boolean z = this.b;
        int i = z ? 16 : 15;
        dhri dhriVar = this.a;
        dgew dgewVar = this.c;
        if (map == null || map.isEmpty()) {
            dgewVar.b.f(i);
            dhriVar.a(new IllegalStateException("Received null or empty result from Duo Reachability Service."));
            return;
        }
        Bundle bundle = (Bundle) map.values().iterator().next();
        GenerateInviteLinkResponse generateInviteLinkResponse = new GenerateInviteLinkResponse();
        if (bundle.isEmpty() || !bundle.containsKey("INVITE_LINK")) {
            dgewVar.b.f(i);
            dhriVar.a(new IllegalStateException("Result bundle is empty or does not contain invite link."));
            return;
        }
        String string = bundle.getString("INVITE_LINK");
        dfwv.n(string);
        generateInviteLinkResponse.a = string;
        generateInviteLinkResponse.b = dgewVar.a.getString(R.string.generate_invite_link_default_message);
        dgewVar.b.c(z);
        dhriVar.b(generateInviteLinkResponse);
    }
}
