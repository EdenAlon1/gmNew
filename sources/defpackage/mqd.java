package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mqd extends lyc implements mqf {
    public mqd() {
        super(new lxz[1], new mqi[1]);
    }

    @Override // defpackage.lyc, defpackage.lxw
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }

    @Override // defpackage.lyc, defpackage.lxw
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        throw null;
    }

    @Override // defpackage.lyc
    protected final /* synthetic */ lxx g(Throwable th) {
        return new mqg("Unexpected decode error", th);
    }

    @Override // defpackage.lyc
    protected final /* bridge */ /* synthetic */ lxx h(lxz lxzVar, lya lyaVar, boolean z) {
        mqi mqiVar = (mqi) lyaVar;
        try {
            ByteBuffer byteBuffer = lxzVar.d;
            lti.f(byteBuffer);
            lti.c(byteBuffer.hasArray());
            lti.a(byteBuffer.arrayOffset() == 0);
            byte[] array = byteBuffer.array();
            int remaining = byteBuffer.remaining();
            try {
                mqiVar.f = lwi.a(array, remaining, null, -1);
                mqiVar.b = lxzVar.f;
                return null;
            } catch (lrg e) {
                throw new mqg("Could not decode image data with BitmapFactory. (data.length = " + array.length + ", input length = " + remaining + ")", e);
            } catch (IOException e2) {
                throw new mqg(e2);
            }
        } catch (mqg e3) {
            return e3;
        }
    }

    @Override // defpackage.lyc
    protected final lxz i() {
        return new lxz(1);
    }

    @Override // defpackage.lyc
    protected final /* synthetic */ lya k() {
        return new mqb(this);
    }

    @Override // defpackage.mqf
    public final /* bridge */ /* synthetic */ mqi p() {
        return (mqi) super.b();
    }
}
