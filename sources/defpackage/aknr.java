package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aknr implements cgso {
    public static final entd a = entd.c("SamsungMmsController");
    private final aknc b;
    private final errl c;

    public aknr(aknc akncVar, errl errlVar) {
        this.b = akncVar;
        this.c = errlVar;
    }

    private final elfl d(aknb aknbVar) {
        ekzz f = eleg.f("SamsungMmsController#queryIsMmsAllowed");
        try {
            elfl h = this.b.a(aknbVar).h(new emwl() { // from class: aknp
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    Optional optional = (Optional) obj;
                    entd entdVar = aknr.a;
                    optional.getClass();
                    return (Boolean) optional.map(new Function() { // from class: aknq
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            ((ensz) aknr.a.n().h("com/google/android/apps/messaging/samsung/mmscontroller/SamsungMmsController", "queryIsMmsAllowed", 62, "SamsungMmsController.java")).t("knox query returned isAllowed = %s", (String) obj2);
                            return Boolean.valueOf(!r6.equals("false"));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElse(true);
                }
            }, this.c);
            f.b(h);
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cgso
    public final elfl a() {
        ((ensz) a.n().h("com/google/android/apps/messaging/samsung/mmscontroller/SamsungMmsController", "isIncomingMmsAllowed", 34, "SamsungMmsController.java")).q("Querying Knox Provider for isIncomingMmsAllowed");
        return d(aknb.INCOMING_MMS_ALLOWED);
    }

    @Override // defpackage.cgso
    public final elfl b() {
        ((ensz) a.n().h("com/google/android/apps/messaging/samsung/mmscontroller/SamsungMmsController", "isOutgoingMmsAllowed", 40, "SamsungMmsController.java")).q("Querying Knox Provider for isOutgoingMmsAllowed");
        return d(aknb.OUTGOING_MMS_ALLOWED);
    }

    @Override // defpackage.cgso
    public final elfl c() {
        ((ensz) a.n().h("com/google/android/apps/messaging/samsung/mmscontroller/SamsungMmsController", "isRcsEnabled", 46, "SamsungMmsController.java")).q("Querying Knox Provider for isRcsEnabled");
        return d(aknb.RCS_ENABLED);
    }
}
