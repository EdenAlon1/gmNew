package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class njv extends lyc implements njx {
    protected njv() {
        super(new nkc[2], new nkd[2]);
        lti.c(this.b == this.a.length);
        for (lxz lxzVar : this.a) {
            lxzVar.h(1024);
        }
    }

    @Override // defpackage.lyc
    protected final /* synthetic */ lxx g(Throwable th) {
        return new njy(th);
    }

    @Override // defpackage.lyc
    protected final /* bridge */ /* synthetic */ lxx h(lxz lxzVar, lya lyaVar, boolean z) {
        nkc nkcVar = (nkc) lxzVar;
        nkd nkdVar = (nkd) lyaVar;
        try {
            ByteBuffer byteBuffer = nkcVar.d;
            lti.f(byteBuffer);
            nkdVar.i(nkcVar.f, p(byteBuffer.array(), byteBuffer.limit(), z), nkcVar.h);
            nkdVar.d = false;
            return null;
        } catch (njy e) {
            return e;
        }
    }

    @Override // defpackage.lyc
    protected final /* synthetic */ lxz i() {
        return new nkc();
    }

    @Override // defpackage.lyc
    protected final /* synthetic */ lya k() {
        return new nju(this);
    }

    protected abstract njw p(byte[] bArr, int i, boolean z);

    @Override // defpackage.njx
    public final void q(long j) {
    }
}
