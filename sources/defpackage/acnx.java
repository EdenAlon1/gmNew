package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acnx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eisx b;
    final /* synthetic */ ejar c;
    final /* synthetic */ ffbr d;
    final /* synthetic */ ffbr e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acnx(eisx eisxVar, ejar ejarVar, ffbr ffbrVar, ffbr ffbrVar2, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eisxVar;
        this.c = ejarVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((acnx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            eisx eisxVar = this.b;
            acoa acoaVar = acoa.a;
            eisxVar.getClass();
            ejar ejarVar = this.c;
            ffbr ffbrVar = this.d;
            ffbr ffbrVar2 = this.e;
            this.a = 1;
            if (acoaVar.a(eisxVar, ejarVar, ffbrVar, ffbrVar2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new acnx(this.b, this.c, this.d, this.e, ffguVar);
    }
}
