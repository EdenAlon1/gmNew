package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpaa {
    public static final /* synthetic */ int c = 0;
    private static final enru d = enru.c("com/google/android/libraries/compose/attachments/resolver/MetadataCursorFactory");
    private static final List e;
    public final Context a;
    public final ffsk b;

    static {
        ffca.a(dozt.a);
        e = ffdx.g(dpad.b, dpad.a);
    }

    public dpaa(Context context, ffsk ffskVar) {
        context.getClass();
        ffskVar.getClass();
        this.a = context;
        this.b = ffskVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final dozs b(dpae dpaeVar, String str, boolean z, ffji ffjiVar) {
        dpad dpadVar;
        String[] strArr;
        enru enruVar;
        Cursor cursor;
        Iterator it = e.iterator();
        while (true) {
            if (!it.hasNext()) {
                return null;
            }
            dpadVar = (dpad) it.next();
            try {
                strArr = dpaeVar.a(dpadVar);
                try {
                    enruVar = d;
                    ((enrr) enruVar.g().h("com/google/android/libraries/compose/attachments/resolver/MetadataCursorFactory", "repeatQueryWithStrategy", 163, "MetadataCursorFactory.kt")).J("%s; trying quality %s with projection %s", str, dpadVar, new dpac(strArr));
                    cursor = (Cursor) ffjiVar.invoke(new dpac(strArr));
                    if (cursor != 0) {
                        if (!z) {
                            break;
                        }
                        if (cursor.moveToFirst()) {
                            r5 = cursor;
                        } else {
                            cursor.close();
                        }
                        if (r5 != null) {
                            break;
                        }
                        ((enrr) enruVar.e().h("com/google/android/libraries/compose/attachments/resolver/MetadataCursorFactory", "repeatQueryWithStrategy", 195, "MetadataCursorFactory.kt")).J("%s; moveToFirst failed for cursor for quality %s with projection %s", str, dpadVar, new dpac(strArr));
                    } else {
                        ((enrr) enruVar.e().h("com/google/android/libraries/compose/attachments/resolver/MetadataCursorFactory", "repeatQueryWithStrategy", 184, "MetadataCursorFactory.kt")).J("%s; null cursor for quality %s with projection %s", str, dpadVar, new dpac(strArr));
                    }
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof CancellationException) {
                        throw th;
                    }
                    ((enrr) ((enrr) d.j()).g(th).h("com/google/android/libraries/compose/attachments/resolver/MetadataCursorFactory", "repeatQueryWithStrategy", 172, "MetadataCursorFactory.kt")).J("%s; query failed at quality %s with projection %s", str, dpadVar, strArr != null ? new dpac(strArr) : null);
                }
            } catch (Throwable th2) {
                th = th2;
                strArr = null;
            }
        }
        ((enrr) enruVar.h().h("com/google/android/libraries/compose/attachments/resolver/MetadataCursorFactory", "repeatQueryWithStrategy", 205, "MetadataCursorFactory.kt")).J("%s; cursor obtained at quality %s with projection %s", str, dpadVar, new dpac(strArr));
        return new dozs(cursor);
    }

    public final Object a(Uri uri, dpae dpaeVar, ffgu ffguVar) {
        return ffra.a(this.b.hT(), new dozz(this, dpaeVar, uri, null), ffguVar);
    }
}
