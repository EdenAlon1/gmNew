package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dukv implements View.OnClickListener {
    final /* synthetic */ View[] a;
    final /* synthetic */ List b;
    final /* synthetic */ int c;
    final /* synthetic */ dukw d;

    public dukv(dukw dukwVar, View[] viewArr, List list, int i) {
        this.a = viewArr;
        this.b = list;
        this.c = i;
        this.d = dukwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 0;
        while (true) {
            View[] viewArr = this.a;
            if (i >= viewArr.length) {
                dukb.c().b().b = true;
                view.postOnAnimationDelayed(new duku(this, this.b, this.c), 200L);
                return;
            } else {
                View view2 = viewArr[i];
                view2.setOnClickListener(null);
                view2.setClickable(false);
                i++;
            }
        }
    }
}
