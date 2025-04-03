package com.google.android.libraries.abuse.hades.tartarus.core;

import com.google.android.apps.common.proguard.UsedByNative;
import defpackage.dlgk;
import defpackage.dlkr;
import defpackage.euzb;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class TartarusKt {
    public static final dlkr a(euzb euzbVar) {
        if (euzbVar.b.isDirect() && euzbVar.b.isReadOnly()) {
            ByteBuffer byteBuffer = euzbVar.b;
            byteBuffer.getClass();
            return new dlkr(byteBuffer, euzbVar.a);
        }
        ByteBuffer byteBuffer2 = euzbVar.b;
        byteBuffer2.getClass();
        if (!byteBuffer2.isDirect() || !byteBuffer2.isReadOnly()) {
            byteBuffer2.mark();
            ByteBuffer asReadOnlyBuffer = ByteBuffer.allocateDirect(byteBuffer2.remaining()).put(byteBuffer2).asReadOnlyBuffer();
            byteBuffer2.reset();
            asReadOnlyBuffer.flip();
            asReadOnlyBuffer.getClass();
            byteBuffer2 = asReadOnlyBuffer;
        }
        return new dlkr(byteBuffer2, euzbVar.a - euzbVar.b.position());
    }

    @UsedByNative
    private static final native byte[] b(long j, ByteBuffer byteBuffer, int i);

    @UsedByNative
    private static final Exception e(int i, String str) {
        int i2;
        switch (i) {
            case 0:
                i2 = 1;
                break;
            case 1:
                i2 = 2;
                break;
            case 2:
                i2 = 3;
                break;
            case 3:
                i2 = 4;
                break;
            case 4:
                i2 = 5;
                break;
            case 5:
                i2 = 6;
                break;
            case 6:
                i2 = 7;
                break;
            case 7:
                i2 = 8;
                break;
            case 8:
                i2 = 9;
                break;
            case 9:
                i2 = 10;
                break;
            case 10:
                i2 = 11;
                break;
            case 11:
                i2 = 12;
                break;
            case 12:
                i2 = 13;
                break;
            case 13:
                i2 = 14;
                break;
            case 14:
                i2 = 15;
                break;
            case 15:
                i2 = 16;
                break;
            case 16:
                i2 = 17;
                break;
            case 17:
                i2 = 18;
                break;
            case 18:
                i2 = 19;
                break;
            default:
                i2 = 0;
                break;
        }
        return new dlgk(i2 != 0 ? i2 : 11, 31, str, null, 0, 56);
    }

    @UsedByNative
    public static final native byte[] j(long j, ByteBuffer byteBuffer, int i);

    @UsedByNative
    public static final native void l();

    @UsedByNative
    public static final native boolean m(long j);

    @UsedByNative
    public static final native long t(int[] iArr, byte[][] bArr);

    @UsedByNative
    public static final native long u(ByteBuffer[] byteBufferArr);
}
