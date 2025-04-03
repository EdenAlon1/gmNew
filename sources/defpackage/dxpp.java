package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dxpp {
    public static dwtt a(dwsi dwsiVar, int i) {
        dwts dwtsVar = (dwts) dwtt.a.createBuilder();
        String str = dwsiVar.d;
        dwtsVar.copyOnWrite();
        dwtt dwttVar = (dwtt) dwtsVar.instance;
        str.getClass();
        dwttVar.b |= 1;
        dwttVar.c = str;
        long j = dwsiVar.e;
        dwtsVar.copyOnWrite();
        dwtt dwttVar2 = (dwtt) dwtsVar.instance;
        dwttVar2.b |= 2;
        dwttVar2.d = j;
        String e = dxvk.e(dwsiVar);
        dwtsVar.copyOnWrite();
        dwtt dwttVar3 = (dwtt) dwtsVar.instance;
        e.getClass();
        dwttVar3.b |= 4;
        dwttVar3.e = e;
        dwtsVar.copyOnWrite();
        dwtt dwttVar4 = (dwtt) dwtsVar.instance;
        dwttVar4.f = i - 1;
        dwttVar4.b |= 8;
        if ((dwsiVar.b & 32) != 0) {
            fasl faslVar = dwsiVar.h;
            if (faslVar == null) {
                faslVar = fasl.a;
            }
            dwtsVar.copyOnWrite();
            dwtt dwttVar5 = (dwtt) dwtsVar.instance;
            faslVar.getClass();
            dwttVar5.g = faslVar;
            dwttVar5.b |= 16;
        }
        return (dwtt) dwtsVar.build();
    }
}
