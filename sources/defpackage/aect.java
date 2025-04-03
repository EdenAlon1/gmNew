package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aect implements ejlr<Void, Boolean> {
    final /* synthetic */ aedh a;

    public aect(aedh aedhVar) {
        this.a = aedhVar;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        if (((Boolean) obj2).booleanValue()) {
            ensk e = aedh.a.e();
            e.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/home/HomeFragmentPeer$23", "onSuccess", 4060, "HomeFragmentPeer.java")).q("HomeFragment gaiaPromoCallback onSuccess. Will launch Gaia Paring page.");
            ((Optional) this.a.H.b()).ifPresent(new Consumer() { // from class: aecr
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj3) {
                    ((dbtj) obj3).d();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        ensk e2 = aedh.a.e();
        e2.Y(ente.a, "HomeFragmentFlogger");
        ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/home/HomeFragmentPeer$23", "onSuccess", 4066, "HomeFragmentPeer.java")).q("HomeFragment gaiaPromoCallback onSuccess. Will launch Gpp ESI");
        ((Optional) this.a.ao.b()).ifPresent(new Consumer() { // from class: aecs
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj3) {
                aect aectVar = aect.this;
                aectVar.a.b.fe().getIntent().putExtra("EXPRESS_SIGN_IN_FLOW_KEY", admj.c.j);
                ((admk) obj3).b((eito) aectVar.a.ap.b());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        if (!((aube) this.a.bv.b()).a()) {
            aeaa.a.s("Failed to get Gaia promo callback", th);
            return;
        }
        ensk j = aedh.a.j();
        j.Y(ente.a, "HomeFragmentFlogger");
        ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/home/HomeFragmentPeer$23", "onFailure", (char) 4084, "HomeFragmentPeer.java")).q("Failed to get Gaia promo callback");
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
