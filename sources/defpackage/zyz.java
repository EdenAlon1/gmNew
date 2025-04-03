package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zyz extends ffhv implements ffjm {
    final /* synthetic */ zzb a;
    final /* synthetic */ aqdr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyz(zzb zzbVar, aqdr aqdrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = zzbVar;
        this.b = aqdrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zyz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((aigz) this.a.i.b()).h(new aioh(this.b.a));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zyz(this.a, this.b, ffguVar);
    }
}
