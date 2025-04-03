package defpackage;

import android.os.Binder;
import android.os.Build;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtmm {
    public static dtpn a(dtpq dtpqVar, dtpg dtpgVar) {
        return ((dtpb) dtpgVar).c ? dtpqVar.a(dtpgVar) : dtpn.a;
    }

    public static ThreadFactory b(String str, ThreadFactory threadFactory) {
        ersf ersfVar = new ersf();
        ersfVar.c(true);
        ersfVar.d(str.concat(" Thread #%d"));
        ersfVar.a = threadFactory;
        return ersf.b(ersfVar);
    }

    public static ExecutorService c(dtpg dtpgVar, ThreadFactory threadFactory, final dtpn dtpnVar) {
        dtpb dtpbVar = (dtpb) dtpgVar;
        if (dtpbVar.c) {
            threadFactory = new dtps(threadFactory, dtpnVar);
        }
        if (dtpbVar.d != dtpi.a) {
            threadFactory = new dtpk(threadFactory);
        }
        return new eofp(dtpbVar.b, threadFactory, new Runnable() { // from class: dtmd
            @Override // java.lang.Runnable
            public final void run() {
                dtpn.this.c();
            }
        }, new Runnable() { // from class: dtme
            @Override // java.lang.Runnable
            public final void run() {
                if (Build.VERSION.SDK_INT < 31) {
                    Binder.flushPendingCommands();
                }
                dtpn.this.b();
            }
        });
    }
}
