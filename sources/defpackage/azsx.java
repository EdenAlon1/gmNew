package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azsx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aztd b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azsx(aztd aztdVar, long j, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aztdVar;
        this.c = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azsx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            this.a = 1;
            if (ffcu.a == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new azsx(this.b, this.c, ffguVar);
    }
}
