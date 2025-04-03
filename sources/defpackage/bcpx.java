package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bcpx extends ContentObserver {
    final /* synthetic */ bcpz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcpx(bcpz bcpzVar) {
        super(null);
        this.a = bcpzVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.b.clear();
    }
}
