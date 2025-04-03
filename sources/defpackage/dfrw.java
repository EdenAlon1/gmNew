package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfrw extends dfrs {
    public final dftn b;

    public dfrw(dftn dftnVar, dhri dhriVar) {
        super(4, dhriVar);
        this.b = dftnVar;
    }

    @Override // defpackage.dfrr
    public final boolean a(dfsz dfszVar) {
        dftz dftzVar = (dftz) dfszVar.d.get(this.b);
        return dftzVar != null && dftzVar.a.c;
    }

    @Override // defpackage.dfrr
    public final Feature[] b(dfsz dfszVar) {
        dftz dftzVar = (dftz) dfszVar.d.get(this.b);
        if (dftzVar == null) {
            return null;
        }
        return dftzVar.a.b;
    }

    @Override // defpackage.dfrs
    public final void c(dfsz dfszVar) {
        dftz dftzVar = (dftz) dfszVar.d.remove(this.b);
        if (dftzVar == null) {
            this.a.d(false);
            return;
        }
        ((dfuc) dftzVar.b).a.b.a(dfszVar.b, this.a);
        dftzVar.a.a.a();
    }

    @Override // defpackage.dfrs, defpackage.dfrx
    public final /* bridge */ /* synthetic */ void g(dfsp dfspVar, boolean z) {
    }
}
