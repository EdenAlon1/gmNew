package defpackage;

import android.support.v7.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsde implements ehrp {
    final /* synthetic */ dsed a;

    public dsde(dsed dsedVar) {
        this.a = dsedVar;
    }

    @Override // defpackage.ehro
    public final void a(ehrt ehrtVar) {
        if (ehrtVar != null) {
            dsed dsedVar = this.a;
            Object obj = ehrtVar.a;
            obj.getClass();
            dsedVar.bs((dsdc) obj);
            GridLayoutManager gridLayoutManager = dsedVar.b;
            if (gridLayoutManager == null) {
                ffkj.c("stickerPacksListLayoutManager");
                gridLayoutManager = null;
            }
            gridLayoutManager.ac(0, 0);
        }
    }

    @Override // defpackage.ehro
    public final void b(ehrt ehrtVar) {
        Object obj = ehrtVar.a;
        obj.getClass();
        this.a.bs((dsdc) obj);
    }

    @Override // defpackage.ehro
    public final void c(ehrt ehrtVar) {
    }
}
