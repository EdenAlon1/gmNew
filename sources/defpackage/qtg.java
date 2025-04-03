package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qtg implements qtm {
    final /* synthetic */ InputStream a;
    final /* synthetic */ qxd b;

    public qtg(InputStream inputStream, qxd qxdVar) {
        this.a = inputStream;
        this.b = qxdVar;
    }

    @Override // defpackage.qtm
    public final int a(ImageHeaderParser imageHeaderParser) {
        try {
            return imageHeaderParser.a(this.a, this.b);
        } finally {
            this.a.reset();
        }
    }
}
