package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eit implements Comparator {
    final /* synthetic */ elp a;

    public eit(elp elpVar) {
        this.a = elpVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ffgh.a(Integer.valueOf(this.a.a(((ejs) obj).h())), Integer.valueOf(this.a.a(((ejs) obj2).h())));
    }
}
