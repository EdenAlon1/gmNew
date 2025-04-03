package defpackage;

import android.support.v7.widget.LinearLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzyo extends LinearLayoutManager {
    private int a = 0;

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.vx
    public final void p(wo woVar) {
        super.p(woVar);
        int a = woVar.a();
        if (a != this.a) {
            this.a = a;
        }
    }
}
