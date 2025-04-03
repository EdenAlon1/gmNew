package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cryv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cryz b;
    final /* synthetic */ eisx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cryv(cryz cryzVar, eisx eisxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cryzVar;
        this.c = eisxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cryv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cryz cryzVar = this.b;
            eisx eisxVar = this.c;
            this.a = 1;
            if (cryzVar.c(eisxVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cryv(this.b, this.c, ffguVar);
    }
}
