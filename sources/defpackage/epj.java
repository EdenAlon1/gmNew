package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class epj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ epm b;
    final /* synthetic */ ffix c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epj(epm epmVar, ffix ffixVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = epmVar;
        this.c = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((epj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            epm epmVar = this.b;
            ffix ffixVar = this.c;
            this.a = 1;
            if (jhy.a(epmVar, ffixVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new epj(this.b, this.c, ffguVar);
    }
}
