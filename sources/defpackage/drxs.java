package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drxs implements ehrp {
    final /* synthetic */ ffji a;
    final /* synthetic */ List b;

    public drxs(ffji ffjiVar, List list) {
        this.a = ffjiVar;
        this.b = list;
    }

    @Override // defpackage.ehro
    public final void a(ehrt ehrtVar) {
        if (ehrtVar != null) {
            this.a.invoke(this.b.get(ehrtVar.e));
        }
    }

    @Override // defpackage.ehro
    public final void b(ehrt ehrtVar) {
        this.a.invoke(this.b.get(ehrtVar.e));
    }

    @Override // defpackage.ehro
    public final void c(ehrt ehrtVar) {
    }
}
