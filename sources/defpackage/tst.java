package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tst implements ekrm {
    public final ffbr a;
    public final Context b;
    public final entd c;
    private final ffsk d;

    /* compiled from: PG */
    public interface a {
        tta d();
    }

    public tst(ffbr ffbrVar, ffsk ffskVar, Context context) {
        ffbrVar.getClass();
        ffskVar.getClass();
        context.getClass();
        this.a = ffbrVar;
        this.d = ffskVar;
        this.b = context;
        this.c = entd.c("BugleCms");
    }

    @Override // defpackage.ekrm
    public final ListenableFuture a() {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new tsu(this, null));
        return c;
    }
}
