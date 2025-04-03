package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rjj implements qtp {
    public static final /* synthetic */ int b = 0;
    private final int c;
    private final qtp d;

    public rjj(int i, qtp qtpVar) {
        this.c = i;
        this.d = qtpVar;
    }

    @Override // defpackage.qtp
    public final void a(MessageDigest messageDigest) {
        this.d.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.c).array());
    }

    @Override // defpackage.qtp
    public final boolean equals(Object obj) {
        if (obj instanceof rjj) {
            rjj rjjVar = (rjj) obj;
            if (this.c == rjjVar.c && this.d.equals(rjjVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qtp
    public final int hashCode() {
        return rkh.f(this.d, this.c);
    }
}
