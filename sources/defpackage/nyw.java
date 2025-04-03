package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nyw extends ffkk implements ffix {
    final /* synthetic */ nyy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyw(nyy nyyVar) {
        super(0);
        this.a = nyyVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str = this.a.f;
        if (str != null) {
            return new ffpa(str, null);
        }
        return null;
    }
}
