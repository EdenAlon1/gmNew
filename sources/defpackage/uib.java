package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uib implements dpfr {
    private static final entd a = entd.c("BugleCamera");
    private final ffbr b;

    public uib(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.b = ffbrVar;
    }

    @Override // defpackage.dpfr
    public final void a(dpgr dpgrVar, drlw drlwVar, Throwable th) {
        entd entdVar = a;
        ((ensz) ((ensz) entdVar.i()).g(th)).q("Camera capture failed");
        if (!ffkj.e(dpgrVar, dpgq.a)) {
            if (((dpgo) dpgrVar).a == dpgl.a) {
                ((akzt) this.b.b()).c("Bugle.Compose.Gallery.Camera.InApp.Mini.Photo.CaptureFailed.Count");
            }
        } else if (ffkj.e(drlwVar, drlu.a)) {
            ((akzt) this.b.b()).c("Bugle.Compose.Gallery.Camera.System.Photo.CaptureFailed.Count");
        } else if (ffkj.e(drlwVar, drlv.a)) {
            ((akzt) this.b.b()).c("Bugle.Compose.Gallery.Camera.System.Video.CaptureFailed.Count");
        } else {
            ((ensz) entdVar.h()).t("Unexpected media type: %s", drlwVar);
        }
    }

    @Override // defpackage.dpfr
    public final void b() {
        ((akzt) this.b.b()).c("Bugle.Compose.Gallery.Camera.FullscreenCameraOpens.Count");
    }

    @Override // defpackage.dpfr
    public final void c() {
        ((akzt) this.b.b()).c("Bugle.Compose.Gallery.PageLoadRequested.Count");
    }
}
