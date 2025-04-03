package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhd extends ContentObserver {
    final /* synthetic */ ffwm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhd(ffwm ffwmVar, Handler handler) {
        super(handler);
        this.a = ffwmVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.b(ffcu.a);
    }
}
