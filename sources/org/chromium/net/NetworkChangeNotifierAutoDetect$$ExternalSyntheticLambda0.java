package org.chromium.net;

import defpackage.fifr;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class NetworkChangeNotifierAutoDetect$$ExternalSyntheticLambda0 implements Runnable {
    public /* synthetic */ NetworkChangeNotifierAutoDetect f$0;
    public /* synthetic */ fifr f$1;

    public /* synthetic */ NetworkChangeNotifierAutoDetect$$ExternalSyntheticLambda0(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect, fifr fifrVar) {
        this.f$0 = networkChangeNotifierAutoDetect;
        this.f$1 = fifrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.lambda$setConnectivityManagerDelegateForTests$1(this.f$1);
    }
}
