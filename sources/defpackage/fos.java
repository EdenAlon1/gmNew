package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fos extends ffkk implements ffjm {
    final /* synthetic */ fow a;
    final /* synthetic */ boolean b;
    final /* synthetic */ idh c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;
    final /* synthetic */ int f;
    final /* synthetic */ dwn g;
    final /* synthetic */ fjj h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fos(fow fowVar, boolean z, dwn dwnVar, fjj fjjVar, idh idhVar, float f, float f2, int i) {
        super(2);
        this.a = fowVar;
        this.b = z;
        this.g = dwnVar;
        this.h = fjjVar;
        this.c = idhVar;
        this.d = f;
        this.e = f2;
        this.f = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.a.a(this.b, this.g, this.h, this.c, this.d, this.e, (hfd) obj, hip.a(this.f | 1));
        return ffcu.a;
    }
}
