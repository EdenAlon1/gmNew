package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzst implements dzdv {
    private final Context a;

    public dzst(Context context) {
        this.a = context;
    }

    @Override // defpackage.dzdv
    public final dzdu a() {
        return new dzte(this.a);
    }

    @Override // defpackage.dzdv
    public final String b() {
        return "rich_card";
    }

    @Override // defpackage.dzdv
    public final void c(dzja dzjaVar, dzqs dzqsVar, dzhn dzhnVar) {
        dzhl r = dzhm.r();
        r.g(36);
        r.n(dzjaVar.c().f());
        r.o(dzjaVar.d().E());
        dznm dznmVar = (dznm) dzqsVar;
        r.p(dznmVar.a);
        r.d(dznmVar.c);
        dzhnVar.b(r.a());
    }

    @Override // defpackage.dzdv
    public final void d(dzja dzjaVar, dzqs dzqsVar, dzhn dzhnVar) {
        dzhl r = dzhm.r();
        r.g(35);
        r.n(dzjaVar.c().f());
        r.o(dzjaVar.d().E());
        r.p(dzqsVar.r());
        r.d(dzqsVar.f());
        dzhnVar.b(r.a());
    }

    @Override // defpackage.dzdv
    public final void e() {
        erqt.i(true);
    }

    @Override // defpackage.dzdv
    public final ListenableFuture f(dzqs dzqsVar) {
        return erqt.i(dzqsVar);
    }
}
