package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import j$.time.Instant;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlrl implements dlrm {
    private static final enru a = enru.c("com/google/android/libraries/communications/mobileconfiguration/storage/BugleConfigurationManagerImpl");
    private final Context b;
    private final Uri c;

    public dlrl(Context context, Uri uri) {
        this.b = context;
        this.c = uri;
    }

    private final Bundle f(String str, String str2, Optional optional) {
        final Bundle bundle = new Bundle();
        bundle.putString("storage_file_name", "bugle_mobile_configuration");
        bundle.putString("preference_key", str2);
        optional.ifPresent(new Consumer() { // from class: dlrk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                bundle.putString("preference_value", (String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        try {
            return this.b.getContentResolver().call(this.c, str, "STRING", bundle);
        } catch (IllegalArgumentException | IllegalStateException e) {
            ((enrr) ((enrr) ((enrr) a.j()).g(e)).h("com/google/android/libraries/communications/mobileconfiguration/storage/BugleConfigurationManagerImpl", "callContentProvider", 'J', "BugleConfigurationManagerImpl.java")).q("error in callContentProvider");
            return null;
        }
    }

    @Override // defpackage.dlrm
    public final enip a(enhk enhkVar) {
        enin eninVar = new enin();
        enqu listIterator = enhkVar.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            String str = (String) entry.getKey();
            dlro dlroVar = (dlro) d(str).orElse(dlro.a);
            ewgy ewgyVar = dlroVar.c;
            if (ewgyVar == null) {
                ewgyVar = ewgy.a;
            }
            if (!ewgyVar.equals(entry.getValue())) {
                eninVar.c((String) entry.getKey());
                dlrn dlrnVar = (dlrn) dlroVar.toBuilder();
                ewgy ewgyVar2 = (ewgy) entry.getValue();
                dlrnVar.copyOnWrite();
                dlro dlroVar2 = (dlro) dlrnVar.instance;
                ewgyVar2.getClass();
                dlroVar2.c = ewgyVar2;
                dlroVar2.b |= 1;
                e(str, (dlro) dlrnVar.build());
            }
        }
        return eninVar.g();
    }

    @Override // defpackage.dlrm
    public final Optional b() {
        enhk enhkVar = (enhk) c().orElse(enoz.a);
        Instant minusSeconds = Instant.now().minusSeconds(fdqu.a.get().a(this.b));
        enin eninVar = new enin();
        enqu listIterator = enhkVar.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            dlro dlroVar = (dlro) entry.getValue();
            if ((dlroVar.b & 8) != 0) {
                eyja eyjaVar = dlroVar.f;
                if (eyjaVar == null) {
                    eyjaVar = eyja.a;
                }
                if (eykj.d(eyjaVar).isBefore(minusSeconds)) {
                    Bundle f = f("REMOVE", (String) entry.getKey(), Optional.empty());
                    if (f == null || f.containsKey("result_error_key")) {
                        ((enrr) ((enrr) a.j()).h("com/google/android/libraries/communications/mobileconfiguration/storage/BugleConfigurationManagerImpl", "deleteStaleConfigs", 177, "BugleConfigurationManagerImpl.java")).q("deleteStaleConfigs: error calling content provider");
                        return Optional.empty();
                    }
                    eninVar.c((String) entry.getKey());
                } else {
                    continue;
                }
            }
        }
        return Optional.of(eninVar.g());
    }

    @Override // defpackage.dlrm
    public final Optional c() {
        Bundle f = f("GET", "bugle_all_mobile_configurations", Optional.empty());
        if (f == null || f.containsKey("result_error_key")) {
            ((enrr) ((enrr) a.j()).h("com/google/android/libraries/communications/mobileconfiguration/storage/BugleConfigurationManagerImpl", "getAllConfigurationData", 107, "BugleConfigurationManagerImpl.java")).q("getAllConfigurationData: error calling content provider");
            return Optional.empty();
        }
        try {
            return Optional.of(enhk.j(DesugarCollections.unmodifiableMap(((dlrr) cbhj.a(f.getString("preference_key"), dlrr.a)).b)));
        } catch (eygu unused) {
            ((enrr) ((enrr) a.j()).h("com/google/android/libraries/communications/mobileconfiguration/storage/BugleConfigurationManagerImpl", "getAllConfigurationData", 118, "BugleConfigurationManagerImpl.java")).q("getAllConfigurationData: error decoding string to proto");
            return Optional.empty();
        }
    }

    @Override // defpackage.dlrm
    public final Optional d(String str) {
        Bundle f = f("GET", str, Optional.empty());
        if (f == null || f.containsKey("result_error_key")) {
            ((enrr) ((enrr) a.h()).h("com/google/android/libraries/communications/mobileconfiguration/storage/BugleConfigurationManagerImpl", "getConfigurationData", 84, "BugleConfigurationManagerImpl.java")).q("getConfigurationData: error calling content provider");
            return Optional.empty();
        }
        try {
            dlro dlroVar = (dlro) cbhj.a(f.getString("preference_key"), dlro.a);
            return dlroVar.equals(dlro.a) ? Optional.empty() : Optional.of(dlroVar);
        } catch (eygu unused) {
            ((enrr) ((enrr) a.j()).h("com/google/android/libraries/communications/mobileconfiguration/storage/BugleConfigurationManagerImpl", "getConfigurationData", 97, "BugleConfigurationManagerImpl.java")).q("getConfigurationData: error decoding string to proto");
            return Optional.empty();
        }
    }

    @Override // defpackage.dlrm
    public final void e(String str, dlro dlroVar) {
        Bundle f = f("PUT", str, Optional.of(cbhj.b(dlroVar)));
        if (f == null || f.containsKey("result_error_key")) {
            ((enrr) ((enrr) a.j()).h("com/google/android/libraries/communications/mobileconfiguration/storage/BugleConfigurationManagerImpl", "putConfigurationData", 155, "BugleConfigurationManagerImpl.java")).q("putConfigurationData: error calling content provider");
            throw new dlqr();
        }
    }
}
