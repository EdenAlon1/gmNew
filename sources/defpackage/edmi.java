package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class edmi {
    public abstract edmj a();

    public abstract void b(List list);

    public final edmj c() {
        edkv edkvVar = (edkv) a();
        emxf.b(!edkvVar.a.isEmpty(), "Name must not be empty.");
        List list = edkvVar.c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            emxf.b(!TextUtils.isEmpty((String) it.next()), "Types must not contain null or empty values.");
        }
        b(engw.n(list));
        return a();
    }
}
