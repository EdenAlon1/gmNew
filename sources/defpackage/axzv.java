package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axzv implements ffji {
    final /* synthetic */ eyja a;

    public axzv(eyja eyjaVar) {
        this.a = eyjaVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        axvx axvxVar = (axvx) obj;
        axvt axvtVar = (axvt) axvxVar.toBuilder();
        axvw axvwVar = axvxVar.d;
        if (axvwVar == null) {
            axvwVar = axvw.a;
        }
        axvu axvuVar = (axvu) axvwVar.toBuilder();
        axvuVar.copyOnWrite();
        ((axvw) axvuVar.instance).c = axvv.a(3);
        eyja eyjaVar = this.a;
        axvuVar.copyOnWrite();
        axvw axvwVar2 = (axvw) axvuVar.instance;
        eyjaVar.getClass();
        axvwVar2.d = eyjaVar;
        axvwVar2.b |= 1;
        axvtVar.copyOnWrite();
        axvx axvxVar2 = (axvx) axvtVar.instance;
        axvw axvwVar3 = (axvw) axvuVar.build();
        axvwVar3.getClass();
        axvxVar2.d = axvwVar3;
        axvxVar2.b |= 1;
        eyja eyjaVar2 = this.a;
        axvtVar.copyOnWrite();
        axvx axvxVar3 = (axvx) axvtVar.instance;
        eyjaVar2.getClass();
        axvxVar3.e = eyjaVar2;
        axvxVar3.b |= 2;
        eyja eyjaVar3 = this.a;
        axvtVar.copyOnWrite();
        axvx axvxVar4 = (axvx) axvtVar.instance;
        eyjaVar3.getClass();
        axvxVar4.f = eyjaVar3;
        axvxVar4.b |= 4;
        return (axvx) axvtVar.build();
    }
}
