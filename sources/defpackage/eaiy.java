package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class eaiy {
    public abstract eaja a();

    public abstract Map b();

    public final void c(eaix eaixVar, String str) {
        List arrayList = b().containsKey(eaixVar) ? (List) b().get(eaixVar) : new ArrayList(1);
        arrayList.add(str);
        b().put(eaixVar, arrayList);
    }
}
