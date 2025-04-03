package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
class abyw implements ejwd<engw<abzx>> {
    final /* synthetic */ abyy a;

    public abyw(abyy abyyVar) {
        this.a = abyyVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        this.a.a();
        ((ddzb) this.a.e.b()).k(R.string.donation_query_error);
        abyy.a.s("#messageListsCallback: failed to load conversations", th);
        ellj.f(new abyd(5), (ea) this.a.b.b());
        ((abxg) this.a.j.b()).c(3);
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        engw engwVar = (engw) obj;
        this.a.a();
        ((abxg) this.a.j.b()).c(2);
        if (this.a.p != null) {
            return;
        }
        if (engwVar.isEmpty()) {
            ((ddzb) this.a.e.b()).k(R.string.donation_no_messages_error);
            ellj.f(new abyd(3), (ea) this.a.b.b());
        }
        abyy abyyVar = this.a;
        RecyclerView recyclerView = abyyVar.o;
        abzn abznVar = (abzn) abyyVar.d.b();
        ffbr ffbrVar = abznVar.a;
        RecyclerView recyclerView2 = abyyVar.o;
        csrh csrhVar = (csrh) ffbrVar.b();
        csrhVar.getClass();
        ffbr ffbrVar2 = abznVar.b;
        ffbr ffbrVar3 = abznVar.c;
        recyclerView2.getClass();
        engwVar.getClass();
        recyclerView.am(new abzm(csrhVar, ffbrVar2, ffbrVar3, recyclerView2, engwVar));
        abzm abzmVar = (abzm) abyyVar.o.n;
        abzmVar.getClass();
        abyyVar.p = abzmVar;
        abyyVar.p.G();
    }

    @Override // defpackage.ejwd
    public final void hB() {
        this.a.b();
    }
}
