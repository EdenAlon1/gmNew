package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtct {
    public final int a;
    private final ffbz b = ffca.a(new ffix() { // from class: dtcs
        @Override // defpackage.ffix
        public final Object invoke() {
            return new dtcr(dtct.this.a, 2, null);
        }
    });
    private int c;
    private int d;

    public dtct(int i) {
        this.a = i;
    }

    private final dtcr c() {
        return (dtcr) this.b.a();
    }

    public final void a(RecyclerView recyclerView) {
        if (this.a != 0) {
            this.c = recyclerView.getPaddingStart();
            int paddingTop = recyclerView.getPaddingTop();
            this.d = paddingTop;
            int i = this.c;
            if (i == 0) {
                i = this.a;
            }
            if (paddingTop == 0) {
                paddingTop = this.a;
            }
            recyclerView.setPaddingRelative(i, paddingTop, recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
            recyclerView.w(c());
        }
    }

    public final void b(RecyclerView recyclerView) {
        if (this.a != 0) {
            recyclerView.setPaddingRelative(this.c, this.d, recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
            recyclerView.ae(c());
        }
    }
}
