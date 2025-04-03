package defpackage;

import android.media.MediaCodec;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nqw extends nqv {
    private final npm n;
    private final int o;
    private final List p;
    private int q;

    public nqw(npm npmVar, int i, ntg ntgVar, npc npcVar) {
        super(2, ntgVar, npcVar);
        this.n = npmVar;
        this.o = i;
        this.p = new ArrayList();
        this.q = -1;
    }

    @Override // defpackage.mig, defpackage.mij
    public final String R() {
        return "ExoAssetLoaderVideoRenderer";
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        if (android.os.Build.MODEL.startsWith("SM-F936") != false) goto L35;
     */
    @Override // defpackage.nqv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void W(defpackage.lqc r12) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nqw.W(lqc):void");
    }

    @Override // defpackage.nqv
    protected final boolean X() {
        if (this.l.g()) {
            this.k.f();
            this.m = true;
            return false;
        }
        MediaCodec.BufferInfo a = this.l.a();
        if (a != null) {
            long j = a.presentationTimeUs - this.j;
            if (j >= 0) {
                long j2 = a.presentationTimeUs;
                int size = this.p.size();
                for (int i = 0; i < size; i++) {
                    if (((Long) this.p.get(i)).longValue() == j2) {
                        this.p.remove(i);
                    }
                }
                if (((nsh) this.k).a.a() != this.q && ((nsh) this.k).a.i()) {
                    ((npw) this.l).l(true, j);
                    return true;
                }
            }
            this.l.i();
            return true;
        }
        return false;
    }

    @Override // defpackage.nqv
    protected final boolean Y(lxz lxzVar) {
        if (lxzVar.eR()) {
            return false;
        }
        lti.f(lxzVar.d);
        if (this.l != null) {
            return false;
        }
        lxzVar.f -= this.j;
        return false;
    }

    @Override // defpackage.nqv
    protected final lqc Z(lqc lqcVar) {
        if (this.o != 3 || !lpo.i(lqcVar.C)) {
            return lqcVar;
        }
        lqb lqbVar = new lqb(lqcVar);
        lqbVar.A = lpo.a;
        return new lqc(lqbVar);
    }

    @Override // defpackage.nqv
    protected final lqc aa(lqc lqcVar) {
        lpo c = ntl.c(ntl.d(lqcVar.C), this.o == 1);
        lqb lqbVar = new lqb(lqcVar);
        lqbVar.A = c;
        return new lqc(lqbVar);
    }

    @Override // defpackage.nqv
    protected final void ab(lxz lxzVar) {
        long j = lxzVar.f;
        if (j < this.f) {
            this.p.add(Long.valueOf(j));
        }
    }
}
