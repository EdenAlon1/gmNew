package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseBooleanArray;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diom {
    public static boolean a = false;
    public static final SparseBooleanArray b = new SparseBooleanArray();
    public static dioi c = null;
    public static final diol d = new diol();
    public static final BroadcastReceiver e = new dioj();
    public static diku f = null;

    public static void a(Context context) {
        dkty.k("Initializing Carrier Services Logging.", new Object[0]);
        dkty.y(context);
        a = true;
    }

    public static synchronized void b(Context context) {
        synchronized (diom.class) {
            if (c == null) {
                dkty.k("Initializing Carrier Services Library.", new Object[0]);
                ecwj.f(context);
                dizc.m();
                dimn.I(context);
                c = new dioi();
                final Context applicationContext = context.getApplicationContext();
                SparseBooleanArray sparseBooleanArray = b;
                if (!sparseBooleanArray.get(applicationContext.hashCode(), false)) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.gservices.intent.action.GSERVICES_CHANGED");
                    diol diolVar = d;
                    koa.g(applicationContext, diolVar, intentFilter);
                    Runnable runnable = new Runnable() { // from class: dioh
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z = diom.a;
                            ezdl F = dimn.E().F();
                            diku dikuVar = diom.f;
                            Context context2 = applicationContext;
                            if (dikuVar != null) {
                                dikuVar.d(context2, F);
                            }
                            if (!Objects.isNull(diom.c)) {
                                dioi dioiVar = diom.c;
                                if (dioiVar.a != ((Boolean) dinq.a.a()).booleanValue()) {
                                    System.exit(0);
                                }
                            }
                            if (diom.a) {
                                dkty.y(context2);
                            }
                        }
                    };
                    synchronized (diolVar.a) {
                        diolVar.a.add(runnable);
                    }
                    IntentFilter intentFilter2 = new IntentFilter();
                    intentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
                    intentFilter2.addAction("android.intent.action.PACKAGE_CHANGED");
                    intentFilter2.addDataScheme("package");
                    applicationContext.registerReceiver(e, intentFilter2);
                    sparseBooleanArray.put(applicationContext.hashCode(), true);
                }
                f = (diku) ((dipk) dipo.a(context.getApplicationContext())).bq.b();
            }
        }
    }
}
