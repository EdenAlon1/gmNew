package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qtf implements qtm {
    final /* synthetic */ ByteBuffer a;
    final /* synthetic */ qxd b;

    public qtf(ByteBuffer byteBuffer, qxd qxdVar) {
        this.a = byteBuffer;
        this.b = qxdVar;
    }

    @Override // defpackage.qtm
    public final int a(ImageHeaderParser imageHeaderParser) {
        try {
            return imageHeaderParser.b(this.a, this.b);
        } finally {
            rjr.b(this.a);
        }
    }
}
