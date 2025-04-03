package defpackage;

import android.net.LocalSocket;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rpr {
    public final LocalSocket a;
    private final rph b;

    public rpr(LocalSocket localSocket, rph rphVar) {
        this.a = localSocket;
        this.b = rphVar;
    }

    public final InputStream a() {
        return this.b.a();
    }

    public final OutputStream b() {
        return this.a.getOutputStream();
    }
}
