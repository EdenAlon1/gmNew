package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddsu extends wr {
    public final ddsr s;
    public ddqs t;

    public ddsu(Context context, View view, lkk lkkVar) {
        super(view);
        ddsr ddsrVar = new ddsr(context, lkkVar, new ddst());
        this.s = ddsrVar;
        ddsrVar.a(view);
    }

    final void C() {
        this.s.c();
        ddqs ddqsVar = this.t;
        if (ddqsVar != null) {
            ddqsVar.m();
            this.t = null;
        }
    }
}
