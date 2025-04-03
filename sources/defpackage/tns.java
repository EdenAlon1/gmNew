package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tns {
    public static final entd a = entd.c("BugleCmsPrimaryDevice");
    private final axkm b;
    private final errl c;

    public tns(axkm axkmVar, errl errlVar) {
        this.b = axkmVar;
        this.c = errlVar;
    }

    public final elfl a(final esvv esvvVar) {
        return this.b.n().i(new eroh() { // from class: tnr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Optional optional = (Optional) obj;
                entd entdVar = tns.a;
                if (optional.isEmpty()) {
                    ((ensz) ((ensz) tns.a.j()).h("com/google/android/apps/messaging/cloudstore/grpc/CmsPrimaryDeviceChecker", "throwIfDeviceNotAllowed", 49, "CmsPrimaryDeviceChecker.java")).q("No device ID on the device");
                    return elfo.e(null);
                }
                esvv esvvVar2 = esvv.this;
                Optional findFirst = Collection.EL.stream(esvvVar2.f).filter(new Predicate() { // from class: tno
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo439negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        entd entdVar2 = tns.a;
                        return ((esvx) obj2).b.equals(Optional.this.get());
                    }
                }).findFirst();
                if (csgj.a()) {
                    if (findFirst.isEmpty()) {
                        throw new csgw("Box primary device does not match current device, device is not included in box", 2);
                    }
                    int a2 = esvy.a(((esvx) findFirst.get()).d);
                    if (a2 == 0 || a2 != 4) {
                        throw new csgw("Device is disabled or unspecified", 1);
                    }
                } else {
                    if (findFirst.isEmpty()) {
                        throw new csgw("Device is not included in box");
                    }
                    int a3 = esvy.a(((esvx) findFirst.get()).d);
                    if (a3 == 0 || a3 != 4) {
                        throw new csgw("Device is disabled or unspecified");
                    }
                }
                ((ensz) ((ensz) tns.a.h()).h("com/google/android/apps/messaging/cloudstore/grpc/CmsPrimaryDeviceChecker", "throwIfDeviceNotAllowed", 94, "CmsPrimaryDeviceChecker.java")).q("Current device is primary device");
                return elfo.e(null);
            }
        }, this.c);
    }
}
