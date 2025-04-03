package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class flc extends ffkk implements ffji {
    final /* synthetic */ hho a;
    final /* synthetic */ hkx b;
    final /* synthetic */ hkx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flc(hho hhoVar, hkx hkxVar, hkx hkxVar2) {
        super(1);
        this.a = hhoVar;
        this.b = hkxVar;
        this.c = hkxVar2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        idd iddVar = (idd) obj;
        iddVar.x(flk.a(this.b));
        iddVar.y(flk.a(this.b));
        iddVar.a(((Number) this.c.a()).floatValue());
        iddVar.C(((idr) this.a.a()).b);
        return ffcu.a;
    }
}
