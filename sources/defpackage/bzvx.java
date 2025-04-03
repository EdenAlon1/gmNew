package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.BaseCryptoBuilder;
import com.google.communication.synapse.security.scytale.DbWrapperFactory;
import com.google.communication.synapse.security.scytale.KeyPair;
import com.google.communication.synapse.security.scytale.MessageEncryptorV2Builder;
import com.google.communication.synapse.security.scytale.NativeBaseCrypto;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import com.google.communication.synapse.security.scytale.Scope;
import com.google.communication.synapse.security.scytale.ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig;
import com.google.media.webrtc.common.StatusOr;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzvx {
    public static final cskc a = cskc.g("BugleEtouffee", "CryptoV2Provider");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/CryptoV2Provider");
    public final caga c;
    public final cafi d;
    public final DbWrapperFactory e;
    public final chpz f;
    public final ffbr g;
    public final ffbr h;
    public final ConcurrentMap i = new ConcurrentHashMap();
    public final cadx j;
    private final chhg k;
    private final fazb l;
    private final errl m;
    private final errl n;
    private final ffbr o;

    public bzvx(ffbr ffbrVar, chhg chhgVar, caga cagaVar, fazb fazbVar, cafi cafiVar, cagg caggVar, errl errlVar, errl errlVar2, ffbr ffbrVar2, cadx cadxVar, chpz chpzVar, ffbr ffbrVar3) {
        this.g = ffbrVar;
        this.k = chhgVar;
        this.h = ffbrVar3;
        this.c = cagaVar;
        this.l = fazbVar;
        this.d = cafiVar;
        this.e = new bzvw(caggVar);
        this.m = errlVar;
        this.n = errlVar2;
        this.o = ffbrVar2;
        this.j = cadxVar;
        this.f = chpzVar;
    }

    private final elfl d(String str) {
        return this.k.b(str).h(new emwl() { // from class: bzvo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                byte[][] bArr = (byte[][]) obj;
                eyee x = eyee.x(bArr[0]);
                eyee x2 = eyee.x(bArr[1]);
                emxf.a(x.d() == 33);
                emxf.a(x2.d() == 32);
                return new esoq(x, x2);
            }
        }, erpp.a);
    }

    public final elfl a(final String str) {
        synchronized (this.i) {
            elfl elflVar = (elfl) this.i.get(str);
            if (elflVar != null) {
                return elflVar;
            }
            this.l.b();
            elfl f = d(str).i(new eroh() { // from class: bzvj
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig defaultInstance;
                    esor esorVar = (esor) obj;
                    String a2 = cagf.a(esorVar);
                    csjb a3 = bzvx.a.a();
                    a3.I("Building base crypto");
                    final String str2 = str;
                    a3.x("normalizedPhoneNumber", str2, 2);
                    a3.A("tableNamePrefix", a2);
                    a3.r();
                    final bzvx bzvxVar = bzvx.this;
                    Scope create = Scope.create(bzvxVar.d.b());
                    BaseCryptoBuilder createBuilder = BaseCryptoBuilder.createBuilder(bzvxVar.e, new KeyPair(esorVar.b().I(), esorVar.a().I()));
                    emyw.e(createBuilder);
                    cskc cskcVar = bzwd.a;
                    try {
                        defaultInstance = ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig.parseFrom((byte[]) bzwd.e.e(), eyfc.a());
                    } catch (eygu e) {
                        bzwd.a.s("Error parsing ScytaleExperimentConfig, using default instance instead", e);
                        defaultInstance = ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig.getDefaultInstance();
                    }
                    BaseCryptoBuilder experimentConfig = createBuilder.setExperimentConfig(defaultInstance);
                    emyw.e(experimentConfig);
                    BaseCryptoBuilder tableNamePrefix = experimentConfig.setTableNamePrefix(a2);
                    emyw.e(tableNamePrefix);
                    StatusOr<NativeBaseCrypto> build = tableNamePrefix.build(create);
                    if (build.hasValue) {
                        bzvx.a.p("Base crypto created");
                        return elfo.e(build.value);
                    }
                    final fedn fednVar = new fedn(build.status);
                    if (build.status.getCode() != Status.q.getCode()) {
                        return elfo.d(fednVar);
                    }
                    csjb a4 = bzvx.a.a();
                    a4.I("Resetting database due to a data loss failure");
                    a4.x("normalizedPhoneNumber", str2, 2);
                    a4.r();
                    return bzvxVar.f.a(str2).h(chob.LOW_PREKEYS).i(new eroh() { // from class: bzvt
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            return bzvx.this.c(str2);
                        }
                    }, erpp.a).h(new emwl() { // from class: bzvu
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            bzvx.this.j.a(str2);
                            return null;
                        }
                    }, erpp.a).i(new eroh() { // from class: bzvq
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            return elfo.d(fedn.this);
                        }
                    }, erpp.a);
                }
            }, this.n).f(Throwable.class, new eroh() { // from class: bzvn
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    Throwable th = (Throwable) obj;
                    bzvx.a.s("Failed to create base crypto", th);
                    String str2 = str;
                    bzvx bzvxVar = bzvx.this;
                    synchronized (bzvxVar.i) {
                        bzvxVar.i.remove(str2);
                    }
                    return elfo.d(th);
                }
            }, erpp.a);
            synchronized (this.i) {
                this.i.putIfAbsent(str, f);
            }
            return f;
        }
    }

    public final elfl b(final String str) {
        elfl h = ((bzqc) this.o.b()).e(str).h(new emwl() { // from class: bzvv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                bzvx.a.r("CryptoV2Provider.get called while Etouffee is unprovisioned");
                throw new cagb();
            }
        }, erpp.a);
        final elfl i = h.i(new eroh() { // from class: bzvk
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return bzvx.this.a(str);
            }
        }, erpp.a);
        final elfl i2 = h.i(new eroh() { // from class: bzvl
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return bzvx.this.c.a(str);
            }
        }, this.m);
        return elfo.m(i, i2).a(new Callable() { // from class: bzvm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                NativeBaseCrypto nativeBaseCrypto = (NativeBaseCrypto) erqt.q(i);
                String str2 = (String) erqt.q(i2);
                Scope create = Scope.create(bzvx.this.d.b());
                MessageEncryptorV2Builder createBuilder = MessageEncryptorV2Builder.createBuilder(nativeBaseCrypto, enkr.c(str), str2);
                emyw.e(createBuilder);
                MessageEncryptorV2Builder requireUserTrustedInfo = createBuilder.setRequireUserTrustedInfo(true);
                emyw.e(requireUserTrustedInfo);
                return (NativeMessageEncryptorV2) cafo.a(requireUserTrustedInfo.build(create));
            }
        }, this.m);
    }

    final elfl c(final String str) {
        a.p("Resetting crypto data store");
        return d(str).h(new emwl() { // from class: bzvr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                String a2;
                final String str2 = str;
                esor esorVar = (esor) obj;
                bzvx bzvxVar = bzvx.this;
                synchronized (bzvxVar.i) {
                    bzvxVar.i.remove(str2);
                    if (((atqu) bzvxVar.g.b()).a()) {
                        Set e = ((crgh) bzvxVar.h.b()).e();
                        if (e.size() == 1 && ((Boolean) Collection.EL.stream(e).findAny().map(new Function() { // from class: bzvp
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return Boolean.valueOf(((awui) obj2).d.equals(str2));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).orElse(false)).booleanValue()) {
                            ensk h = bzvx.b.h();
                            h.Y(ente.a, "BugleEtouffee");
                            enrr enrrVar = (enrr) h;
                            enrrVar.Y(csux.E, str2);
                            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/CryptoV2Provider", "getScytaleTablesPrefixToDelete", 173, "CryptoV2Provider.java")).q("There is only one RCS identity, deleting all scytale tables");
                            a2 = "scytale_";
                        } else {
                            ensk h2 = bzvx.b.h();
                            h2.Y(ente.a, "BugleEtouffee");
                            enrr enrrVar2 = (enrr) h2;
                            enrrVar2.Y(csux.E, str2);
                            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/CryptoV2Provider", "getScytaleTablesPrefixToDelete", 179, "CryptoV2Provider.java")).q("There are multiple RCS identities, deleting only identity specific scytale tables.");
                            a2 = cagf.a(esorVar);
                        }
                    } else {
                        a2 = !bzvxVar.i.isEmpty() ? cagf.a(esorVar) : "scytale_";
                    }
                }
                return NativeBaseCrypto.resetDataStore(Scope.create(bzvxVar.d.b()), bzvxVar.e, a2);
            }
        }, this.m).h(new emwl() { // from class: bzvs
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Status status = (Status) obj;
                csjb c = bzvx.a.c();
                c.I("Scytale resetDataStore completed");
                c.A("status", status);
                c.r();
                cafo.b(status);
                return null;
            }
        }, erpp.a);
    }
}
