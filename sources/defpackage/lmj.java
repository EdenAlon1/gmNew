package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmj {
    public final lkv a;
    private final Handler b = new Handler();
    private lmi c;

    public lmj(lkr lkrVar) {
        this.a = new lkv(lkrVar);
    }

    public final void a(lki lkiVar) {
        lmi lmiVar = this.c;
        if (lmiVar != null) {
            lmiVar.run();
        }
        lmi lmiVar2 = new lmi(this.a, lkiVar);
        this.c = lmiVar2;
        this.b.postAtFrontOfQueue(lmiVar2);
    }
}
