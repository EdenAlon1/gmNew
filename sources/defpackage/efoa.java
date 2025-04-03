package defpackage;

import android.content.Context;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efoa {
    private final CronetEngine a;

    @Deprecated
    public efoa(CronetEngine cronetEngine) {
        this.a = cronetEngine;
    }

    public final efog a(Context context, String str, String str2, String str3) {
        return new efnz(context, str, str2, str3, new efnq(this.a));
    }
}
