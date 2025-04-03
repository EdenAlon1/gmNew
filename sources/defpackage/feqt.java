package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feqt implements fevq {
    private InputStream a;

    public feqt(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.fevq
    public final InputStream g() {
        InputStream inputStream = this.a;
        this.a = null;
        return inputStream;
    }
}
