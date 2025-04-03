package defpackage;

import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rfa implements qtw {
    private final rfc a;

    public rfa(rfc rfcVar) {
        this.a = rfcVar;
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ qwv a(Object obj, int i, int i2, qtu qtuVar) {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource((ByteBuffer) obj);
        return rfc.a(createSource, i, i2, qtuVar);
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ boolean b(Object obj, qtu qtuVar) {
        return rfc.b(qto.c(this.a.a, (ByteBuffer) obj));
    }
}
