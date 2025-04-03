package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kzj extends ContentObserver {
    final /* synthetic */ kzl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzj(kzl kzlVar) {
        super(new Handler());
        this.a = kzlVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        kzl kzlVar = this.a;
        if (!kzlVar.c || (cursor = kzlVar.d) == null || cursor.isClosed()) {
            return;
        }
        kzlVar.b = kzlVar.d.requery();
    }
}
