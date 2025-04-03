package defpackage;

import android.support.rastermill.FrameSequence;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duhn implements qtw {
    private final List a;
    private final qxf b;
    private final qxd c;

    public duhn(List list, qxf qxfVar, qxd qxdVar) {
        this.a = list;
        this.b = qxfVar;
        this.c = qxdVar;
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ qwv a(Object obj, int i, int i2, qtu qtuVar) {
        return c((InputStream) obj);
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ boolean b(Object obj, qtu qtuVar) {
        return qto.d(this.a, (InputStream) obj, this.c) == ImageHeaderParser.ImageType.ANIMATED_WEBP;
    }

    public final qwv c(InputStream inputStream) {
        return new duho(FrameSequence.decodeStream(inputStream), this.b);
    }
}
