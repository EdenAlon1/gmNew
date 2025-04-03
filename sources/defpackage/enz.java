package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class enz extends ffkk implements ffjn {
    final /* synthetic */ ejq a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enz(ejq ejqVar, long j, int i, int i2) {
        super(3);
        this.a = ejqVar;
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int i = intValue + this.c;
        int i2 = intValue2 + this.d;
        ejq ejqVar = this.a;
        long j = this.b;
        return ejqVar.ei(jzl.c(j, i), jzl.b(j, i2), ffem.a, (ffji) obj3);
    }
}
