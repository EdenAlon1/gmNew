package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eevk implements erqj {
    final /* synthetic */ View a;
    final /* synthetic */ eevm b;

    public eevk(eevm eevmVar, View view) {
        this.a = view;
        this.b = eevmVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.i.setClickable(true);
        this.b.b();
        Context context = this.a.getContext();
        eerv.d(this.a, this.b.p ? context.getString(R.string.announcement_sticker_added_to_favorites) : context.getString(R.string.announcement_sticker_removed_from_favorites));
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        eevm eevmVar = this.b;
        eevmVar.p = !eevmVar.p;
        eevmVar.i.setClickable(true);
    }
}
