package defpackage;

import android.graphics.ImageDecoder;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rfb implements qtw {
    private final rfc a;

    public rfb(rfc rfcVar) {
        this.a = rfcVar;
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ qwv a(Object obj, int i, int i2, qtu qtuVar) {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(rjr.a((InputStream) obj));
        return rfc.a(createSource, i, i2, qtuVar);
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ boolean b(Object obj, qtu qtuVar) {
        rfc rfcVar = this.a;
        qxd qxdVar = rfcVar.b;
        return rfc.b(qto.d(rfcVar.a, (InputStream) obj, qxdVar));
    }
}
