package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adgn {
    private final Optional a;
    private final Optional b;

    public adgn(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [fazb, java.lang.Object] */
    public final Optional a() {
        if (this.a.isEmpty()) {
            return Optional.empty();
        }
        this.b.isPresent();
        emxf.m(true, "the isEnabledFn should be present when the feature is compiled in");
        if (!((adgm) this.b.get()).a()) {
            return Optional.empty();
        }
        Object b = this.a.get().b();
        b.getClass();
        return Optional.of(b);
    }
}
