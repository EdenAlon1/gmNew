package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drrf implements rif {
    final /* synthetic */ drri a;
    final /* synthetic */ drlj b;
    final /* synthetic */ drlj c;

    public drrf(drri drriVar, drlj drljVar, drlj drljVar2) {
        this.a = drriVar;
        this.b = drljVar;
        this.c = drljVar2;
    }

    @Override // defpackage.rif
    public final boolean a(qwp qwpVar, Object obj, rix rixVar, boolean z) {
        enrr enrrVar = (enrr) drri.s.j();
        Throwable th = qwpVar;
        if (qwpVar == null) {
            th = new RuntimeException("Glide failed with null exception");
        }
        enrr enrrVar2 = (enrr) enrrVar.g(th).h("com/google/android/libraries/compose/media/ui/holder/MediaViewHolder$bind$$inlined$simpleGlideListener$1", "onLoadFailed", 133, "MediaViewHolder.kt");
        drri drriVar = this.a;
        enrrVar2.D("Failed to load %s with media=%s", drriVar.w, this.b);
        this.a.E();
        return false;
    }

    @Override // defpackage.rif
    public final boolean b(Object obj, Object obj2, rix rixVar, qsy qsyVar, boolean z) {
        ((enrr) drri.s.f().h("com/google/android/libraries/compose/media/ui/holder/MediaViewHolder$bind$$inlined$simpleGlideListener$1", "onResourceReady", 137, "MediaViewHolder.kt")).t("Successfully rendered media=%s", this.c);
        return false;
    }
}
