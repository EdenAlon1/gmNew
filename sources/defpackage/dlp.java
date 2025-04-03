package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dlq b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlp(dlq dlqVar, long j, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dlqVar;
        this.c = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dlq dlqVar = this.b;
            long e = kan.e(this.c, dlqVar.j() ? -1.0f : 1.0f);
            float b = dlqVar.b == dqs.a ? kan.b(e) : kan.a(e);
            dlq dlqVar2 = this.b;
            this.a = 1;
            if (dlqVar2.f(b, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dlp(this.b, this.c, ffguVar);
    }
}
