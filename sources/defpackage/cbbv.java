package defpackage;

import android.os.AsyncTask;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbbv extends AsyncTask {
    private final emyl a;
    private final emwl b;

    public cbbv(emyl emylVar, emwl emwlVar) {
        this.a = eldl.b(emylVar);
        this.b = eldl.a(emwlVar);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return (cbbr) this.a.get();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
    }
}
