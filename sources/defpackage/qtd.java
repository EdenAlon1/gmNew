package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qtd implements qtn {
    final /* synthetic */ ByteBuffer a;

    public qtd(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // defpackage.qtn
    public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
        try {
            return imageHeaderParser.d(this.a);
        } finally {
            rjr.b(this.a);
        }
    }
}
