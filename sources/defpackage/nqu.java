package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nqu extends nqv {
    private final npm n;
    private boolean o;

    public nqu(npm npmVar, ntg ntgVar, npc npcVar) {
        super(1, ntgVar, npcVar);
        this.n = npmVar;
    }

    @Override // defpackage.mig, defpackage.mij
    public final String R() {
        return "ExoAssetLoaderAudioRenderer";
    }

    @Override // defpackage.nqv
    protected final void W(lqc lqcVar) {
        npm npmVar = this.n;
        npk npkVar = (npk) npmVar;
        npw a = ((npy) npkVar.a).a(lum.b(lqcVar), lqcVar, null, false);
        npkVar.b = a.c();
        this.l = a;
    }

    @Override // defpackage.nqv
    protected final boolean X() {
        lxz c = this.k.c();
        if (c != null) {
            if (!this.o) {
                if (this.l.g()) {
                    ByteBuffer byteBuffer = c.d;
                    lti.f(byteBuffer);
                    byteBuffer.limit(0);
                    c.eP(4);
                    this.k.j();
                    this.m = true;
                    return false;
                }
                ByteBuffer d = this.l.d();
                if (d != null) {
                    c.h(d.limit());
                    c.d.put(d).flip();
                    MediaCodec.BufferInfo a = this.l.a();
                    lti.f(a);
                    c.f = a.presentationTimeUs;
                    c.a = a.flags;
                    this.l.i();
                    this.o = true;
                }
            }
            this.k.j();
            this.o = false;
            return true;
        }
        return false;
    }

    @Override // defpackage.nqv
    protected final boolean Y(lxz lxzVar) {
        if (lxzVar.eR()) {
            return false;
        }
        long j = lxzVar.f - this.j;
        lxzVar.f = j;
        if (this.l == null || j >= 0) {
            return false;
        }
        lxzVar.eO();
        return true;
    }
}
