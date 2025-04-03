package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlky {
    public static final dlkz a(eyee eyeeVar) {
        int i = eodh.a;
        byte[] bArr = new byte[16];
        eodf.a.a(eyeeVar.o()).h(bArr);
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        return new dlkz(order.getInt(), order.getInt(), order.getInt(), order.getInt());
    }
}
