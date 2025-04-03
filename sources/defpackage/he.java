package defpackage;

import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class he extends hi {
    private final gc j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public he(int r2, int r3, defpackage.gc r4) {
        /*
            r1 = this;
            ea r0 = r4.a
            r0.getClass()
            r1.<init>(r2, r3, r0)
            r1.j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he.<init>(int, int, gc):void");
    }

    @Override // defpackage.hi
    public final void a() {
        super.a();
        this.a.t = false;
        this.j.e();
    }

    @Override // defpackage.hi
    public final void b() {
        if (this.e) {
            return;
        }
        super.b();
        int i = this.i;
        if (i != 2) {
            if (i == 3) {
                ea eaVar = this.j.a;
                eaVar.getClass();
                View N = eaVar.N();
                if (fr.af(2)) {
                    Log.v("FragmentManager", "Clearing focus " + N.findFocus() + " on view " + N + " for Fragment " + eaVar);
                }
                N.clearFocus();
                return;
            }
            return;
        }
        ea eaVar2 = this.j.a;
        eaVar2.getClass();
        View findFocus = eaVar2.Q.findFocus();
        if (findFocus != null) {
            eaVar2.au(findFocus);
            if (fr.af(2)) {
                Log.v("FragmentManager", a.j(eaVar2, findFocus, "requestFocus: Saved focused view ", " for Fragment "));
            }
        }
        View N2 = this.a.N();
        if (N2.getParent() == null) {
            this.j.b();
            N2.setAlpha(0.0f);
        }
        if (N2.getAlpha() == 0.0f && N2.getVisibility() == 0) {
            N2.setVisibility(4);
        }
        dv dvVar = eaVar2.T;
        N2.setAlpha(dvVar == null ? 1.0f : dvVar.n);
    }
}
