package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwiz implements cwiw {
    public static final enru a = enru.c("com/google/android/apps/messaging/startchat/tracker/SelectedSelfIdentityTrackerImpl");
    public final ffbr b;
    private final ffsk c;
    private final fgcm d;
    private final AtomicBoolean e;
    private final fgdj f;

    public cwiz(ffsk ffskVar, ffbr ffbrVar) {
        ffskVar.getClass();
        ffbrVar.getClass();
        this.c = ffskVar;
        this.b = ffbrVar;
        fgcm a2 = fgdm.a(null);
        this.d = a2;
        this.e = new AtomicBoolean(false);
        this.f = new fgco(a2);
    }

    @Override // defpackage.cwiw
    public final fgdj a() {
        return this.f;
    }

    @Override // defpackage.cwiw
    public final void b() {
        if (this.e.getAndSet(true)) {
            return;
        }
        axol.k(this.c, null, new cwix(this, null), 3);
    }

    @Override // defpackage.cwiw
    public final void c(SelfIdentityId selfIdentityId) {
        axol.k(this.c, null, new cwiy(this, selfIdentityId, null), 3);
    }

    @Override // defpackage.cwiw
    public final void d(aqux aquxVar) {
        fgcm fgcmVar;
        Object c;
        do {
            fgcmVar = this.d;
            c = fgcmVar.c();
        } while (!fgcmVar.g(c, aquxVar));
    }
}
