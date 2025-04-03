package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecev implements ecep {
    final /* synthetic */ ecew a;

    public ecev(ecew ecewVar) {
        this.a = ecewVar;
    }

    @Override // defpackage.ecep
    public final boolean a(ecea eceaVar) {
        dlpw dlpwVar;
        dlpw dlpwVar2;
        long startElapsedRealtime;
        long myPid = Process.myPid();
        eceaVar.copyOnWrite();
        ecel ecelVar = (ecel) eceaVar.instance;
        ecel ecelVar2 = ecel.a;
        ecelVar.b |= 1;
        ecelVar.c = myPid;
        dlpwVar = this.a.a;
        eyja d = eykm.d(dlpwVar.f().toEpochMilli());
        eceaVar.copyOnWrite();
        ecel ecelVar3 = (ecel) eceaVar.instance;
        d.getClass();
        ecelVar3.d = d;
        ecelVar3.b |= 2;
        eceb ecebVar = (eceb) ecec.a.createBuilder();
        eced ecedVar = (eced) ecee.a.createBuilder();
        dlpwVar2 = this.a.a;
        startElapsedRealtime = Process.getStartElapsedRealtime();
        eyja c = ecew.c(dlpwVar2, startElapsedRealtime);
        ecedVar.copyOnWrite();
        ecee eceeVar = (ecee) ecedVar.instance;
        c.getClass();
        eceeVar.c = c;
        eceeVar.b |= 1;
        ecebVar.copyOnWrite();
        ecec ececVar = (ecec) ecebVar.instance;
        ecee eceeVar2 = (ecee) ecedVar.build();
        eceeVar2.getClass();
        ececVar.c = eceeVar2;
        ececVar.b = 2;
        eceaVar.a(ecebVar);
        return true;
    }
}
