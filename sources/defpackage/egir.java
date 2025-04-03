package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egir implements erqj {
    final /* synthetic */ egiu a;

    public egir(egiu egiuVar) {
        this.a = egiuVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.i.d(fapt.OBAKE_MDI_UPDATE_PERSON_PHOTO_ME);
        this.a.d();
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((enrr) ((enrr) ((enrr) egiu.a.j()).g(th)).h("com/google/android/libraries/user/profile/photopicker/common/model/profile/MdiPhotoRepository$4", "onFailure", (char) 297, "MdiPhotoRepository.java")).q("Unable to write profile photo.");
        this.a.i.b(fapt.OBAKE_MDI_UPDATE_PERSON_PHOTO_ME, th);
        this.a.a(th);
    }
}
