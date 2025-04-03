package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wdp {
    public final Context a;
    public final elbx b;
    public final elet c;
    public final List d;
    public final ffji e;
    public final wdq f;
    private final wdr g;

    public wdp(wdr wdrVar, Context context, elbx elbxVar, elet eletVar, List list, ffji ffjiVar) {
        this.g = wdrVar;
        this.a = context;
        this.b = elbxVar;
        this.c = eletVar;
        this.d = list;
        this.e = ffjiVar;
        crnx crnxVar = (crnx) wdrVar.a.b();
        crnxVar.getClass();
        aolr aolrVar = (aolr) wdrVar.b.b();
        aolrVar.getClass();
        this.f = new wdq(crnxVar, aolrVar, (Context) wdrVar.c.b(), list);
    }
}
