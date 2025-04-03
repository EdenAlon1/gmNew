package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awoq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ awor b;
    final /* synthetic */ awxk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awoq(awor aworVar, awxk awxkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aworVar;
        this.c = awxkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awoq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        awor aworVar = this.b;
        awxk awxkVar = this.c;
        this.a = 1;
        Object b = aworVar.b(awxkVar, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new awoq(this.b, this.c, ffguVar);
    }
}
