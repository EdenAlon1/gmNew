package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ehuf extends pbq {
    private final ehuj w;
    private final ehuj x;
    private final List y = new ArrayList();

    protected ehuf(ehuj ehujVar, ehuj ehujVar2) {
        this.w = ehujVar;
        this.x = ehujVar2;
    }

    private final Animator P(ViewGroup viewGroup, View view, boolean z) {
        int a;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Q(arrayList, this.w, viewGroup, view, z);
        Q(arrayList, this.x, viewGroup, view, z);
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            Q(arrayList, (ehuj) it.next(), viewGroup, view, z);
        }
        Context context = viewGroup.getContext();
        int i = ehui.a;
        if (this.b == -1 && (a = ehmp.a(context, R.attr.motionDurationLong1, -1)) != -1) {
            K(a);
        }
        TimeInterpolator timeInterpolator = egyv.b;
        if (this.c == null) {
            L(ehjz.a(context, R.attr.motionEasingEmphasizedInterpolator, timeInterpolator));
        }
        egyw.a(animatorSet, arrayList);
        return animatorSet;
    }

    private static void Q(List list, ehuj ehujVar, ViewGroup viewGroup, View view, boolean z) {
        if (ehujVar == null) {
            return;
        }
        Animator a = z ? ehujVar.a(viewGroup, view) : ehujVar.b(viewGroup, view);
        if (a != null) {
            list.add(a);
        }
    }

    @Override // defpackage.pbq
    public final Animator f(ViewGroup viewGroup, View view, pbb pbbVar, pbb pbbVar2) {
        return P(viewGroup, view, false);
    }

    @Override // defpackage.pbq
    public final Animator g(ViewGroup viewGroup, View view, pbb pbbVar) {
        return P(viewGroup, view, true);
    }
}
