package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aerf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aerk b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aerf(ffgu ffguVar, aerk aerkVar) {
        super(2, ffguVar);
        this.b = aerkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aerf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        aerk aerkVar = this.b;
        cfva cfvaVar = cjja.a;
        Object e = cjja.d.e();
        e.getClass();
        final int intValue = ((Number) e).intValue();
        this.a = 1;
        Object a = ctzl.a(aerkVar.d.a, new ffji() { // from class: aetr
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                aetn aetnVar = (aetn) obj2;
                aetnVar.getClass();
                boolean z = true;
                if (aetnVar.c < intValue && !aetnVar.d) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aerf aerfVar = new aerf(ffguVar, this.b);
        aerfVar.c = obj;
        return aerfVar;
    }
}
