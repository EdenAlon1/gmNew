package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rgd implements rge {
    @Override // defpackage.rge
    public final qwv a(qwv qwvVar, qtu qtuVar) {
        byte[] bArr;
        ByteBuffer b = ((rfp) qwvVar.c()).b();
        int i = rjr.a;
        rjq rjqVar = null;
        if (!b.isReadOnly() && b.hasArray()) {
            rjqVar = new rjq(b.array(), b.arrayOffset(), b.limit());
        }
        if (rjqVar != null && rjqVar.a == 0 && rjqVar.b == rjqVar.c.length) {
            bArr = b.array();
        } else {
            ByteBuffer asReadOnlyBuffer = b.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer.limit()];
            rjr.b(asReadOnlyBuffer);
            asReadOnlyBuffer.get(bArr2);
            bArr = bArr2;
        }
        return new rey(bArr);
    }
}
