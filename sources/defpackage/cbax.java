package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbax extends cbcd {
    private final cbay g;

    /* compiled from: PG */
    public interface a {
        crjx a();
    }

    public cbax(Context context, cbba cbbaVar, int i) {
        super(context, cbbaVar);
        cbaz cbazVar = cbay.a;
        if (cbazVar.a == null) {
            synchronized (cbazVar) {
                if (cbazVar.a == null) {
                    cbazVar.a = new cbay(context);
                }
            }
        }
        cbay cbayVar = cbazVar.a;
        this.g = cbayVar;
        if (i != cbayVar.d) {
            cbayVar.a(i);
        }
    }

    @Override // defpackage.cbcd, defpackage.cbbh
    protected final cbbk h(List list) {
        efbd.b();
        Uri uri = ((cbba) this.b).k;
        if (uri == null || !csuu.w(uri)) {
            throw new IllegalArgumentException("Invalid emoji URI: ".concat(String.valueOf(String.valueOf(uri))));
        }
        String str = uri.getPathSegments().get(1);
        String f = f();
        cbcb m = m();
        cbba cbbaVar = (cbba) this.b;
        Bitmap a2 = m.a(cbbaVar.b, cbbaVar.c);
        Canvas canvas = new Canvas();
        canvas.setBitmap(a2);
        String charSequence = str.toString();
        int height = a2.getHeight();
        cbay cbayVar = this.g;
        cbaz cbazVar = cbay.a;
        canvas.drawText(charSequence, 0.0f, height - cbayVar.c.bottom, this.g.b);
        return new cbaw(f, a2, 1, this.c, this.d);
    }

    @Override // defpackage.cbbh
    public final int j() {
        return 3;
    }
}
