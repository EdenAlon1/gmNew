package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qfg extends qlz {
    final /* synthetic */ qly a;
    final /* synthetic */ qlz b;
    final /* synthetic */ qhn c;

    public qfg(qly qlyVar, qlz qlzVar, qhn qhnVar) {
        this.a = qlyVar;
        this.b = qlzVar;
        this.c = qhnVar;
    }

    @Override // defpackage.qlz
    public final /* bridge */ /* synthetic */ Object a(qly qlyVar) {
        this.a.a(qlyVar.a, qlyVar.b, ((qhn) qlyVar.c).a, ((qhn) qlyVar.d).a, qlyVar.e, qlyVar.f, qlyVar.g);
        String str = (String) this.b.a(this.a);
        qhn qhnVar = (qhn) (qlyVar.f == 1.0f ? qlyVar.d : qlyVar.c);
        this.c.a(str, qhnVar.b, qhnVar.c, qhnVar.m, qhnVar.d, qhnVar.e, qhnVar.f, qhnVar.g, qhnVar.h, qhnVar.i, qhnVar.j, qhnVar.k, qhnVar.l);
        return this.c;
    }
}
