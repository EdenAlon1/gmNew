package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbbs {
    public final cbcc a;
    public final boolean b;
    final /* synthetic */ cbbu c;
    private final List d;

    public cbbs(cbbu cbbuVar, cbcc cbccVar, boolean z, List list) {
        this.c = cbbuVar;
        this.a = cbccVar;
        this.b = z;
        this.d = list;
    }

    public final void a() {
        for (cbbn cbbnVar : this.d) {
            cbbu cbbuVar = this.c;
            cbbuVar.e(cbbnVar, cbbuVar.a);
        }
    }
}
