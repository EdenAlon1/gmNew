package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oco {
    public final mr a;
    public final mw b;
    public final ffhd c;
    public int e;
    public final ojv g;
    public final AtomicInteger h;
    public final ffxx i;
    public final ffxx j;
    public final AtomicReference k;
    public final CopyOnWriteArrayList l;
    public final ffji m;
    public final ffbz n;
    public final ocf o;
    private final ffhd p;
    public final fgcm d = fgdm.a(false);
    public final AtomicReference f = new AtomicReference(null);

    public oco(mr mrVar, mw mwVar, ffhd ffhdVar, ffhd ffhdVar2) {
        this.a = mrVar;
        this.b = mwVar;
        this.p = ffhdVar;
        this.c = ffhdVar2;
        ock ockVar = new ock(this, ffhdVar);
        this.g = ockVar;
        this.h = new AtomicInteger(0);
        fgcp fgcpVar = new fgcp(new ocn(ffxz.a(new fgbq(ockVar.j), -1), null, this));
        ffsd ffsdVar = fftc.a;
        this.i = ffyo.b(fgcpVar, fghh.a);
        this.j = new fgcn(ockVar.k);
        this.k = new AtomicReference(null);
        this.l = new CopyOnWriteArrayList();
        this.m = new ocg(this);
        this.n = ffca.a(oce.a);
        this.o = new ocf(this);
    }
}
