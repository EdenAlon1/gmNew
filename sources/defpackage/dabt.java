package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dabt implements crjx {
    private final Context a;
    private final dabs b;

    public dabt(Context context, dabs dabsVar) {
        this.a = context;
        this.b = dabsVar;
    }

    @Override // defpackage.crjx
    public final int a() {
        return je.b;
    }

    @Override // defpackage.crjx
    public final void b() {
        this.b.b(1);
    }

    @Override // defpackage.crjx
    public final void c() {
        this.b.b(2);
    }

    @Override // defpackage.crjx
    public final void d() {
        dabs dabsVar = this.b;
        final dabo daboVar = dabsVar.e;
        dabsVar.f = elfo.h(new erog() { // from class: dabm
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return ((effy) dabo.this.a.b()).a();
            }
        }, daboVar.b).h(new emwl() { // from class: dabn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Integer.valueOf(((dabj) obj).c);
            }
        }, erpp.a);
    }

    @Override // defpackage.crjx
    public final void e() {
        elfl elflVar;
        dabs dabsVar = this.b;
        if (dabsVar.g || (elflVar = dabsVar.f) == null) {
            ensk i = dabs.a.i();
            i.Y(ente.a, "Bugle");
            ((enrr) ((enrr) i).h("com/google/android/apps/messaging/ui/dark/DarkModeManager", "setDarkModeOnAppStart", 88, "DarkModeManager.java")).I("DarkModeManager: Unexpected call to setDarkModeOnAppStart. initialized: %s darkModeFuture: %s", dabsVar.g, dabsVar.f == null);
            return;
        }
        dabsVar.g = true;
        if (!elflVar.isDone()) {
            dabsVar.f.k(new dabr(dabsVar), (Executor) dabsVar.d.b());
            return;
        }
        try {
            dabsVar.a(((Integer) erqt.q(dabsVar.f)).intValue());
        } catch (Exception e) {
            ensk j = dabs.a.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/ui/dark/DarkModeManager", "setDarkModeOnAppStart", 'c', "DarkModeManager.java")).q("DarkModeManager: Get DarkMode error");
        }
    }

    @Override // defpackage.crjx
    public final void f(int i) {
        this.b.b(i);
    }

    @Override // defpackage.crjx
    public final boolean g() {
        if (!ctid.c) {
            return je.b == 2;
        }
        int i = je.b;
        return i != -1 ? i == 2 : (this.a.getResources().getConfiguration().uiMode & 48) == 32;
    }

    @Override // defpackage.crjx
    public final void h() {
    }
}
