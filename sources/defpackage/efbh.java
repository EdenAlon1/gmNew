package defpackage;

import android.net.Uri;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbh {
    public final efbm a;
    public final efef b;
    public final List c;
    public final List d;
    public final Uri e;
    public final Uri f;

    public efbh(efbg efbgVar) {
        this.a = efbgVar.a;
        this.b = efbgVar.b;
        this.c = efbgVar.c;
        this.d = efbgVar.d;
        this.e = efbgVar.e;
        this.f = efbgVar.f;
    }

    public final List a(OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        if (!this.d.isEmpty()) {
            List list = this.d;
            Uri uri = this.e;
            int i = efbf.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                efei b = ((efej) it.next()).b(uri);
                if (b != null) {
                    arrayList2.add(b);
                }
            }
            efbf efbfVar = !arrayList2.isEmpty() ? new efbf(outputStream, arrayList2) : null;
            if (efbfVar != null) {
                arrayList.add(efbfVar);
            }
        }
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            arrayList.add(((efel) it2.next()).b(this.e, (OutputStream) enjk.j(arrayList)));
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public final boolean b() {
        return !this.c.isEmpty();
    }
}
