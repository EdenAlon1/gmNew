package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zza extends ffhv implements ffjm {
    final /* synthetic */ zzb a;
    final /* synthetic */ alxr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(zzb zzbVar, alxr alxrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = zzbVar;
        this.b = alxrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zza) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.b.P(this.b.b(), 3);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zza(this.a, this.b, ffguVar);
    }
}
