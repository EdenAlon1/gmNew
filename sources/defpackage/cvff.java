package defpackage;

import android.content.Context;
import android.provider.Settings;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvff {
    private final Context a;
    private final Optional b;

    public cvff(Context context, Optional optional) {
        this.a = context;
        this.b = optional;
    }

    public final boolean a() {
        return !this.b.isPresent() && Settings.Global.getInt(this.a.getContentResolver(), "vt_ims_enabled", 1) == 1;
    }
}
