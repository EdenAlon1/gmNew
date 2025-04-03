package defpackage;

import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcci extends ContentObserver {
    public boolean a;
    final /* synthetic */ dccj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcci(dccj dccjVar) {
        super(new Handler(Looper.getMainLooper()));
        this.b = dccjVar;
        this.a = true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (this.a) {
            this.b.c();
        }
    }
}
