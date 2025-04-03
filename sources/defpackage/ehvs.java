package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ehvs {
    protected final ehvt a;
    private final IntentFilter c;
    private final Context d;
    protected final Set b = new HashSet();
    private ehvr e = null;
    private volatile boolean f = false;

    protected ehvs(ehvt ehvtVar, IntentFilter intentFilter, Context context) {
        this.a = ehvtVar;
        this.c = intentFilter;
        this.d = ehwt.a(context);
    }

    private final void e() {
        ehvr ehvrVar;
        if (!this.b.isEmpty() && this.e == null) {
            this.e = new ehvr(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.d.registerReceiver(this.e, this.c, 2);
            } else {
                this.d.registerReceiver(this.e, this.c);
            }
        }
        if (!this.b.isEmpty() || (ehvrVar = this.e) == null) {
            return;
        }
        this.d.unregisterReceiver(ehvrVar);
        this.e = null;
    }

    protected abstract void a(Context context, Intent intent);

    public final synchronized void b(Object obj) {
        Iterator it = new HashSet(this.b).iterator();
        while (it.hasNext()) {
            aeux aeuxVar = (aeux) it.next();
            aeuz aeuzVar = aeuxVar.a;
            eg egVar = aeuxVar.b;
            int i = ((ehvn) obj).a;
            if (i != 11) {
                switch (i) {
                    case 0:
                        ((ensz) aeuz.a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "registerAppUpdateListener", 327, "InAppUpdatePresenterImpl.java")).r("Update flow transitioned to InstallStatus code: %s.", ((ehvn) obj).a);
                        ((aeva) aeuzVar.d.b()).b(14, true);
                        break;
                    case 1:
                        ((ensz) aeuz.a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "registerAppUpdateListener", 302, "InAppUpdatePresenterImpl.java")).q("Update pending.");
                        break;
                    case 2:
                        ((ensz) aeuz.a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "registerAppUpdateListener", 305, "InAppUpdatePresenterImpl.java")).q("Update downloading.");
                        break;
                    case 3:
                        ((ensz) aeuz.a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "registerAppUpdateListener", 318, "InAppUpdatePresenterImpl.java")).q("Update installing.");
                        break;
                    case 4:
                        ((aeva) aeuzVar.d.b()).b(12, true);
                        ((ensz) aeuz.a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "registerAppUpdateListener", 324, "InAppUpdatePresenterImpl.java")).q("Update installed.");
                        break;
                    case 5:
                        ((ensz) ((ensz) aeuz.a.j()).h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "registerAppUpdateListener", 292, "InAppUpdatePresenterImpl.java")).r("Update failed with error code %s.", ((ehvn) obj).b);
                        ((aeva) aeuzVar.d.b()).b(6, true);
                        aeuzVar.j();
                        axnw.h(((aevc) aeuzVar.e.b()).c(true));
                        break;
                    case 6:
                        ((ensz) ((ensz) aeuz.a.h()).h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "registerAppUpdateListener", 285, "InAppUpdatePresenterImpl.java")).q("Update canceled by user");
                        ((aeva) aeuzVar.d.b()).b(7, true);
                        aeuzVar.j();
                        break;
                    default:
                        ((aeva) aeuzVar.d.b()).b(1, true);
                        ((ensz) ((ensz) aeuz.a.j()).h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "registerAppUpdateListener", 340, "InAppUpdatePresenterImpl.java")).r("Unexpected InstallStatus code occurred: %s.", ((ehvn) obj).a);
                        break;
                }
            } else {
                ((ensz) aeuz.a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "registerAppUpdateListener", 308, "InAppUpdatePresenterImpl.java")).q("Update downloaded, fetching new update info.");
                ((aeva) aeuzVar.d.b()).b(10, true);
                aeuzVar.i(egVar);
            }
        }
    }

    public final synchronized void c(aeux aeuxVar) {
        this.a.d("registerListener", new Object[0]);
        this.b.add(aeuxVar);
        e();
    }

    public final synchronized void d(aeux aeuxVar) {
        this.a.d("unregisterListener", new Object[0]);
        this.b.remove(aeuxVar);
        e();
    }
}
