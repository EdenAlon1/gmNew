package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcja extends dbzy {
    private final dciz f;
    private final dbxy g;

    public dcja(dbxy dbxyVar, dciz dcizVar, dcab dcabVar, ContentGridView contentGridView, int i) {
        super(dcizVar, dcabVar, contentGridView, i);
        this.g = dbxyVar;
        this.f = dcizVar;
    }

    @Override // defpackage.dbzy
    public final void d(dcal dcalVar, int i) {
        super.d(dcalVar, i);
        ((dcjm) dcalVar).d(this.f.b(i));
    }

    @Override // defpackage.dbzy
    protected final void f(dcal dcalVar, int i) {
        String str = ((dcjm) dcalVar).c().b;
        if (str == null) {
            this.g.l(eptm.EXPAND);
            return;
        }
        dbxp dbxpVar = (dbxp) this.g;
        dbxpVar.B.G(dbxpVar.w, str, dbxpVar.j, dbxpVar.i, dbxpVar.k, eptm.QUERY);
    }
}
