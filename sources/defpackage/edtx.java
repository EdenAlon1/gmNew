package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edtx {
    public final int a = 11;
    public final int b = 12;
    public final etfr c;
    public final etfr d;

    public edtx(etfr etfrVar, etfr etfrVar2) {
        this.c = etfrVar;
        this.d = etfrVar2;
    }

    public static emrs a(eyhs eyhsVar, int i, etfr etfrVar, byte[] bArr, eyee eyeeVar) {
        byte[] a = etfrVar.a(eyhsVar.toByteArray(), bArr);
        emrr emrrVar = (emrr) emrs.a.createBuilder();
        eyee x = eyee.x(a);
        emrrVar.copyOnWrite();
        ((emrs) emrrVar.instance).d = x;
        emrrVar.copyOnWrite();
        ((emrs) emrrVar.instance).b = i;
        emrrVar.copyOnWrite();
        emrs emrsVar = (emrs) emrrVar.instance;
        eyeeVar.getClass();
        emrsVar.c = eyeeVar;
        return (emrs) emrrVar.build();
    }
}
