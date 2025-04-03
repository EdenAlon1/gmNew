package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fsp extends ffkk implements ffjm {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsp(float f, float f2, ffjm ffjmVar, int i) {
        super(2);
        this.a = f;
        this.b = f2;
        this.c = ffjmVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.d | 1);
        fsx.a(this.a, this.b, this.c, (hfd) obj, a);
        return ffcu.a;
    }
}
