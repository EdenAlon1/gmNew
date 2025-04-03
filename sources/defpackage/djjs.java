package defpackage;

import android.net.Network;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class djjs {
    public static djjs d(String str, Network network, boolean z) {
        return new djjj(Optional.ofNullable(str), Optional.ofNullable(network), z);
    }

    public abstract Optional a();

    public abstract Optional b();

    @Deprecated
    public abstract boolean c();
}
