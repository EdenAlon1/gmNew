package defpackage;

import android.support.v7.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egbu extends tx {
    final /* synthetic */ GridLayoutManager c;
    final /* synthetic */ egbw d;

    public egbu(egbw egbwVar, GridLayoutManager gridLayoutManager) {
        this.c = gridLayoutManager;
        this.d = egbwVar;
    }

    @Override // defpackage.tx
    public final int b(int i) {
        if (this.d.a.G(i)) {
            return this.c.b;
        }
        return 1;
    }
}
