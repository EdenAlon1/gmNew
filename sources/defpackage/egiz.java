package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egiz implements erqj {
    final /* synthetic */ egdt a;
    final /* synthetic */ egja b;

    public egiz(egja egjaVar, egdt egdtVar) {
        this.a = egdtVar;
        this.b = egjaVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ewkh ewkhVar = (ewkh) obj;
        exfw a = this.a.a();
        emux emuxVar = emux.a;
        boolean z = ewkhVar.c;
        boolean z2 = ewkhVar.b;
        ewke b = ewke.b(ewkhVar.e);
        if (b == null) {
            b = ewke.MESSAGE_UNDEFINED;
        }
        ewke ewkeVar = b;
        if (ewkeVar == null) {
            throw new NullPointerException("Null infoMessage");
        }
        int a2 = ewkg.a(ewkhVar.d);
        if (a2 == 0) {
            a2 = 1;
        }
        this.b.a(egdx.i(new egik(z, emuxVar, z2, ewkhVar.f, a2, ewkeVar), engw.r(a)));
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        egdp a = this.b.b.a(th);
        exfw c = this.a.c(th);
        ((enrr) ((enrr) ((enrr) egja.a.j()).g(th)).h("com/google/android/libraries/user/profile/photopicker/common/model/profile/ProfileStateRepository$1", "onFailure", 'a', "ProfileStateRepository.java")).q("Unable to read current profile state.");
        this.b.a(egdx.f(a, engw.r(c)));
    }
}
