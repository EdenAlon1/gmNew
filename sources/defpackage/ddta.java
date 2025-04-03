package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddta extends wc {
    private final qqs a;
    private int b;
    private float c;
    private boolean d = false;

    public ddta(qqs qqsVar) {
        this.a = qqsVar;
        c();
    }

    private final void c() {
        this.b = 0;
        this.c = 0.0f;
    }

    @Override // defpackage.wc
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (this.d) {
            return;
        }
        int abs = Math.abs(i2);
        int i3 = this.b;
        if (i3 < 5) {
            float f = i3;
            int i4 = i3 + 1;
            this.b = i4;
            this.c = ((f * this.c) + abs) / i4;
        } else {
            float f2 = this.c;
            this.c = (f2 - (f2 / 5.0f)) + (abs / 5);
        }
        if (this.a.u()) {
            if (this.c < 60.0f) {
                this.a.r();
            }
        } else if (this.c > 120.0f) {
            this.a.q();
        }
    }

    @Override // defpackage.wc
    public final void b(RecyclerView recyclerView, int i) {
        this.d = i == 1;
        if (this.a.u()) {
            if (i == 1 || i == 0) {
                this.a.r();
                c();
            }
        }
    }
}
