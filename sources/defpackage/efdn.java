package defpackage;

import android.net.Uri;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efdn implements efbi {
    @Override // defpackage.efbi
    public final /* bridge */ /* synthetic */ Object a(efbh efbhVar) {
        OutputStream f = efbhVar.b.f(efbhVar.f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(f);
        if (!efbhVar.d.isEmpty()) {
            List list = efbhVar.d;
            Uri uri = efbhVar.e;
            int i = efbf.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                efei a = ((efej) it.next()).a(uri);
                if (a != null) {
                    arrayList2.add(a);
                }
            }
            efbf efbfVar = !arrayList2.isEmpty() ? new efbf(f, arrayList2) : null;
            if (efbfVar != null) {
                arrayList.add(efbfVar);
            }
        }
        Iterator it2 = efbhVar.c.iterator();
        while (it2.hasNext()) {
            arrayList.add(((efel) it2.next()).d((OutputStream) enjk.j(arrayList)));
        }
        Collections.reverse(arrayList);
        return (OutputStream) arrayList.get(0);
    }
}
