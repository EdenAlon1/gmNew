package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alog extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aloj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alog(aloj alojVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = alojVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alog) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aloj alojVar = this.b;
            alof alofVar = new alof(alojVar, null);
            this.a = 1;
            if (alojVar.a.a(alofVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new alog(this.b, ffguVar);
    }
}
