package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abnk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ abnl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abnk(abnl abnlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = abnlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abnk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            abnl abnlVar = this.b;
            this.a = 1;
            final abnt abntVar = abnlVar.b;
            Object b = ctzl.b(abntVar.b, new ffji() { // from class: abno
                @Override // defpackage.ffji
                public final Object invoke(Object obj3) {
                    abnm abnmVar = (abnm) obj3;
                    int i2 = ((abnn) abnmVar.instance).b + 1;
                    abnmVar.copyOnWrite();
                    ((abnn) abnmVar.instance).b = i2;
                    long epochMilli = abnt.this.c.f().toEpochMilli();
                    abnmVar.copyOnWrite();
                    ((abnn) abnmVar.instance).c = epochMilli;
                    return ffcu.a;
                }
            }, this);
            if (b != ffhh.a) {
                b = ffcu.a;
            }
            if (b == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new abnk(this.b, ffguVar);
    }
}
