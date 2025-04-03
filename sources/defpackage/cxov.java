package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxov implements rif {
    final /* synthetic */ cxow a;

    public cxov(cxow cxowVar) {
        this.a = cxowVar;
    }

    @Override // defpackage.rif
    public final boolean a(qwp qwpVar, Object obj, rix rixVar, boolean z) {
        if (qwpVar != null) {
            csjy.k("Bugle", qwpVar, "Failed to load video thumbnail");
        }
        ((akzt) this.a.e.b()).c("Bugle.Share.AttachmentViewVideoThumbnail.FailedToLoad");
        return false;
    }

    @Override // defpackage.rif
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2, rix rixVar, qsy qsyVar, boolean z) {
        return false;
    }
}
