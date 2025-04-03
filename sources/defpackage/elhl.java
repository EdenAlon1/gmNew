package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elhl extends wc {
    final /* synthetic */ wc a;
    final /* synthetic */ String b = "MessageListFragmentPeer scrollListener";
    final /* synthetic */ elhn c;

    public elhl(elhn elhnVar, wc wcVar) {
        this.a = wcVar;
        this.c = elhnVar;
    }

    @Override // defpackage.wc
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (ekyf.v()) {
            this.a.a(recyclerView, i, i2);
            return;
        }
        elhn elhnVar = this.c;
        ekzm b = elhnVar.a.b(this.b);
        try {
            this.a.a(recyclerView, i, i2);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.wc
    public final void b(RecyclerView recyclerView, int i) {
        if (ekyf.v()) {
            this.a.b(recyclerView, i);
            return;
        }
        elhn elhnVar = this.c;
        ekzm b = elhnVar.a.b(this.b);
        try {
            this.a.b(recyclerView, i);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
