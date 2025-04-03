package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejaj {
    private static final enru b = enru.c("com/google/apps/tiktok/account/data/device/DeviceAccountsChangedMonitor");
    public final Set a;
    private final Context c;
    private final errl d;
    private final ejjz e;
    private boolean f = false;

    public ejaj(Context context, Set set, errl errlVar, ejjz ejjzVar) {
        this.c = context;
        this.a = set;
        this.d = errlVar;
        this.e = ejjzVar;
    }

    final ListenableFuture a() {
        ((enrr) ((enrr) b.g()).h("com/google/apps/tiktok/account/data/device/DeviceAccountsChangedMonitor", "notifyAccountsChanged", 55, "DeviceAccountsChangedMonitor.java")).q("Device Accounts Changed");
        ListenableFuture n = erqt.n(eldl.c(new erog() { // from class: ejai
            @Override // defpackage.erog
            public final ListenableFuture a() {
                ListenableFuture b2;
                ArrayList arrayList = new ArrayList(1);
                enqu listIterator = ((enpx) ejaj.this.a).listIterator();
                while (listIterator.hasNext()) {
                    ejby ejbyVar = (ejby) listIterator.next();
                    try {
                        b2 = fgfz.b(ejbyVar.f, ffhe.a, ffsm.a, new ejbx(ejbyVar, null));
                        arrayList.add(b2);
                    } catch (Exception e) {
                        arrayList.add(erqt.h(e));
                    }
                }
                return erqt.c(arrayList).a(new eroi(null), erpp.a);
            }
        }), this.d);
        this.e.g(n);
        return n;
    }

    public final synchronized void b() {
        if (this.f) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.accounts.LOGIN_ACCOUNTS_CHANGED");
        this.c.registerReceiver(new ejah(), intentFilter);
        this.f = true;
    }

    final synchronized boolean c() {
        return this.f;
    }
}
