package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjpl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjpm b;
    final /* synthetic */ cjpf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjpl(cjpm cjpmVar, cjpf cjpfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cjpmVar;
        this.c = cjpfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjpl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cjpm cjpmVar = this.b;
        cjpf cjpfVar = this.c;
        this.a = 1;
        Object c = cjpmVar.c(cjpfVar, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjpl(this.b, this.c, ffguVar);
    }
}
