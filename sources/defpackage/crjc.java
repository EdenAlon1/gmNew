package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crjc extends crjw implements crjh {
    private static final entd a = entd.c("BugleImage");

    /* compiled from: PG */
    public interface a {
        crji cB();

        crpr cD();

        crmr iz();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.graphics.Bitmap b(android.net.Uri r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crjc.b(android.net.Uri, int, int):android.graphics.Bitmap");
    }

    @Override // defpackage.crjw
    protected final Bitmap a(Uri uri) {
        Bitmap bitmap;
        List list;
        String str;
        String str2;
        Context context = getContext();
        context.getClass();
        String str3 = "Rejecting unsafe uri";
        String str4 = "com/google/android/apps/messaging/shared/ui/avatar/AvatarContentProvider$AvatarContentProviderInner";
        if (!crjm.y(context, uri)) {
            ensz enszVar = (ensz) a.i();
            enszVar.Y(cbci.i, cskt.b(uri.toString()));
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/ui/avatar/AvatarContentProvider$AvatarContentProviderInner", "generateBitmap", 86, "AvatarContentProvider.java")).q("Rejecting unsafe uri");
            return null;
        }
        int dimension = (int) getContext().getResources().getDimension(R.dimen.contact_icon_view_xlarge_size);
        int dimension2 = (int) getContext().getResources().getDimension(R.dimen.contact_icon_view_xlarge_size);
        if (!"g".equals(crjm.s(uri))) {
            return b(uri, dimension2, dimension);
        }
        crji cB = ((a) ctba.a(a.class)).cB();
        String s = crjm.s(uri);
        Bitmap g = g(dimension2, dimension, 0);
        Canvas canvas = new Canvas(g);
        csix.k("g".equals(s));
        List v = crjm.v(uri);
        RectF[] d = cB.d(dimension2, dimension, v.size());
        int i = 0;
        while (i < d.length) {
            try {
                RectF rectF = d[i];
                Uri parse = Uri.parse((String) v.get(i));
                Context context2 = getContext();
                context2.getClass();
                if (crjm.y(context2, parse)) {
                    Bitmap b = b(parse, dimension2, dimension);
                    try {
                        list = v;
                        RectF rectF2 = new RectF(0.0f, 0.0f, b.getWidth(), b.getHeight());
                        Bitmap g2 = g(Math.round(rectF.width()), Math.round(rectF.height()), 0);
                        str = str3;
                        str2 = str4;
                        RectF rectF3 = new RectF(0.0f, 0.0f, g2.getWidth(), g2.getHeight());
                        ctap.s(b, new Canvas(g2), rectF2, rectF3, false, 0, true);
                        Matrix matrix = new Matrix();
                        matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.FILL);
                        canvas.drawBitmap(g2, matrix, new Paint(1));
                        if (b != null) {
                            b.recycle();
                        }
                    } catch (Throwable th) {
                        th = th;
                        bitmap = b;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        throw th;
                    }
                } else {
                    ensz enszVar2 = (ensz) a.i();
                    enszVar2.Y(cbci.i, cskt.b(parse.toString()));
                    ((ensz) enszVar2.h(str4, "getGroupAvatarBitmap", 134, "AvatarContentProvider.java")).q(str3);
                    list = v;
                    str = str3;
                    str2 = str4;
                }
                i++;
                v = list;
                str3 = str;
                str4 = str2;
            } catch (Throwable th2) {
                th = th2;
                bitmap = null;
            }
        }
        return g;
    }

    @Override // defpackage.crjh
    public final Bitmap g(int i, int i2, int i3) {
        OutOfMemoryError outOfMemoryError;
        Bitmap bitmap;
        try {
            bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            try {
                bitmap.eraseColor(i3);
                return bitmap;
            } catch (OutOfMemoryError e) {
                outOfMemoryError = e;
                ((ensz) ((ensz) ((ensz) a.j()).g(outOfMemoryError)).h("com/google/android/apps/messaging/shared/ui/avatar/AvatarContentProvider$AvatarContentProviderInner", "createOrReuseBitmap", (char) 388, "AvatarContentProvider.java")).q("Error while creating bitmap");
                ((a) ctba.a(a.class)).iz().a(15, 1);
                return bitmap;
            }
        } catch (OutOfMemoryError e2) {
            outOfMemoryError = e2;
            bitmap = null;
        }
    }
}
