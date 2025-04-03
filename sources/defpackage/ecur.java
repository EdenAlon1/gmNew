package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecur extends ContentObserver {
    final /* synthetic */ ecus a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecur(ecus ecusVar) {
        super(null);
        this.a = ecusVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.c();
    }
}
