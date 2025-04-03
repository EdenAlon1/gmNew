package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class cvss extends ffkh implements ffjm {
    public cvss(Object obj) {
        super(2, obj, cvsy.class, "onContactListInteractive", "onContactListInteractive(ZZ)V", 0);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        aler b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        cvsy cvsyVar = (cvsy) this.g;
        cwdv cwdvVar = cvsyVar.f;
        cwdvVar.b.g(alrv.H, null, null, ecrh.SUCCESS);
        cwdvVar.d.c(alrv.G, 0);
        cwdvVar.c.e(csra.h, null);
        cwdv.a.p("contact list is interactive");
        cwav cwavVar = cvsyVar.c;
        cwavVar.b.d(5, cwavVar.f);
        if (booleanValue) {
            cwavVar.b.d(6, cwavVar.f);
        }
        cwavVar.c(booleanValue2);
        b = cwavVar.c.b(176570, null);
        cwavVar.e = b;
        return ffcu.a;
    }
}
