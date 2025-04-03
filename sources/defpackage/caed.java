package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import google.internal.communications.instantmessaging.v1.TachyonCommon$PublicPreKeySets;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caed implements cibn {
    public static final cskc a = cskc.g("BugleEtouffee", "RegisterDataDecoratorImpl");
    public final errl b;
    public final cadw c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    private final errl g;
    private final chpz h;

    public caed(errl errlVar, errl errlVar2, cadw cadwVar, ffbr ffbrVar, chpz chpzVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.b = errlVar;
        this.g = errlVar2;
        this.c = cadwVar;
        this.d = ffbrVar;
        this.h = chpzVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
    }

    @Override // defpackage.cibn
    public final elfl a(final fcbq fcbqVar, aoku aokuVar, int i) {
        final String str = (String) aokuVar.c().orElseThrow(new Supplier() { // from class: cadz
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalStateException("No normalized phone number.");
            }
        });
        return (i == 1 ? elfo.e(true) : this.h.a(str).d().h(new emwl() { // from class: caeb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((choc) obj) != choc.REGISTERED_WITH_PREKEYS);
            }
        }, this.b)).i(new eroh() { // from class: caea
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final fcbq fcbqVar2 = fcbqVar;
                if (!bzwd.a()) {
                    caed.a.m("Etouffee not enabled. Do not decorate RegisterData");
                    return elfo.e(fcbqVar2);
                }
                caed caedVar = caed.this;
                if (!((ctvb) caedVar.d.b()).G()) {
                    caed.a.p("Not default SMS app. Do not decorate RegisterData for Etouffee");
                    return elfo.e(fcbqVar2);
                }
                String str2 = str;
                if (((djrv) caedVar.e.b()).a(((djrk) caedVar.f.b()).a(str2)).f()) {
                    caed.a.p("RCS disabled by user. Do not decorate RegisterData for Etouffee");
                    return elfo.e(fcbqVar2);
                }
                fcks fcksVar = ((fcbr) fcbqVar2.instance).l;
                if (fcksVar == null) {
                    fcksVar = fcks.a;
                }
                fckr fckrVar = (fckr) fcks.a.createBuilder(fcksVar);
                fckrVar.a(cgye.ETOUFFEE.h);
                if (bzwf.g()) {
                    caed.a.p("Advertising Etouffee group");
                    fckrVar.a(cgye.ETOUFFEE_GROUPS.h);
                }
                fcbqVar2.copyOnWrite();
                fcbr fcbrVar = (fcbr) fcbqVar2.instance;
                fcks fcksVar2 = (fcks) fckrVar.build();
                fcksVar2.getClass();
                fcbrVar.l = fcksVar2;
                fcbrVar.b |= 8;
                if (!booleanValue) {
                    caed.a.p("Added Etouffee capability without generating prekeys");
                    return elfo.e(fcbqVar2);
                }
                caed.a.p("Added Etouffee capability and will generate prekeys");
                cadw cadwVar = caedVar.c;
                cadwVar.e.b();
                return cadwVar.a(str2).h(new emwl() { // from class: cadu
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return Optional.of((TachyonCommon$PublicPreKeySets) obj2);
                    }
                }, erpp.a).e(Throwable.class, new emwl() { // from class: cadv
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cadw.a.s("Failed to generate prekey set.", (Throwable) obj2);
                        return Optional.empty();
                    }
                }, erpp.a).h(new emwl() { // from class: caec
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        Optional optional = (Optional) obj2;
                        boolean isPresent = optional.isPresent();
                        fcbq fcbqVar3 = fcbq.this;
                        if (!isPresent) {
                            csjb a2 = caed.a.a();
                            a2.I("Fall back to empty prekey set");
                            a2.r();
                            return fcbqVar3;
                        }
                        TachyonCommon$PublicPreKeySets tachyonCommon$PublicPreKeySets = (TachyonCommon$PublicPreKeySets) optional.get();
                        fcbqVar3.copyOnWrite();
                        fcbr fcbrVar2 = (fcbr) fcbqVar3.instance;
                        fcbr fcbrVar3 = fcbr.a;
                        fcbrVar2.p = tachyonCommon$PublicPreKeySets;
                        fcbrVar2.b |= 1024;
                        return fcbqVar3;
                    }
                }, caedVar.b);
            }
        }, this.g);
    }
}
