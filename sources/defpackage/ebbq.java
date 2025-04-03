package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebbq {
    public static final String a = "ebbq";
    public final ebbb b;
    private final fr c;
    private final eg d;

    public ebbq(fr frVar, ebbb ebbbVar, eg egVar) {
        this.c = frVar;
        this.b = ebbbVar;
        this.d = egVar;
        kc d = d(frVar);
        if (d != null && (d instanceof ecau)) {
            e((ecau) d);
        }
    }

    private static kc d(fr frVar) {
        return (kc) frVar.h(a);
    }

    private final void e(ecau ecauVar) {
        efbd.c();
        ezon ezonVar = (ezon) ezoo.a.createBuilder();
        ezonVar.copyOnWrite();
        ezoo ezooVar = (ezoo) ezonVar.instance;
        ezooVar.d = 1;
        ezooVar.b |= 2;
        ezonVar.copyOnWrite();
        ezoo ezooVar2 = (ezoo) ezonVar.instance;
        ezooVar2.f = 8;
        ezooVar2.b |= 32;
        ezonVar.copyOnWrite();
        ezoo ezooVar3 = (ezoo) ezonVar.instance;
        ezooVar3.e = 3;
        ezooVar3.b = 8 | ezooVar3.b;
        new ebmc(this.b, ecauVar, (ezoo) ezonVar.build());
    }

    public final ecau a() {
        efbd.c();
        ecau ecauVar = (ecau) d(this.c);
        if (ecauVar != null) {
            return ecauVar;
        }
        ecau ecauVar2 = new ecau();
        Bundle bundle = new Bundle();
        bundle.putBoolean("accountMenuFlavorsStyle", true);
        ecauVar2.at(bundle);
        e(ecauVar2);
        return ecauVar2;
    }

    public final void b() {
        efbd.c();
        c(a());
    }

    public final void c(kc kcVar) {
        efbd.c();
        eg egVar = this.d;
        if ((egVar != null && egVar.isFinishing()) || kcVar.aF() || this.c.ai()) {
            return;
        }
        kcVar.t(this.c, a);
    }
}
