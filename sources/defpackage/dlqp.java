package defpackage;

import android.content.Context;
import j$.time.Instant;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlqp implements dlqm {
    public static final enru a = enru.c("com/google/android/libraries/communications/mobileconfiguration/api/accessor/MobileConfigurationAccessor");
    public final dlrm b;
    private final Context c;
    private final errl d;
    private final errl e;

    public dlqp(Context context, errl errlVar, errl errlVar2, dlrm dlrmVar) {
        this.c = context;
        this.d = errlVar;
        this.e = errlVar2;
        this.b = dlrmVar;
    }

    @Override // defpackage.dlqm
    public final Optional a(final String str) {
        Optional d = this.b.d(str);
        if (!d.isPresent() || (((dlro) d.get()).b & 2) == 0) {
            ((enrr) ((enrr) a.e()).h("com/google/android/libraries/communications/mobileconfiguration/api/accessor/MobileConfigurationAccessor", "getConfiguration", 83, "MobileConfigurationAccessor.java")).q("getConfiguration returning empty");
            return Optional.empty();
        }
        ewgw ewgwVar = ((dlro) d.get()).d;
        if (ewgwVar == null) {
            ewgwVar = ewgw.a;
        }
        if (fdqx.a.get().j(this.c)) {
            dlrn dlrnVar = (dlrn) ((eyfy) d.get()).toBuilder();
            eyja b = eykj.b(Instant.now());
            dlrnVar.copyOnWrite();
            dlro dlroVar = (dlro) dlrnVar.instance;
            b.getClass();
            dlroVar.f = b;
            dlroVar.b |= 8;
            final dlro dlroVar2 = (dlro) dlrnVar.build();
            erqt.r(this.d.submit(new Callable() { // from class: dlqn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    dlqp.this.b.e(str, dlroVar2);
                    return null;
                }
            }), new dlqo(), this.e);
        }
        eyja eyjaVar = ((dlro) d.get()).e;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        Instant d2 = eykj.d(eyjaVar);
        eyev eyevVar = ewgwVar.f;
        if (eyevVar == null) {
            eyevVar = eyev.a;
        }
        if (d2.plus(eykj.c(eyevVar)).isBefore(Instant.now())) {
            ((enrr) ((enrr) a.e()).h("com/google/android/libraries/communications/mobileconfiguration/api/accessor/MobileConfigurationAccessor", "getConfiguration", 79, "MobileConfigurationAccessor.java")).q("getConfiguration returning expired config");
        }
        return Optional.of(ewgwVar);
    }

    @Override // defpackage.dlqm
    public final void b() {
        throw new UnsupportedOperationException("accessor does not support forceSyncConfigurations");
    }

    @Override // defpackage.dlqm
    public final void d(enhk enhkVar) {
        throw new UnsupportedOperationException("accessor does not support registerParameters");
    }
}
