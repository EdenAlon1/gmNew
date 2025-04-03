package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvz implements zvv, abqq {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/NetworkConnectionImpl");
    public final ConnectivityManager b;
    public final ejlk c;
    public final AtomicBoolean d;
    public final zvy e;
    private final Context f;
    private final ffsk g;
    private final ffsk h;
    private final ffhd i;
    private final askk j;

    public zvz(Context context, ConnectivityManager connectivityManager, ffsk ffskVar, ejlk ejlkVar, ffsk ffskVar2, ffhd ffhdVar, askk askkVar) {
        context.getClass();
        connectivityManager.getClass();
        ffskVar.getClass();
        ejlkVar.getClass();
        ffskVar2.getClass();
        ffhdVar.getClass();
        this.f = context;
        this.b = connectivityManager;
        this.g = ffskVar;
        this.c = ejlkVar;
        this.h = ffskVar2;
        this.i = ffhdVar;
        this.j = askkVar;
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.d = atomicBoolean;
        this.e = new zvy(this);
        if (askkVar.a()) {
            if (context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                axol.k(ffskVar, ffhdVar, new zvx(this, null), 2);
            } else {
                ((enrr) a.j().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/NetworkConnectionImpl", "connectCallback", 68, "NetworkConnectionImpl.kt")).q("Missing ACCESS_NETWORK_STATE permission");
                atomicBoolean.set(false);
            }
        }
    }

    @Override // defpackage.zvv
    public final boolean a() {
        return this.d.get();
    }

    @Override // defpackage.abqq, java.lang.AutoCloseable
    public final void close() {
        if (this.j.a()) {
            axol.k(this.h, null, new zvw(this, null), 3);
        }
    }
}
