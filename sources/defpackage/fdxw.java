package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdxw implements fdxx {
    public static final fdxx a = new fdxw();

    private fdxw() {
    }

    @Override // defpackage.fdxy, defpackage.fdyt
    public final String c() {
        return "identity";
    }

    @Override // defpackage.fdyt
    public final InputStream a(InputStream inputStream) {
        return inputStream;
    }

    @Override // defpackage.fdxy
    public final OutputStream b(OutputStream outputStream) {
        return outputStream;
    }
}
