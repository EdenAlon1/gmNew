package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class denp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ deny b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public denp(deny denyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = denyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((denp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            deny denyVar = this.b;
            fgdj a = denyVar.b.a();
            deno denoVar = new deno(denyVar);
            this.a = 1;
            if (a.a(denoVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        throw new ffbx();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new denp(this.b, ffguVar);
    }
}
