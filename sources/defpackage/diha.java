package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class diha extends ContentObserver {
    final /* synthetic */ dihe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public diha(dihe diheVar) {
        super(null);
        this.a = diheVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.a.set(true);
    }
}
