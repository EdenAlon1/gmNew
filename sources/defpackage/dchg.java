package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dchg extends dche {
    public String a;
    public final long b;
    public final Uri d;
    public int e;
    public int f;

    public dchg(Cursor cursor) {
        super(1);
        this.d = bdjd.b(cursor);
        this.e = cursor.getInt(cursor.getColumnIndexOrThrow("width"));
        int i = cursor.getInt(cursor.getColumnIndexOrThrow("height"));
        this.f = i;
        if (this.e <= 0) {
            this.e = -1;
        }
        if (i <= 0) {
            this.f = -1;
        }
        int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("orientation"));
        if (i2 == 90 || i2 == 270) {
            int i3 = this.e;
            this.e = this.f;
            this.f = i3;
        }
        this.a = cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
        this.b = cursor.getLong(cursor.getColumnIndexOrThrow("date_modified"));
    }

    @Override // defpackage.dche
    public final int a() {
        return this.d.hashCode();
    }

    public abstract GalleryContent b(eohh eohhVar);

    @Deprecated
    public abstract GalleryContentItem c(eohh eohhVar);

    @Override // defpackage.dche
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dchg)) {
            return false;
        }
        dchg dchgVar = (dchg) obj;
        return super.equals(obj) && Objects.equals(this.a, dchgVar.a) && this.b == dchgVar.b && Objects.equals(this.d, dchgVar.d) && this.f == dchgVar.f && this.e == dchgVar.e;
    }

    @Override // defpackage.dche
    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), this.a, Long.valueOf(this.b), this.d, Integer.valueOf(this.f), Integer.valueOf(this.e));
    }
}
