package org.chromium.net;

import defpackage.fifz;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class NetworkChangeNotifierAutoDetect$$ExternalSyntheticLambda1 implements Runnable {
    public /* synthetic */ NetworkChangeNotifierAutoDetect f$0;
    public /* synthetic */ fifz f$1;

    public /* synthetic */ NetworkChangeNotifierAutoDetect$$ExternalSyntheticLambda1(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect, fifz fifzVar) {
        this.f$0 = networkChangeNotifierAutoDetect;
        this.f$1 = fifzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.lambda$setWifiManagerDelegateForTests$2(this.f$1);
    }
}
