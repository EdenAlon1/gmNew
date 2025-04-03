package defpackage;

import android.os.Bundle;
import com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryNoCacheCallback;
import com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest;
import com.google.android.gms.duokit.LookupSingleRemoteReachabilityResponse;
import com.google.android.gms.duokit.RemoteUserReachability;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgfn extends IReachabilityQueryNoCacheCallback.Stub {
    final /* synthetic */ LookupSingleRemoteReachabilityRequest a;
    final /* synthetic */ dhri b;
    final /* synthetic */ dgfo c;

    public dgfn(dgfo dgfoVar, LookupSingleRemoteReachabilityRequest lookupSingleRemoteReachabilityRequest, dhri dhriVar) {
        this.a = lookupSingleRemoteReachabilityRequest;
        this.b = dhriVar;
        this.c = dgfoVar;
    }

    @Override // com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryNoCacheCallback
    public final void onFinished(Map map) {
        LookupSingleRemoteReachabilityResponse lookupSingleRemoteReachabilityResponse = new LookupSingleRemoteReachabilityResponse();
        dhri dhriVar = this.b;
        LookupSingleRemoteReachabilityRequest lookupSingleRemoteReachabilityRequest = this.a;
        dgfo dgfoVar = this.c;
        if (map == null || map.isEmpty()) {
            dgfoVar.a.f(14);
            RemoteUserReachability remoteUserReachability = new RemoteUserReachability();
            remoteUserReachability.a = lookupSingleRemoteReachabilityRequest.a;
            remoteUserReachability.b = 0;
            lookupSingleRemoteReachabilityResponse.a = remoteUserReachability;
            dhriVar.b(lookupSingleRemoteReachabilityResponse);
            return;
        }
        Bundle bundle = (Bundle) map.values().iterator().next();
        if (bundle.isEmpty()) {
            dgfoVar.a.f(14);
            RemoteUserReachability remoteUserReachability2 = new RemoteUserReachability();
            remoteUserReachability2.a = lookupSingleRemoteReachabilityRequest.a;
            remoteUserReachability2.b = 0;
            remoteUserReachability2.c = 0;
            lookupSingleRemoteReachabilityResponse.a = remoteUserReachability2;
            dhriVar.b(lookupSingleRemoteReachabilityResponse);
            return;
        }
        RemoteUserReachability remoteUserReachability3 = new RemoteUserReachability();
        remoteUserReachability3.a = lookupSingleRemoteReachabilityRequest.a;
        int i = bundle.getInt("IS_USER_REACHABLE", 0);
        remoteUserReachability3.b = i;
        int i2 = bundle.getInt("IS_USER_MEET_REACHABLE", 0);
        remoteUserReachability3.c = i2;
        dgec dgecVar = dgfoVar.a;
        fatx fatxVar = (fatx) faty.a.createBuilder();
        fatxVar.copyOnWrite();
        ((faty) fatxVar.instance).b = i;
        fatxVar.copyOnWrite();
        ((faty) fatxVar.instance).c = i2;
        dgecVar.d((faty) fatxVar.build());
        lookupSingleRemoteReachabilityResponse.a = remoteUserReachability3;
        dhriVar.b(lookupSingleRemoteReachabilityResponse);
    }
}
