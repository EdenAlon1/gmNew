package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ss implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ ta b;

    public ss(ta taVar, ArrayList arrayList) {
        this.b = taVar;
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            wr wrVar = (wr) arrayList.get(i);
            ta taVar = this.b;
            View view = wrVar.a;
            ViewPropertyAnimator animate = view.animate();
            taVar.d.add(wrVar);
            animate.alpha(1.0f).setDuration(taVar.h).setListener(new su(taVar, wrVar, view, animate)).start();
        }
        this.a.clear();
        ta taVar2 = this.b;
        taVar2.a.remove(this.a);
    }
}
