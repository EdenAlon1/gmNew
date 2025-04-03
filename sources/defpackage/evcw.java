package defpackage;

import android.os.IBinder;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evcw implements emyl {
    private final fecr a;
    private final feeo b;
    private boolean c;

    public evcw(fecr fecrVar, feeo feeoVar, lkr lkrVar) {
        this.a = fecrVar;
        this.b = feeoVar;
        fees.a(lkrVar.P(), fecrVar);
    }

    @Override // defpackage.emyl
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized IBinder get() {
        if (!this.c) {
            try {
                this.c = true;
                this.a.b();
            } catch (IOException e) {
                ((enrr) ((enrr) ((enrr) evcx.a.i()).g(e)).h("com/google/frameworks/client/data/android/binder/IoGrpcInterop$ServerLifecycle", "get", 76, "IoGrpcInterop.java")).t("Unable to start server %s", this.a);
            }
        }
        return this.b.a;
    }
}
