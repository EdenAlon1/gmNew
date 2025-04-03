package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhs extends ffkk implements ffji {
    final /* synthetic */ hkx a;
    final /* synthetic */ dkl b;
    final /* synthetic */ fhi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhs(hkx hkxVar, dkl dklVar, fhi fhiVar) {
        super(1);
        this.a = hkxVar;
        this.b = dklVar;
        this.c = fhiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        dkg dkgVar = (dkg) obj;
        int i = ((evp) this.a.a()).a;
        int i2 = i & 4;
        evv evvVar = evv.a;
        if (i2 == 4) {
            fhi fhiVar = this.c;
            dkgVar.a.add(new hpw(262103052, true, new dkf(new esp(evvVar), hvi.e, new fhn(this.b, fhiVar))));
        }
        dkl dklVar = this.b;
        int i3 = i & 1;
        fhi fhiVar2 = this.c;
        evv evvVar2 = evv.b;
        if (i3 != 0) {
            dkgVar.a.add(new hpw(262103052, true, new dkf(new esp(evvVar2), hvi.e, new fho(dklVar, fhiVar2))));
        }
        dkl dklVar2 = this.b;
        int i4 = i & 2;
        fhi fhiVar3 = this.c;
        evv evvVar3 = evv.c;
        if (i4 == 2) {
            dkgVar.a.add(new hpw(262103052, true, new dkf(new esp(evvVar3), hvi.e, new fhp(dklVar2, fhiVar3))));
        }
        dkl dklVar3 = this.b;
        int i5 = i & 8;
        fhi fhiVar4 = this.c;
        evv evvVar4 = evv.d;
        if (i5 == 8) {
            dkgVar.a.add(new hpw(262103052, true, new dkf(new esp(evvVar4), hvi.e, new fhq(dklVar3, fhiVar4))));
        }
        dkl dklVar4 = this.b;
        fhi fhiVar5 = this.c;
        evv evvVar5 = evv.e;
        boolean z = false;
        if (fhiVar5.s() && jpm.i(this.c.f().c)) {
            z = true;
        }
        fhi fhiVar6 = this.c;
        if (z) {
            dkgVar.a.add(new hpw(262103052, true, new dkf(new esp(evvVar5), hvi.e, new fhr(dklVar4, fhiVar6))));
        }
        return ffcu.a;
    }
}
