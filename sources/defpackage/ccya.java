package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccya extends ffhv implements ffjm {
    final /* synthetic */ ccyb a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ ccvl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccya(ccyb ccybVar, String str, String str2, ccvl ccvlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ccybVar;
        this.b = str;
        this.c = str2;
        this.d = ccvlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccya) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ccyb ccybVar = this.a;
        String str = this.b;
        String str2 = this.c;
        ccvl ccvlVar = this.d;
        ekzz f = eleg.f("CmsParticipantsBackupDelegate.uploadProfilePhoto");
        try {
            try {
                Optional a = ccybVar.c.a(str);
                a.getClass();
                if (a.isPresent()) {
                    ccybVar.d.h(((csby) a.get()).b());
                } else {
                    ensz enszVar = (ensz) ccyb.a.j();
                    enszVar.Y(cdii.c, str);
                    enszVar.Y(cdii.d, ccvlVar.b.a);
                    enszVar.Y(cdii.p, Integer.valueOf(ccvlVar.b.b));
                    enszVar.Y(csux.m, str2);
                    enszVar.q("Failure because CmsParticipant data is not found.");
                }
            } catch (Exception e) {
                ensz enszVar2 = (ensz) ((ensz) ccyb.a.j()).g(e);
                enszVar2.Y(cdii.c, str);
                enszVar2.Y(cdii.d, ccvlVar.b.a);
                enszVar2.Y(cdii.p, Integer.valueOf(ccvlVar.b.b));
                enszVar2.Y(csux.m, str2);
                enszVar2.q("Failure while uploading CmsParticipant profile photo.");
            }
            ffig.a(f, null);
            return ffcu.a;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ccya(this.a, this.b, this.c, this.d, ffguVar);
    }
}
