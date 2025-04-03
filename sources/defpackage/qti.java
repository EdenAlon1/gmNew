package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qti implements qtl {
    final /* synthetic */ ByteBuffer a;
    final /* synthetic */ qxd b;

    public qti(ByteBuffer byteBuffer, qxd qxdVar) {
        this.a = byteBuffer;
        this.b = qxdVar;
    }

    @Override // defpackage.qtl
    public final boolean a(ImageHeaderParser imageHeaderParser) {
        try {
            return imageHeaderParser.f(this.a, this.b);
        } finally {
            rjr.b(this.a);
        }
    }
}
