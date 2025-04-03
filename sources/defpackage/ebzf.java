package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebzf implements erqj {
    final /* synthetic */ ebzg a;
    private final String b;

    public ebzf(ebzg ebzgVar) {
        this.a = ebzgVar;
        this.b = ebwo.a(ebzgVar.d);
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ebzg ebzgVar = this.a;
        ebzgVar.b.d(this.b, "OK", ebzgVar.c);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        String str = this.b;
        String a = eboa.a(th);
        ebzg ebzgVar = this.a;
        ebzgVar.b.d(str, a, ebzgVar.c);
    }
}
