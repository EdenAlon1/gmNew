package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpqv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpqw b;
    final /* synthetic */ fbzt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpqv(cpqw cpqwVar, fbzt fbztVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cpqwVar;
        this.c = fbztVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpqv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return null;
        }
        cpqw cpqwVar = this.b;
        fbzt fbztVar = this.c;
        this.a = 1;
        if (cpqwVar.b.b(fbztVar, this) == ffhhVar) {
            return ffhhVar;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cpqv(this.b, this.c, ffguVar);
    }
}
