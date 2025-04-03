package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gon extends ffkk implements ffjn {
    final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gon(String str) {
        super(3);
        this.a = str;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            grl.b(this.a, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar, 0, 0, 131070);
        }
        return ffcu.a;
    }
}
