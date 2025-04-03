package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ftu extends ffkk implements ffji {
    final /* synthetic */ ffix a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftu(ffix ffixVar) {
        super(1);
        this.a = ffixVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((idd) obj).a(((Number) this.a.invoke()).floatValue());
        return ffcu.a;
    }
}
