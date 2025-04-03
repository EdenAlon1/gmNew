package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class cnhd extends cnfw {
    public static final cskc a = cskc.g("Bugle", "SimChangeReceiver");
    public ffbr b;
    public ffbr c;
    public ffbr d;
    public ffbr e;

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.d.b()).b("SimChangeReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return null;
    }

    @Override // defpackage.cniz
    public final void c(final Context context, Intent intent) {
        final String action = intent.getAction();
        csjb c = a.c();
        c.I("action:");
        c.I(action);
        c.r();
        axos.a(new Runnable() { // from class: cnhc
            @Override // java.lang.Runnable
            public final void run() {
                cnhd cnhdVar = cnhd.this;
                String str = action;
                if ("com.google.android.ims.SIM_ABSENT".equals(str)) {
                    cnhd.a.m("SIM ABSENT");
                } else if ("com.google.android.ims.SIM_LOADED".equals(str)) {
                    ((copk) cnhdVar.e.b()).a(context);
                }
                ((akxl) cnhdVar.b.b()).r();
            }
        }, (Executor) this.c.b());
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 18;
    }
}
