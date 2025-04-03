package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
class elha implements eewm {
    final eewm a;
    final /* synthetic */ elhc b;

    public elha(elhc elhcVar, eewm eewmVar) {
        this.b = elhcVar;
        this.a = eewmVar;
    }

    @Override // defpackage.eewm
    public final String c() {
        return this.a.c();
    }

    @Override // defpackage.eewm
    public final List d() {
        int i = engw.d;
        engr engrVar = new engr();
        Iterator it = this.a.d().iterator();
        while (it.hasNext()) {
            engrVar.h(new elgy(this.b, (eewl) it.next()));
        }
        return engrVar.g();
    }

    @Override // defpackage.eewm
    public final List e() {
        int i = engw.d;
        engr engrVar = new engr();
        Iterator it = this.a.e().iterator();
        while (it.hasNext()) {
            engrVar.h(this.b.a((eewm) it.next()));
        }
        return engrVar.g();
    }
}
