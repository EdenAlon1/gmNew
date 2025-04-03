package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eazp extends mo {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ eazq c;

    public eazp(eazq eazqVar, List list, List list2) {
        this.a = list;
        this.b = list2;
        this.c = eazqVar;
    }

    @Override // defpackage.mo
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.mo
    public final int b() {
        return this.a.size();
    }

    @Override // defpackage.mo
    public final boolean d(int i, int i2) {
        Object obj = this.a.get(i);
        Object obj2 = this.b.get(i2);
        eazq eazqVar = this.c;
        return eavo.b(obj, eazqVar.a).equals(eavo.b(obj2, eazqVar.a));
    }

    @Override // defpackage.mo
    public final boolean e(int i, int i2) {
        return this.c.a.b(this.a.get(i)).equals(this.c.a.b(this.b.get(i2)));
    }
}
