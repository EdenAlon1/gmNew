package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezm extends ffkk implements ffji {
    final /* synthetic */ ezv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezm(ezv ezvVar) {
        super(1);
        this.a = ezvVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        List list = (List) obj;
        if (this.a.c.d() != null) {
            exq d = this.a.c.d();
            d.getClass();
            list.add(d.a);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
