package defpackage;

import j$.util.Optional;
import java.net.URI;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esqg extends esqt {
    private fcek a;
    private Optional b = Optional.empty();
    private byte c;

    @Override // defpackage.esqt
    public final esqu a() {
        int i = ~this.c;
        if ((i & 1) == 0) {
            return new esqu(this.a, this.b, i & 2);
        }
        throw new IllegalStateException("Missing required properties: id");
    }

    @Override // defpackage.esqt
    public final void b(URI uri) {
        this.b = Optional.of(uri);
        this.c = (byte) (this.c | 2);
    }

    @Override // defpackage.esqt
    public final void c(fcek fcekVar) {
        if (fcekVar == null) {
            throw new NullPointerException("Null id");
        }
        this.a = fcekVar;
        this.c = (byte) (this.c | 1);
    }
}
