package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cibl implements cibg {

    @Deprecated(forRemoval = true)
    private static final engw b = engw.t("#=0.92", "#=1", "#=1.2");
    public final ffbr a;
    private final errl c;
    private final Set d;
    private final auwi e;

    public cibl(errl errlVar, Set set, ffbr ffbrVar, auwi auwiVar) {
        this.c = errlVar;
        this.d = set;
        this.a = ffbrVar;
        this.e = auwiVar;
    }

    private static fcdx b(String str) {
        fcdv fcdvVar = (fcdv) fcdx.a.createBuilder();
        fcdy fcdyVar = (fcdy) fcdz.a.createBuilder();
        fcdyVar.copyOnWrite();
        fcdz fcdzVar = (fcdz) fcdyVar.instance;
        fcdzVar.b = 1;
        fcdzVar.c = "+g.3gpp.iari-ref";
        fcdvVar.copyOnWrite();
        fcdx fcdxVar = (fcdx) fcdvVar.instance;
        fcdz fcdzVar2 = (fcdz) fcdyVar.build();
        fcdzVar2.getClass();
        fcdxVar.c = fcdzVar2;
        fcdxVar.b |= 1;
        fcdy fcdyVar2 = (fcdy) fcdz.a.createBuilder();
        fcdyVar2.copyOnWrite();
        fcdz fcdzVar3 = (fcdz) fcdyVar2.instance;
        fcdzVar3.b = 1;
        fcdzVar3.c = str;
        fcdvVar.copyOnWrite();
        fcdx fcdxVar2 = (fcdx) fcdvVar.instance;
        fcdz fcdzVar4 = (fcdz) fcdyVar2.build();
        fcdzVar4.getClass();
        fcdxVar2.d = fcdzVar4;
        fcdxVar2.b |= 2;
        fcdvVar.copyOnWrite();
        ((fcdx) fcdvVar.instance).e = fcdw.a(3);
        return (fcdx) fcdvVar.build();
    }

    @Deprecated(forRemoval = true)
    private static fcdx c(String str) {
        fcdv fcdvVar = (fcdv) fcdx.a.createBuilder();
        fcdy fcdyVar = (fcdy) fcdz.a.createBuilder();
        fcdyVar.copyOnWrite();
        fcdz fcdzVar = (fcdz) fcdyVar.instance;
        fcdzVar.b = 1;
        fcdzVar.c = "+g.gsma.rcs.botversion";
        fcdvVar.copyOnWrite();
        fcdx fcdxVar = (fcdx) fcdvVar.instance;
        fcdz fcdzVar2 = (fcdz) fcdyVar.build();
        fcdzVar2.getClass();
        fcdxVar.c = fcdzVar2;
        fcdxVar.b |= 1;
        fcdy fcdyVar2 = (fcdy) fcdz.a.createBuilder();
        fcdyVar2.copyOnWrite();
        fcdz fcdzVar3 = (fcdz) fcdyVar2.instance;
        str.getClass();
        fcdzVar3.b = 1;
        fcdzVar3.c = str;
        fcdvVar.copyOnWrite();
        fcdx fcdxVar2 = (fcdx) fcdvVar.instance;
        fcdz fcdzVar4 = (fcdz) fcdyVar2.build();
        fcdzVar4.getClass();
        fcdxVar2.d = fcdzVar4;
        fcdxVar2.b |= 2;
        fcdvVar.copyOnWrite();
        ((fcdx) fcdvVar.instance).e = fcdw.a(3);
        return (fcdx) fcdvVar.build();
    }

    private static void d(fcea fceaVar) {
        fcdv fcdvVar = (fcdv) fcdx.a.createBuilder();
        fcdy fcdyVar = (fcdy) fcdz.a.createBuilder();
        fcdyVar.copyOnWrite();
        fcdz fcdzVar = (fcdz) fcdyVar.instance;
        fcdzVar.b = 1;
        fcdzVar.c = "+g.3gpp.icsi-ref";
        fcdvVar.copyOnWrite();
        fcdx fcdxVar = (fcdx) fcdvVar.instance;
        fcdz fcdzVar2 = (fcdz) fcdyVar.build();
        fcdzVar2.getClass();
        fcdxVar.c = fcdzVar2;
        fcdxVar.b |= 1;
        fcdy fcdyVar2 = (fcdy) fcdz.a.createBuilder();
        String a = dkmn.a();
        fcdyVar2.copyOnWrite();
        fcdz fcdzVar3 = (fcdz) fcdyVar2.instance;
        fcdzVar3.b = 1;
        fcdzVar3.c = a;
        fcdvVar.copyOnWrite();
        fcdx fcdxVar2 = (fcdx) fcdvVar.instance;
        fcdz fcdzVar4 = (fcdz) fcdyVar2.build();
        fcdzVar4.getClass();
        fcdxVar2.d = fcdzVar4;
        fcdxVar2.b |= 2;
        fcdvVar.copyOnWrite();
        ((fcdx) fcdvVar.instance).e = fcdw.a(3);
        fceaVar.b((fcdx) fcdvVar.build());
        fceaVar.b(b("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im"));
        fceaVar.b(b("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp"));
        fceaVar.b(b("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftthumb"));
        fceaVar.b(b("urn%3Aurn-7%3A3gpp-application.ims.iari.joyn.intmsg"));
        fceaVar.b(b("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush"));
        if (djaq.o()) {
            fceaVar.b(b("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftsms"));
        }
        if (djaq.p()) {
            fceaVar.b(b("urn%3Aurn-7%3A3gppapplication.ims.iari.rcs.geosms"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cibg
    public final elfl a(fcea fceaVar, final aoku aokuVar) {
        elfl e;
        if (engw.s(1, 3).contains(crgo.a.e())) {
            return elfo.e(fceaVar);
        }
        if (this.e.a()) {
            d(fceaVar);
            e = elfo.e(fceaVar);
        } else {
            engw engwVar = b;
            int i = ((enou) engwVar).c;
            for (int i2 = 0; i2 < i; i2++) {
                fceaVar.b(c((String) engwVar.get(i2)));
            }
            if (diwo.a()) {
                fceaVar.b(c("#=0.93"));
            }
            if (diwx.a()) {
                fceaVar.b(c("#=1.9"));
            }
            fceaVar.b(b("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot"));
            d(fceaVar);
            e = elfo.e(fceaVar);
        }
        enqu listIterator = ((enpx) this.d).listIterator();
        while (listIterator.hasNext()) {
            final ckma ckmaVar = (ckma) listIterator.next();
            e = e.i(new eroh() { // from class: cibk
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    elfl c;
                    fcea fceaVar2 = (fcea) obj;
                    awui a = ((avkc) cibl.this.a.b()).a(aokuVar.o(), false);
                    fceaVar2.getClass();
                    a.getClass();
                    ckma ckmaVar2 = ckmaVar;
                    c = axol.c(ckmaVar2.d, ffhe.a, ffsm.a, new cklz(ckmaVar2, fceaVar2, null));
                    return c;
                }
            }, this.c);
        }
        return e;
    }
}
