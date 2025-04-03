package defpackage;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cbne {
    public static cbne e() {
        ArrayList arrayList = new ArrayList();
        return new cbme(new ArrayList(), new ArrayMap(), arrayList, arrayList);
    }

    public abstract Collection a();

    public abstract Collection b();

    public abstract Collection c();

    public abstract Map d();

    public final boolean f() {
        return c().isEmpty() && d().isEmpty();
    }
}
