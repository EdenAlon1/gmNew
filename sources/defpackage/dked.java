package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.net.MalformedURLException;
import java.util.IllegalFormatException;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dked {
    private static final dktn a = new dktn("ProvisioningServerUtil");
    private static final enru b = enru.c("com/google/android/ims/provisioning/util/ProvisioningServerUtil");
    private final ffbr c;
    private final ffbr d;
    private final cguo e;
    private final cort f;

    public dked(ffbr ffbrVar, ffbr ffbrVar2, cguo cguoVar, cort cortVar) {
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = cguoVar;
        this.f = cortVar;
    }

    private final Optional j(Optional optional) {
        String k;
        if (optional.isPresent()) {
            dkty.l(a, "getConfigServerUrl with simId: %s", dktx.SIM_ID.c(optional.get()));
        } else {
            dkty.l(a, "getConfigServerUrl without simId", new Object[0]);
        }
        if (p()) {
            dkty.l(a, "Using overridden config server URL", new Object[0]);
            k = ((dkrx) this.c.b()).i();
        } else {
            String str = "";
            if (n(optional)) {
                dkty.l(a, "Using config server URL from %s", optional.isPresent() ? this.e.getClass().getName() : dimn.E().getClass().getName());
                if (optional.isPresent()) {
                    ewht c = this.e.c((String) optional.get());
                    k = c.e == 2 ? (String) c.f : "";
                } else {
                    k = (String) dimn.E().a().a();
                }
            } else if (o(optional)) {
                dktn dktnVar = a;
                dkty.l(dktnVar, "Using MCC based URL", new Object[0]);
                if (optional.isPresent()) {
                    ewht c2 = this.e.c((String) optional.get());
                    if (c2.e == 3) {
                        str = (String) c2.f;
                    }
                } else {
                    str = (String) dimn.E().m().a();
                }
                String l = l(optional);
                if (TextUtils.isEmpty(l)) {
                    dkty.l(dktnVar, "Not using MCC URL. Failed to get MCC", new Object[0]);
                    k = null;
                } else {
                    k = String.format(str, l);
                }
            } else if (g(optional)) {
                dkty.l(a, "Using RCS compliant config URL", new Object[0]);
                k = k(optional);
            } else {
                dkty.l(a, "No config URL. RCS not configured for dual-registration.", new Object[0]);
                k = null;
            }
        }
        if (k == null) {
            return Optional.empty();
        }
        if (TextUtils.isEmpty(k)) {
            return Optional.empty();
        }
        if (!k.endsWith("/")) {
            k = k.concat("/");
        }
        if (k.startsWith("http")) {
            return Optional.of(k);
        }
        dkty.p(a, "Prepending \"http\" to URL %s", dktx.URI.c(k));
        return Optional.of("http://".concat(k));
    }

    private final String k(Optional optional) {
        String m;
        if (optional.isPresent()) {
            Optional j = this.f.j(new djro((String) optional.get()));
            if (j.isEmpty()) {
                return null;
            }
            m = ((cosz) j.get()).s;
        } else {
            m = ((dkpp) this.d.b()).m();
        }
        if (!TextUtils.isEmpty(m) && m.length() > 4) {
            try {
                return String.format("http://config.rcs.mnc%s.mcc%s.pub.3gppnetwork.org", String.format(Locale.US, "%03d", Integer.valueOf(Integer.parseInt(m.substring(3)))), l(optional));
            } catch (NumberFormatException | IllegalFormatException unused) {
            }
        }
        if (optional.isPresent()) {
            dkty.h(a, "Cannot create compliant config server url, invalid MCC-MNC. sim ID: %s", dktx.SIM_ID.c(optional));
        } else {
            dkty.h(a, "Cannot create compliant config server url, invalid MCC-MNC.", new Object[0]);
        }
        return null;
    }

    private final String l(Optional optional) {
        String m;
        if (optional.isPresent()) {
            Optional j = this.f.j(new djro((String) optional.get()));
            if (j.isEmpty()) {
                ((enrr) ((enrr) b.j()).h("com/google/android/ims/provisioning/util/ProvisioningServerUtil", "getMcc", 252, "ProvisioningServerUtil.java")).q("ProvisioningServerUtil: Failed to get MCC. SimSubscriptionInfo is empty.");
                return "";
            }
            ((enrr) ((enrr) b.h()).h("com/google/android/ims/provisioning/util/ProvisioningServerUtil", "getMcc", 256, "ProvisioningServerUtil.java")).q("Getting mccmnc from SimSubscriptionInfo.");
            m = ((cosz) j.get()).s;
        } else {
            ((enrr) ((enrr) b.h()).h("com/google/android/ims/provisioning/util/ProvisioningServerUtil", "getMcc", 260, "ProvisioningServerUtil.java")).q("Getting mccmnc from SimPreferences.");
            m = ((dkpp) this.d.b()).m();
        }
        if (!TextUtils.isEmpty(m)) {
            return m.substring(0, 3);
        }
        ((enrr) ((enrr) b.j()).h("com/google/android/ims/provisioning/util/ProvisioningServerUtil", "getMcc", 266, "ProvisioningServerUtil.java")).q("ProvisioningServerUtil: Failed to get MCC. SimOperator is empty.");
        return "";
    }

    private final String m(final Optional optional) {
        return (String) j(optional).filter(new Predicate() { // from class: dkea
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
                return !TextUtils.isEmpty((String) obj);
            }
        }).orElseThrow(new Supplier() { // from class: dkeb
            @Override // java.util.function.Supplier
            public final Object get() {
                Optional optional2 = Optional.this;
                return optional2.isPresent() ? new MalformedURLException("Config server url should be valid when making request. simId: ".concat(String.valueOf(dktx.SIM_ID.c(optional2)))) : new MalformedURLException("Config server url should be valid when making request.");
            }
        });
    }

    private final boolean n(Optional optional) {
        String str;
        if (optional.isPresent()) {
            ewht c = this.e.c((String) optional.get());
            str = c.e == 2 ? (String) c.f : "";
        } else {
            str = (String) dimn.E().a().a();
        }
        return !TextUtils.isEmpty(str);
    }

    private final boolean o(Optional optional) {
        if (!optional.isPresent()) {
            return !TextUtils.isEmpty((CharSequence) dimn.E().m().a());
        }
        ewht c = this.e.c((String) optional.get());
        return !(c.e == 3 ? (String) c.f : "").isEmpty();
    }

    private final boolean p() {
        return ((Boolean) dimn.E().c().a()).booleanValue() && ((dkrx) this.c.b()).u();
    }

    @Deprecated
    public final int a() {
        if (((dkrx) this.c.b()).v()) {
            return ((dkrx) this.c.b()).a();
        }
        int intValue = ((Integer) dimn.E().C().a()).intValue();
        return intValue >= 0 ? intValue : g(Optional.empty()) ? 37273 : 0;
    }

    @Deprecated
    public final int b(String str) {
        return ((dkrx) this.c.b()).v() ? ((dkrx) this.c.b()).a() : this.e.c(str).k;
    }

    @Deprecated
    public final Optional c() {
        return j(Optional.empty());
    }

    public final Optional d(String str) {
        return j(Optional.of(str));
    }

    @Deprecated
    public final String e() {
        return m(Optional.empty());
    }

    public final String f(String str) {
        return m(Optional.of(str));
    }

    final boolean g(Optional optional) {
        String m;
        if (optional.isPresent()) {
            Optional j = this.f.j(new djro((String) optional.get()));
            if (j.isEmpty()) {
                return false;
            }
            m = ((cosz) j.get()).s;
        } else {
            m = ((dkpp) this.d.b()).m();
        }
        if (!optional.isPresent()) {
            return !TextUtils.isEmpty(m) && TextUtils.equals((String) dimn.E().t().a(), m);
        }
        int a2 = ewhp.a(this.e.c((String) optional.get()).g);
        if (a2 == 0) {
            a2 = 1;
        }
        return !TextUtils.isEmpty(m) && a2 == 3;
    }

    @Deprecated
    public final boolean h() {
        return c().filter(new Predicate() { // from class: dkec
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
                return !TextUtils.isEmpty((String) obj);
            }
        }).isPresent();
    }

    public final int i(Optional optional) {
        if (p()) {
            return 3;
        }
        if (n(optional)) {
            return 4;
        }
        if (o(optional)) {
            return 5;
        }
        if (g(optional)) {
            return 6;
        }
        dkty.r(a, "No config URL source available.", new Object[0]);
        return 2;
    }
}
