package defpackage;

import j$.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yec {
    private static final enru f = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/PersistenceDraftObserver");
    public final ffsk a;
    public final ffhd b;
    public final ydy c;
    public final Duration d;
    public final ydb e;
    private final AtomicReference g;

    public yec(ffsk ffskVar, ffhd ffhdVar, ydb ydbVar, ydy ydyVar, Duration duration) {
        ffskVar.getClass();
        ffhdVar.getClass();
        ydbVar.getClass();
        this.a = ffskVar;
        this.b = ffhdVar;
        this.e = ydbVar;
        this.c = ydyVar;
        this.d = duration;
        this.g = new AtomicReference();
    }

    public final Object a(ffud ffudVar, ffgu ffguVar) {
        Object a;
        ffud ffudVar2 = (ffud) this.g.getAndSet(ffudVar);
        ensk f2 = f.f();
        f2.Y(ente.a, "BugleComposeRow2");
        ((enrr) f2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/PersistenceDraftObserver", "replaceSubscription", 47, "PersistenceDraftObserver.kt")).D("Replacing draft persistence subscription %s with %s", ffudVar2, ffudVar);
        return (ffudVar2 == null || (a = ffui.a(ffudVar2, ffguVar)) != ffhh.a) ? ffcu.a : a;
    }
}
