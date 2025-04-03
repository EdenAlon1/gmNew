package defpackage;

import android.database.ContentObserver;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dipd extends ContentObserver {
    final /* synthetic */ dipf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dipd(dipf dipfVar) {
        super(null);
        this.a = dipfVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (z) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.a.c.h());
        dkty.c("User is logged in: %b", Boolean.valueOf(!isEmpty));
        if (isEmpty) {
            return;
        }
        dkty.o("Address book has changed, triggering IMS contacts DB sync.", new Object[0]);
        this.a.c();
    }
}
