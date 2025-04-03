package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpr extends bel {
    public int a;
    private final String b;

    public bpr(bcq bcqVar) {
        super(bcqVar);
        this.b = "virtual-" + bcqVar.k() + "-" + UUID.randomUUID().toString();
    }

    @Override // defpackage.bel, defpackage.ati
    public final int b() {
        return c(0);
    }

    @Override // defpackage.bel, defpackage.ati
    public final int c(int i) {
        return bix.b(super.c(i) - this.a);
    }

    @Override // defpackage.bel, defpackage.bcq
    public final String k() {
        return this.b;
    }
}
