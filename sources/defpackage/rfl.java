package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rfl {
    private final Queue a;

    public rfl() {
        char[] cArr = rkh.a;
        this.a = new ArrayDeque(0);
    }

    final synchronized qrg a(ByteBuffer byteBuffer) {
        qrg qrgVar;
        qrgVar = (qrg) this.a.poll();
        if (qrgVar == null) {
            qrgVar = new qrg();
        }
        qrgVar.b = null;
        Arrays.fill(qrgVar.a, (byte) 0);
        qrgVar.c = new qrf();
        qrgVar.d = 0;
        qrgVar.b = byteBuffer.asReadOnlyBuffer();
        qrgVar.b.position(0);
        qrgVar.b.order(ByteOrder.LITTLE_ENDIAN);
        return qrgVar;
    }

    final synchronized void b(qrg qrgVar) {
        qrgVar.b = null;
        qrgVar.c = null;
        this.a.offer(qrgVar);
    }
}
