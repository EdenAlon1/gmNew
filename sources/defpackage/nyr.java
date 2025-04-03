package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nyr extends ffkk implements ffix {
    final /* synthetic */ nyy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyr(nyy nyyVar) {
        super(0);
        this.a = nyyVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str = (String) this.a.h.a();
        if (str != null) {
            return new ffpa(str, null);
        }
        return null;
    }
}
