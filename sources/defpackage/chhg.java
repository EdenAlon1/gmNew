package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chhg {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/net/common/CryptoHelper");
    public final ffbr b;
    public final errl c;
    private final ffbr d;
    private final Object e = new Object();
    private final Map f = new HashMap();

    public chhg(ffbr ffbrVar, ffbr ffbrVar2, errl errlVar) {
        new HashMap();
        this.d = ffbrVar;
        this.b = ffbrVar2;
        this.c = errlVar;
    }

    public static byte[] c(byte[] bArr) {
        int length;
        return (bArr == null || (length = bArr.length) == 0) ? ermn.k(0) : ByteBuffer.allocate(length + 4).order(ByteOrder.LITTLE_ENDIAN).putInt(length).put(bArr).array();
    }

    public static byte[] d(int i) {
        return ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putInt(4).putInt(i).array();
    }

    public static byte[] e(long j) {
        return ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN).putInt(8).putLong(j).array();
    }

    public final elfl a(String str) {
        return b(str).h(new emwl() { // from class: chgz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                byte[][] bArr = (byte[][]) obj;
                try {
                    return Optional.of(new fiwb(fivy.b(bArr[0]), new fivz(bArr[1])));
                } catch (fivx e) {
                    ensk i = chhg.a.i();
                    i.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/shared/net/common/CryptoHelper", "getPhoneKeyPair", (char) 153, "CryptoHelper.java")).q("Cannot find valid Curve25519 key pair");
                    return Optional.empty();
                }
            }
        }, erpp.a);
    }

    public final elfl b(String str) {
        elfl elflVar;
        synchronized (this.e) {
            elflVar = (elfl) this.f.get(str);
            if (elflVar == null) {
                final chpy a2 = ((chpz) this.d.b()).a(str);
                elflVar = a2.a().i(new eroh() { // from class: chhd
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        chod chodVar = (chod) obj;
                        eyee eyeeVar = chodVar.g;
                        eyee eyeeVar2 = chodVar.f;
                        byte[] I = eyeeVar.I();
                        byte[] I2 = eyeeVar2.I();
                        if (!eyeeVar.H() && !eyeeVar2.H()) {
                            ensk e = chhg.a.e();
                            e.Y(ente.a, "BugleNetwork");
                            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/common/CryptoHelper", "ensurePhoneKeyPairBytes", 236, "CryptoHelper.java")).q("CryptoHelper: Using existing identity key");
                            return elfo.e(new byte[][]{I2, I});
                        }
                        final chpy chpyVar = chpy.this;
                        fiwb a3 = fivy.a();
                        fiwa fiwaVar = a3.a;
                        fivz fivzVar = a3.b;
                        final byte[] a4 = fiwaVar.a();
                        ensk e2 = chhg.a.e();
                        e2.Y(ente.a, "BugleNetwork");
                        ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/net/common/CryptoHelper", "ensurePhoneKeyPairBytes", 222, "CryptoHelper.java")).q("CryptoHelper: Storing new identity key");
                        final byte[] bArr = fivzVar.a;
                        return chpyVar.b.j(new emwl() { // from class: chpe
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                choa choaVar = (choa) ((chod) obj2).toBuilder();
                                eyee x = eyee.x(a4);
                                choaVar.copyOnWrite();
                                ((chod) choaVar.instance).f = x;
                                eyee x2 = eyee.x(bArr);
                                choaVar.copyOnWrite();
                                ((chod) choaVar.instance).g = x2;
                                return (chod) choaVar.build();
                            }
                        }).h(new emwl() { // from class: chpf
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                return null;
                            }
                        }, erpp.a).i(new eroh() { // from class: chhe
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                return chpy.this.a();
                            }
                        }, erpp.a).h(new emwl() { // from class: chhf
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                chod chodVar2 = (chod) obj2;
                                return new byte[][]{chodVar2.f.I(), chodVar2.g.I()};
                            }
                        }, erpp.a);
                    }
                }, erpp.a);
            }
            this.f.put(str, elflVar);
        }
        return elflVar;
    }
}
