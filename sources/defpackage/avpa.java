package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avpa extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aoku b;
    final /* synthetic */ avpd c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avpa(ffgu ffguVar, aoku aokuVar, avpd avpdVar) {
        super(2, ffguVar);
        this.b = aokuVar;
        this.c = avpdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avpa) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        aoku aokuVar;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            aokuVar = (aoku) this.d;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            aoku aokuVar2 = this.b;
            avpd avpdVar = this.c;
            this.d = aokuVar2;
            this.a = 1;
            elfl e = avpdVar.e.e(aokuVar2);
            e.getClass();
            Object c = fgfz.c(e, this);
            if (c == ffhhVar) {
                return ffhhVar;
            }
            aokuVar = aokuVar2;
            obj = c;
        }
        return new ffcf(aokuVar, obj);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        avpa avpaVar = new avpa(ffguVar, this.b, this.c);
        avpaVar.d = obj;
        return avpaVar;
    }
}
