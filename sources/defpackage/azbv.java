package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azbv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ azcf b;
    final /* synthetic */ awui c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azbv(azcf azcfVar, awui awuiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = azcfVar;
        this.c = awuiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azbv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        azcf azcfVar = this.b;
        awui awuiVar = this.c;
        this.a = 1;
        Object b = azcfVar.b(awuiVar, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new azbv(this.b, this.c, ffguVar);
    }
}
