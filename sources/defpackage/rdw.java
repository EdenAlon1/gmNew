package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rdw implements rdz {
    private final ByteBuffer a;
    private final List b;
    private final qxd c;

    public rdw(ByteBuffer byteBuffer, List list, qxd qxdVar) {
        this.a = byteBuffer;
        this.b = list;
        this.c = qxdVar;
    }

    @Override // defpackage.rdz
    public final int a() {
        ByteBuffer b = rjr.b(this.a);
        if (b == null) {
            return -1;
        }
        return qto.b(this.b, new qtf(b, this.c));
    }

    @Override // defpackage.rdz
    public final Bitmap b(BitmapFactory.Options options) {
        return rdu.a(new rjp(rjr.b(this.a)), options, this);
    }

    @Override // defpackage.rdz
    public final ImageHeaderParser.ImageType c() {
        return qto.c(this.b, rjr.b(this.a));
    }

    @Override // defpackage.rdz
    public final boolean e() {
        ByteBuffer b = rjr.b(this.a);
        if (b == null) {
            return false;
        }
        return qto.f(this.b, new qti(b, this.c));
    }

    @Override // defpackage.rdz
    public final void d() {
    }
}
