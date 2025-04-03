package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czdw extends GridLayoutManager {
    final /* synthetic */ czdz J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czdw(czdz czdzVar, Context context, int i) {
        super(i);
        this.J = czdzVar;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.vx
    public final boolean ag() {
        if (this.J.ak.isShowing()) {
            return false;
        }
        return super.ag();
    }
}
