package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enbc extends encr {
    final /* synthetic */ enbd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enbc(enbd enbdVar, enbg enbgVar) {
        super(enbgVar);
        this.a = enbdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.encr
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        enbd enbdVar = this.a;
        enbg g = obj.g();
        if (g == enbdVar.a) {
            return null;
        }
        return g;
    }
}
