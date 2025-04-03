package defpackage;

import android.database.ContentObserver;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpgc extends ContentObserver {
    public final dqfs a;
    public final dsyj b;
    private final dpge c;
    private final RecyclerView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpgc(Handler handler, dpge dpgeVar, dqfs dqfsVar, RecyclerView recyclerView) {
        super(handler);
        recyclerView.getClass();
        this.c = dpgeVar;
        this.a = dqfsVar;
        this.d = recyclerView;
        this.b = dsyh.a(recyclerView);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        this.c.e();
        if (!(this.d.o instanceof SpannedGridLayoutManager) || this.b.h()) {
            this.a.G();
            return;
        }
        RecyclerView recyclerView = this.d;
        vx vxVar = recyclerView.o;
        if (!(vxVar instanceof SpannedGridLayoutManager)) {
            throw new IllegalStateException("Check failed.");
        }
        recyclerView.z(new dpgb(this, vxVar));
    }
}
