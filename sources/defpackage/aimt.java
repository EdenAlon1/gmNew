package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aimt extends ffhv implements ffjm {
    final /* synthetic */ aimu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aimt(aimu aimuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aimuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aimt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((adtc) this.a.b.b()).h(ddxb.a(this.a.a));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aimt(this.a, ffguVar);
    }
}
