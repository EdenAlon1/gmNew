package defpackage;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.util.Log;
import com.google.android.libraries.onegoogle.owners.mdi.MdiOwnersLoader;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebxq implements ebwq {
    private final dydd a;
    private final ebwg b;
    private final dyda c = new ebxo(this);
    private final List d = new ArrayList();
    private final MdiOwnersLoader e;
    private final ebxx f;
    private final ebxh g;

    public ebxq(Context context, dydd dyddVar, ebwg ebwgVar, ebun ebunVar) {
        context.getClass();
        dyddVar.getClass();
        this.a = dyddVar;
        this.b = ebwgVar;
        this.g = new ebxh(context, ebwgVar, new OnAccountsUpdateListener() { // from class: ebxj
            @Override // android.accounts.OnAccountsUpdateListener
            public final void onAccountsUpdated(Account[] accountArr) {
                ebxq ebxqVar = ebxq.this;
                ebxqVar.j();
                for (Account account : accountArr) {
                    ebxqVar.i(account);
                }
            }
        });
        this.e = new MdiOwnersLoader(context, dyddVar, ebwgVar, ebunVar);
        this.f = new ebxx(dyddVar, context);
    }

    public static ListenableFuture h(ListenableFuture listenableFuture) {
        return elfr.j(listenableFuture, new emwl() { // from class: ebxi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((emxc) obj).f();
            }
        }, erpp.a);
    }

    @Override // defpackage.ebwq
    public final ListenableFuture a() {
        return this.e.a(new emwl() { // from class: ebxl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ebxq.h(((dydc) obj).b());
            }
        });
    }

    @Override // defpackage.ebwq
    public final ListenableFuture b(final String str) {
        final MdiOwnersLoader mdiOwnersLoader = this.e;
        return elfr.k(mdiOwnersLoader.b.a(), new eroh() { // from class: ebxy
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                for (Account account : (List) obj) {
                    final String str2 = str;
                    if (str2.equals(account.name)) {
                        final MdiOwnersLoader mdiOwnersLoader2 = MdiOwnersLoader.this;
                        final ListenableFuture d = mdiOwnersLoader2.a.a(account).d();
                        return elfr.b(d).a(new Callable() { // from class: ebxz
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ebwl m = ebwn.m();
                                m.b(str2);
                                MdiOwnersLoader.this.b(m, d);
                                return m.a();
                            }
                        }, erpp.a);
                    }
                }
                return erqt.i(null);
            }
        }, erpp.a);
    }

    @Override // defpackage.ebwq
    public final ListenableFuture c() {
        return this.e.a(new emwl() { // from class: ebxm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((dydc) obj).d();
            }
        });
    }

    @Override // defpackage.ebwq
    public final void d(ejhg ejhgVar) {
        synchronized (this.d) {
            if (this.d.isEmpty()) {
                ebxh ebxhVar = this.g;
                synchronized (ebxhVar) {
                    if (!ebxhVar.a) {
                        ebxhVar.c.addOnAccountsUpdatedListener(ebxhVar.b, null, false, new String[]{"com.google"});
                        ebxhVar.a = true;
                    }
                }
                elfr.l(this.b.a(), new ebxp(this), erpp.a);
            }
            this.d.add(ejhgVar);
        }
    }

    @Override // defpackage.ebwq
    public final void e(ejhg ejhgVar) {
        synchronized (this.d) {
            if (this.d.isEmpty()) {
                return;
            }
            this.d.remove(ejhgVar);
            if (this.d.isEmpty()) {
                ebxh ebxhVar = this.g;
                synchronized (ebxhVar) {
                    if (ebxhVar.a) {
                        try {
                            ebxhVar.c.removeOnAccountsUpdatedListener(ebxhVar.b);
                        } catch (IllegalArgumentException e) {
                            Log.w("OneGoogle", "Failed to remove an OnAccountsUpdatedListener", e);
                        }
                        ebxhVar.a = false;
                    }
                }
            }
        }
    }

    @Override // defpackage.ebwq
    public final ListenableFuture f(String str, int i) {
        return this.f.a(new ebxw() { // from class: ebxk
            @Override // defpackage.ebxw
            public final ListenableFuture a(dydc dydcVar, dydb dydbVar, int i2) {
                return ebxq.h(dydcVar.c(dydbVar, i2));
            }
        }, str, i);
    }

    @Override // defpackage.ebwq
    public final ListenableFuture g(String str, int i) {
        return this.f.a(new ebxw() { // from class: ebxn
            @Override // defpackage.ebxw
            public final ListenableFuture a(dydc dydcVar, dydb dydbVar, int i2) {
                return dydcVar.e(dydbVar, i2);
            }
        }, str, i);
    }

    public final void i(Account account) {
        dydc a = this.a.a(account);
        a.h(this.c);
        a.g(this.c, erpp.a);
    }

    public final void j() {
        synchronized (this.d) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((ejhg) it.next()).a();
            }
        }
    }
}
