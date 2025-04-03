package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cbcd extends cbbh {
    public cbcd(Context context, cbce cbceVar) {
        super(context, cbceVar);
    }

    @Override // defpackage.cbbh
    protected cbbk h(List list) {
        cbbn g;
        ekzz f = eleg.f("UriImageRequest.loadMediaInternal");
        try {
            cbbk h = super.h(list);
            if (((cbce) this.b).l && (g = h.g(this)) != null) {
                list.add(g);
                if (h instanceof cbaw) {
                    ((cbaw) h).b = false;
                }
            }
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cbbh
    protected InputStream i() {
        Uri a = ((cbce) this.b).a();
        if (a != null) {
            return this.a.getContentResolver().openInputStream(a);
        }
        return null;
    }
}
