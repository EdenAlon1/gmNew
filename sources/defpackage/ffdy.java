package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffdy {
    public static final List a(List list) {
        list.getClass();
        fffs fffsVar = (fffs) list;
        fffsVar.h();
        fffsVar.d = true;
        return fffsVar.c > 0 ? fffsVar : fffs.a;
    }

    public static final List b(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static final List c(Iterable iterable) {
        iterable.getClass();
        List al = ffdx.al(iterable);
        Collections.shuffle(al);
        return al;
    }

    public static final void d(int i, Object[] objArr) {
        objArr.getClass();
        if (i < objArr.length) {
            objArr[i] = null;
        }
    }
}
