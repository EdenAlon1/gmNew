package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gis extends ffkk implements ffjm {
    final /* synthetic */ ffix a;
    final /* synthetic */ gio b;
    final /* synthetic */ cxj c;
    final /* synthetic */ ffjm d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gis(ffix ffixVar, gio gioVar, cxj cxjVar, ffjm ffjmVar, int i) {
        super(2);
        this.a = ffixVar;
        this.b = gioVar;
        this.c = cxjVar;
        this.d = ffjmVar;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        giw.a(this.a, this.b, this.c, this.d, (hfd) obj, hip.a(this.e | 1));
        return ffcu.a;
    }
}
