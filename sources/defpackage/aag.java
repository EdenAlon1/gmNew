package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aag extends aac {
    public final int a;
    public final int b;

    public aag(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.aac
    public int e(RecyclerView recyclerView, wr wrVar) {
        return g(this.b, q(recyclerView, wrVar));
    }

    public int q(RecyclerView recyclerView, wr wrVar) {
        return this.a;
    }
}
