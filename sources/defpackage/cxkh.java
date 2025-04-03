package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxkh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxkk b;
    final /* synthetic */ akue c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxkh(ffgu ffguVar, cxkk cxkkVar, akue akueVar) {
        super(2, ffguVar);
        this.b = cxkkVar;
        this.c = akueVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxkh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cxkk cxkkVar = this.b;
        cxkj cxkjVar = new cxkj(cxkkVar, this.c);
        this.a = 1;
        Object d = cxkkVar.a.d(cxkjVar, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cxkh cxkhVar = new cxkh(ffguVar, this.b, this.c);
        cxkhVar.d = obj;
        return cxkhVar;
    }
}
