package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etox {
    public static final etzp a;
    private static final byte[] b;

    static {
        byte[] bArr = new byte[0];
        b = bArr;
        a = a(etyp.NIST_P256, etys.SHA256, etxn.UNCOMPRESSED, etgq.a, euag.TINK, bArr);
        a(etyp.NIST_P256, etys.SHA256, etxn.COMPRESSED, etgq.a, euag.RAW, bArr);
        a(etyp.NIST_P256, etys.SHA256, etxn.UNCOMPRESSED, etgq.b, euag.TINK, bArr);
    }

    @Deprecated
    static etzp a(etyp etypVar, etys etysVar, etxn etxnVar, etzp etzpVar, euag euagVar, byte[] bArr) {
        etxz etxzVar = (etxz) etya.a.createBuilder();
        etyh etyhVar = (etyh) etyi.a.createBuilder();
        etyhVar.copyOnWrite();
        ((etyi) etyhVar.instance).b = etypVar.a();
        etyhVar.copyOnWrite();
        ((etyi) etyhVar.instance).c = etysVar.a();
        eyee x = eyee.x(bArr);
        etyhVar.copyOnWrite();
        ((etyi) etyhVar.instance).d = x;
        etyi etyiVar = (etyi) etyhVar.build();
        etxx etxxVar = (etxx) etxy.a.createBuilder();
        etxxVar.copyOnWrite();
        etxy etxyVar = (etxy) etxxVar.instance;
        etzpVar.getClass();
        etxyVar.c = etzpVar;
        etxyVar.b |= 1;
        etxy etxyVar2 = (etxy) etxxVar.build();
        etyb etybVar = (etyb) etyc.a.createBuilder();
        etybVar.copyOnWrite();
        etyc etycVar = (etyc) etybVar.instance;
        etyiVar.getClass();
        etycVar.c = etyiVar;
        etycVar.b |= 1;
        etybVar.copyOnWrite();
        etyc etycVar2 = (etyc) etybVar.instance;
        etxyVar2.getClass();
        etycVar2.d = etxyVar2;
        etycVar2.b |= 2;
        etybVar.copyOnWrite();
        ((etyc) etybVar.instance).e = etxnVar.a();
        etyc etycVar3 = (etyc) etybVar.build();
        etxzVar.copyOnWrite();
        etya etyaVar = (etya) etxzVar.instance;
        etycVar3.getClass();
        etyaVar.c = etycVar3;
        etyaVar.b |= 1;
        etya etyaVar2 = (etya) etxzVar.build();
        etzo etzoVar = (etzo) etzp.a.createBuilder();
        etsv etsvVar = etnm.a;
        etzoVar.copyOnWrite();
        ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
        etzoVar.copyOnWrite();
        ((etzp) etzoVar.instance).d = euagVar.a();
        eyee byteString = etyaVar2.toByteString();
        etzoVar.copyOnWrite();
        ((etzp) etzoVar.instance).c = byteString;
        return (etzp) etzoVar.build();
    }
}
