package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileDescriptor;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rdy implements rdz {
    private final qxd a;
    private final List b;
    private final ParcelFileDescriptorRewinder c;

    public rdy(ParcelFileDescriptor parcelFileDescriptor, List list, qxd qxdVar) {
        rkf.f(qxdVar);
        this.a = qxdVar;
        rkf.f(list);
        this.b = list;
        this.c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
    }

    @Override // defpackage.rdz
    public final int a() {
        return qto.b(this.b, new qth(this.c, this.a));
    }

    @Override // defpackage.rdz
    public final Bitmap b(BitmapFactory.Options options) {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap.Config config4;
        FileDescriptor fileDescriptor = this.c.a().getFileDescriptor();
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT != 34 || !rdt.a(options) || !rdu.c(this)) {
            return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        }
        Bitmap.Config config5 = options.inPreferredConfig;
        config = Bitmap.Config.HARDWARE;
        rkf.a(config5 == config);
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            if (decodeFileDescriptor == null) {
                config4 = Bitmap.Config.HARDWARE;
                options.inPreferredConfig = config4;
                return null;
            }
            try {
                Bitmap b = rdu.b(decodeFileDescriptor);
                decodeFileDescriptor.recycle();
                config3 = Bitmap.Config.HARDWARE;
                options.inPreferredConfig = config3;
                return b;
            } catch (Throwable th) {
                th = th;
                bitmap = decodeFileDescriptor;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                config2 = Bitmap.Config.HARDWARE;
                options.inPreferredConfig = config2;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.rdz
    public final ImageHeaderParser.ImageType c() {
        return qto.e(this.b, new qte(this.c, this.a));
    }

    @Override // defpackage.rdz
    public final boolean e() {
        return qto.f(this.b, new qtk(this.c, this.a));
    }

    @Override // defpackage.rdz
    public final void d() {
    }
}
