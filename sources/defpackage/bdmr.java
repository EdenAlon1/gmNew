package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdmr {
    private final ffbr a;
    private final ffbr b;

    public bdmr(ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    public final int a(MessageCoreData messageCoreData, int i) {
        if (messageCoreData.df()) {
            return 0;
        }
        if (messageCoreData.cm()) {
            return (((ckds) this.b.b()).d() == 1 && messageCoreData.ci()) ? 0 : 1;
        }
        return ((bcvw) this.a.b()).a(cuxt.b(messageCoreData.ar(), ""), i, messageCoreData.ab(), "automatic fallback message");
    }
}
