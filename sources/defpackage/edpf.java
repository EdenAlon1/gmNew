package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class edpf {
    public abstract edpi a();

    public abstract void b(List list);

    public abstract void c(List list);

    public abstract void d(List list);

    public final edpi e() {
        edlk edlkVar = (edlk) a();
        Iterator it = edlkVar.d.iterator();
        while (it.hasNext()) {
            emxf.b(!TextUtils.isEmpty((String) it.next()), "WeekdayText must not contain null or empty values.");
        }
        b(engw.n(edlkVar.b));
        d(engw.n(edlkVar.d));
        c(engw.n(edlkVar.c));
        return a();
    }
}
