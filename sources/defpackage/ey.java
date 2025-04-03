package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ey implements adf {
    final /* synthetic */ fr a;

    public ey(fr frVar) {
        this.a = frVar;
    }

    @Override // defpackage.adf
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Map map = (Map) obj;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = true != ((Boolean) arrayList.get(i)).booleanValue() ? -1 : 0;
        }
        fk fkVar = (fk) this.a.t.pollFirst();
        if (fkVar == null) {
            toString();
            Log.w("FragmentManager", "No permissions were requested for ".concat(toString()));
            return;
        }
        ge geVar = this.a.b;
        String str = fkVar.a;
        ea c = geVar.c(str);
        if (c == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment ".concat(String.valueOf(str)));
        } else {
            c.aS();
        }
    }
}
