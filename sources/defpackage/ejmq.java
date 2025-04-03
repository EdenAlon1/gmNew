package defpackage;

import android.database.ContentObserver;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejmq extends ContentObserver {
    final /* synthetic */ ffjm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejmq(ffjm ffjmVar) {
        super(null);
        this.a = ffjmVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.a(Boolean.valueOf(z), null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.a(Boolean.valueOf(z), uri);
    }
}
