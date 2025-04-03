package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbch extends cbbh {
    private final ctap g;

    /* compiled from: PG */
    public interface a {
        ctap cO();
    }

    public cbch(Context context, cbce cbceVar) {
        super(context, cbceVar);
        this.g = ((a) ekhw.a(context, a.class)).cO();
    }

    @Override // defpackage.cbbh
    protected final InputStream i() {
        return null;
    }

    @Override // defpackage.cbbh
    protected final Bitmap k() {
        Bitmap bitmap;
        cbce cbceVar = (cbce) this.b;
        Uri a2 = cbceVar.a();
        if (a2 != null) {
            bitmap = this.g.e(a2, cbceVar.b, cbceVar.c);
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            this.b.b(bitmap.getWidth(), bitmap.getHeight());
        }
        return bitmap;
    }

    @Override // defpackage.cbbh
    protected final boolean n() {
        return true;
    }
}
