package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctak {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/image/GifCompressor");
    private final Context b;
    private final albq c;
    private final akzt d;
    private final ffbr e;

    public ctak(Context context, albq albqVar, akzt akztVar, ffbr ffbrVar) {
        this.b = context;
        this.c = albqVar;
        this.d = akztVar;
        this.e = ffbrVar;
    }

    public final String a(Uri uri) {
        if (cbgi.k(uri, this.b)) {
            return cbgi.i(uri, this.b).getAbsolutePath();
        }
        if (!csuu.t(uri)) {
            if (csuu.v(uri)) {
                return uri.getPath();
            }
            return null;
        }
        Context context = this.b;
        File i = cbgi.i(cbgi.d("gif", context), context);
        if (csuu.t(uri)) {
            try {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    dfyt.c(this.b.getResources().openRawResource(Integer.parseInt(lastPathSegment)), new FileOutputStream(i));
                } else {
                    ensk j = a.j();
                    j.Y(ente.a, "BugleResizing");
                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/util/image/GifCompressor", "getScratchFileForBugleAppResource", 183, "GifCompressor.java")).q("uri.getLastPathSegment() is null");
                }
            } catch (FileNotFoundException e) {
                ensk i2 = a.i();
                i2.Y(ente.a, "BugleResizing");
                enrr enrrVar = (enrr) ((enrr) i2).g(e);
                enrrVar.Y(csux.X, uri);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/util/image/GifCompressor", "getScratchFileForBugleAppResource", 188, "GifCompressor.java")).q("Could not open scratch file.");
            } catch (IOException e2) {
                ensk i3 = a.i();
                i3.Y(ente.a, "BugleResizing");
                enrr enrrVar2 = (enrr) ((enrr) i3).g(e2);
                enrrVar2.Y(csux.X, uri);
                ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/util/image/GifCompressor", "getScratchFileForBugleAppResource", 193, "GifCompressor.java")).q("Could not copy Bugle app resource to scratch file.");
            } catch (NumberFormatException e3) {
                ensk i4 = a.i();
                i4.Y(ente.a, "BugleResizing");
                enrr enrrVar3 = (enrr) ((enrr) i4).g(e3);
                enrrVar3.Y(csux.X, uri);
                ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/util/image/GifCompressor", "getScratchFileForBugleAppResource", 186, "GifCompressor.java")).q("Invalid Bugle app resource id.");
            }
        } else {
            ensk j2 = a.j();
            j2.Y(ente.a, "BugleResizing");
            ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/util/image/GifCompressor", "getScratchFileForBugleAppResource", 171, "GifCompressor.java")).t("Expected a Bugle app resource uri, but actual uri = %s", uri);
        }
        return i.getAbsolutePath();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] b(android.net.Uri r38, int r39, int r40, long r41) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctak.b(android.net.Uri, int, int, long):byte[]");
    }
}
