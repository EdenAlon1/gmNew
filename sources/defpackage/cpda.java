package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpda {
    public static final /* synthetic */ int c = 0;
    private static final entd d = entd.c("BugleSyncManager");
    public final effy a;
    public final cqoh b;

    public cpda(effy effyVar, cqoh cqohVar) {
        this.a = effyVar;
        this.b = cqohVar;
    }

    public static Optional c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Optional.of(UUID.fromString(str));
            } catch (IllegalArgumentException e) {
                ((ensz) ((ensz) ((ensz) d.j()).g(e)).h("com/google/android/apps/messaging/shared/sms/datastore/SyncManagerDataStore", "uuidFromString", 109, "SyncManagerDataStore.java")).t("Failed to parse Current Sync Id: [%s]", str);
            }
        }
        return Optional.empty();
    }

    public final elfl a() {
        return elfl.g(this.a.a()).h(new emwl() { // from class: cpcq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Long.valueOf(((cpcp) obj).c);
            }
        }, erpp.a);
    }

    public final elfl b(final long j) {
        return elfl.g(this.a.b(new emwl() { // from class: cpcu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = cpda.c;
                cpco cpcoVar = (cpco) ((cpcp) obj).toBuilder();
                cpcoVar.copyOnWrite();
                cpcp cpcpVar = (cpcp) cpcoVar.instance;
                cpcpVar.b |= 1;
                cpcpVar.c = j;
                return (cpcp) cpcoVar.build();
            }
        }, erpp.a));
    }
}
