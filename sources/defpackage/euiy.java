package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class euiy implements etgl {
    @Override // defpackage.etgl
    public final InputStream a(InputStream inputStream, byte[] bArr) {
        return new eujn(this, inputStream, bArr);
    }

    @Override // defpackage.etgl
    public final OutputStream b(OutputStream outputStream, byte[] bArr) {
        return new eujo(this, outputStream, bArr);
    }

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract eujl g();

    public abstract eujm h(byte[] bArr);
}
