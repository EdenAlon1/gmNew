package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cqrn {
    public abstract Optional a();

    public abstract Optional b();

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, java.lang.Object] */
    public final boolean c() {
        return a().isPresent() && (b().isPresent() && b().get().af().isPresent());
    }
}
