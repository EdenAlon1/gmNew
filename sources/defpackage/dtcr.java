package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtcr extends vt {
    private final int a;
    private final int b;

    public dtcr() {
        this(0, 3, null);
    }

    @Override // defpackage.vt
    public final void a(Rect rect, View view, RecyclerView recyclerView, wo woVar) {
        rect.getClass();
        view.getClass();
        woVar.getClass();
        super.a(rect, view, recyclerView, woVar);
        if (dslh.f(view)) {
            rect.left = this.a;
        } else {
            rect.right = this.a;
        }
        rect.bottom = this.b;
    }

    public dtcr(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ dtcr(int r1, int r2, byte[] r3) {
        /*
            r0 = this;
            r3 = 1
            r2 = r2 & r3
            if (r3 != r2) goto L5
            r1 = 0
        L5:
            r0.<init>(r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtcr.<init>(int, int, byte[]):void");
    }
}
