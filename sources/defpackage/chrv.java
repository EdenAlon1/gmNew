package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chrv {
    public final Optional b;
    public final chii c;
    public final ffbr d;
    private final chhw f;
    private final chio g;
    private final chio h;
    private final ffbr i;
    private static final cskc e = cskc.f("BugleNetwork", chrv.class);
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/net/grpcproxies/GrpcProxies");

    public chrv(ffbr ffbrVar, chhw chhwVar, chhw chhwVar2, Optional optional, chii chiiVar, chio chioVar, chio chioVar2, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.b = optional;
        this.d = ffbrVar3;
        this.f = true == ((cgcu) ffbrVar.b()).a() ? chhwVar2 : chhwVar;
        this.c = chiiVar;
        this.g = chioVar;
        this.h = chioVar2;
        this.i = ffbrVar2;
    }

    public final chhw a() {
        e.q("Getting messaging grpc for Ditto.");
        return this.f;
    }

    public final chio b() {
        e.m("Anonymous registration grpc is used.");
        return this.g;
    }

    @Deprecated
    public final chio c() {
        e.m("Phone registration grpc is used.");
        return this.h;
    }

    public final chir d(fcek fcekVar) {
        ekzz f = eleg.f("GrpcProxies#getPhoneRegistrationGrpcProxy(identity)");
        try {
            e.m("Phone channel bound registration grpc is used.");
            chiq chiqVar = (chiq) this.i.b();
            fcekVar.getClass();
            chir chirVar = (chir) ((chhv) chiqVar.a.b()).a(fcekVar, chip.a);
            f.close();
            return chirVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
