package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class daui implements dauu {
    final /* synthetic */ String a;
    final /* synthetic */ dauv b;

    public daui(dauv dauvVar, String str) {
        this.a = str;
        this.b = dauvVar;
    }

    @Override // defpackage.dauu
    public final void a() {
        this.b.v("No pending verification. Skipped.".concat(String.valueOf(this.a)));
    }

    @Override // defpackage.dauu
    public final void b() {
        this.b.v("Successfully verified: ".concat(String.valueOf(this.a)));
    }
}
