package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;
import org.whispersystems.curve25519.Curve25519;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chyc {
    public static final cskc a = cskc.g("BugleNetwork", "RegisterRefreshRequestBuilder");
    public final Supplier b;
    private final errl c;
    private final chzf d;
    private final long e;
    private final Optional f;
    private final Callable g;

    public chyc(errl errlVar, chzf chzfVar, long j, Optional optional, Callable callable, Supplier supplier) {
        this.c = errlVar;
        this.d = chzfVar;
        this.f = optional;
        this.e = j;
        this.g = callable;
        this.b = supplier;
    }

    public final chze a() {
        chze a2 = this.d.a();
        a2.j();
        a2.m(this.g);
        a2.k(this.e);
        a2.l();
        a2.k = this.f;
        return a2;
    }

    public final ListenableFuture b(final fcfo fcfoVar, final chze chzeVar) {
        return elfr.j(chzeVar.b(), new emwl() { // from class: chyb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Object obj2;
                byte[] b;
                fcbs fcbsVar = (fcbs) fcbt.a.createBuilder();
                obj2 = chyc.this.b.get();
                fcek fcekVar = (fcek) obj2;
                fcbsVar.copyOnWrite();
                fcbt fcbtVar = (fcbt) fcbsVar.instance;
                fcekVar.getClass();
                fcbtVar.d = fcekVar;
                fcbtVar.b |= 2;
                chze chzeVar2 = chzeVar;
                long a2 = chzeVar2.a();
                fcbsVar.copyOnWrite();
                ((fcbt) fcbsVar.instance).e = a2;
                fcbsVar.copyOnWrite();
                fcbt fcbtVar2 = (fcbt) fcbsVar.instance;
                fcbr fcbrVar = (fcbr) ((fcbq) obj).build();
                fcbrVar.getClass();
                fcbtVar2.h = fcbrVar;
                fcbtVar2.b |= 4;
                fcbt fcbtVar3 = (fcbt) fcbsVar.build();
                chyc.a.m("Creating RegisterRefreshRequest");
                elfl elflVar = chzeVar2.g;
                if (elflVar == null) {
                    throw new IllegalStateException("Key pair future is not set.");
                }
                try {
                    Optional optional = (Optional) erqt.q(elflVar);
                    fiwb fiwbVar = optional.isPresent() ? (fiwb) optional.get() : null;
                    if (fiwbVar == null) {
                        throw new IllegalStateException("Key pair is not available.");
                    }
                    try {
                        int i = fcbtVar3.f;
                        char c = i != 0 ? i != 2 ? (char) 0 : (char) 4 : (char) 2;
                        try {
                            if (c != 0 && c == 4) {
                                fcfo fcfoVar2 = fcbtVar3.c;
                                if (fcfoVar2 == null) {
                                    fcfoVar2 = fcfo.a;
                                }
                                b = erme.b(chhg.c(fcfoVar2.c.getBytes(StandardCharsets.UTF_8)), chhg.e(fcbtVar3.e));
                                byte[] calculateSignature = Curve25519.getInstance(Curve25519.BEST).calculateSignature(fiwbVar.b.a, b);
                                calculateSignature.getClass();
                                if (csjc.c() && !Curve25519.getInstance(Curve25519.BEST).verifySignature(fiwbVar.a.a, b, calculateSignature)) {
                                    throw new IllegalStateException("unable to verify signature locally");
                                }
                                eyee x = eyee.x(calculateSignature);
                                fcfo fcfoVar3 = fcfoVar;
                                fcbs fcbsVar2 = (fcbs) fcbtVar3.toBuilder();
                                fcbsVar2.copyOnWrite();
                                fcbt fcbtVar4 = (fcbt) fcbsVar2.instance;
                                fcfoVar3.getClass();
                                fcbtVar4.c = fcfoVar3;
                                fcbtVar4.b |= 1;
                                fcbsVar2.copyOnWrite();
                                ((fcbt) fcbsVar2.instance).g = x;
                                return (fcbt) fcbsVar2.build();
                            }
                            byte[] calculateSignature2 = Curve25519.getInstance(Curve25519.BEST).calculateSignature(fiwbVar.b.a, b);
                            calculateSignature2.getClass();
                            if (csjc.c()) {
                                throw new IllegalStateException("unable to verify signature locally");
                            }
                            eyee x2 = eyee.x(calculateSignature2);
                            fcfo fcfoVar32 = fcfoVar;
                            fcbs fcbsVar22 = (fcbs) fcbtVar3.toBuilder();
                            fcbsVar22.copyOnWrite();
                            fcbt fcbtVar42 = (fcbt) fcbsVar22.instance;
                            fcfoVar32.getClass();
                            fcbtVar42.c = fcfoVar32;
                            fcbtVar42.b |= 1;
                            fcbsVar22.copyOnWrite();
                            ((fcbt) fcbsVar22.instance).g = x2;
                            return (fcbt) fcbsVar22.build();
                        } catch (fivx e) {
                            ensk i2 = chhg.a.i();
                            i2.Y(ente.a, "BugleNetwork");
                            ((enrr) ((enrr) ((enrr) i2).g(e)).h("com/google/android/apps/messaging/shared/net/common/CryptoHelper", "signBytes", (char) 317, "CryptoHelper.java")).q("failed to signBytes");
                            throw new IllegalStateException("Failed to sign", e);
                        }
                        byte[] d = chhg.d(0);
                        byte[] d2 = chhg.d(0);
                        fcbr fcbrVar2 = fcbtVar3.h;
                        if (fcbrVar2 == null) {
                            fcbrVar2 = fcbr.a;
                        }
                        if ((fcbrVar2.b & 4) != 0) {
                            fcbr fcbrVar3 = fcbtVar3.h;
                            if (fcbrVar3 == null) {
                                fcbrVar3 = fcbr.a;
                            }
                            fcfa fcfaVar = fcbrVar3.i;
                            if (fcfaVar == null) {
                                fcfaVar = fcfa.a;
                            }
                            d = chhg.d(fcfaVar.b);
                            fcbr fcbrVar4 = fcbtVar3.h;
                            if (fcbrVar4 == null) {
                                fcbrVar4 = fcbr.a;
                            }
                            fcfa fcfaVar2 = fcbrVar4.i;
                            if (fcfaVar2 == null) {
                                fcfaVar2 = fcfa.a;
                            }
                            d2 = chhg.c(fcfaVar2.c.I());
                        }
                        fcek fcekVar2 = fcbtVar3.d;
                        if (fcekVar2 == null) {
                            fcekVar2 = fcek.a;
                        }
                        byte[] c2 = chhg.c(fcekVar2.d.getBytes("UTF-8"));
                        fcek fcekVar3 = fcbtVar3.d;
                        if (fcekVar3 == null) {
                            fcekVar3 = fcek.a;
                        }
                        byte[] d3 = chhg.d(fcekVar3.b);
                        fcek fcekVar4 = fcbtVar3.d;
                        if (fcekVar4 == null) {
                            fcekVar4 = fcek.a;
                        }
                        byte[] c3 = chhg.c(fcekVar4.c.getBytes("UTF-8"));
                        fcbr fcbrVar5 = fcbtVar3.h;
                        if (fcbrVar5 == null) {
                            fcbrVar5 = fcbr.a;
                        }
                        byte[] c4 = chhg.c(fcbrVar5.f.getBytes("UTF-8"));
                        fcbr fcbrVar6 = fcbtVar3.h;
                        if (fcbrVar6 == null) {
                            fcbrVar6 = fcbr.a;
                        }
                        byte[] c5 = chhg.c(fcbrVar6.g.I());
                        fcbr fcbrVar7 = fcbtVar3.h;
                        if (fcbrVar7 == null) {
                            fcbrVar7 = fcbr.a;
                        }
                        b = erme.b(c2, d3, c3, c4, c5, chhg.c(fcbrVar7.h.getBytes("UTF-8")), d, d2, chhg.e(fcbtVar3.e));
                    } catch (UnsupportedEncodingException e2) {
                        throw new IllegalStateException("Unsupported encoding in the request", e2);
                    }
                } catch (ExecutionException e3) {
                    throw new IllegalStateException("Key pair is not available.", e3);
                }
            }
        }, this.c);
    }
}
