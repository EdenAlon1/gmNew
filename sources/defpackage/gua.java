package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gua extends ffkk implements ffjm {
    final /* synthetic */ gul a;
    final /* synthetic */ grs b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gua(gul gulVar, grs grsVar, int i) {
        super(2);
        this.a = gulVar;
        this.b = grsVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        gul gulVar = this.a;
        int i = this.c;
        guj.s(gulVar, this.b, (hfd) obj, hip.a(i | 1));
        return ffcu.a;
    }
}
