package defpackage;

import android.view.View;
import android.view.animation.Animation;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbtf implements Animation.AnimationListener {
    final /* synthetic */ dbth a;

    public dbtf(dbth dbthVar) {
        this.a = dbthVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        for (List list : this.a.b.values()) {
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).setVisibility(8);
                }
            }
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
