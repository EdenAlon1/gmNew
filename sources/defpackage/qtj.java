package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qtj implements qtl {
    final /* synthetic */ InputStream a;
    final /* synthetic */ qxd b;

    public qtj(InputStream inputStream, qxd qxdVar) {
        this.a = inputStream;
        this.b = qxdVar;
    }

    @Override // defpackage.qtl
    public final boolean a(ImageHeaderParser imageHeaderParser) {
        try {
            return imageHeaderParser.e(this.a, this.b);
        } finally {
            this.a.reset();
        }
    }
}
