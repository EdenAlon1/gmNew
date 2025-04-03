package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qid implements qih {
    private final qhw a;
    private final qhw b;

    public qid(qhw qhwVar, qhw qhwVar2) {
        this.a = qhwVar;
        this.b = qhwVar2;
    }

    @Override // defpackage.qih
    public final qer a() {
        return new qff(this.a.a(), this.b.a());
    }

    @Override // defpackage.qih
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.qih
    public final boolean c() {
        return this.a.c() && this.b.c();
    }
}
