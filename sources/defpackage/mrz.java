package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mrz extends mea implements Handler.Callback {
    private final mry j;
    private final Handler k;
    private final nfi l;
    private nfh m;
    private boolean n;
    private boolean o;
    private long p;
    private lrb q;
    private long r;
    private final mgi s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mrz(mgi mgiVar, Looper looper) {
        super(5);
        Handler handler;
        mry mryVar = mry.a;
        lti.f(mgiVar);
        this.s = mgiVar;
        if (looper == null) {
            handler = null;
        } else {
            int i = lvf.a;
            handler = new Handler(looper, this);
        }
        this.k = handler;
        this.j = mryVar;
        this.l = new nfi();
        this.r = -9223372036854775807L;
    }

    private final long W(long j) {
        lti.c(j != -9223372036854775807L);
        lti.c(this.r != -9223372036854775807L);
        return j - this.r;
    }

    private final void X(lrb lrbVar, List list) {
        for (int i = 0; i < lrbVar.a(); i++) {
            lqc a = lrbVar.b(i).a();
            if (a == null || !this.j.b(a)) {
                list.add(lrbVar.b(i));
            } else {
                nfh a2 = this.j.a(a);
                byte[] c = lrbVar.b(i).c();
                lti.f(c);
                this.l.eO();
                this.l.h(c.length);
                ByteBuffer byteBuffer = this.l.d;
                int i2 = lvf.a;
                byteBuffer.put(c);
                this.l.i();
                lrb a3 = a2.a(this.l);
                if (a3 != null) {
                    X(a3, list);
                }
            }
        }
    }

    private final void Y(final lrb lrbVar) {
        final mgi mgiVar = this.s;
        mgl mglVar = mgiVar.a;
        lqy lqyVar = new lqy(mglVar.z);
        for (int i = 0; i < lrbVar.a(); i++) {
            lrbVar.b(i).b(lqyVar);
        }
        mglVar.z = new lqz(lqyVar);
        mgl mglVar2 = mgiVar.a;
        lqz ai = mglVar2.ai();
        if (!ai.equals(mglVar2.s)) {
            mgl mglVar3 = mgiVar.a;
            mglVar3.s = ai;
            mglVar3.h.d(14, new lud() { // from class: mgc
                @Override // defpackage.lud
                public final void a(Object obj) {
                    ((lrm) obj).j(mgi.this.a.s);
                }
            });
        }
        mgl mglVar4 = mgiVar.a;
        mglVar4.h.d(28, new lud() { // from class: mgd
            @Override // defpackage.lud
            public final void a(Object obj) {
                int i2 = mgi.b;
                ((lrm) obj).k(lrb.this);
            }
        });
        mgiVar.a.h.c();
    }

    @Override // defpackage.mea
    protected final void B(lqc[] lqcVarArr, long j, long j2, mtl mtlVar) {
        this.m = this.j.a(lqcVarArr[0]);
        lrb lrbVar = this.q;
        if (lrbVar != null) {
            long j3 = this.r;
            long j4 = lrbVar.b;
            long j5 = (j3 + j4) - j2;
            if (j4 != j5) {
                lrbVar = new lrb(j5, lrbVar.a);
            }
            this.q = lrbVar;
        }
        this.r = j2;
    }

    @Override // defpackage.mig, defpackage.mij
    public final String R() {
        return "MetadataRenderer";
    }

    @Override // defpackage.mig
    public final void S(long j, long j2) {
        boolean z;
        do {
            z = false;
            if (!this.n && this.q == null) {
                this.l.eO();
                mgz j3 = j();
                int c = c(j3, this.l, 0);
                if (c == -4) {
                    if (this.l.eR()) {
                        this.n = true;
                    } else {
                        nfi nfiVar = this.l;
                        if (nfiVar.f >= this.f) {
                            nfiVar.h = this.p;
                            nfiVar.i();
                            nfh nfhVar = this.m;
                            int i = lvf.a;
                            lrb a = nfhVar.a(this.l);
                            if (a != null) {
                                ArrayList arrayList = new ArrayList(a.a());
                                X(a, arrayList);
                                if (!arrayList.isEmpty()) {
                                    this.q = new lrb(W(this.l.f), (lra[]) arrayList.toArray(new lra[0]));
                                }
                            }
                        }
                    }
                } else if (c == -5) {
                    lqc lqcVar = j3.b;
                    lti.f(lqcVar);
                    this.p = lqcVar.t;
                }
            }
            lrb lrbVar = this.q;
            if (lrbVar != null) {
                if (lrbVar.b <= W(j)) {
                    lrb lrbVar2 = this.q;
                    Handler handler = this.k;
                    if (handler != null) {
                        handler.obtainMessage(1, lrbVar2).sendToTarget();
                    } else {
                        Y(lrbVar2);
                    }
                    this.q = null;
                    z = true;
                }
            }
            if (this.n && this.q == null) {
                this.o = true;
            }
        } while (z);
    }

    @Override // defpackage.mig
    public final boolean T() {
        return this.o;
    }

    @Override // defpackage.mig
    public final boolean U() {
        return true;
    }

    @Override // defpackage.mij
    public final int V(lqc lqcVar) {
        if (this.j.b(lqcVar)) {
            return mih.a(lqcVar.M == 0 ? 4 : 2);
        }
        return mih.a(0);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        Y((lrb) message.obj);
        return true;
    }

    @Override // defpackage.mea
    protected final void u() {
        this.q = null;
        this.m = null;
        this.r = -9223372036854775807L;
    }

    @Override // defpackage.mea
    protected final void w(long j, boolean z) {
        this.q = null;
        this.n = false;
        this.o = false;
    }
}
