package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gne extends ffkk implements ffji {
    final /* synthetic */ gnn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gne(gnn gnnVar) {
        super(1);
        this.a = gnnVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        float e = ffmk.e(((Number) obj).floatValue(), ((Number) this.a.i.c()).floatValue(), ((Number) this.a.i.b()).floatValue());
        if (e == this.a.d()) {
            z = false;
        } else {
            if (e != this.a.d()) {
                gnn gnnVar = this.a;
                ffji ffjiVar = gnnVar.b;
                if (ffjiVar != null) {
                    ffjiVar.invoke(Float.valueOf(e));
                } else {
                    gnnVar.k(e);
                }
            }
            ffix ffixVar = this.a.a;
            if (ffixVar != null) {
                ffixVar.invoke();
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
