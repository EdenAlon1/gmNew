package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ftq extends ffkk implements ffji {
    final /* synthetic */ gvo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftq(gvo gvoVar) {
        super(1);
        this.a = gvoVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        gvr b = this.a.b();
        b.e(b.c() + floatValue);
        return ffcu.a;
    }
}
