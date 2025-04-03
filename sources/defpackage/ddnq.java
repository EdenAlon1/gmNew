package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddnq extends riv {
    final /* synthetic */ ddnr a;
    final /* synthetic */ SearchFilterDataItem b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddnq(int i, int i2, ddnr ddnrVar, SearchFilterDataItem searchFilterDataItem) {
        super(i, i2);
        this.a = ddnrVar;
        this.b = searchFilterDataItem;
    }

    @Override // defpackage.rix
    public final /* bridge */ /* synthetic */ void c(Object obj, rjh rjhVar) {
        ddnr ddnrVar = this.a;
        Drawable drawable = (Drawable) obj;
        if (ddnrVar.a != this.b) {
            return;
        }
        ddnrVar.b.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
