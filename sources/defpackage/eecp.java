package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eecp {
    private final eecn a;
    private Socket b;

    public eecp(eecl eeclVar) {
        this.a = new eeck(eeclVar);
    }

    private final boolean e() {
        return this.b != null;
    }

    public final InputStream a() {
        if (!e() || this.b.isClosed()) {
            throw new IOException("Connection not opened");
        }
        return this.b.getInputStream();
    }

    public final OutputStream b() {
        if (!e() || this.b.isClosed()) {
            throw new IOException("Connection not opened");
        }
        return this.b.getOutputStream();
    }

    public final void c() {
        if (!e() || this.b.isClosed()) {
            return;
        }
        this.b.close();
        this.a.a().ifPresent(new Consumer() { // from class: eeci
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((eebp) obj).a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void d() {
        this.b = this.a.b();
    }

    public eecp(eeco eecoVar, eecm eecmVar, String str, int i, Optional optional) {
        this.a = new eecj(eecoVar, eecmVar, str, i, optional);
    }
}
