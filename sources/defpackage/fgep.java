package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgep extends fgea {
    private final Iterable d;

    public fgep(Iterable iterable, ffhd ffhdVar, int i, int i2) {
        super(ffhdVar, i, i2);
        this.d = iterable;
    }

    @Override // defpackage.fgea
    protected final Object b(ffxe ffxeVar, ffgu ffguVar) {
        fgfm fgfmVar = new fgfm(ffxeVar);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ffqy.d(ffxeVar, null, null, new fgeo((ffxx) it.next(), fgfmVar, null), 3);
        }
        return ffcu.a;
    }

    @Override // defpackage.fgea
    protected final fgea c(ffhd ffhdVar, int i, int i2) {
        return new fgep(this.d, ffhdVar, i, i2);
    }

    @Override // defpackage.fgea
    public final ffxg e(ffsk ffskVar) {
        return ffxd.a(ffskVar, this.a, this.b, new fgdz(this, null));
    }

    public /* synthetic */ fgep(Iterable iterable) {
        this(iterable, ffhe.a, -2, 1);
    }
}
