package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctqv extends ffhv implements ffjm {
    final /* synthetic */ blra a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctqv(ffgu ffguVar, blra blraVar) {
        super(2, ffguVar);
        this.a = blraVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctqv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(this.a.b().i() > 0);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctqv ctqvVar = new ctqv(ffguVar, this.a);
        ctqvVar.b = obj;
        return ctqvVar;
    }
}
