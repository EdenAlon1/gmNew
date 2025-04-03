package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjro extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ eiyc c;
    final /* synthetic */ cjrp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjro(eiyc eiycVar, cjrp cjrpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = eiycVar;
        this.d = cjrpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjro) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        eisx eisxVar;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            eiyc eiycVar = this.c;
            Object b = this.d.c.b();
            b.getClass();
            cvjo cvjoVar = (cvjo) fflm.b((Optional) b);
            eisx eisxVar2 = ((eizj) eiycVar).a;
            if (cvjoVar == null) {
                obj2 = eisxVar2;
                eisxVar = null;
                if (eisxVar != null || ffkj.e(eisxVar, obj2)) {
                    ensk h = cjrp.a.h();
                    h.Y(ente.a, "BugleProfiles");
                    ((enrr) h.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesAccountCleanupInterceptor$cleanUpAccount$1", "invokeSuspend", 60, "ProfilesAccountCleanupInterceptor.kt")).q("Account disabled/removed, cleaning up profiles data");
                    Optional optional = (Optional) this.d.b.b();
                    final ffji ffjiVar = new ffji() { // from class: cjrm
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj3) {
                            ((cjrt) obj3).a();
                            return ffcu.a;
                        }
                    };
                    optional.ifPresent(new Consumer() { // from class: cjrn
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj3) {
                            ffji.this.invoke(obj3);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                } else {
                    ensk h2 = cjrp.a.h();
                    h2.Y(ente.a, "BugleProfiles");
                    ((enrr) h2.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesAccountCleanupInterceptor$cleanUpAccount$1", "invokeSuspend", 65, "ProfilesAccountCleanupInterceptor.kt")).q("Account disabled/removed but not current signed in account, not cleaning up data");
                }
                return ffcu.a;
            }
            this.a = eisxVar2;
            this.b = 1;
            Object a = cvjoVar.a(this);
            if (a == ffhhVar) {
                return ffhhVar;
            }
            obj2 = eisxVar2;
            obj = a;
        }
        eisxVar = (eisx) obj;
        if (eisxVar != null) {
        }
        ensk h3 = cjrp.a.h();
        h3.Y(ente.a, "BugleProfiles");
        ((enrr) h3.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesAccountCleanupInterceptor$cleanUpAccount$1", "invokeSuspend", 60, "ProfilesAccountCleanupInterceptor.kt")).q("Account disabled/removed, cleaning up profiles data");
        Optional optional2 = (Optional) this.d.b.b();
        final ffji ffjiVar2 = new ffji() { // from class: cjrm
            @Override // defpackage.ffji
            public final Object invoke(Object obj3) {
                ((cjrt) obj3).a();
                return ffcu.a;
            }
        };
        optional2.ifPresent(new Consumer() { // from class: cjrn
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj3) {
                ffji.this.invoke(obj3);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjro(this.c, this.d, ffguVar);
    }
}
