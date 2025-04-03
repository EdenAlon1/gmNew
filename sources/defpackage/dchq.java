package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dchq implements ejuh {
    final /* synthetic */ dchr a;

    public dchq(dchr dchrVar) {
        this.a = dchrVar;
    }

    @Override // defpackage.ejuh
    public final erph a() {
        erph erphVar;
        ekzz f = eleg.f("MessageDataSource#GalleryDataServiceImpl#LoadData");
        try {
            if (this.a.e.s()) {
                erph b = this.a.c.b(bdjd.a(), this.a.d.d(), this.a.d.c(), null, "date_modified DESC");
                dchr dchrVar = this.a;
                final Function function = dchrVar.i;
                erphVar = new erph(b.e(eldl.g(new erow() { // from class: dchk
                    @Override // defpackage.erow
                    public final Object a(erpc erpcVar, Object obj) {
                        Object apply;
                        Cursor cursor = (Cursor) obj;
                        Uri[] uriArr = dchr.a;
                        ArrayList arrayList = new ArrayList(cursor.getCount());
                        if (cursor.moveToFirst()) {
                            do {
                                apply = Function.this.apply(cursor);
                                arrayList.add((dche) apply);
                            } while (cursor.moveToNext());
                        }
                        return arrayList;
                    }
                }), dchrVar.b).g());
            } else {
                int i = engw.d;
                erphVar = new erph(erqt.i(enou.a));
            }
            erph e = erphVar.e(eldl.g(new erow() { // from class: dcho
                @Override // defpackage.erow
                public final Object a(erpc erpcVar, Object obj) {
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList();
                    dchr dchrVar2 = dchq.this.a;
                    if (dchrVar2.e.s()) {
                        arrayList.add(new dchc(7, R.string.c2o_external_device_folders, R.drawable.quantum_gm_ic_folder_black_24));
                        if (dchrVar2.g && dchrVar2.h) {
                            arrayList.add(new dchc(3, R.string.c2o_camera_button_text, R.drawable.quantum_ic_camera_alt_white_24));
                            arrayList.add(new dchc(11, R.string.c2o_video_button_text, R.drawable.comms_gm_ic_videocam_vd_theme_24));
                        }
                    } else {
                        arrayList.add(new dchc(2, R.string.c2o_storage_permissions_text, -1));
                    }
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    return arrayList;
                }
            }), this.a.b).e(eldl.g(new erow() { // from class: dchp
                @Override // defpackage.erow
                public final Object a(erpc erpcVar, Object obj) {
                    return ejug.a((List) obj, dchq.this.a.f.f());
                }
            }), erpp.a);
            f.a(e);
            f.close();
            return e;
        } finally {
        }
    }

    @Override // defpackage.ejuh
    public final ListenableFuture b() {
        ekzz f = eleg.f("MessageDataSource#GalleryDataServiceImpl#FetchAndStoreData");
        try {
            ListenableFuture i = erqt.i(null);
            f.close();
            return i;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ejuh
    public final /* synthetic */ Object c() {
        return "gallery_content_key";
    }
}
