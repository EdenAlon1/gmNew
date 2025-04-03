package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mly extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    final /* synthetic */ mma c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mly(mma mmaVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = mmaVar;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        mma mmaVar = this.c;
        mmaVar.a(mlw.b(mmaVar.a, mmaVar.h, mmaVar.g));
    }
}
