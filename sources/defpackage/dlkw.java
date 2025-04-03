package defpackage;

import com.google.android.libraries.abuse.hades.tartarus.runtime.TartarusKt;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlkw extends dlaf implements Closeable {
    public final ByteBuffer a;

    public dlkw(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = dlkx.a;
        TartarusKt.freeTartarusBuffer(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlkw) && ffkj.e(this.a, ((dlkw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
