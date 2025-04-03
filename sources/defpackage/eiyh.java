package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiyh {
    public static final enru a = enru.c("com/google/apps/tiktok/account/data/AccountInvalidator");
    public final eiyx b;

    public eiyh(eiyx eiyxVar) {
        this.b = eiyxVar;
    }

    public final ListenableFuture a() {
        ListenableFuture g = ernq.g(this.b.b(new enpx("google")), Throwable.class, eldl.d(new eroh() { // from class: eiyg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ((enrr) ((enrr) ((enrr) eiyh.a.i()).g((Throwable) obj)).h("com/google/apps/tiktok/account/data/AccountInvalidator", "invalidateAccounts", 47, "AccountInvalidator.java")).q("Account sync failed");
                return eiyh.this.b.f();
            }
        }), erpp.a);
        this.b.d(g);
        return g;
    }

    public final ListenableFuture b() {
        ListenableFuture g = ernq.g(this.b.a(), Throwable.class, eldl.d(new eroh() { // from class: eiyf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ((enrr) ((enrr) ((enrr) eiyh.a.i()).g((Throwable) obj)).h("com/google/apps/tiktok/account/data/AccountInvalidator", "invalidateAllAccounts", 70, "AccountInvalidator.java")).q("Account sync failed");
                return eiyh.this.b.f();
            }
        }), erpp.a);
        this.b.d(g);
        return g;
    }
}
