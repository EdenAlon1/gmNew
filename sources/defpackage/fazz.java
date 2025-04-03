package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fazz implements fbas {
    public final lmy a;
    public final Context b;
    private volatile fazk c;
    private final Object d = new Object();

    /* compiled from: PG */
    public interface a {
        akgc iG();
    }

    /* compiled from: PG */
    public interface b {
        fazv N();
    }

    public fazz(abe abeVar) {
        this.a = abeVar;
        this.b = abeVar;
    }

    public static final lmw a(lmy lmyVar, Context context) {
        return new lmw(lmyVar, new fazy(context));
    }

    @Override // defpackage.fbas
    public final /* bridge */ /* synthetic */ Object aX() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = ((fbaa) a(this.a, this.b).a(fbaa.class)).a;
                }
            }
        }
        return this.c;
    }
}
