package defpackage;

import com.google.android.libraries.compose.ui.views.recycler.reactive.ReactiveGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drbo implements ehrp {
    final /* synthetic */ drcf a;

    public drbo(drcf drcfVar) {
        this.a = drcfVar;
    }

    @Override // defpackage.ehro
    public final void a(ehrt ehrtVar) {
        ehrtVar.getClass();
        Object obj = ehrtVar.a;
        obj.getClass();
        drcf drcfVar = this.a;
        drcfVar.q((drbm) obj);
        ReactiveGridLayoutManager reactiveGridLayoutManager = drcfVar.an;
        if (reactiveGridLayoutManager == null) {
            ffkj.c("stickerListLayoutManager");
            reactiveGridLayoutManager = null;
        }
        reactiveGridLayoutManager.ac(0, 0);
    }

    @Override // defpackage.ehro
    public final void b(ehrt ehrtVar) {
        Object obj = ehrtVar.a;
        obj.getClass();
        this.a.q((drbm) obj);
    }

    @Override // defpackage.ehro
    public final void c(ehrt ehrtVar) {
    }
}
