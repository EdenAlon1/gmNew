package defpackage;

import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbxg {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public cwpf c;
    public ViewTreeObserver d;
    private final dede e;

    public dbxg(ea eaVar, dede dedeVar, tam tamVar, cwpg cwpgVar) {
        this.e = dedeVar;
        eaVar.P().c(new dbxf(this, eaVar, cwpgVar, tamVar, dedeVar));
    }

    public final void a(decy decyVar) {
        this.a.add(decyVar);
        this.e.c(decyVar);
    }

    public final void b(decz deczVar) {
        this.b.add(deczVar);
        this.e.d(deczVar);
    }
}
