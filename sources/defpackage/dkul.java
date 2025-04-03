package defpackage;

import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkul implements eeht {
    private static final Set a = enip.v("ACK", "BYE", "INVITE", "OPTIONS", "REGISTER", "SUBSCRIBE", new String[0]);
    private final ffbr b;

    public dkul(ffbr ffbrVar) {
        this.b = ffbrVar;
    }

    private static final String b(eenj eenjVar) {
        return emxe.b(eenjVar.a.i());
    }

    @Override // defpackage.eeht
    public final void a(eenj eenjVar) {
        eejd eejdVar = new eejd();
        eekk b = eenjVar.b();
        String b2 = b(eenjVar);
        int y = eenjVar.a.t() ? ((eenl) eenjVar).y() : -1;
        if (a.contains(b2)) {
            if (eenjVar.a.s() || y == 200) {
                if (b != null) {
                    eejdVar = b.e;
                }
                eejd eejdVar2 = eejdVar;
                boolean z = false;
                if (eenjVar.a.s() && b(eenjVar).equals("REGISTER")) {
                    z = true;
                }
                djkv djkvVar = (djkv) ((djky) this.b).b();
                Optional optional = djkvVar.a;
                String str = djkvVar.b;
                eyss eyssVar = djkvVar.c;
                eejk eejkVar = djkvVar.d;
                int i = djkvVar.e;
                String str2 = djkvVar.f;
                String str3 = eejkVar.d;
                String str4 = eyssVar.c;
                try {
                    eehk eehkVar = dkut.a;
                    eenjVar.u(new eekk(eehk.f((String) optional.orElse(null), z, str, str4), str3, i, Optional.of(str2), eejdVar2));
                    eejc a2 = eejdVar2.a("mobility");
                    if (a2 != null) {
                        a2.e = "mobile";
                        return;
                    }
                    eejc eejcVar = new eejc("mobility", "mobile");
                    eejcVar.b();
                    eejdVar2.e(eejcVar);
                } catch (eeje e) {
                    throw new IllegalArgumentException("ContactHeader could not be created", e);
                }
            }
        }
    }
}
