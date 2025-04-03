package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfxl {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/fcm/impl/PhoneChannelHelper");
    public final akzt b;
    private final Optional c;
    private final errl d;
    private final ffbr e;
    private final ffbr f;

    public cfxl(akzt akztVar, Optional optional, errl errlVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.b = akztVar;
        this.c = optional;
        this.d = errlVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
    }

    public final elfl a(fcek fcekVar) {
        return ((cilk) this.c.get()).e(fcekVar.c).h(new emwl() { // from class: cfxh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cfxl.this.b.c("Bugle.Fcm.Phone.Bind.Success.Count");
                return null;
            }
        }, this.d);
    }

    public final elfl b(fcek fcekVar) {
        return ((cilk) this.c.get()).a(fcekVar).h(new emwl() { // from class: cfxk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cfxl.this.b.c("Bugle.Fcm.Phone.Pull.Success.Count");
                return null;
            }
        }, this.d);
    }

    public final elfl c(final fcek fcekVar) {
        return ((atqw) this.f.b()).a() ? ((djrv) this.e.b()).g(fcekVar.c).i(new eroh() { // from class: cfxi
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                fcek fcekVar2 = fcekVar;
                if (booleanValue) {
                    return cfxl.this.a(fcekVar2);
                }
                ensk j = cfxl.a.j();
                j.Y(ente.a, "BugleNetwork");
                enrr enrrVar = (enrr) j;
                enrrVar.Y(csux.E, fcekVar2.c);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/fcm/impl/PhoneChannelHelper", "phoneBindIfProvisioned", 60, "PhoneChannelHelper.java")).q("Attempt to bind a channel for non-provisioned identity, aborted.");
                return erre.a;
            }
        }, this.d) : a(fcekVar);
    }

    public final elfl d(final fcek fcekVar) {
        return ((atqw) this.f.b()).a() ? ((djrv) this.e.b()).g(fcekVar.c).i(new eroh() { // from class: cfxj
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                fcek fcekVar2 = fcekVar;
                if (booleanValue) {
                    return cfxl.this.b(fcekVar2);
                }
                ensk j = cfxl.a.j();
                j.Y(ente.a, "BugleNetwork");
                enrr enrrVar = (enrr) j;
                enrrVar.Y(csux.E, fcekVar2.c);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/fcm/impl/PhoneChannelHelper", "phonePullIfProvisioned", 94, "PhoneChannelHelper.java")).q("Attempt to pull messages for non-provisioned identity, aborted.");
                return erre.a;
            }
        }, this.d) : b(fcekVar);
    }
}
