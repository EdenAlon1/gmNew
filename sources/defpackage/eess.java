package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eess implements erqj {
    final /* synthetic */ String a;
    final /* synthetic */ View b;
    final /* synthetic */ eest c;

    public eess(eest eestVar, String str, View view) {
        this.a = str;
        this.b = view;
        this.c = eestVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.c.C();
        this.c.y.i.remove(this.a);
        this.c.v.setClickable(true);
        Context context = this.b.getContext();
        eerv.d(this.b, this.c.x ? context.getString(R.string.announcement_sticker_added_to_favorites) : context.getString(R.string.announcement_sticker_removed_from_favorites));
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        eest eestVar = this.c;
        boolean z = eestVar.x;
        eestVar.x = !z;
        if (!z) {
            eestVar.y.f.remove(this.a);
        }
        this.c.y.i.remove(this.a);
        this.c.v.setClickable(true);
    }
}
