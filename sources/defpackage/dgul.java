package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgul implements erqj {
    final /* synthetic */ dgts a;
    final /* synthetic */ dgum b;

    public dgul(dgum dgumVar, dgts dgtsVar) {
        this.a = dgtsVar;
        this.b = dgumVar;
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
        synchronized (this.b.a) {
            if (this.b.a.isEmpty()) {
                if (Log.isLoggable("ExampleIterator", 3)) {
                    Log.d("ExampleIterator", "No results found matching query.");
                }
                this.a.b(null, null);
            } else {
                emxd emxdVar = (emxd) this.b.a.removeFirst();
                if (Log.isLoggable("ExampleIterator", 3)) {
                    Log.d("ExampleIterator", "Returning result with id=".concat(String.valueOf(String.valueOf(emxdVar.a))));
                }
                this.a.b((byte[]) emxdVar.b, ((ewbw) emxdVar.a).toByteArray());
            }
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        Log.e("ExampleIterator", "Failed to get results", th);
        this.a.a(8, emyt.a(th));
    }
}
