package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evao {
    final List a = new ArrayList();

    final void a(ByteBuffer byteBuffer) {
        if (!this.a.isEmpty()) {
            if (this.a.get(r0.size() - 1) == byteBuffer) {
                return;
            }
        }
        this.a.add(byteBuffer);
    }
}
