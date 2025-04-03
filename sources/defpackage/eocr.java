package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eocr implements eodc {
    @Override // defpackage.eodc
    public final eodb a(ByteBuffer byteBuffer) {
        eodd d = d(byteBuffer.remaining());
        d.f(byteBuffer);
        return d.q();
    }

    @Override // defpackage.eodc
    public final eodb b(byte[] bArr) {
        return e(bArr, bArr.length);
    }

    @Override // defpackage.eodc
    public eodb c(CharSequence charSequence, Charset charset) {
        return f().k(charSequence, charset).q();
    }

    public eodd d(int i) {
        emxf.d(i >= 0, "expectedInputSize must be >= 0 but was %s", i);
        return f();
    }

    public eodb e(byte[] bArr, int i) {
        emxf.k(0, i, bArr.length);
        eodd d = d(i);
        d.g(bArr, i);
        return d.q();
    }
}
