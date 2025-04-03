package defpackage;

import java.math.BigInteger;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class depu {
    public static void a(ByteBuffer byteBuffer, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length <= 0 || byteArray[0] != 0) {
            byteBuffer.put(byteArray);
        } else {
            byteBuffer.put(byteArray, 1, length - 1);
        }
    }
}
