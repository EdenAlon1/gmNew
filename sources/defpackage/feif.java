package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feif implements fevy {
    @Override // defpackage.fevy
    public final fevx a(int i) {
        return new feie(ByteBuffer.allocateDirect(Math.min(1048576, i)));
    }
}
