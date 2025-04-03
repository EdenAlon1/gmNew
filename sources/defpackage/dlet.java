package defpackage;

import com.google.android.libraries.abuse.hades.tartarus.runtime.Data;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlet {
    final /* synthetic */ Data a;

    public dlet(Data data) {
        this.a = data;
    }

    public final void a(String str, int i) {
        this.a.putInteger(str, i);
    }

    public final void b(String str, dlcs dlcsVar) {
        this.a.putData(str, dleu.a(dlcsVar));
    }

    public final void c(String str, String str2) {
        this.a.putString(str, str2);
    }

    public final void d(String str, List list) {
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        for (Object obj : list) {
            if (obj instanceof dlcs) {
                obj = dleu.a((dlcs) obj);
            }
            arrayList.add(obj);
        }
        this.a.putList(str, arrayList);
    }

    public final void e(String str, boolean z) {
        this.a.putBoolean(str, z);
    }
}
