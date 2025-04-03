package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emqy {
    public final emqv a;
    public final enhk b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final boolean h;
    public final int i;

    public emqy(emqv emqvVar, enhk enhkVar, int i, boolean z) {
        Optional empty;
        this.a = emqvVar;
        this.b = enhkVar;
        this.i = i;
        if ((emqvVar.b & 16) != 0) {
            this.d = Optional.of(emqvVar.i);
        } else {
            this.d = Optional.empty();
        }
        if ((emqvVar.b & 32) != 0) {
            this.c = Optional.of(emqvVar.j);
        } else {
            this.c = Optional.empty();
        }
        if ((emqvVar.b & 64) != 0) {
            this.e = Optional.of(Long.valueOf(emqvVar.k));
        } else {
            this.e = Optional.empty();
        }
        if ((emqvVar.b & 1024) != 0) {
            fbrg b = fbrg.b(emqvVar.o);
            empty = Optional.of(b == null ? fbrg.UNKNOWN_SUGGESTION_SOURCE : b);
        } else {
            empty = Optional.empty();
        }
        this.f = empty;
        this.g = (emqvVar.b & 512) != 0 ? Optional.of(Float.valueOf(emqvVar.n)) : Optional.empty();
        this.h = z;
    }

    public final Optional a() {
        return this.a.e.isEmpty() ? Optional.empty() : Optional.of(this.a.e);
    }

    public final String b() {
        return this.a.d;
    }
}
