package defpackage;

import android.content.pm.ProviderInfo;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejnn extends ejni {
    public ejnn(ProviderInfo providerInfo, Throwable th) {
        super("Provider exists, but could not be obtained: ".concat(providerInfo.toString()), th);
    }
}
