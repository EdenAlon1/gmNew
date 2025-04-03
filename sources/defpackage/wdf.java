package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wdf extends wdh implements cnjr {
    public static final cskc a = cskc.g("Bugle", "DefaultSimChangeReceiver");
    public ffbr b;

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.b.b()).b("DefaultSimChangeReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return null;
    }

    @Override // defpackage.cniz
    public final void c(Context context, Intent intent) {
        a.p("Default SIM was changed");
        if (context != null) {
            ayfe.a(context, bdgq.a, null);
        }
    }
}
