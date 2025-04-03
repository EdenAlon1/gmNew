package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pp extends oo {
    final /* synthetic */ pt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp(pt ptVar, Context context, od odVar, View view) {
        super(context, odVar, view, true);
        this.d = ptVar;
        this.b = 8388613;
        e(ptVar.m);
    }

    @Override // defpackage.oo
    protected final void c() {
        od odVar = this.d.c;
        if (odVar != null) {
            odVar.close();
        }
        this.d.j = null;
        super.c();
    }
}
