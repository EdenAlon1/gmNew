package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqza implements aqge {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/SubscriptionRcsAvailabilitySupplier");
    public static final entd b = entd.c("BugleSelfIdentity");
    public final errl c;
    public final int d;
    public final djru e;
    public final ffbr f;
    public final ffbr g;
    private final ctbl h;
    private final AtomicReference i;

    public aqza(ctbk ctbkVar, errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, ctwi ctwiVar) {
        final AtomicReference atomicReference = new AtomicReference(eqwf.DISABLED_NOT_DEFAULT_SMS_APP);
        this.i = atomicReference;
        final ctbl a2 = ctbkVar.a(new aqyz(this));
        this.h = a2;
        this.c = errlVar;
        this.f = ffbrVar;
        final int a3 = ctwiVar.a();
        this.d = a3;
        this.g = ffbrVar2;
        this.e = new djru() { // from class: aqyv
            @Override // defpackage.djru
            public final void a(String str, djtc djtcVar) {
                enru enruVar = aqza.a;
                if (atomicReference.getAndSet(djtcVar.a) != djtcVar.a) {
                    ctbl ctblVar = a2;
                    int i = a3;
                    ensz enszVar = (ensz) aqza.b.h();
                    enszVar.Y(csux.t, Integer.valueOf(i));
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/SubscriptionRcsAvailabilitySupplier", "createRcsAvailabilityListener", 156, "SubscriptionRcsAvailabilitySupplier.java")).t("Rcs Availability has been updated to %s.", djtcVar.a);
                    ctblVar.c(new Supplier() { // from class: aqyx
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            enru enruVar2 = aqza.a;
                            return null;
                        }
                    }, "SubscriptionRcsEnabledSupplier::Notify");
                }
            }
        };
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.h.a(new ctbf() { // from class: aqyy
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                enru enruVar = aqza.a;
                return aqgd.this.a();
            }
        }, "SubscriptionRcsEnabledSupplier::register", "SubscriptionRcsEnabledSupplier::callback", "SubscriptionRcsEnabledSupplier::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        return ((djrv) this.f.b()).e(this.d).h(new emwl() { // from class: aqyw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                aqys aqysVar;
                eqwf eqwfVar = ((djtc) obj).a;
                int ordinal = eqwfVar.ordinal();
                if (ordinal != 2) {
                    if (ordinal == 7) {
                        aqysVar = aqys.a;
                    } else if (ordinal != 23) {
                        aqysVar = aqys.b;
                    }
                    aqza aqzaVar = aqza.this;
                    ensz enszVar = (ensz) aqza.b.h();
                    enszVar.Y(csux.t, Integer.valueOf(aqzaVar.d));
                    enszVar.Y(csux.P, eqwfVar.toString());
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/SubscriptionRcsAvailabilitySupplier", "convertRcsAvailability", 110, "SubscriptionRcsAvailabilitySupplier.java")).t("Rcs is %s for SelfIdentity.", aqysVar);
                    return aqysVar;
                }
                aqysVar = aqys.c;
                aqza aqzaVar2 = aqza.this;
                ensz enszVar2 = (ensz) aqza.b.h();
                enszVar2.Y(csux.t, Integer.valueOf(aqzaVar2.d));
                enszVar2.Y(csux.P, eqwfVar.toString());
                ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/SubscriptionRcsAvailabilitySupplier", "convertRcsAvailability", 110, "SubscriptionRcsAvailabilitySupplier.java")).t("Rcs is %s for SelfIdentity.", aqysVar);
                return aqysVar;
            }
        }, this.c);
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
