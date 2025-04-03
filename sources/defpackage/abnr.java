package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abnr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ abnt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abnr(abnt abntVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = abntVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abnr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final abnt abntVar = this.b;
            ffji ffjiVar = new ffji() { // from class: abnq
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    abnm abnmVar = (abnm) obj2;
                    long epochMilli = abnt.this.c.f().toEpochMilli();
                    abnmVar.copyOnWrite();
                    abnn abnnVar = (abnn) abnmVar.instance;
                    abnn abnnVar2 = abnn.a;
                    abnnVar.c = epochMilli;
                    return ffcu.a;
                }
            };
            this.a = 1;
            if (ctzl.b(abntVar.b, ffjiVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new abnr(this.b, ffguVar);
    }
}
