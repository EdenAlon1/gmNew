package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eugo implements etgl {
    private final List a;
    private final etgl b;

    public eugo(List list, etgl etglVar) {
        this.a = list;
        this.b = etglVar;
    }

    @Override // defpackage.etgl
    public final InputStream a(InputStream inputStream, byte[] bArr) {
        return new euga(this.a, inputStream, bArr);
    }

    @Override // defpackage.etgl
    public final OutputStream b(OutputStream outputStream, byte[] bArr) {
        return this.b.b(outputStream, bArr);
    }
}
