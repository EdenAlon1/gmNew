package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awpz extends ceut {
    public final awqr a;
    public final avgr b;
    public final errl c;

    public awpz(awqr awqrVar, avgr avgrVar, errl errlVar) {
        this.a = awqrVar;
        this.b = avgrVar;
        this.c = errlVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        poh pohVar = new poh();
        pohVar.c(2);
        ((ceti) l).a = pohVar.a();
        l.c(((Integer) avic.b.e()).intValue());
        l.f(((Boolean) ((cfup) avic.d.get()).e()).booleanValue() ? poa.EXPONENTIAL : poa.LINEAR);
        return l.a();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("IncomingRbmMessageRequestHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return awxk.b.getParserForType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(final ceuw ceuwVar, eyhs eyhsVar) {
        final awxk awxkVar = (awxk) eyhsVar;
        awui awuiVar = awxkVar.d;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        final String str = awuiVar.d;
        fayv fayvVar = awxkVar.n;
        if (fayvVar == null) {
            fayvVar = fayv.a;
        }
        fayz fayzVar = fayz.a;
        eyhm eyhmVar = fayvVar.b;
        if (eyhmVar.containsKey("urn:rcs:google:")) {
            fayzVar = (fayz) eyhmVar.get("urn:rcs:google:");
        }
        eyhm eyhmVar2 = fayzVar.b;
        String str2 = eyhmVar2.containsKey("Agent-Name") ? (String) eyhmVar2.get("Agent-Name") : "";
        final Optional empty = str2.isEmpty() ? Optional.empty() : Optional.of(str2);
        return this.b.d(str).i(new eroh() { // from class: awpx
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                awxn awxnVar = (awxn) awxo.a.createBuilder();
                awxnVar.copyOnWrite();
                awxo awxoVar = (awxo) awxnVar.instance;
                awxk awxkVar2 = awxkVar;
                awxkVar2.getClass();
                awxoVar.c = awxkVar2;
                awxoVar.b |= 1;
                boolean c = ceuwVar.c();
                awxnVar.copyOnWrite();
                awxo awxoVar2 = (awxo) awxnVar.instance;
                awxoVar2.b |= 2;
                awxoVar2.d = c;
                final awxo awxoVar3 = (awxo) awxnVar.build();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final awpz awpzVar = awpz.this;
                String str3 = str;
                if (!booleanValue && empty.isPresent()) {
                    csjb c2 = awpz.D.c();
                    c2.I("Business Info is missing and Bot Name header is present, postponing Business Info Download");
                    c2.A("RBM bot id", str3);
                    c2.r();
                    return awpzVar.a.a(awxoVar3).h(new awpw(), erpp.a);
                }
                avgr avgrVar = awpzVar.b;
                awxk awxkVar3 = awxoVar3.c;
                if (awxkVar3 == null) {
                    awxkVar3 = awxk.b;
                }
                String str4 = awxkVar3.l;
                str3.getClass();
                str4.getClass();
                return avgrVar.f(new avgs(str3, 2, str4, null)).i(new eroh() { // from class: awpy
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        ceyt ceytVar = (ceyt) obj2;
                        ceytVar.getClass();
                        if (!ceytVar.e()) {
                            return elfo.e(ceytVar);
                        }
                        return awpz.this.a.a(awxoVar3).h(new awpw(), erpp.a);
                    }
                }, awpzVar.c);
            }
        }, this.c);
    }
}
