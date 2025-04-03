package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djkt implements djjx {
    private final Context a;
    private final dkpf b;
    private final dkgw c;
    private final diod d;
    private final dikj e;
    private final dkga f;
    private final eenq g;
    private final djkq h;
    private final djky i;

    public djkt(Context context, dkpf dkpfVar, dkgw dkgwVar, diod diodVar, dikj dikjVar, dkga dkgaVar, eenq eenqVar, djkq djkqVar, djky djkyVar) {
        this.a = context;
        this.b = dkpfVar;
        this.c = dkgwVar;
        this.d = diodVar;
        this.e = dikjVar;
        this.f = dkgaVar;
        this.g = eenqVar;
        this.h = djkqVar;
        this.i = djkyVar;
    }

    @Override // defpackage.djjx
    public final djjw a(String str, djjq djjqVar, djqr djqrVar, dkur dkurVar, djkh djkhVar, eehz eehzVar, eehs eehsVar, djts djtsVar, djtl djtlVar, diod diodVar, ffbr ffbrVar, dktn dktnVar) {
        Optional ofNullable;
        dkty.l(dktnVar, "Creating RegistrationEngine.", new Object[0]);
        dkurVar.b.a = Optional.of("-regv2");
        djkq djkqVar = this.h;
        dkty.d(djkqVar.b, "Creating ImsNetworkInterfaces.", new Object[0]);
        djkqVar.d.put(0, new djko(djkqVar.a, 1, new dihj(djkqVar.a), djkqVar.b, djkqVar.c));
        djkqVar.d.put(1, new djko(djkqVar.a, 2, new dihk(), djkqVar.b, djkqVar.c));
        Context context = djkqVar.a;
        djkqVar.d.put(17, new djko(context, 5, new dihj(context), djkqVar.b, djkqVar.c));
        diod diodVar2 = this.d;
        dkpf dkpfVar = this.b;
        dikj dikjVar = this.e;
        dkga dkgaVar = this.f;
        Context context2 = this.a;
        djqh djqhVar = new djqh(context2, str, eehzVar, this.i, djtsVar, djtlVar, this.c, eehsVar, djkqVar, djqrVar, djkhVar, djjqVar, dktnVar, diodVar2, dkpfVar, dikjVar, dkgaVar, this.g, dkurVar, ffbrVar);
        synchronized (dipo.a) {
            ofNullable = Optional.ofNullable(dipo.b);
        }
        errl v = ((dipm) ofNullable.get()).v();
        return new djnr(djtsVar, djtlVar, ffbrVar, djqhVar, new djqm(context2, v), v, dktnVar);
    }
}
