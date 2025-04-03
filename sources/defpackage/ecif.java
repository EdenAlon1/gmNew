package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecif extends ecid {
    public static final ecif a = new ecif();

    private ecif() {
    }

    @Override // defpackage.ecid
    public final /* synthetic */ eyhs a(String str, Object obj) {
        return ecig.g(str, afg$$ExternalSyntheticApiModelOutline0.m96m(obj));
    }

    @Override // defpackage.ecid
    public final /* synthetic */ eyhs b(eyhs eyhsVar, eyhs eyhsVar2) {
        return ecig.f((fglo) eyhsVar, (fglo) eyhsVar2);
    }

    @Override // defpackage.ecid
    public final /* bridge */ /* synthetic */ String c(eyhs eyhsVar) {
        fglo fgloVar = (fglo) eyhsVar;
        fgle fgleVar = fgloVar.e;
        if (fgleVar == null) {
            fgleVar = fgle.a;
        }
        int i = fgleVar.b & 2;
        fgle fgleVar2 = fgloVar.e;
        if (i != 0) {
            if (fgleVar2 == null) {
                fgleVar2 = fgle.a;
            }
            return fgleVar2.d;
        }
        if (fgleVar2 == null) {
            fgleVar2 = fgle.a;
        }
        return Long.toHexString(fgleVar2.c);
    }
}
