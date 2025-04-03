package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dpnn extends wr {
    public static final /* synthetic */ ffmx[] s;
    public final ffls t;

    static {
        ffko ffkoVar = new ffko(dpnn.class, "size", "getSize()Landroid/util/Size;", 0);
        int i = fflc.a;
        s = new ffmx[]{ffkoVar};
    }

    public dpnn(View view) {
        super(view);
        this.t = new dpnm(this);
    }

    public abstract Object C(ffgu ffguVar);

    public abstract void D(dpni dpniVar);

    public abstract Object E();
}
