package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zdz extends ffhv implements ffjm {
    final /* synthetic */ zea a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdz(zea zeaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = zeaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zdz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.b.b(new zdy());
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zdz(this.a, ffguVar);
    }
}
