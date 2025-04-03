package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duhl implements qtw {
    private final List a;
    private final duhn b;

    public duhl(List list, qxf qxfVar, qxd qxdVar) {
        this.a = list;
        this.b = new duhn(list, qxfVar, qxdVar);
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ qwv a(Object obj, int i, int i2, qtu qtuVar) {
        int i3 = rjr.a;
        return this.b.c(new rjp((ByteBuffer) obj));
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ boolean b(Object obj, qtu qtuVar) {
        return qto.c(this.a, (ByteBuffer) obj) == ImageHeaderParser.ImageType.ANIMATED_WEBP;
    }
}
