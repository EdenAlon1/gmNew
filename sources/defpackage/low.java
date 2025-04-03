package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class low extends ContentObserver {
    final /* synthetic */ lox a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public low(lox loxVar) {
        super(new Handler());
        this.a = loxVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.k();
    }
}
