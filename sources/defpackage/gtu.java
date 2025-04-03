package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gtu extends ffkk implements ffix {
    final /* synthetic */ int a;
    final /* synthetic */ gul b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtu(int i, gul gulVar) {
        super(0);
        this.a = i;
        this.b = gulVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        gul gulVar = this.b;
        int i = this.a;
        if (!guk.b(i, gulVar.f())) {
            this.b.j(i);
        }
        return ffcu.a;
    }
}
