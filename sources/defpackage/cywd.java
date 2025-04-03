package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cywd extends ffhv implements ffjm {
    final /* synthetic */ czaj a;
    final /* synthetic */ hho b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cywd(czaj czajVar, hho hhoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = czajVar;
        this.b = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cywd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.b.b(Boolean.valueOf(this.a == czaj.c));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cywd(this.a, this.b, ffguVar);
    }
}
