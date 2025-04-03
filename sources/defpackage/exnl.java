package defpackage;

import j$.util.Optional;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class exnl {
    public abstract exnp a();

    public abstract void b();

    public final exnp c() {
        exnp a = a();
        exng exngVar = (exng) a;
        exngVar.a.isPresent();
        Optional optional = exngVar.b;
        Optional optional2 = exngVar.c;
        if ((optional.isPresent() ? 1 : 0) + (optional2.isPresent() ? 1 : 0) != 1) {
            throw new IllegalArgumentException("Please specify only one of the model asset path, the model asset file descriptor, and the model asset buffer.");
        }
        if (exngVar.c.isPresent() && !((ByteBuffer) exngVar.c.get()).isDirect() && !(exngVar.c.get() instanceof MappedByteBuffer)) {
            throw new IllegalArgumentException("The model buffer should be either a direct ByteBuffer or a MappedByteBuffer.");
        }
        if (exngVar.d.isPresent()) {
            exngVar.d.get();
        }
        return a;
    }
}
