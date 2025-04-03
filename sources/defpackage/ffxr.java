package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffxr extends fgea {
    private final ffxg d;
    private final ffqk e;

    public ffxr(ffxg ffxgVar, ffhd ffhdVar, int i, int i2) {
        super(ffhdVar, i, i2);
        this.d = ffxgVar;
        this.e = new ffqk(false, ffqo.a);
    }

    private final void g() {
        if (ffqk.a.getAndSet(this.e, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    @Override // defpackage.fgea, defpackage.ffxx
    public final Object a(ffxy ffxyVar, ffgu ffguVar) {
        if (this.b == -3) {
            g();
            Object a = ffyi.a(ffxyVar, this.d, true, ffguVar);
            if (a == ffhh.a) {
                return a;
            }
        } else {
            Object h = fgea.h(this, ffxyVar, ffguVar);
            if (h == ffhh.a) {
                return h;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.fgea
    protected final Object b(ffxe ffxeVar, ffgu ffguVar) {
        Object a = ffyi.a(new fgfm(ffxeVar), this.d, true, ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    @Override // defpackage.fgea
    protected final fgea c(ffhd ffhdVar, int i, int i2) {
        return new ffxr(this.d, ffhdVar, i, i2);
    }

    @Override // defpackage.fgea
    protected final String d() {
        ffxg ffxgVar = this.d;
        Objects.toString(ffxgVar);
        return "channel=".concat(ffxgVar.toString());
    }

    @Override // defpackage.fgea
    public final ffxg e(ffsk ffskVar) {
        g();
        return this.b == -3 ? this.d : super.e(ffskVar);
    }

    @Override // defpackage.fgea
    public final ffxx f() {
        return new ffxr(this.d);
    }

    public /* synthetic */ ffxr(ffxg ffxgVar) {
        this(ffxgVar, ffhe.a, -3, 1);
    }
}
