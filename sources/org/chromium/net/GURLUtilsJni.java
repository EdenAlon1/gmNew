package org.chromium.net;

import defpackage.fdxa;
import internal.J.N;
import org.chromium.net.GURLUtils;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class GURLUtilsJni implements GURLUtils.Natives {
    private static fdxa sOverride;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, org.chromium.net.GURLUtils$Natives] */
    public static GURLUtils.Natives get() {
        ?? r0;
        fdxa fdxaVar = sOverride;
        return (fdxaVar == null || (r0 = fdxaVar.b) == 0) ? new GURLUtilsJni() : r0;
    }

    public static void setInstanceForTesting(GURLUtils.Natives natives) {
        if (sOverride == null) {
            sOverride = fdxa.a();
        }
        sOverride.b = natives;
    }

    @Override // org.chromium.net.GURLUtils.Natives
    public String getOrigin(String str) {
        return (String) N.MpCt7siL(str);
    }
}
