package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ayew extends ffhv implements ffji {
    int a;
    final /* synthetic */ ayex b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayew(ayex ayexVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = ayexVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ayex ayexVar = this.b;
            ayev ayevVar = new ayev(ayexVar, null);
            this.a = 1;
            if (ffra.a(ayexVar.b, ayevVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ayew(this.b, (ffgu) obj).b(ffcu.a);
    }
}
