package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enil implements Serializable {
    private final engw a;

    public enil(engw engwVar) {
        this.a = engwVar;
    }

    Object readResolve() {
        return this.a.isEmpty() ? enim.a : enkr.h(this.a, engw.r(enop.a)) ? enim.b : new enim(this.a);
    }
}
