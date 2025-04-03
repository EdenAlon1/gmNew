package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fhl extends ffkk implements ffjm {
    final /* synthetic */ boolean a;
    final /* synthetic */ jyi b;
    final /* synthetic */ fhi c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhl(boolean z, jyi jyiVar, fhi fhiVar, int i) {
        super(2);
        this.a = z;
        this.b = jyiVar;
        this.c = fhiVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.d | 1);
        fhm.a(this.a, this.b, this.c, (hfd) obj, a);
        return ffcu.a;
    }
}
