package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zvx extends ffhv implements ffjm {
    final /* synthetic */ zvz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvx(zvz zvzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = zvzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zvx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        zvz zvzVar = this.a;
        boolean z = false;
        if (zvzVar.b.isDefaultNetworkActive() && this.a.b.getActiveNetwork() != null) {
            z = true;
        }
        zvzVar.d.set(z);
        zvz zvzVar2 = this.a;
        zvzVar2.b.registerDefaultNetworkCallback(zvzVar2.e, zvzVar2.c);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zvx(this.a, ffguVar);
    }
}
