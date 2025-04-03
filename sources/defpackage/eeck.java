package defpackage;

import j$.util.Optional;
import java.net.Socket;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeck implements eecn {
    private final eecl a;

    public eeck(eecl eeclVar) {
        this.a = eeclVar;
    }

    @Override // defpackage.eecn
    public final Optional a() {
        return Optional.empty();
    }

    @Override // defpackage.eecn
    public final Socket b() {
        return this.a.a().accept();
    }
}
