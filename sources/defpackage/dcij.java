package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifContentItem;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcij implements erqj {
    final /* synthetic */ dcil a;

    public dcij(dcil dcilVar) {
        this.a = dcilVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List<bwyo> list = (List) obj;
        this.a.g(false);
        dcin dcinVar = this.a.i;
        dcinVar.d.clear();
        for (bwyo bwyoVar : list) {
            List list2 = dcinVar.d;
            Uri k = bwyoVar.k();
            if (k == null) {
                throw new IllegalStateException("Received invalid content item null with URL");
            }
            Uri l = bwyoVar.l();
            String m = bwyoVar.m();
            String n = bwyoVar.n();
            bwyoVar.az(4, "width");
            int i = bwyoVar.e;
            bwyoVar.az(5, "height");
            list2.add(new GifContentItem(k, k, l, m, n, "", i, bwyoVar.f));
        }
        dcinVar.a = true;
        dcinVar.p();
        if (this.a.s && list.isEmpty()) {
            this.a.i();
        } else {
            this.a.a.af(epto.LOADED);
        }
        this.a.s = false;
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        this.a.g(false);
        csjy.h("Bugle", th, "Failed to fetch recent gifs from database");
        dcil dcilVar = this.a;
        if (dcilVar.s) {
            dcilVar.i();
        } else {
            dcilVar.a.af(epto.FAILED_TO_LOAD);
        }
        this.a.s = false;
    }
}
