package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class azs implements bnd {
    private static bcd b(avr avrVar) {
        return avrVar.e() instanceof bku ? ((bku) avrVar.e()).a : new bcc();
    }

    @Override // defpackage.bnd
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        bia c;
        bab babVar = (bab) obj;
        avr a = babVar.a();
        bad b = babVar.b();
        if (bly.d(a.a())) {
            try {
                String str = bia.a;
                ByteBuffer c2 = a.f()[0].c();
                c2.rewind();
                byte[] bArr = new byte[c2.capacity()];
                c2.get(bArr);
                c = bia.c(new ByteArrayInputStream(bArr));
                a.f()[0].c().rewind();
            } catch (IOException e) {
                throw new avl("Failed to extract EXIF data.", e);
            }
        } else {
            c = null;
        }
        if (!blr.a() || !bly.d(a.a())) {
            return bne.j(a, c, new Size(a.c(), a.b()), b.d, b.e, b.g, b(a));
        }
        ksw.i(c, "JPEG image must have exif.");
        Size size = new Size(a.c(), a.b());
        int b2 = b.e - c.b();
        Size size2 = bix.n(bix.b(b2)) ? new Size(size.getHeight(), size.getWidth()) : size;
        Matrix c3 = bix.c(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()), b2);
        RectF rectF = new RectF(b.d);
        c3.mapRect(rectF);
        rectF.sort();
        Rect rect = new Rect();
        rectF.round(rect);
        Size size3 = size2;
        int b3 = c.b();
        Matrix matrix = new Matrix(b.g);
        matrix.postConcat(c3);
        return bne.j(a, c, size3, rect, b3, matrix, b(a));
    }
}
