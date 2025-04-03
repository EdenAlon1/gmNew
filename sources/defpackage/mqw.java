package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mqw extends lxz {
    public long h;
    public int i;
    private int j;

    public mqw() {
        super(2);
        this.j = 32;
    }

    @Override // defpackage.lxz, defpackage.lxs
    public final void eO() {
        super.eO();
        this.i = 0;
    }

    public final void k(int i) {
        lti.a(true);
        this.j = i;
    }

    public final boolean l(lxz lxzVar) {
        ByteBuffer byteBuffer;
        lti.a(!lxzVar.j());
        lti.a(!lxzVar.d());
        lti.a(!lxzVar.eR());
        if (m()) {
            if (this.i >= this.j) {
                return false;
            }
            ByteBuffer byteBuffer2 = lxzVar.d;
            if (byteBuffer2 != null && (byteBuffer = this.d) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i = this.i;
        this.i = i + 1;
        if (i == 0) {
            this.f = lxzVar.f;
            if (lxzVar.f()) {
                this.a = 1;
            }
        }
        ByteBuffer byteBuffer3 = lxzVar.d;
        if (byteBuffer3 != null) {
            h(byteBuffer3.remaining());
            this.d.put(byteBuffer3);
        }
        this.h = lxzVar.f;
        return true;
    }

    public final boolean m() {
        return this.i > 0;
    }
}
