package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class clay {
    public abstract clba a();

    public abstract Optional b();

    public abstract Optional c();

    public abstract void d(claz clazVar);

    public final clba e() {
        emxf.b(c().isPresent() != b().isPresent(), "Either RcsGroupTelephonyData or ParseError must be present.");
        return a();
    }
}
