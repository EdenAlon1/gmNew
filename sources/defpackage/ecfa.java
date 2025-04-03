package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecfa implements ecep {
    final /* synthetic */ ecfb a;

    public ecfa(ecfb ecfbVar) {
        this.a = ecfbVar;
    }

    @Override // defpackage.ecep
    public final boolean a(ecea eceaVar) {
        if (!((Boolean) this.a.d.b()).booleanValue()) {
            return false;
        }
        ecej ecejVar = (ecej) ecek.a.createBuilder();
        if (this.a.a.b() != null) {
            String str = (String) this.a.a.b();
            ecejVar.copyOnWrite();
            ecek ecekVar = (ecek) ecejVar.instance;
            str.getClass();
            ecekVar.b |= 1;
            ecekVar.c = str;
        }
        if (((Integer) this.a.b.b()).intValue() > 0) {
            int intValue = ((Integer) this.a.b.b()).intValue();
            ecejVar.copyOnWrite();
            ecek ecekVar2 = (ecek) ecejVar.instance;
            ecekVar2.b |= 2;
            ecekVar2.d = intValue;
        }
        if (((Integer) this.a.c.b()).intValue() > 0) {
            int intValue2 = ((Integer) this.a.c.b()).intValue();
            ecejVar.copyOnWrite();
            ecek ecekVar3 = (ecek) ecejVar.instance;
            ecekVar3.b |= 4;
            ecekVar3.e = intValue2;
        }
        int i = Build.VERSION.SDK_INT;
        ecejVar.copyOnWrite();
        ecek ecekVar4 = (ecek) ecejVar.instance;
        ecekVar4.b |= 8;
        ecekVar4.f = i;
        eceb ecebVar = (eceb) ecec.a.createBuilder();
        ecebVar.copyOnWrite();
        ecec ececVar = (ecec) ecebVar.instance;
        ecek ecekVar5 = (ecek) ecejVar.build();
        ecekVar5.getClass();
        ececVar.c = ecekVar5;
        ececVar.b = 4;
        ecec ececVar2 = (ecec) ecebVar.build();
        eceaVar.copyOnWrite();
        ecel ecelVar = (ecel) eceaVar.instance;
        ecel ecelVar2 = ecel.a;
        ececVar2.getClass();
        ecelVar.a();
        ecelVar.e.add(ececVar2);
        return true;
    }
}
