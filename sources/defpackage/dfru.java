package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfru extends dfrs {
    public final dftz b;

    public dfru(dftz dftzVar, dhri dhriVar) {
        super(3, dhriVar);
        this.b = dftzVar;
    }

    @Override // defpackage.dfrr
    public final boolean a(dfsz dfszVar) {
        return this.b.a.c;
    }

    @Override // defpackage.dfrr
    public final Feature[] b(dfsz dfszVar) {
        return this.b.a.b;
    }

    @Override // defpackage.dfrs
    public final void c(dfsz dfszVar) {
        this.b.a.b(dfszVar.b, this.a);
        dftn a = this.b.a.a();
        if (a != null) {
            dfszVar.d.put(a, this.b);
        }
    }

    @Override // defpackage.dfrs, defpackage.dfrx
    public final /* bridge */ /* synthetic */ void g(dfsp dfspVar, boolean z) {
    }
}
