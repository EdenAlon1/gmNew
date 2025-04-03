package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ntt extends nsc {
    public final ntr e;
    public volatile long f;
    private final nts g;
    private final lxz h;
    private long i;
    private boolean j;

    public ntt(Context context, lqc lqcVar, nsl nslVar, lse lseVar, List list, lsg lsgVar, npn npnVar, nrx nrxVar, lts ltsVar, nrj nrjVar, lpr lprVar, boolean z) {
        super(lqcVar, nrxVar);
        this.f = -9223372036854775807L;
        this.i = -9223372036854775807L;
        lpo lpoVar = lqcVar.C;
        lti.f(lpoVar);
        lpo lpoVar2 = lpoVar.e == 2 ? Objects.equals(lqcVar.o, "image/jpeg_r") ? new lpo(6, 1, 7, null, -1, -1) : lpo.a : lpoVar;
        lqb lqbVar = new lqb(lqcVar);
        lqbVar.A = lpoVar2;
        ntr ntrVar = new ntr(npnVar, new lqc(lqbVar), nrxVar.b(2), nslVar, nrjVar);
        this.e = ntrVar;
        this.h = new lxz(0);
        if (ntrVar.g == 2 && lpo.i(lpoVar)) {
            lpoVar2 = lpo.a;
        }
        try {
            nts ntsVar = new nts(this, context, z ? new nth(lsgVar) : new ntj(lsgVar), lpoVar2, ltsVar, lprVar, lseVar, list);
            this.g = ntsVar;
            ntsVar.f();
        } catch (lsf e) {
            throw new nrd("Video frame processing error", e, 5001);
        }
    }

    @Override // defpackage.nsc
    public final void d() {
        this.g.g();
        ntr ntrVar = this.e;
        if (ntrVar.i != null) {
            ntrVar.i.f();
        }
        ntrVar.k = true;
    }

    @Override // defpackage.nsc
    protected final lqc p() {
        ntr ntrVar = this.e;
        if (ntrVar.i == null) {
            return null;
        }
        lqc b = ntrVar.i.b();
        if (b == null || ntrVar.j == 0) {
            return b;
        }
        lqb lqbVar = new lqb(b);
        lqbVar.w = ntrVar.j;
        return new lqc(lqbVar);
    }

    @Override // defpackage.nsc
    protected final lxz q() {
        ntr ntrVar = this.e;
        ByteBuffer d = ntrVar.i != null ? ntrVar.i.d() : null;
        lxz lxzVar = this.h;
        lxzVar.d = d;
        if (lxzVar.d == null) {
            return null;
        }
        ntr ntrVar2 = this.e;
        MediaCodec.BufferInfo a = ntrVar2.i != null ? ntrVar2.i.a() : null;
        lti.f(a);
        if (a.presentationTimeUs == 0 && this.g.i() == this.j && this.f != -9223372036854775807L && a.size > 0) {
            a.presentationTimeUs = this.f;
        }
        this.h.f = a.presentationTimeUs;
        this.h.a = a.flags;
        this.i = a.presentationTimeUs;
        return this.h;
    }

    @Override // defpackage.nsc
    public final nrl r(nql nqlVar, lqc lqcVar, int i) {
        try {
            return this.g.c(i);
        } catch (lsf e) {
            throw new nrd("Video frame processing error", e, 5001);
        }
    }

    @Override // defpackage.nsc
    protected final void s() {
        if (this.i == 0) {
            this.j = true;
        }
        ntr ntrVar = this.e;
        if (ntrVar.i != null) {
            ntrVar.i.i();
        }
        boolean z = this.g.a;
    }

    @Override // defpackage.nsc
    protected final boolean t() {
        ntr ntrVar = this.e;
        if (ntrVar.i != null && ntrVar.i.g()) {
            return true;
        }
        boolean z = this.g.a;
        return false;
    }
}
