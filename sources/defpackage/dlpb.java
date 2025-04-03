package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlpb {
    public static dloz a(Context context, Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hashSet.add(context.getString(((Integer) it.next()).intValue()));
        }
        return new dlpa(hashSet);
    }
}
