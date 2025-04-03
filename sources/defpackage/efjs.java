package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efjs implements erqj {
    final /* synthetic */ efjy a;

    public efjs(efjy efjyVar) {
        this.a = efjyVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (new File(((SQLiteDatabase) obj).getPath()).exists()) {
            return;
        }
        synchronized (this.a.j) {
            this.a.e();
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
    }
}
