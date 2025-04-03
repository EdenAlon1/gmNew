package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pwb extends pvu {
    public pwb(pwl pwlVar) {
        super(pwlVar);
    }

    @Override // defpackage.pvx
    public final boolean b(pyj pyjVar) {
        int i = pyjVar.l.j;
        if (i != 3) {
            return Build.VERSION.SDK_INT >= 30 && i == 6;
        }
        return true;
    }

    @Override // defpackage.pvu
    protected final int d() {
        return 7;
    }

    @Override // defpackage.pvu
    public final /* bridge */ /* synthetic */ boolean e(Object obj) {
        pvh pvhVar = (pvh) obj;
        pvhVar.getClass();
        return !pvhVar.a || pvhVar.c;
    }
}
