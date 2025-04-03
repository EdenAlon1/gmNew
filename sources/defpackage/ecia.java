package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecia extends ecid {
    public static final ecia a = new ecia();

    private ecia() {
    }

    @Override // defpackage.ecid
    public final /* bridge */ /* synthetic */ eyhs a(String str, Object obj) {
        int intValue = ((Long) obj).intValue();
        if (intValue == 0) {
            return null;
        }
        fglb fglbVar = (fglb) fglc.a.createBuilder();
        fglbVar.copyOnWrite();
        fglc fglcVar = (fglc) fglbVar.instance;
        fglcVar.b |= 1;
        fglcVar.c = intValue;
        if (str != null) {
            fgle d = ecig.d(str);
            fglbVar.copyOnWrite();
            fglc fglcVar2 = (fglc) fglbVar.instance;
            d.getClass();
            fglcVar2.d = d;
            fglcVar2.b |= 2;
        }
        return (fglc) fglbVar.build();
    }

    @Override // defpackage.ecid
    public final /* synthetic */ eyhs b(eyhs eyhsVar, eyhs eyhsVar2) {
        int i;
        fglc fglcVar = (fglc) eyhsVar;
        fglc fglcVar2 = (fglc) eyhsVar2;
        if (fglcVar == null || fglcVar2 == null) {
            return fglcVar;
        }
        if ((fglcVar.b & 1) == 0 || (i = fglcVar.c - fglcVar2.c) == 0) {
            return null;
        }
        fglb fglbVar = (fglb) fglc.a.createBuilder();
        if ((fglcVar.b & 2) != 0) {
            fgle fgleVar = fglcVar.d;
            if (fgleVar == null) {
                fgleVar = fgle.a;
            }
            fglbVar.copyOnWrite();
            fglc fglcVar3 = (fglc) fglbVar.instance;
            fgleVar.getClass();
            fglcVar3.d = fgleVar;
            fglcVar3.b |= 2;
        }
        fglbVar.copyOnWrite();
        fglc fglcVar4 = (fglc) fglbVar.instance;
        fglcVar4.b |= 1;
        fglcVar4.c = i;
        return (fglc) fglbVar.build();
    }

    @Override // defpackage.ecid
    public final /* bridge */ /* synthetic */ String c(eyhs eyhsVar) {
        fgle fgleVar = ((fglc) eyhsVar).d;
        if (fgleVar == null) {
            fgleVar = fgle.a;
        }
        return fgleVar.d;
    }
}
