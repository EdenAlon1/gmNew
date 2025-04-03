package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csmo extends csoc {
    public elbx a;
    private final csmz b;

    public csmo(csmz csmzVar) {
        this.b = csmzVar;
    }

    @Override // defpackage.cniz
    public final ekzm a() {
        return this.a.b("ConnectivityBroadcastReceiverLegacy Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return null;
    }

    @Override // defpackage.cniz
    public final void c(Context context, final Intent intent) {
        String action = intent.getAction();
        if (action == null || action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            final csoa csoaVar = (csoa) this.b;
            axos.a(new Runnable() { // from class: csnb
                @Override // java.lang.Runnable
                public final void run() {
                    csoa csoaVar2 = csoa.this;
                    for (final csmw csmwVar : csoaVar2.o) {
                        final Intent intent2 = intent;
                        axos.a(new Runnable() { // from class: csna
                            @Override // java.lang.Runnable
                            public final void run() {
                                enru enruVar = csoa.c;
                                csmw.this.a(intent2);
                            }
                        }, csoaVar2.h);
                    }
                }
            }, csoaVar.i);
        }
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 18;
    }
}
