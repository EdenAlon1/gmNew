package defpackage;

import android.app.Activity;
import android.view.View;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uns implements adf {
    public final cqoh a;
    public final cfyt b;
    public final epts c;
    public final ffix d;
    public final uno e;
    public final adg f;
    public Instant g;
    private final ffsk h;
    private final adu i;
    private final eg j;
    private final adn k;
    private final ffbz l = ffca.a(new ffix() { // from class: unp
        @Override // defpackage.ffix
        public final Object invoke() {
            eptq eptqVar = (eptq) eptv.a.createBuilder();
            eptqVar.copyOnWrite();
            eptv eptvVar = (eptv) eptqVar.instance;
            eptvVar.c = uns.this.c.v;
            eptvVar.b |= 1;
            eptu eptuVar = eptu.EXPANDED;
            eptqVar.copyOnWrite();
            eptv eptvVar2 = (eptv) eptqVar.instance;
            eptvVar2.d = eptuVar.e;
            eptvVar2.b |= 2;
            return (eptv) eptqVar.build();
        }
    });

    public uns(Activity activity, cqoh cqohVar, cfyt cfytVar, ffsk ffskVar, epts eptsVar, adu aduVar, ffix ffixVar, uno unoVar) {
        this.a = cqohVar;
        this.b = cfytVar;
        this.h = ffskVar;
        this.c = eptsVar;
        this.i = aduVar;
        this.d = ffixVar;
        this.e = unoVar;
        if (!(activity instanceof eg)) {
            throw new IllegalStateException("Check failed.");
        }
        eg egVar = (eg) activity;
        this.j = egVar;
        adn adnVar = egVar.h;
        this.k = adnVar;
        this.f = adnVar.b("compose_shortcut_".concat(String.valueOf(eptsVar.name())), aduVar, this);
    }

    @Override // defpackage.adf
    public final void a(Object obj) {
        axol.k(this.h, null, new unq(this, obj, null), 3);
    }

    public final eptv b() {
        return (eptv) this.l.a();
    }

    public final void c(View view) {
        this.g = this.a.f();
        axol.k(this.h, null, new unr(view, this, null), 3);
    }
}
