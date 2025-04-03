package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eehy {
    public volatile eehp b;
    public String c;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final ArrayList f = new ArrayList();
    public final ArrayList d = new ArrayList();
    public Optional e = Optional.empty();
    private final eehw g = new eehw(this);

    protected eehy() {
    }

    public static final String w() {
        return String.format(Locale.US, "%s", UUID.randomUUID());
    }

    private final void x(eenj eenjVar) {
        if (eenjVar.x()) {
            return;
        }
        eenk eenkVar = (eenk) eenjVar;
        if (eenkVar.z().equals("SUBSCRIBE") || eenkVar.z().equals("PUBLISH")) {
            return;
        }
        eeit w = ((eelw) eenjVar.a).w();
        String d = w.d();
        if ("sip".equals(d) || "sips".equals(d)) {
            eeiq eeiqVar = (eeiq) w;
            String e = eeiqVar.e();
            String b = eeiqVar.b();
            if (e == null || b == null) {
                return;
            }
            if (dktk.a(h(), e) && dktk.a(f(), b)) {
                throw new eehu();
            }
        }
        if ("tel".equals(d)) {
            eeir eeirVar = (eeir) w;
            if (h().equals(eeirVar.e() ? "+".concat(String.valueOf(eeirVar.a())) : eeirVar.a())) {
                throw new eehu();
            }
        }
    }

    public abstract dktn a();

    public abstract eehk b();

    public abstract eeig c();

    public abstract eejk d();

    public abstract engw e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public int i() {
        return m().a();
    }

    public int j() {
        return m().b();
    }

    public eeif k(eenj eenjVar, eein eeinVar) {
        x(eenjVar);
        eeif a = c().a(eenjVar, eeinVar);
        if (a == null) {
            throw new eejg("SipTransactionContext is null");
        }
        s(eenjVar);
        return a;
    }

    public eeif l(eenj eenjVar) {
        return k(eenjVar, null);
    }

    public final eeno m() {
        return c().b();
    }

    public String n() {
        return m().e();
    }

    public String o() {
        return m().f();
    }

    public String p() {
        return d().d;
    }

    public final ArrayList q() {
        return new ArrayList(this.f);
    }

    public final void r(eehs eehsVar) {
        dkty.d(a(), "Add a SIP listener", new Object[0]);
        this.a.add(eehsVar);
    }

    public void s(eenj eenjVar) {
        String str;
        x(eenjVar);
        try {
            engw e = e();
            int size = e.size();
            for (int i = 0; i < size; i++) {
                ((eeht) e.get(i)).a(eenjVar);
            }
            c().d(eenjVar.a);
            if (eenjVar.x()) {
                eenl eenlVar = (eenl) eenjVar;
                str = "Sent SIP response with code: " + eenlVar.y() + " and callid: " + eenlVar.d();
            } else {
                eenk eenkVar = (eenk) eenjVar;
                str = "Sent SIP request with method: " + eenkVar.z() + " and callid: " + eenkVar.d();
            }
            dkty.w(26, 3, "%s", str);
            if (((Boolean) dinr.h.a()).booleanValue()) {
                dkty.c("\n%s", eenjVar.n());
            }
        } catch (eejg e2) {
            dkty.j(e2, a(), "Can't send SIP message", new Object[0]);
            throw e2;
        } catch (Exception e3) {
            dkty.j(e3, a(), "Can't send SIP message", new Object[0]);
            throw new eejg(e3.getMessage(), e3);
        }
    }

    public final void t(ArrayList arrayList) {
        this.f.clear();
        this.f.addAll(arrayList);
    }

    public final void u() {
        c().e(this.g);
    }

    public boolean v() {
        return false;
    }
}
