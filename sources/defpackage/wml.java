package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wml extends ffhv implements ffji {
    final /* synthetic */ eolu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wml(eolu eoluVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = eoluVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new wml(this.a, (ffgu) obj).b(ffcu.a);
    }
}
