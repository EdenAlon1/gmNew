package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feum extends fekk {
    final /* synthetic */ fevq a;
    final /* synthetic */ feuo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feum(feuo feuoVar, fevq fevqVar) {
        super(feuoVar.a);
        this.a = fevqVar;
        this.b = feuoVar;
    }

    @Override // defpackage.fekk
    public final void a() {
        try {
            int i = ffbo.a;
            this.b.c().d(this.a);
        } catch (Throwable th) {
            this.b.f(th);
            throw th;
        }
    }
}
