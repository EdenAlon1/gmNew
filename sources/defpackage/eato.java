package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eato extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eatp b;
    final /* synthetic */ easy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eato(eatp eatpVar, easy easyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eatpVar;
        this.c = easyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eato) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        this.a = 1;
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eato(this.b, this.c, ffguVar);
    }
}
