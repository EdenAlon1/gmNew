package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aitp implements aefa, ejlr {
    private static final cskc a = cskc.g("BugleSuperSort", "NegativeButtonOnClickListener");
    private final aitz b;
    private final ejvp c;
    private final aiuv d;

    public aitp(aitz aitzVar, ejvp ejvpVar, aiuv aiuvVar) {
        this.b = aitzVar;
        this.c = ejvpVar;
        this.d = aiuvVar;
    }

    @Override // defpackage.aefa
    public final void a(ejlq ejlqVar, View view) {
        ejlqVar.g(ejlp.b(this.b.f()), this);
        this.d.c(3);
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        a.q("Banner is dismissed.");
        this.c.a(elfo.e(null), aefc.a);
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        a.s("Failed to dismiss banner", th);
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
