package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crbd {
    public static final entd a = entd.c("BugleFileTransfer");
    private final Context b;
    private final csum c;
    private final ctap d;

    public crbd(Context context, csum csumVar, ctap ctapVar) {
        this.b = context;
        this.c = csumVar;
        this.d = ctapVar;
    }

    private final byte[] d(Uri uri, int i, int i2, int i3) {
        return this.d.q(i2, i3, 250, 250, i, uri, "image/jpeg");
    }

    public final byte[] a(bdov bdovVar, int i) {
        emxf.a(bdovVar.aZ());
        Uri t = bdovVar.t();
        if (t == null) {
            return null;
        }
        if (bdovVar.c() <= 0 || bdovVar.b() <= 0) {
            bdovVar.ai();
        }
        int c = bdovVar.c();
        int b = bdovVar.b();
        try {
            String V = bdovVar.V();
            return le.A(V) ? c(t, i, c, b) : b(t, V, i, c, b);
        } catch (IOException e) {
            ((ensz) ((ensz) ((ensz) a.i()).g(e)).h("com/google/android/apps/messaging/shared/transfer/preview/FilePreviewCreator", "getImagePreview", 'H', "FilePreviewCreator.java")).q("Cannot get a File Transfer preview.");
            return null;
        }
    }

    public final byte[] b(Uri uri, String str, int i, int i2, int i3) {
        emxf.a(le.n(str));
        if (!this.d.n(str, uri)) {
            return d(uri, i, i2, i3);
        }
        ((ensz) ((ensz) a.e()).h("com/google/android/apps/messaging/shared/transfer/preview/FilePreviewCreator", "getPreviewForImage", 108, "FilePreviewCreator.java")).q("Getting preview for GIF-files is not supported at the moment.");
        return null;
    }

    public final byte[] c(Uri uri, int i, int i2, int i3) {
        Context context = this.b;
        Bitmap e = this.d.e(uri, 250, 250);
        Uri d = cbgi.d(null, context);
        File i4 = cbgi.i(d, context);
        if (e != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(i4);
                try {
                    e.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    fileOutputStream.close();
                } finally {
                }
            } finally {
                e.recycle();
            }
        }
        byte[] d2 = d(d, i, i2, i3);
        this.c.j(i4);
        return d2;
    }
}
