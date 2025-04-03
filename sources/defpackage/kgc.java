package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgc extends kfv {
    private kgb b;
    private int c;
    private final ArrayList d;

    public kgc() {
        super(null);
        this.c = 0;
        this.d = new ArrayList();
    }

    public static final hvi d(hvi hviVar, kfr kfrVar, ffji ffjiVar) {
        return hviVar.a(new kga(kfrVar, ffjiVar));
    }

    public final kfr a() {
        int i = this.c;
        this.c = i + 1;
        kfr kfrVar = (kfr) ffdx.N(this.d, i);
        if (kfrVar != null) {
            return kfrVar;
        }
        kfr kfrVar2 = new kfr(Integer.valueOf(this.c));
        this.d.add(kfrVar2);
        return kfrVar2;
    }

    public final kgb b() {
        kgb kgbVar = this.b;
        if (kgbVar != null) {
            return kgbVar;
        }
        kgb kgbVar2 = new kgb(this);
        this.b = kgbVar2;
        return kgbVar2;
    }

    public final void c() {
        ((khj) this.a).a.clear();
        this.c = 0;
    }
}
