package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcw implements eiuz {
    public static final enru a = enru.c("com/google/android/apps/messaging/cloudstore/accounts/FiAccountRequirement");
    public final Context b;
    private final ffsk c;

    public tcw(ffsk ffskVar, Context context) {
        ffskVar.getClass();
        context.getClass();
        this.c = ffskVar;
        this.b = context;
    }

    @Override // defpackage.eiuz
    public final ListenableFuture a(eisx eisxVar, eiva eivaVar) {
        elfl c;
        eisxVar.getClass();
        c = axol.c(this.c, ffhe.a, ffsm.a, new tcv(eisxVar, this, eivaVar, null));
        return c;
    }
}
