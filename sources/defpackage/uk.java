package defpackage;

import android.database.DataSetObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class uk extends DataSetObserver {
    final /* synthetic */ uo a;

    public uk(uo uoVar) {
        this.a = uoVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        if (this.a.x()) {
            this.a.v();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.m();
    }
}
