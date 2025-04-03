package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exly {
    public static ByteBuffer a(exma exmaVar) {
        exmb a = exmaVar.a();
        if (((exlt) a.a()).b == 2) {
            return ((exlz) a).a.asReadOnlyBuffer().order(ByteOrder.nativeOrder());
        }
        throw new IllegalArgumentException("Extract ByteBuffer from a MPImage created by objects other than Bytebuffer is not supported");
    }
}
