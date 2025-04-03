package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class msj extends mvq {
    private final long d;
    private final long f;
    private final boolean g;
    private final ArrayList h;
    private final lrt i;
    private msh j;
    private msi k;
    private long l;
    private long m;

    public msj(msg msgVar) {
        super(msgVar.a);
        this.d = msgVar.b;
        this.f = msgVar.c;
        this.g = msgVar.d;
        this.h = new ArrayList();
        this.i = new lrt();
    }

    private final void E(lru lruVar) {
        long j;
        lruVar.p(0, this.i);
        long j2 = this.i.p;
        if (this.j == null || this.h.isEmpty()) {
            j = this.d;
            long j3 = this.f;
            this.l = j2 + j;
            this.m = j3 != Long.MIN_VALUE ? j2 + j3 : Long.MIN_VALUE;
            int size = this.h.size();
            for (int i = 0; i < size; i++) {
                ((msf) this.h.get(i)).m(this.l, this.m);
            }
            r6 = j3;
        } else {
            j = this.l - j2;
            if (this.f != Long.MIN_VALUE) {
                r6 = this.m - j2;
            }
        }
        try {
            msh mshVar = new msh(lruVar, j, r6);
            this.j = mshVar;
            l(mshVar);
        } catch (msi e) {
            this.k = e;
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                ((msf) this.h.get(i2)).d = this.k;
            }
        }
    }

    @Override // defpackage.msn, defpackage.msa
    protected final void n() {
        super.n();
        this.k = null;
        this.j = null;
    }

    @Override // defpackage.msn, defpackage.mtn
    public final void t() {
        msi msiVar = this.k;
        if (msiVar != null) {
            throw msiVar;
        }
        super.t();
    }

    @Override // defpackage.mvq
    protected final void u(lru lruVar) {
        if (this.k != null) {
            return;
        }
        E(lruVar);
    }

    @Override // defpackage.mvq, defpackage.mtn
    public final void v(mtj mtjVar) {
        lti.c(this.h.remove(mtjVar));
        this.e.v(((msf) mtjVar).a);
        if (this.h.isEmpty()) {
            msh mshVar = this.j;
            lti.f(mshVar);
            E(mshVar.b);
        }
    }

    @Override // defpackage.mvq, defpackage.mtn
    public final mtj w(mtl mtlVar, mxt mxtVar, long j) {
        msf msfVar = new msf(this.e.w(mtlVar, mxtVar, j), this.g, this.l, this.m);
        this.h.add(msfVar);
        return msfVar;
    }
}
