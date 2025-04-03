package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecms extends wc {
    final /* synthetic */ ecda a;
    final /* synthetic */ ecmt b;
    private boolean c;

    public ecms(ecmt ecmtVar, ecda ecdaVar) {
        this.a = ecdaVar;
        this.b = ecmtVar;
    }

    @Override // defpackage.wc
    public final void b(RecyclerView recyclerView, int i) {
        if (this.c) {
            if (i == 0) {
                this.b.e(this.a, null);
                this.c = false;
                return;
            }
            return;
        }
        if (i == 1) {
            this.b.d(this.a);
            this.c = true;
        }
    }

    @Override // defpackage.wc
    public final void a(RecyclerView recyclerView, int i, int i2) {
    }
}
