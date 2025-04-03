package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Size;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dchh extends dchg {
    public final long g;

    public dchh(Context context, csuu csuuVar, Cursor cursor) {
        super(cursor);
        String q;
        this.g = cursor.getLong(cursor.getColumnIndexOrThrow("duration"));
        String path = ((Boolean) bdjc.a.e()).booleanValue() ? ContentUris.withAppendedId(bdjd.b, cursor.getLong(cursor.getColumnIndexOrThrow("_id"))).getPath() : cursor.getString(cursor.getColumnIndexOrThrow("_data"));
        if (path == null || (q = csuu.q(context, Uri.parse(path))) == null || csuuVar.s(q)) {
            return;
        }
        this.a = q;
    }

    @Override // defpackage.dchg
    public final GalleryContent b(eohh eohhVar) {
        ufk o = GalleryContent.o();
        o.k(this.d);
        o.f(this.a);
        ((uec) o).a = new Size(this.e, this.f);
        o.e(eohhVar);
        o.i(this.b);
        long j = this.g;
        if (j > 0) {
            o.g(j);
        }
        return o.l();
    }

    @Override // defpackage.dchg
    public final GalleryContentItem c(eohh eohhVar) {
        return new GalleryContentItem(this.d, this.a, this.e, this.f, this.g, eohhVar, this.b);
    }

    @Override // defpackage.dchg, defpackage.dche
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dchh) {
            return super.equals(obj) && this.g == ((dchh) obj).g;
        }
        return false;
    }

    @Override // defpackage.dchg, defpackage.dche
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Long.valueOf(this.g));
    }
}
