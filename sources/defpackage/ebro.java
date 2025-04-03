package defpackage;

import android.animation.AnimatorSet;
import android.util.Log;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebro implements erqj {
    final WeakReference a;

    public ebro(ebrp ebrpVar) {
        this.a = new WeakReference(ebrpVar);
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        final ebrp ebrpVar = (ebrp) this.a.get();
        if (ebrpVar != null) {
            if (bool.booleanValue()) {
                ebrpVar.d();
            } else {
                ebpa.a(new Runnable() { // from class: ebqt
                    @Override // java.lang.Runnable
                    public final void run() {
                        ebrp ebrpVar2 = ebrp.this;
                        AnimatorSet animatorSet = ebrpVar2.y;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        ebrpVar2.h(true);
                    }
                });
            }
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        Log.e(ebrp.a, "ContinueWithAccountListener execution threw an exception", th);
    }
}
