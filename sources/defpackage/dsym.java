package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsym {
    public final dsxk a;
    public final ffji b;
    public final ffji c;
    public final ffji d;
    public final dsyl e = new dsyl(this);

    @ffbs
    public dsym(dsxk dsxkVar, ffji ffjiVar, ffji ffjiVar2, ffji ffjiVar3) {
        this.a = dsxkVar;
        this.b = ffjiVar;
        this.c = ffjiVar2;
        this.d = ffjiVar3;
    }

    public final void a() {
        this.a.c.setOnHierarchyChangeListener(null);
    }

    public final void b() {
        a();
        if (this.a.h) {
            c(this.c);
        }
    }

    public final void c(ffji ffjiVar) {
        ffnf ffnfVar = new ffnf((ffng) ffno.j(new kvt(this.a.c), this.d));
        while (ffnfVar.hasNext()) {
            ffjiVar.invoke((View) ffnfVar.next());
        }
    }
}
