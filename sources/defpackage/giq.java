package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class giq extends ffkk implements ffji {
    final /* synthetic */ ggx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public giq(ggx ggxVar) {
        super(1);
        this.a = ggxVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.show();
        return new gip(this.a);
    }
}
