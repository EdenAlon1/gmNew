package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dfe extends ddx {
    public dfe(dwn dwnVar, dhf dhfVar, boolean z, String str, jjj jjjVar, ffix ffixVar) {
        super(dwnVar, dhfVar, z, str, jjjVar, ffixVar);
    }

    @Override // defpackage.ddx
    public final Object b(ild ildVar, ffgu ffguVar) {
        Object c = dtr.c(ildVar, new dfc(this, null), new dfd(this), ffguVar);
        return c == ffhh.a ? c : ffcu.a;
    }

    @Override // defpackage.ddx
    protected final boolean s(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.ddx
    protected final void z(KeyEvent keyEvent) {
        ((ddx) this).c.invoke();
    }
}
