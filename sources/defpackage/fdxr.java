package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdxr {
    public static fdxk a(fdxk fdxkVar, List list) {
        fdxkVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fdxkVar = new fdxq(fdxkVar, (fdxp) it.next());
        }
        return fdxkVar;
    }

    public static fdxk b(fdxk fdxkVar, fdxp... fdxpVarArr) {
        return a(fdxkVar, Arrays.asList(fdxpVarArr));
    }

    public static fdxk c(fdxk fdxkVar, List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.reverse(arrayList);
        return a(fdxkVar, arrayList);
    }

    public static fdxk d(fdxk fdxkVar, fdxp... fdxpVarArr) {
        return c(fdxkVar, Arrays.asList(fdxpVarArr));
    }
}
