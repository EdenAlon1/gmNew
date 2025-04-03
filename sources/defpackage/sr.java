package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sr implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ ta b;

    public sr(ta taVar, ArrayList arrayList) {
        this.b = taVar;
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sy syVar = (sy) arrayList.get(i);
            ta taVar = this.b;
            wr wrVar = syVar.a;
            View view = wrVar == null ? null : wrVar.a;
            wr wrVar2 = syVar.b;
            View view2 = wrVar2 != null ? wrVar2.a : null;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(250L);
                taVar.g.add(syVar.a);
                duration.translationX(syVar.e - syVar.c);
                duration.translationY(syVar.f - syVar.d);
                duration.alpha(0.0f).setListener(new sw(taVar, syVar, duration, view)).start();
            }
            if (view2 != null) {
                ArrayList arrayList2 = taVar.g;
                ViewPropertyAnimator animate = view2.animate();
                arrayList2.add(syVar.b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new sx(taVar, syVar, animate, view2)).start();
            }
        }
        this.a.clear();
        this.b.c.remove(this.a);
    }
}
