package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class efjg implements efka {
    final /* synthetic */ efjh d;

    public efjg(efjh efjhVar) {
        this.d = efjhVar;
    }

    @Override // defpackage.efka
    public final void c() {
        Log.v("ASQLDB", efks.e(this.d.a.rawQuery("EXPLAIN QUERY PLAN ".concat(b()), null)));
    }
}
