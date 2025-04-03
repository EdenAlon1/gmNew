package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdwm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cdwo b;
    final /* synthetic */ Exception c;
    final /* synthetic */ eisx d;
    final /* synthetic */ eyhs e;
    final /* synthetic */ ceuw f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdwm(ffgu ffguVar, cdwo cdwoVar, Exception exc, eisx eisxVar, eyhs eyhsVar, ceuw ceuwVar) {
        super(2, ffguVar);
        this.b = cdwoVar;
        this.c = exc;
        this.d = eisxVar;
        this.e = eyhsVar;
        this.f = ceuwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdwm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        try {
        } catch (Exception unused) {
            ceut.D.n("Could not save exception to SilentFeedbackManager");
        }
        if (i == 0) {
            ffci.b(obj);
            csjb b = ceut.D.b();
            b.I("Encountered an unexpected exception from a CMS WorkHandler");
            cdwo cdwoVar = this.b;
            cfup cfupVar = cdwo.a;
            b.A("processor", cdwoVar.d.getClass().getCanonicalName());
            b.s(this.c);
            if (this.b.e.a()) {
                crze.c("Encountered an unexpected exception from a CmsSingleItemWorkHandler", this.c);
            } else {
                elfl b2 = this.b.f.b(this.c);
                this.a = 1;
                if (fgfz.c(b2, this) == ffhhVar) {
                }
            }
        } else {
            if (i != 1) {
                ffci.b(obj);
                return obj;
            }
            ffci.b(obj);
        }
        cdwo cdwoVar2 = this.b;
        eisx eisxVar = this.d;
        eyhs eyhsVar = this.e;
        ceuw ceuwVar = this.f;
        Exception exc = this.c;
        this.a = 2;
        cfup cfupVar2 = cdwo.a;
        Object l = cdwoVar2.l(eisxVar, eyhsVar, ceuwVar, exc, this);
        return l == ffhhVar ? ffhhVar : l;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cdwm cdwmVar = new cdwm(ffguVar, this.b, this.c, this.d, this.e, this.f);
        cdwmVar.g = obj;
        return cdwmVar;
    }
}
