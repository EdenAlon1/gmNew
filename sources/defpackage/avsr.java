package defpackage;

import android.content.Context;
import android.telephony.ims.ImsException;
import android.telephony.ims.ImsManager;
import android.telephony.ims.ImsRcsManager;
import android.telephony.ims.RcsContactPresenceTuple;
import android.telephony.ims.RcsContactUceCapability;
import android.telephony.ims.RcsUceAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avsr implements avrk, avtc {
    public final Context a;
    public final ckds b;
    public final avor c;
    public final errl d;
    public final cqoh e;
    public final diid f;
    private final Random g = new Random();
    private final azei h;

    public avsr(Context context, errl errlVar, ckds ckdsVar, avor avorVar, cqoh cqohVar, diid diidVar, azei azeiVar) {
        this.a = context;
        this.b = ckdsVar;
        this.c = avorVar;
        this.d = errlVar;
        this.e = cqohVar;
        this.f = diidVar;
        this.h = azeiVar;
    }

    @Override // defpackage.avrk
    public final elfl a(Iterable iterable) {
        return elfo.d(new IllegalStateException("getBatchCapabilities not supported for SingleReg."));
    }

    @Override // defpackage.avrk
    public final elfl b(final awui awuiVar) {
        final long nextLong = this.g.nextLong();
        return elfl.g(kfg.a(new kfd() { // from class: avsl
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                ImsRcsManager imsRcsManager;
                RcsUceAdapter uceAdapter;
                avsr avsrVar = avsr.this;
                diid diidVar = avsrVar.f;
                long j = nextLong;
                diidVar.b(j, 3);
                int e = avsrVar.b.h().e();
                if (!ctid.e) {
                    throw new avlo("[Single Registration] Version S or higher is only supported");
                }
                ImsManager m68m = aeb$$ExternalSyntheticApiModelOutline0.m68m(avsrVar.a.getSystemService(aeb$$ExternalSyntheticApiModelOutline0.m71m()));
                if (m68m == null) {
                    throw new avlo("[Single Registration] Unable to get UCE adapter from the platform.");
                }
                awui awuiVar2 = awuiVar;
                imsRcsManager = m68m.getImsRcsManager(e);
                uceAdapter = imsRcsManager.getUceAdapter();
                uceAdapter.requestAvailability(aolm.b(awuiVar2), avsrVar.d, new avsq(avsrVar, kfbVar, j));
                return "SingleRegistrationNetworkCapabilitiesProvider.getCapabilities";
            }
        })).i(new eroh() { // from class: avsm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                avoi a;
                engw engwVar;
                avsr avsrVar = avsr.this;
                RcsContactUceCapability rcsContactUceCapability = (RcsContactUceCapability) obj;
                Instant f = avsrVar.e.f();
                int capabilityMechanism = rcsContactUceCapability.getCapabilityMechanism();
                avor avorVar = avsrVar.c;
                if (capabilityMechanism == 1) {
                    List<RcsContactPresenceTuple> capabilityTuples = rcsContactUceCapability.getCapabilityTuples();
                    HashSet hashSet = new HashSet();
                    for (RcsContactPresenceTuple rcsContactPresenceTuple : capabilityTuples) {
                        if (rcsContactPresenceTuple == null) {
                            ((ensz) ((ensz) avor.a.j()).h("com/google/android/apps/messaging/shared/chatapi/capabilities/converter/RcsCapabilitiesConverter", "convertTupleListToRcsCapabilities", 73, "RcsCapabilitiesConverter.java")).q("[SR] Received a null presence capabilities tuple.");
                        } else if (!"closed".equals(rcsContactPresenceTuple.getStatus())) {
                            avol avolVar = new avol();
                            avolVar.b(rcsContactPresenceTuple.getServiceId());
                            avolVar.c(rcsContactPresenceTuple.getServiceVersion());
                            avoo a2 = avolVar.a();
                            enhk enhkVar = (enhk) avorVar.b.a.get();
                            if (enhkVar.containsKey(a2)) {
                                engwVar = (engw) enhkVar.get(a2);
                            } else {
                                int i = engw.d;
                                engwVar = enou.a;
                            }
                            hashSet.addAll(engwVar);
                            RcsContactPresenceTuple.ServiceCapabilities serviceCapabilities = rcsContactPresenceTuple.getServiceCapabilities();
                            if (serviceCapabilities != null && a2.equals(avos.m) && serviceCapabilities.isVideoCapable()) {
                                hashSet.add("video");
                            }
                        }
                    }
                    if (!hashSet.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp")) {
                        hashSet.remove("urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session.group");
                    }
                    a = avor.a(avorVar.c.a(hashSet));
                } else {
                    a = avor.a(avorVar.c.a(rcsContactUceCapability.getFeatureTags()));
                }
                int i2 = avmz.b;
                avml avmlVar = new avml();
                avmlVar.c(a);
                avmlVar.b(f);
                return elfo.e(avmlVar.a());
            }
        }, this.d).f(IllegalArgumentException.class, new eroh() { // from class: avsn
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                avsr.this.e(nextLong);
                return elfo.d(new avlo("[Single Registration] Failed to force the platform to make a network exchange", (IllegalArgumentException) obj));
            }
        }, this.d).f(aeb$$ExternalSyntheticApiModelOutline0.m81m$1(), new eroh() { // from class: avso
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                avsr avsrVar = avsr.this;
                long j = nextLong;
                ImsException m67m = aeb$$ExternalSyntheticApiModelOutline0.m67m(obj);
                avsrVar.e(j);
                return elfo.d(new avlo("[Single Registration] Failed to force the platform to make a network exchange", m67m));
            }
        }, this.d).f(SecurityException.class, new eroh() { // from class: avsp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                avsr.this.e(nextLong);
                return elfo.d(new avlo("[Single Registration] Failed to force the platform to make a network exchange", (SecurityException) obj));
            }
        }, this.d);
    }

    @Override // defpackage.avtc
    public final elfl c(final awui awuiVar) {
        return b(awuiVar).i(new eroh() { // from class: avsh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return avsr.this.d(awuiVar, (avmz) obj);
            }
        }, this.d).h(new emwl() { // from class: avsi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return avtb.ONLINE;
            }
        }, erpp.a).f(avlo.class, new eroh() { // from class: avsj
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                avlo avloVar = (avlo) obj;
                int i = avloVar.b;
                if (i == 3 || i == 4) {
                    return elfo.e(avtb.OFFLINE);
                }
                if (i != 7) {
                    return elfo.d(avloVar);
                }
                awui awuiVar2 = awuiVar;
                avsr avsrVar = avsr.this;
                return avsrVar.d(awuiVar2, avmz.e(avsrVar.e.f())).h(new emwl() { // from class: avsk
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return avtb.NOT_RCS;
                    }
                }, erpp.a);
            }
        }, this.d);
    }

    public final elfl d(final awui awuiVar, final avmz avmzVar) {
        return this.h.a(new Function() { // from class: avsg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((avpe) obj).b(awui.this, avmzVar);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final void e(long j) {
        this.f.a(j, 3, -1, -1L);
    }
}
