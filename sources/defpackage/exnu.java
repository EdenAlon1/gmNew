package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class exnu {
    public abstract exnv a();

    public abstract void b(List list);

    public abstract void c(List list);

    public abstract void d(String str);

    public abstract void e();

    public final exnv f() {
        exnv a = a();
        exnk exnkVar = (exnk) a;
        if (exnkVar.a.isEmpty() || exnkVar.c.isEmpty() || exnkVar.d.isEmpty()) {
            throw new IllegalArgumentException("Task graph's name, input streams, and output streams should be non-empty.");
        }
        return a;
    }
}
