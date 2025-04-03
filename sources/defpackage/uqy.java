package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.List;
import java.util.function.IntPredicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uqy extends wt {
    public final IntPredicate c;
    public final elbx d;
    public boolean e;
    public engw f;
    private final ktb g;

    public uqy(RecyclerView recyclerView, IntPredicate intPredicate, elbx elbxVar) {
        super(recyclerView);
        this.g = new uqx(this);
        this.e = false;
        this.c = intPredicate;
        this.d = elbxVar;
    }

    @Override // defpackage.wt
    public final ktb j() {
        return this.g;
    }

    final void l(List list) {
        boolean z = true;
        if (list != null && list.contains(null)) {
            z = false;
        }
        emxf.b(z, "Setting menu items for MessageListAccessibilityDelegate where at least one item is null");
        this.f = list != null ? engw.n(list) : null;
    }
}
