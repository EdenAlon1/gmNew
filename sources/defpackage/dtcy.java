package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtcy {
    static final /* synthetic */ ffmx[] a;
    public static final enru b;
    public final RecyclerView c;
    public final vx d;
    public final ffji e;
    public final ffji f;
    private final ffsk g;
    private final ffls h = new dtcx();

    static {
        ffko ffkoVar = new ffko(dtcy.class, "observerJob", "getObserverJob()Lkotlinx/coroutines/Job;", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar};
        b = enru.c("com/google/android/libraries/compose/ui/views/recycler/reactive/LayoutManagerSizeObserver");
    }

    public dtcy(ffsk ffskVar, RecyclerView recyclerView, vx vxVar, ffji ffjiVar, ffji ffjiVar2) {
        this.g = ffskVar;
        this.c = recyclerView;
        this.d = vxVar;
        this.e = ffjiVar;
        this.f = ffjiVar2;
    }

    public static /* synthetic */ void b(dtcy dtcyVar) {
        Integer valueOf = Integer.valueOf(((Number) dtcyVar.e.invoke(dtcyVar.d)).intValue() == 0 ? dtcyVar.c.getHeight() : dtcyVar.c.getWidth());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            dtcyVar.f.invoke(Integer.valueOf(valueOf.intValue()));
        }
        dtcyVar.c(ffqy.d(dtcyVar.g, null, null, new dtcw(dtcyVar, valueOf, null), 3));
    }

    private final void c(ffud ffudVar) {
        this.h.d(a[0], ffudVar);
    }

    public final void a() {
        ((enrr) b.e().h("com/google/android/libraries/compose/ui/views/recycler/reactive/LayoutManagerSizeObserver", "detach", 82, "LayoutManagerSizeObserver.kt")).q("Stopped observing size of RecyclerView");
        c(null);
    }
}
