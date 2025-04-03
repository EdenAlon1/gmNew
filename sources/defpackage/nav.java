package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nav extends mea {
    private final lxz j;
    private final luv k;
    private nau l;
    private long m;

    public nav() {
        super(6);
        this.j = new lxz(1);
        this.k = new luv();
    }

    private final void W() {
        nau nauVar = this.l;
        if (nauVar != null) {
            nauVar.b();
        }
    }

    @Override // defpackage.mig, defpackage.mij
    public final String R() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.mig
    public final void S(long j, long j2) {
        float[] fArr;
        while (!M() && this.m < 100000 + j) {
            this.j.eO();
            if (c(j(), this.j, 0) != -4) {
                return;
            }
            lxz lxzVar = this.j;
            if (lxzVar.eR()) {
                return;
            }
            long j3 = lxzVar.f;
            this.m = j3;
            long j4 = this.f;
            if (this.l != null && j3 >= j4) {
                lxzVar.i();
                ByteBuffer byteBuffer = this.j.d;
                int i = lvf.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    this.k.I(byteBuffer.array(), byteBuffer.limit());
                    this.k.K(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr2[i2] = Float.intBitsToFloat(this.k.f());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.l.a(this.m - this.e, fArr);
                }
            }
        }
    }

    @Override // defpackage.mig
    public final boolean T() {
        return M();
    }

    @Override // defpackage.mig
    public final boolean U() {
        return true;
    }

    @Override // defpackage.mij
    public final int V(lqc lqcVar) {
        return mih.a(true != "application/x-camera-motion".equals(lqcVar.o) ? 0 : 4);
    }

    @Override // defpackage.mea, defpackage.mic
    public final void r(int i, Object obj) {
        if (i == 8) {
            this.l = (nau) obj;
        }
    }

    @Override // defpackage.mea
    protected final void u() {
        W();
    }

    @Override // defpackage.mea
    protected final void w(long j, boolean z) {
        this.m = Long.MIN_VALUE;
        W();
    }
}
