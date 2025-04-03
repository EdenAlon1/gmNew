package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiwh extends fizg {
    private static final long serialVersionUID = -2172609200849142323L;
    private int a;

    private static final byte[] f(int i) {
        return new byte[]{(byte) (i >> 24), (byte) ((i >>> 16) & PrivateKeyType.INVALID), (byte) ((i >>> 8) & PrivateKeyType.INVALID), (byte) (i & PrivateKeyType.INVALID)};
    }

    @Override // defpackage.fizg
    public final String a() {
        return fiwi.c(f(this.a));
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fiwh();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        byte[] i = fixbVar.i(4);
        this.a = (i[3] & 255) | ((i[0] & 255) << 24) | ((i[1] & 255) << 16) | ((i[2] & 255) << 8);
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        fixdVar.f(this.a & 4294967295L);
    }

    public final InetAddress e() {
        try {
            fiyt fiytVar = this.f;
            return fiytVar == null ? InetAddress.getByAddress(f(this.a)) : InetAddress.getByAddress(fiytVar.toString(), f(this.a));
        } catch (UnknownHostException unused) {
            return null;
        }
    }
}
