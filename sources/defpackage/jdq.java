package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jdq extends ffkk implements ffjm {
    final /* synthetic */ iwx a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ int c;
    final /* synthetic */ jci d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdq(iwx iwxVar, jci jciVar, ffjm ffjmVar, int i) {
        super(2);
        this.a = iwxVar;
        this.d = jciVar;
        this.b = ffjmVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.c | 1);
        jdr.a(this.a, this.d, this.b, (hfd) obj, a);
        return ffcu.a;
    }
}
