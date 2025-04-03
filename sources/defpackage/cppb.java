package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cppb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cppd b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cppb(ffgu ffguVar, cppd cppdVar) {
        super(2, ffguVar);
        this.b = cppdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cppb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cppd cppdVar = this.b;
        this.a = 1;
        Object a = cppdVar.a(this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cppb cppbVar = new cppb(ffguVar, this.b);
        cppbVar.c = obj;
        return cppbVar;
    }
}
