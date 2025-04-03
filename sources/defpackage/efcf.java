package defpackage;

import java.io.Closeable;
import java.io.OutputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efcf {
    private OutputStream a;
    private efcx b;

    public final void a(List list) {
        Closeable closeable = (OutputStream) enjk.j(list);
        if (closeable instanceof efcx) {
            this.b = (efcx) closeable;
            this.a = (OutputStream) list.get(0);
        }
    }

    public final void b() {
        if (this.b == null) {
            throw new efcy("Cannot sync underlying stream");
        }
        this.a.flush();
        this.b.b();
    }
}
