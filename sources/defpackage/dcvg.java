package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcvg implements ejuh {
    final /* synthetic */ Uri a;
    final /* synthetic */ dcvh b;

    public dcvg(dcvh dcvhVar, Uri uri) {
        this.a = uri;
        this.b = dcvhVar;
    }

    @Override // defpackage.ejuh
    public final erph a() {
        ekzz f = eleg.f("MessageDataSource#MediaViewerDataServiceImpl#LoadData");
        try {
            erph b = this.b.b.b(this.a, bdxg.a, "", null, null);
            final dcvh dcvhVar = this.b;
            final Function function = new Function() { // from class: dcve
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function2) {
                    return Function$CC.$default$andThen(this, function2);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Cursor cursor = (Cursor) obj;
                    String charSequence = dcvh.this.d.d(cursor.getLong(7)).toString();
                    Uri parse = Uri.parse(cursor.getString(0));
                    String string = cursor.getString(5);
                    String string2 = cursor.getString(1);
                    if (emxe.c(string2)) {
                        string2 = cursor.getString(6);
                    }
                    String string3 = cursor.getString(3);
                    Uri parse2 = string3 != null ? Uri.parse(string3) : null;
                    dcuw dcuwVar = new dcuw();
                    dcuwVar.c(parse);
                    dcuwVar.a = parse2;
                    dcuwVar.b(string);
                    dcuwVar.b = string2;
                    dcuwVar.c = charSequence;
                    return dcuwVar.a();
                }

                public final /* synthetic */ Function compose(Function function2) {
                    return Function$CC.$default$compose(this, function2);
                }
            };
            erph e = new erph(b.e(eldl.g(new erow() { // from class: dcvd
                @Override // defpackage.erow
                public final Object a(erpc erpcVar, Object obj) {
                    Object apply;
                    Cursor cursor = (Cursor) obj;
                    ArrayList arrayList = new ArrayList(cursor.getCount());
                    if (cursor.moveToFirst()) {
                        do {
                            apply = Function.this.apply(cursor);
                            arrayList.add((MediaViewerItem) apply);
                        } while (cursor.moveToNext());
                    }
                    return arrayList;
                }
            }), dcvhVar.a).g()).e(eldl.g(new erow() { // from class: dcvf
                @Override // defpackage.erow
                public final Object a(erpc erpcVar, Object obj) {
                    return ejug.a((List) obj, dcvg.this.b.c.f());
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
        ekzz f = eleg.f("MessageDataSource#MediaViewerDataServiceImpl#FetchAndStoreData");
        try {
            elfl e = elfo.e(null);
            f.close();
            return e;
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
        return "chat_media_viewer_content_key";
    }
}
