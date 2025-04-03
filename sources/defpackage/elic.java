package defpackage;

import android.view.LayoutInflater;
import java.text.DateFormat;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elic implements oyy {
    public final ea a;
    public final ejwl b;
    public final eljl c;
    public final elhg d;
    public final ejzi e;
    public final elib f = new elib(this);

    public elic(ea eaVar, ejwl ejwlVar, eljl eljlVar, elhg elhgVar) {
        this.a = eaVar;
        this.b = ejwlVar;
        this.c = eljlVar;
        this.d = elhgVar;
        LayoutInflater K = eaVar.K();
        DateFormat dateFormat = eljo.a;
        this.e = new ejzi(new eljn(K), emwg.a);
    }

    @Override // defpackage.oyy
    public final void a() {
        this.b.a(new elji(this.c), this.f);
    }
}
