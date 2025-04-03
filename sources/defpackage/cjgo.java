package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjgo {
    public final csmj a;
    public final cjgx b;
    private final ekmz c;

    public cjgo(ekmz ekmzVar, csmj csmjVar, cjgx cjgxVar) {
        this.c = ekmzVar;
        this.a = csmjVar;
        this.b = cjgxVar;
    }

    public static final List b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri t = ((MessagePartCoreData) it.next()).t();
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public final cjgv a(cjha cjhaVar) {
        cjgv a;
        boolean z = cjhaVar instanceof cjgy;
        cjgx cjgxVar = this.b;
        if (z) {
            a = cjgxVar.a();
        } else if (cjhaVar.c() == null) {
            a = null;
        } else {
            cjia c = cjhaVar.c();
            c.getClass();
            a = c.b == 103 ? (cjgs) cjgxVar.c.a() : cjgxVar.a();
        }
        cjgxVar.d.d(cjgx.a[0], a);
        if (a == null) {
            return null;
        }
        ((qqo) this.c.e(cjhaVar.b()).y()).v(a.c());
        a.e().setText(cjhaVar.e());
        a.d().setText(cjhaVar.d());
        return a;
    }
}
