package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffuf extends ffuq implements ffud {
    private final boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffuf(ffud ffudVar) {
        super(true);
        ffuq e;
        boolean z = true;
        M(ffudVar);
        ffrm I = I();
        ffrn ffrnVar = I instanceof ffrn ? (ffrn) I : null;
        if (ffrnVar != null && (e = ffrnVar.e()) != null) {
            while (!e.hM()) {
                ffrm I2 = e.I();
                ffrn ffrnVar2 = I2 instanceof ffrn ? (ffrn) I2 : null;
                if (ffrnVar2 != null && (e = ffrnVar2.e()) != null) {
                }
            }
            this.a = z;
        }
        z = false;
        this.a = z;
    }

    @Override // defpackage.ffuq
    public final boolean hM() {
        return this.a;
    }

    @Override // defpackage.ffuq
    public final boolean ia() {
        return true;
    }
}
