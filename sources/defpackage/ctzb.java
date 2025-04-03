package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctzb implements ctzc {
    final /* synthetic */ dloz a;
    final /* synthetic */ dloz b;
    final /* synthetic */ Collection c;
    final /* synthetic */ Collection d;

    public ctzb(dloz dlozVar, dloz dlozVar2, Collection collection, Collection collection2) {
        this.a = dlozVar;
        this.b = dlozVar2;
        this.c = collection;
        this.d = collection2;
    }

    @Override // defpackage.ctzc
    public final boolean a(String str) {
        return this.a.b(str) || this.b.b(str) || this.c.contains(str);
    }

    @Override // defpackage.dloz
    public final boolean b(String str) {
        if (!this.a.b(str)) {
            return false;
        }
        enqu listIterator = ((enpx) this.d).listIterator();
        while (listIterator.hasNext()) {
            ctzc ctzcVar = (ctzc) listIterator.next();
            if (ctzcVar.a(str)) {
                return ctzcVar.b(str);
            }
        }
        return true;
    }
}
