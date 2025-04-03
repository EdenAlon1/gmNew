package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cfm implements ljv {
    final /* synthetic */ cfn a;

    public cfm(cfn cfnVar) {
        this.a = cfnVar;
    }

    @Override // defpackage.ljv
    public final void c(lkr lkrVar) {
        cfl cflVar = (cfl) this.a.a.peek();
        if (cflVar == null) {
            Log.e("CarApp", "Screen stack was empty during lifecycle onPause");
        } else {
            cflVar.b(lki.ON_PAUSE);
        }
    }

    @Override // defpackage.ljv
    public final void d(lkr lkrVar) {
        cfl cflVar = (cfl) this.a.a.peek();
        if (cflVar == null) {
            Log.e("CarApp", "Screen stack was empty during lifecycle onResume");
        } else {
            cflVar.b(lki.ON_RESUME);
        }
    }

    @Override // defpackage.ljv
    public final void f(lkr lkrVar) {
        cfl cflVar = (cfl) this.a.a.peek();
        if (cflVar == null) {
            Log.e("CarApp", "Screen stack was empty during lifecycle onStop");
        } else {
            cflVar.b(lki.ON_STOP);
        }
    }

    @Override // defpackage.ljv
    public final void ff(lkr lkrVar) {
        cfn cfnVar = this.a;
        Iterator it = new ArrayDeque(cfnVar.a).iterator();
        while (it.hasNext()) {
            cfn.c((cfl) it.next(), true);
        }
        cfnVar.a.clear();
        lkrVar.P().d(this);
    }

    @Override // defpackage.ljv
    public final void ha(lkr lkrVar) {
        cfl cflVar = (cfl) this.a.a.peek();
        if (cflVar == null) {
            Log.e("CarApp", "Screen stack was empty during lifecycle onStart");
        } else {
            cflVar.b(lki.ON_START);
        }
    }

    @Override // defpackage.ljv
    public final void gZ(lkr lkrVar) {
    }
}
