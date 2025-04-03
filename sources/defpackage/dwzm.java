package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwzm implements dwzi, dwzh {
    public static final enru a = enru.c("com/google/android/libraries/mdi/download/debug/common/filegroups/MddDebugListFragmentActionProviderImpl");
    public final Executor c;
    public final ea d;
    public final dwyh e;
    public emud f;
    public dwzf g;
    public final emtz b = new dwzk(this);
    public dwzh h = null;

    public dwzm(ea eaVar, dwyh dwyhVar, Executor executor) {
        emxf.b(true, "This helper class requires a fragment that implements IMddDebugListFragment!");
        this.d = eaVar;
        this.e = dwyhVar;
        this.c = executor;
    }

    public final void a() {
        dwzh dwzhVar = this.h;
        if (dwzhVar != null) {
            final dwzt dwztVar = (dwzt) dwzhVar;
            dwztVar.b.fe().runOnUiThread(new Runnable() { // from class: dwzr
                @Override // java.lang.Runnable
                public final void run() {
                    dwzt.this.e.d(false);
                }
            });
        }
    }

    @Override // defpackage.dwzh
    public final void b(String str) {
        throw null;
    }

    @Override // defpackage.dwzi
    public final void c() {
        this.f.c(emud.a(this.g.a()), this.b, "MDD.DEBUG.UPDATE_ACTION");
    }
}
