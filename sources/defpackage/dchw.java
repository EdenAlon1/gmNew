package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dchw extends lml implements dchz {
    public static final cskc a = cskc.g("Bugle", "GalleryCategoryViewModelBase");
    protected final ctud b;
    public final ContentResolver c;
    public final bdjd d;
    public final dchi e;
    public final boolean f;
    public final llg g = new llg();
    public final List h = new ArrayList();
    public final AtomicBoolean i = new AtomicBoolean(false);
    private final errl j;
    private final ContentObserver k;
    private Runnable l;

    public dchw(Context context, ctud ctudVar, ContentResolver contentResolver, errl errlVar, bdjd bdjdVar, dchi dchiVar) {
        dchv dchvVar = new dchv(this);
        this.k = dchvVar;
        this.b = ctudVar;
        this.c = contentResolver;
        this.j = errlVar;
        this.d = bdjdVar;
        this.e = dchiVar;
        this.f = context.getPackageManager().hasSystemFeature("android.hardware.camera");
        contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, dchvVar);
        contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, dchvVar);
    }

    @Override // defpackage.dcak
    public final int a() {
        return Math.min(k(), this.h.size());
    }

    public abstract int b(int i);

    public abstract int c();

    @Override // defpackage.dchz
    public final long d(int i, int i2) {
        Uri uri;
        if (i2 != 1 || (uri = ((dchg) m(i - c())).d) == null) {
            return -1L;
        }
        return uri.hashCode();
    }

    @Override // defpackage.lml
    protected final void fD() {
        this.c.unregisterContentObserver(this.k);
        cslq.a(n());
    }

    @Override // defpackage.dchz
    public final void g(dcal dcalVar, int i, AttachmentQueueState attachmentQueueState, ekms ekmsVar) {
        dcia dciaVar = (dcia) dcalVar;
        dche m = m(i);
        if (((Boolean) cful.o.e()).booleanValue()) {
            GalleryContent b = ((dchg) m).b(eohh.GALLERY_CHOOSER);
            boolean n = attachmentQueueState.n(b);
            int f = attachmentQueueState.f(b);
            dciaVar.f(b);
            dciaVar.e(f, n);
        } else {
            GalleryContentItem c = ((dchg) m).c(eohh.GALLERY_CHOOSER);
            boolean o = attachmentQueueState.o(c);
            int g = attachmentQueueState.g(c);
            dciaVar.g(c);
            dciaVar.e(g, o);
        }
        dciaVar.i(m);
        dciaVar.j(ekmsVar);
    }

    @Override // defpackage.dchz
    public final void h() {
        if (this.b.s()) {
            ekzz f = eleg.f("GalleryCategoryViewModelBase.loadData");
            try {
                elfl f2 = elfo.f(new Runnable() { // from class: dcht
                    @Override // java.lang.Runnable
                    public final void run() {
                        Cursor query;
                        try {
                            boolean booleanValue = ((Boolean) dchx.a.e()).booleanValue();
                            dchw dchwVar = dchw.this;
                            if (booleanValue) {
                                Bundle bundle = new Bundle();
                                bundle.putString("android:query-arg-sql-selection", dchwVar.d.c());
                                bundle.putString("android:query-arg-sql-sort-order", "date_modified DESC");
                                bundle.putInt("android:query-arg-limit", dchwVar.k());
                                query = dchwVar.c.query(bdjd.a(), dchwVar.d.d(), bundle, null);
                            } else {
                                query = dchwVar.c.query(bdjd.a(), dchwVar.d.d(), dchwVar.d.c(), null, String.format(Locale.US, "date_modified DESC LIMIT %d", Integer.valueOf(dchwVar.k())));
                            }
                            Cursor cursor = query;
                            if (cursor == null) {
                                return;
                            }
                            try {
                                dchwVar.h.clear();
                                if (cursor.moveToFirst()) {
                                    do {
                                        if (le.A(cursor.getString(cursor.getColumnIndexOrThrow("mime_type")))) {
                                            dchwVar.h.add(dchwVar.e.a(cursor));
                                        } else {
                                            dchwVar.h.add(new dchf(cursor));
                                        }
                                    } while (cursor.moveToNext());
                                }
                                dchwVar.g.j(true);
                                cursor.close();
                            } finally {
                            }
                        } catch (Exception e) {
                            dchw.a.o("Can't load gallery media.", e);
                        }
                    }
                }, this.j);
                f.b(f2);
                f2.k(axnw.b(), this.j);
                f.close();
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    protected int k() {
        throw null;
    }

    public int l() {
        return 1;
    }

    public final dche m(int i) {
        return (dche) this.h.get(i);
    }

    public final Runnable n() {
        if (this.l == null) {
            this.l = new Runnable() { // from class: dchu
                @Override // java.lang.Runnable
                public final void run() {
                    dchw dchwVar = dchw.this;
                    dchwVar.i.set(false);
                    dchwVar.h();
                }
            };
        }
        return this.l;
    }
}
