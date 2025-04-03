package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ojb extends ffhv implements ffji {
    final /* synthetic */ ffix a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojb(ffix ffixVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = ffixVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.invoke();
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ojb(this.a, (ffgu) obj).b(ffcu.a);
    }
}
