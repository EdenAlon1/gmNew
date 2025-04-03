package defpackage;

import defpackage.fbal;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fbak implements lkp {
    final /* synthetic */ fbal.a a;

    public fbak(fbal.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.lkp
    public final void hg(lkr lkrVar, lki lkiVar) {
        if (lkiVar == lki.ON_DESTROY) {
            fbal.a aVar = this.a;
            aVar.a = null;
            aVar.b = null;
            aVar.c = null;
        }
    }
}
