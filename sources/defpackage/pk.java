package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pk extends oo {
    final /* synthetic */ pt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk(pt ptVar, Context context, oy oyVar, View view) {
        super(context, oyVar, view, false);
        this.d = ptVar;
        if (!oyVar.m.o()) {
            View view2 = ptVar.h;
            this.a = view2 == null ? (View) ptVar.f : view2;
        }
        e(ptVar.m);
    }

    @Override // defpackage.oo
    protected final void c() {
        pt ptVar = this.d;
        ptVar.k = null;
        ptVar.n = 0;
        super.c();
    }
}
