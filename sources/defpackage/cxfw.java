package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxfw extends cslh {
    private final Resources a;
    private final int b;
    private final ctwb c;
    private final bdtd k;
    private final cins l;

    public cxfw(ctwb ctwbVar, bdtd bdtdVar, cins cinsVar, Resources resources, int i) {
        super("Bugle.Async.SimFullReceiver.handleSimFull.Duration");
        this.a = resources;
        this.k = bdtdVar;
        this.c = ctwbVar;
        this.l = cinsVar;
        this.b = i;
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        int i = this.b;
        if (i == -1) {
            i = this.c.j().a();
        }
        if (this.c.a() <= 1) {
            return null;
        }
        String h = this.k.g(i).h();
        if (h != null) {
            return this.a.getString(R.string.sim_specific_settings, h);
        }
        csjy.n("Bugle", "subscriptionName is empty");
        return null;
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        this.l.A(this.b, (String) obj);
    }
}
