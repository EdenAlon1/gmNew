package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nyu extends ffkk implements ffix {
    final /* synthetic */ nyy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyu(nyy nyyVar) {
        super(0);
        this.a = nyyVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str = this.a.c;
        boolean z = false;
        if (str != null && nyy.b.d(str)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
