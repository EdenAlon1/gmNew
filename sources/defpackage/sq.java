package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sq implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ ta b;

    public sq(ta taVar, ArrayList arrayList) {
        this.b = taVar;
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sz szVar = (sz) arrayList.get(i);
            ta taVar = this.b;
            wr wrVar = szVar.a;
            int i2 = szVar.b;
            int i3 = szVar.c;
            int i4 = szVar.d;
            int i5 = szVar.e;
            View view = wrVar.a;
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            if (i6 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i7 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            taVar.e.add(wrVar);
            animate.setDuration(taVar.m()).setListener(new sv(taVar, wrVar, i6, view, i7, animate)).start();
        }
        this.a.clear();
        ta taVar2 = this.b;
        taVar2.b.remove(this.a);
    }
}
