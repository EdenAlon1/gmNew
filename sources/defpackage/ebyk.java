package defpackage;

import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebyk implements ebwq {
    public final ebwq a;
    final /* synthetic */ ebyl b;
    private final ebwq c;
    private entd d;

    public ebyk(ebyl ebylVar, ebwq ebwqVar, ebwq ebwqVar2) {
        this.b = ebylVar;
        this.c = ebwqVar;
        this.a = ebwqVar2;
    }

    private final ListenableFuture i(final emwl emwlVar) {
        return elfr.f((ListenableFuture) emwlVar.apply(this.c), MdiNotAvailableException.class, new eroh() { // from class: ebyj
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ebyk ebykVar = ebyk.this;
                ebykVar.h((MdiNotAvailableException) obj);
                return (ListenableFuture) emwlVar.apply(ebykVar.a);
            }
        }, erpp.a);
    }

    private final ListenableFuture j(final ebyc ebycVar, final String str, final int i) {
        return elfr.f(ebycVar.a(this.c, str, i), MdiNotAvailableException.class, new eroh() { // from class: ebyi
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ebyk ebykVar = ebyk.this;
                ebykVar.h((MdiNotAvailableException) obj);
                return ebycVar.a(ebykVar.a, str, i);
            }
        }, erpp.a);
    }

    @Override // defpackage.ebwq
    public final ListenableFuture a() {
        return i(new emwl() { // from class: ebye
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((ebwq) obj).a();
            }
        });
    }

    @Override // defpackage.ebwq
    public final ListenableFuture b(final String str) {
        return elfr.f(this.c.b(str), MdiNotAvailableException.class, new eroh() { // from class: ebyd
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ebyk ebykVar = ebyk.this;
                ebykVar.h((MdiNotAvailableException) obj);
                return ebykVar.a.b(str);
            }
        }, erpp.a);
    }

    @Override // defpackage.ebwq
    public final ListenableFuture c() {
        return i(new emwl() { // from class: ebyf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((ebwq) obj).c();
            }
        });
    }

    @Override // defpackage.ebwq
    public final void d(ejhg ejhgVar) {
        synchronized (this.b.b) {
            this.b.b.add(ejhgVar);
            this.c.d(ejhgVar);
        }
    }

    @Override // defpackage.ebwq
    public final void e(ejhg ejhgVar) {
        synchronized (this.b.b) {
            this.b.b.remove(ejhgVar);
            this.c.e(ejhgVar);
        }
    }

    @Override // defpackage.ebwq
    public final ListenableFuture f(String str, int i) {
        return j(new ebyc() { // from class: ebyg
            @Override // defpackage.ebyc
            public final ListenableFuture a(ebwq ebwqVar, String str2, int i2) {
                return ebwqVar.f(str2, i2);
            }
        }, str, i);
    }

    @Override // defpackage.ebwq
    public final ListenableFuture g(String str, int i) {
        return j(new ebyc() { // from class: ebyh
            @Override // defpackage.ebyc
            public final ListenableFuture a(ebwq ebwqVar, String str2, int i2) {
                return ebwqVar.g(str2, i2);
            }
        }, str, i);
    }

    public final void h(Exception exc) {
        synchronized (this.b.b) {
            if (this.d == null) {
                this.d = entd.c("OneGoogle");
            }
            ((ensz) ((ensz) this.d.j()).h("com/google/android/libraries/onegoogle/owners/mdi/SafeMdiOwnersProvider$SafeDelegate", "enableSafeDelegate", 190, "SafeMdiOwnersProvider.java")).t("MDI Profile Sync not available on device. Reverting to backup implementation. Exception: %s", eboa.a(exc));
            Iterator it = this.b.b.iterator();
            while (it.hasNext()) {
                this.a.d((ejhg) it.next());
            }
            ebyl ebylVar = this.b;
            ebylVar.a = this.a;
            Iterator it2 = ebylVar.b.iterator();
            while (it2.hasNext()) {
                this.c.e((ejhg) it2.next());
            }
            this.b.b.clear();
        }
    }
}
