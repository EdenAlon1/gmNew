package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nzd extends ffkk implements ffji {
    final /* synthetic */ nyy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzd(nyy nyyVar) {
        super(1);
        this.a = nyyVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((String) obj).getClass();
        return Boolean.valueOf(!this.a.a().contains(r2));
    }
}
