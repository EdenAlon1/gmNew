package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kcv extends ffkk implements ffjm {
    final /* synthetic */ ffix a;
    final /* synthetic */ keh b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcv(ffix ffixVar, keh kehVar, ffjm ffjmVar, int i, int i2) {
        super(2);
        this.a = ffixVar;
        this.b = kehVar;
        this.c = ffjmVar;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        kdc.a(this.a, this.b, this.c, (hfd) obj, hip.a(this.d | 1), this.e);
        return ffcu.a;
    }
}
