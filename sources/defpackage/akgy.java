package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akgy implements dvbo {
    private final akis a;

    public akgy(akis akisVar) {
        this.a = akisVar;
    }

    @Override // defpackage.dvbo
    public final /* synthetic */ void a(ea eaVar) {
        dvsj dvsjVar = (dvsj) eaVar;
        evzc evzcVar = evzc.UITYPE_GM_DIALOG;
        akko akkoVar = this.a.b;
        dvsjVar.ai = enhk.m(evzcVar, akkoVar.gn, evzc.UITYPE_PERMISSION, akkoVar.go);
        dvsjVar.aj = (dvqv) this.a.a.eO.b();
        dvsjVar.ak = this.a.dU();
        dvsjVar.al = (Context) this.a.q.b();
        dvsjVar.ao = (dvqr) this.a.a.eQ.b();
    }
}
