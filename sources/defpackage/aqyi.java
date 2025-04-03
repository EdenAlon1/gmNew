package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqyi implements aqyu {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/IdentityBasedRcsConfigProvider");
    public final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;

    public aqyi(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.b = ffbrVar5;
    }

    private final djtp c(djrj djrjVar) {
        Optional k = ((djry) this.c.b()).k(djrjVar);
        k.getClass();
        return (djtp) fflm.b(k);
    }

    @Override // defpackage.aqyu
    public final aqyt a(aoku aokuVar) {
        aokuVar.getClass();
        if (!aokuVar.s()) {
            throw new IllegalArgumentException("messagingIdentity can not be a fully qualified phone number.");
        }
        Optional e = aokuVar.e();
        e.getClass();
        awui awuiVar = (awui) fflm.b(e);
        String str = awuiVar != null ? awuiVar.d : null;
        if (str == null) {
            throw new IllegalArgumentException("messagingIdentity has no rcs identifier.");
        }
        djtp c = c(((djrk) this.d.b()).a(str));
        if (c != null) {
            return ((akki) this.e.b()).a(c);
        }
        ensk j = a.j();
        j.Y(ente.a, "BugleSelfIdentity");
        ((enrr) j.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/IdentityBasedRcsConfigProvider", "getRcsConfig", 45, "IdentityBasedRcsConfigProvider.kt")).q("No configuration is found for messagingIdentity. Returning default config instead.");
        return aqxz.a;
    }

    @Override // defpackage.aqyu
    public final aqyt b(azop azopVar) {
        if (azopVar.a() != azon.a) {
            throw new IllegalArgumentException("Address type is not phone number.");
        }
        azpp a2 = ((azpo) this.f.b()).a(azopVar);
        Optional b = a2.b();
        b.getClass();
        String str = (String) fflm.b(b);
        if (str != null && str.length() != 0) {
            djtp c = c(((djrk) this.d.b()).a(str));
            if (c != null) {
                return ((akki) this.e.b()).a(c);
            }
            ensk j = a.j();
            j.Y(ente.a, "BugleSelfIdentity");
            ((enrr) j.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/IdentityBasedRcsConfigProvider", "getRcsConfig", 83, "IdentityBasedRcsConfigProvider.kt")).q("No configuration is found for MyIdentity. Returning default config instead.");
            return aqxz.a;
        }
        ensk j2 = a.j();
        j2.Y(ente.a, "BugleSelfIdentity");
        ((enrr) j2.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/IdentityBasedRcsConfigProvider", "getRcsConfig", 65, "IdentityBasedRcsConfigProvider.kt")).q("MyIdentity address is not available when getting rcs config");
        Optional c2 = a2.c();
        final ffji ffjiVar = new ffji() { // from class: aqyb
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Integer num = (Integer) obj;
                aqyr aqyrVar = (aqyr) aqyi.this.b.b();
                num.getClass();
                return aqyrVar.a(num.intValue());
            }
        };
        Optional flatMap = c2.flatMap(new Function() { // from class: aqyc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final ffji ffjiVar2 = new ffji() { // from class: aqyd
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((aoku) obj).e().isPresent());
            }
        };
        Optional filter = flatMap.filter(new Predicate() { // from class: aqye
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) ffji.this.invoke(obj)).booleanValue();
            }
        });
        final aqyh aqyhVar = new aqyh(this);
        Object orElseGet = filter.map(new Function() { // from class: aqyf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: aqyg
            @Override // java.util.function.Supplier
            public final Object get() {
                ensk j3 = aqyi.a.j();
                j3.Y(ente.a, "BugleSelfIdentity");
                ((enrr) j3.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/IdentityBasedRcsConfigProvider", "getRcsConfig$lambda$8", 73, "IdentityBasedRcsConfigProvider.kt")).q("Messaging identity is not available, returning default config.");
                return aqxz.a;
            }
        });
        orElseGet.getClass();
        return (aqyt) orElseGet;
    }
}
