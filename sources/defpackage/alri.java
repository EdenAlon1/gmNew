package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alri {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/analytics/statistics/DuplicateMessageChecker");
    public static final Set b = fffi.d(3, 0, 1);
    public final ffbr c;
    public final ffbr d;
    private final ffsk e;

    public alri(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.e = ffskVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
    }

    public final elfl a(MessageCoreData messageCoreData) {
        elfl c;
        c = axol.c(this.e, ffhe.a, ffsm.a, new alrh(this, messageCoreData, null));
        return c;
    }
}
