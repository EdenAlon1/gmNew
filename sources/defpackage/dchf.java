package defpackage;

import android.database.Cursor;
import android.util.Size;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dchf extends dchg {
    public dchf(Cursor cursor) {
        super(cursor);
    }

    @Override // defpackage.dchg
    public final GalleryContent b(eohh eohhVar) {
        ufk o = GalleryContent.o();
        o.k(this.d);
        o.f(this.a);
        ((uec) o).a = new Size(this.e, this.f);
        o.e(eohhVar);
        o.i(this.b);
        return o.l();
    }

    @Override // defpackage.dchg
    public final GalleryContentItem c(eohh eohhVar) {
        return new GalleryContentItem(this.d, this.a, this.e, this.f, -1L, eohhVar, this.b);
    }

    @Override // defpackage.dchg, defpackage.dche
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dchf) {
            return super.equals(obj);
        }
        return false;
    }
}
