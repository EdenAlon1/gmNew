package defpackage;

import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class djkr {
    public abstract Network a();

    public abstract NetworkCapabilities b();

    public abstract engw c();

    public abstract engw d();

    public abstract String e();

    public final boolean f() {
        return b().hasTransport(1);
    }
}
