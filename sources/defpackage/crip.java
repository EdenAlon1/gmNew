package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crip implements rif {
    final /* synthetic */ criq a;

    public crip(criq criqVar) {
        this.a = criqVar;
    }

    @Override // defpackage.rif
    public final boolean a(qwp qwpVar, Object obj, rix rixVar, boolean z) {
        if (qwpVar != null) {
            csjy.k("Bugle", qwpVar, "Failed to load attachment image");
        }
        ((akzt) this.a.i.b()).c("Bugle.Share.AttachmentViewImage.FailedToLoad");
        return false;
    }

    @Override // defpackage.rif
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2, rix rixVar, qsy qsyVar, boolean z) {
        return false;
    }
}
