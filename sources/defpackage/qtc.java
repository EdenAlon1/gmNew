package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qtc implements qtn {
    final /* synthetic */ InputStream a;

    public qtc(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.qtn
    public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
        try {
            return imageHeaderParser.c(this.a);
        } finally {
            this.a.reset();
        }
    }
}
