package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrd {
    final /* synthetic */ cop a;
    final /* synthetic */ String b;
    final /* synthetic */ ffix c;

    public hrd(cop copVar, String str, ffix ffixVar) {
        this.a = copVar;
        this.b = str;
        this.c = ffixVar;
    }

    public final void a() {
        List list = (List) this.a.b(this.b);
        if (list != null) {
            list.remove(this.c);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        this.a.e(this.b, list);
    }
}
