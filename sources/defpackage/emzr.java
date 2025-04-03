package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emzr extends encr {
    final /* synthetic */ emzs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emzr(emzs emzsVar, enbg enbgVar) {
        super(enbgVar);
        this.a = emzsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.encr
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        emzs emzsVar = this.a;
        enbg f = obj.f();
        if (f == emzsVar.a) {
            return null;
        }
        return f;
    }
}
