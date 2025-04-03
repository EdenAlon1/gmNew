package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkhz {
    private final dkqq a;

    public dkhz(dkqq dkqqVar) {
        this.a = dkqqVar;
    }

    public static ImsCapabilities b(ImsCapabilities imsCapabilities) {
        ImsCapabilities imsCapabilities2 = new ImsCapabilities(imsCapabilities);
        long currentTimeMillis = System.currentTimeMillis() + dkht.a;
        long j = imsCapabilities2.e;
        if (j <= 0) {
            imsCapabilities2.e = 1L;
        }
        imsCapabilities2.f = currentTimeMillis - j;
        return imsCapabilities2;
    }

    public static String c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("#=0.92");
        arrayList.add("#=1");
        if (diyr.d()) {
            arrayList.add("#=1.2");
        }
        if (diwo.a()) {
            arrayList.add("#=0.93");
        }
        if (diwx.a()) {
            arrayList.add("#=1.9");
        }
        return dkht.a(arrayList);
    }

    public static void d(eenj eenjVar, dkht dkhtVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (dkhtVar.y() && !z) {
            arrayList.add("+g.oma.sip-im");
        }
        if (dkhtVar.v()) {
            arrayList.add("+g.3gpp.iari-ref=\"" + dkhtVar.b() + "\"");
        }
        if (dkhtVar.w(z)) {
            arrayList.add("+g.3gpp.icsi-ref=\"" + dkhtVar.c(z) + "\"");
        }
        if (dkhtVar.F()) {
            arrayList.add("video");
            arrayList.add("+g.gsma.rcs.ipcall");
            if (dkhtVar.I()) {
                arrayList.add("+g.gsma.rcs.ipvideocallonly");
            }
        } else if (dkhtVar.G()) {
            arrayList.add("+g.gsma.rcs.ipcall");
        }
        if (dkhtVar.u()) {
            arrayList.add("+g.jibe.stickers");
        }
        if (dizu.d() && dkhtVar.K()) {
            arrayList.add(c());
        }
        try {
            eenjVar.q(eene.g("Accept-Contact", a.a(TextUtils.join(";", arrayList), "*;", ";explicit")));
        } catch (eeje e) {
            throw new IllegalArgumentException("Accept-Contact can't be set: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    public static void e(eekk eekkVar, dkht dkhtVar, boolean z) {
        if (eekkVar == null) {
            return;
        }
        if (dkhtVar.y() && !z) {
            eekkVar.j(new eejc("+g.oma.sip-im", null));
        }
        if (dkhtVar.v()) {
            eejc eejcVar = new eejc("+g.3gpp.iari-ref", dkhtVar.b());
            eejcVar.b();
            eekkVar.j(eejcVar);
        }
        if (dkhtVar.w(z)) {
            eejc eejcVar2 = new eejc("+g.3gpp.icsi-ref", dkhtVar.c(z));
            eejcVar2.b();
            eekkVar.j(eejcVar2);
        }
        if (dkhtVar.u()) {
            eekkVar.j(new eejc("+g.jibe.stickers", null));
        }
        if (dkhtVar.F()) {
            eekkVar.j(new eejc("+g.gsma.rcs.ipcall", null));
            if (dkhtVar.I()) {
                eekkVar.j(new eejc("+g.gsma.rcs.ipvideocallonly", null));
            }
            eekkVar.j(new eejc("video", null));
        } else if (dkhtVar.G()) {
            eekkVar.j(new eejc("+g.gsma.rcs.ipcall", null));
        }
        if (dizu.d()) {
            eekkVar.j(new eejc(c(), null));
        }
    }

    public final dkht a(dkwz dkwzVar, long j) {
        dkww dkwwVar;
        engw n;
        dkht dkhtVar = new dkht(j);
        for (dkxe dkxeVar : dkwzVar.b()) {
            dkxd dkxdVar = dkxeVar.b;
            if (dkxdVar != null && (dkwwVar = dkxdVar.a) != null && !dkwwVar.equals(dkww.CLOSED)) {
                dkwu dkwuVar = dkxeVar.c;
                if (this.a.b.equals(dkwuVar)) {
                    dkhtVar.e(true);
                    dkhtVar.q(true);
                }
                if (this.a.c.equals(dkwuVar)) {
                    dkhtVar.i(true);
                }
                if (this.a.d.equals(dkwuVar)) {
                    dkhtVar.n(true);
                }
                if (this.a.e.equals(dkwuVar)) {
                    dkhtVar.f(true);
                }
                if (this.a.f.equals(dkwuVar)) {
                    dkhtVar.g(true);
                }
                if (this.a.g.equals(dkwuVar)) {
                    dkhtVar.k(true);
                }
                if (this.a.h.equals(dkwuVar)) {
                    dkhtVar.l(true);
                }
                if (this.a.i.equals(dkwuVar)) {
                    dkhtVar.P();
                }
                if (this.a.j.equals(dkwuVar)) {
                    dkhtVar.R();
                }
                if (this.a.l.equals(dkwuVar)) {
                    dkhtVar.T();
                }
                if (this.a.k.equals(dkwuVar)) {
                    dkhtVar.S();
                }
                if (this.a.m.equals(dkwuVar)) {
                    dkhtVar.p(true);
                }
                if (this.a.n.equals(dkwuVar)) {
                    dkhtVar.m(true);
                    List list = dkxeVar.g;
                    if (list == null) {
                        int i = engw.d;
                        n = enou.a;
                    } else {
                        n = engw.n(list);
                    }
                    if (n.contains(dkwp.VIDEO)) {
                        dkhtVar.Q();
                    }
                }
            }
        }
        if (!dkhtVar.C()) {
            dkhtVar.q(false);
        }
        dkhtVar.c = true;
        dkhtVar.d = true;
        dkhtVar.e = dkvj.a().longValue();
        return dkhtVar;
    }
}
