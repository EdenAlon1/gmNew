package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rdx implements rdz {
    private final quo a;
    private final qxd b;
    private final List c;

    public rdx(InputStream inputStream, List list, qxd qxdVar) {
        rkf.f(qxdVar);
        this.b = qxdVar;
        rkf.f(list);
        this.c = list;
        this.a = new quo(inputStream, qxdVar);
    }

    @Override // defpackage.rdz
    public final int a() {
        return qto.a(this.c, this.a.a(), this.b);
    }

    @Override // defpackage.rdz
    public final Bitmap b(BitmapFactory.Options options) {
        return rdu.a(this.a.a(), options, this);
    }

    @Override // defpackage.rdz
    public final ImageHeaderParser.ImageType c() {
        return qto.d(this.c, this.a.a(), this.b);
    }

    @Override // defpackage.rdz
    public final void d() {
        this.a.a.a();
    }

    @Override // defpackage.rdz
    public final boolean e() {
        InputStream a = this.a.a();
        a.mark(5242880);
        return qto.f(this.c, new qtj(a, this.b));
    }
}
