package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eifc {
    public abstract ContentType a();

    public abstract enhd b();

    public abstract String c();

    public abstract String d();

    public abstract void e(String str);

    public abstract void f(String str);

    public final ContentType g() {
        f(emuz.c(d()));
        e(emuz.c(c()));
        return a();
    }

    public final void h(enhk enhkVar) {
        enqu listIterator = enhkVar.keySet().listIterator();
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            String str2 = (String) enhkVar.get(str);
            if (str2 != null) {
                b().k(emuz.c(str), str2);
            }
        }
    }
}
