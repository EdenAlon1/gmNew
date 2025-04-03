package defpackage;

import android.database.DataSetObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kzk extends DataSetObserver {
    final /* synthetic */ kzl a;

    public kzk(kzl kzlVar) {
        this.a = kzlVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        kzl kzlVar = this.a;
        kzlVar.b = true;
        kzlVar.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        kzl kzlVar = this.a;
        kzlVar.b = false;
        kzlVar.notifyDataSetInvalidated();
    }
}
