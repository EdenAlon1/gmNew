package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enid implements Serializable {
    final enie a;

    public enid(enie enieVar) {
        this.a = enieVar;
    }

    Object readResolve() {
        return this.a.j();
    }
}
