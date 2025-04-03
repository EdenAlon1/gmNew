package defpackage;

import android.database.ContentObserver;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyvy extends ContentObserver {
    final /* synthetic */ dyvz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyvy(dyvz dyvzVar) {
        super(dyvzVar.s.e);
        this.a = dyvzVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        dyhw.a(Looper.getMainLooper() == Looper.myLooper(), "checkMainThread failed");
        this.a.k();
    }
}
