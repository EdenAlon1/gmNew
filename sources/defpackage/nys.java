package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nys extends ffkk implements ffix {
    final /* synthetic */ nyy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nys(nyy nyyVar) {
        super(0);
        this.a = nyyVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        ffcf c = this.a.c();
        if (c != null) {
            return (String) c.b;
        }
        return null;
    }
}
