package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aerh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aerk b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aerh(ffgu ffguVar, aerk aerkVar) {
        super(2, ffguVar);
        this.b = aerkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aerh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aerk aerkVar = this.b;
            this.a = 1;
            Object b = ctzl.b(aerkVar.d.a, new ffji() { // from class: aetq
                @Override // defpackage.ffji
                public final Object invoke(Object obj3) {
                    aetm aetmVar = (aetm) obj3;
                    int i2 = ((aetn) aetmVar.instance).c + 1;
                    aetmVar.copyOnWrite();
                    aetn aetnVar = (aetn) aetmVar.instance;
                    aetnVar.b |= 1;
                    aetnVar.c = i2;
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
        aerh aerhVar = new aerh(ffguVar, this.b);
        aerhVar.c = obj;
        return aerhVar;
    }
}
