package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chbx {
    public final chby b;
    public final Object c = new Object();
    public final ConcurrentMap d = new ConcurrentHashMap();
    private final ffbr f;
    private final ffbr g;
    private final errl h;
    private final errl i;
    private static final cskc e = cskc.g("BugleNetwork", "PhoneRegistrationProviderCache");
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/net/PhoneRegistrationProviderCache");

    public chbx(ffbr ffbrVar, chby chbyVar, ffbr ffbrVar2, errl errlVar, errl errlVar2) {
        this.g = ffbrVar;
        this.b = chbyVar;
        this.f = ffbrVar2;
        this.h = errlVar;
        this.i = errlVar2;
    }

    @Deprecated
    public final elfl a(ciii ciiiVar) {
        return d(ciiiVar.a, 11);
    }

    public final elfl b(final String str) {
        ((chxe) this.g.b()).a(str, 4);
        synchronized (this.c) {
            elfl elflVar = (elfl) this.d.get(str);
            if (elflVar != null) {
                e.q("Using cached phone registration providerFuture");
                return elflVar;
            }
            elfl h = ((djrv) this.f.b()).g(str).h(new emwl() { // from class: chbv
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    String str2 = str;
                    if (booleanValue) {
                        chbx chbxVar = chbx.this;
                        ensk e2 = chbx.a.e();
                        e2.Y(ente.a, "BugleNetwork");
                        ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProviderCache", "createPhoneRegistrationProvider", 215, "PhoneRegistrationProviderCache.java")).q("Creating phone registration providerFuture by phone number.");
                        return chbxVar.b.a(new ciii(str2));
                    }
                    ensk j = chbx.a.j();
                    j.Y(ente.a, "BugleNetwork");
                    enrr enrrVar = (enrr) j;
                    enrrVar.Y(csux.E, str2);
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProviderCache", "createPhoneRegistrationProvider", 222, "PhoneRegistrationProviderCache.java")).q("The provided phone number is not RCS available. Either phone number is not in E164 format or phone number is not RCS available.");
                    throw new cgyb();
                }
            }, this.i);
            h.k(new chbw(this, str), this.h);
            this.d.putIfAbsent(str, h);
            return (elfl) this.d.get(str);
        }
    }

    public final elfl c(String str) {
        synchronized (this.c) {
            elfl elflVar = (elfl) this.d.get(str);
            if (elflVar != null) {
                e.q("Using cached phone registration providerFuture");
                return elflVar;
            }
            e.q("Creating phone registration providerFuture by phone number without validating RCS.");
            elfl e2 = elfo.e(this.b.a(new ciii(str)));
            this.d.putIfAbsent(str, e2);
            return e2;
        }
    }

    public final elfl d(String str, int i) {
        ((chxe) this.g.b()).a(str, i);
        return b(str);
    }
}
