package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aloi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aloj b;
    final /* synthetic */ eisx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aloi(aloj alojVar, eisx eisxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = alojVar;
        this.c = eisxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aloi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aloj alojVar = this.b;
            aloh alohVar = new aloh(alojVar, this.c, null);
            this.a = 1;
            if (alojVar.a.a(alohVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aloi(this.b, this.c, ffguVar);
    }
}
