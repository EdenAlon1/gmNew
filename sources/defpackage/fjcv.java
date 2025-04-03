package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjcv extends fjdm {
    final /* synthetic */ fjdm a;

    public fjcv(fjdm fjdmVar) {
        this.a = fjdmVar;
    }

    @Override // defpackage.fjdm
    public final /* bridge */ /* synthetic */ void a(fjdr fjdrVar, Object obj) {
        Iterable iterable = (Iterable) obj;
        if (iterable == null) {
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.a.a(fjdrVar, it.next());
        }
    }
}
