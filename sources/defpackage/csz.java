package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class csz extends ffkk implements ffji {
    final /* synthetic */ hkx a;
    final /* synthetic */ hkx b;
    final /* synthetic */ hkx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csz(hkx hkxVar, hkx hkxVar2, hkx hkxVar3) {
        super(1);
        this.a = hkxVar;
        this.b = hkxVar2;
        this.c = hkxVar3;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        idd iddVar = (idd) obj;
        hkx hkxVar = this.a;
        iddVar.a(hkxVar != null ? ((Number) hkxVar.a()).floatValue() : 1.0f);
        hkx hkxVar2 = this.b;
        iddVar.x(hkxVar2 != null ? ((Number) hkxVar2.a()).floatValue() : 1.0f);
        hkx hkxVar3 = this.b;
        iddVar.y(hkxVar3 != null ? ((Number) hkxVar3.a()).floatValue() : 1.0f);
        hkx hkxVar4 = this.c;
        iddVar.C(hkxVar4 != null ? ((idr) hkxVar4.a()).b : idr.a);
        return ffcu.a;
    }
}
