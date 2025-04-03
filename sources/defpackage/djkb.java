package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djkb extends djkc {
    final /* synthetic */ djkd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djkb(djkd djkdVar) {
        super(djkdVar);
        this.a = djkdVar;
    }

    @Override // defpackage.djkc
    protected final void a() {
        this.a.d();
        this.a.b(true);
    }

    @Override // defpackage.djkc
    protected final void b() {
        this.a.d();
        this.a.b(false);
    }
}
