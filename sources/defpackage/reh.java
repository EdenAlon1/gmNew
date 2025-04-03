package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class reh implements rdk {
    private final ree a;
    private final rju b;

    public reh(ree reeVar, rju rjuVar) {
        this.a = reeVar;
        this.b = rjuVar;
    }

    @Override // defpackage.rdk
    public final void a(qxf qxfVar, Bitmap bitmap) {
        IOException iOException = this.b.c;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            qxfVar.d(bitmap);
            throw iOException;
        }
    }

    @Override // defpackage.rdk
    public final void b() {
        this.a.a();
    }
}
