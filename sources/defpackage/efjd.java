package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efjd extends efjg {
    final /* synthetic */ Object[] a;
    final /* synthetic */ String b;
    final /* synthetic */ efjh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efjd(efjh efjhVar, Object[] objArr, String str) {
        super(efjhVar);
        this.a = objArr;
        this.b = str;
        this.c = efjhVar;
    }

    @Override // defpackage.efka
    public final Cursor a(CancellationSignal cancellationSignal) {
        this.c.c.b();
        try {
            return this.c.a.rawQueryWithFactory(new efkp(this.a), this.b, null, null, cancellationSignal);
        } finally {
            this.c.c.a();
        }
    }

    @Override // defpackage.efka
    public final String b() {
        return this.b;
    }
}
