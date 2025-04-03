package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aazo extends ffhv implements ffji {
    final /* synthetic */ abac a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aazo(abac abacVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = abacVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        yqv d = this.a.d();
        if (d != null) {
            d.a(3);
        }
        return true;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new aazo(this.a, (ffgu) obj).b(ffcu.a);
    }
}
