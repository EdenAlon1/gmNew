package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class elh extends ffkk implements ffji {
    final /* synthetic */ eli a;
    final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elh(eli eliVar, Object obj) {
        super(1);
        this.a = eliVar;
        this.b = obj;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.a.b(this.b);
        return new elg(this.a, this.b);
    }
}
