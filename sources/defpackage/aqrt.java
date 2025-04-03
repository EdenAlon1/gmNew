package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqrt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aqru b;
    final /* synthetic */ aqkp c;
    final /* synthetic */ aqkh d;
    final /* synthetic */ aqkv e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqrt(ffgu ffguVar, aqru aqruVar, aqkp aqkpVar, aqkv aqkvVar, aqkh aqkhVar) {
        super(2, ffguVar);
        this.b = aqruVar;
        this.c = aqkpVar;
        this.e = aqkvVar;
        this.d = aqkhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqrt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        aqru aqruVar = this.b;
        aqkp aqkpVar = this.c;
        aqkv aqkvVar = this.e;
        aqkh aqkhVar = this.d;
        this.a = 1;
        Object e = aqruVar.e(aqkpVar, aqkvVar, aqkhVar, this);
        return e == ffhhVar ? ffhhVar : e;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aqrt aqrtVar = new aqrt(ffguVar, this.b, this.c, this.e, this.d);
        aqrtVar.f = obj;
        return aqrtVar;
    }
}
