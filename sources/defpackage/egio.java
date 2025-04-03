package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egio implements erqj {
    final /* synthetic */ egiu a;

    public egio(egiu egiuVar) {
        this.a = egiuVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        egiu egiuVar = this.a;
        egit egitVar = egiuVar.i;
        egitVar.c.add(0, ((egdt) egitVar.b.remove(egitVar.a)).a());
        egiuVar.c(egdx.i((egiw) obj, egiuVar.i.a()));
        egiuVar.g.set(false);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((enrr) ((enrr) ((enrr) egiu.a.j()).g(th)).h("com/google/android/libraries/user/profile/photopicker/common/model/profile/MdiPhotoRepository$1", "onFailure", (char) 198, "MdiPhotoRepository.java")).q("Unable to read current profile photo.");
        this.a.a(th);
    }
}
