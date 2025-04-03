package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etgq {
    public static final etzp a = a(16);
    public static final etzp b;

    static {
        a(32);
        c(16);
        c(32);
        b = b(16, 16, etys.SHA256);
        b(32, 32, etys.SHA256);
        etzo etzoVar = (etzo) etzp.a.createBuilder();
        etsv etsvVar = etij.a;
        etzoVar.copyOnWrite();
        ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
        euag euagVar = euag.TINK;
        etzoVar.copyOnWrite();
        ((etzp) etzoVar.instance).d = euagVar.a();
        etzo etzoVar2 = (etzo) etzp.a.createBuilder();
        etsv etsvVar2 = etke.a;
        etzoVar2.copyOnWrite();
        ((etzp) etzoVar2.instance).b = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
        euag euagVar2 = euag.TINK;
        etzoVar2.copyOnWrite();
        ((etzp) etzoVar2.instance).d = euagVar2.a();
    }

    public static etzp a(int i) {
        etwz etwzVar = (etwz) etxa.a.createBuilder();
        etwzVar.copyOnWrite();
        ((etxa) etwzVar.instance).b = i;
        etxa etxaVar = (etxa) etwzVar.build();
        etzo etzoVar = (etzo) etzp.a.createBuilder();
        eyee byteString = etxaVar.toByteString();
        etzoVar.copyOnWrite();
        ((etzp) etzoVar.instance).c = byteString;
        etsv etsvVar = etht.a;
        etzoVar.copyOnWrite();
        ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        euag euagVar = euag.TINK;
        etzoVar.copyOnWrite();
        ((etzp) etzoVar.instance).d = euagVar.a();
        return (etzp) etzoVar.build();
    }

    public static etzp b(int i, int i2, etys etysVar) {
        etwh etwhVar = (etwh) etwi.a.createBuilder();
        etwj etwjVar = (etwj) etwk.a.createBuilder();
        etwjVar.copyOnWrite();
        ((etwk) etwjVar.instance).b = 16;
        etwk etwkVar = (etwk) etwjVar.build();
        etwhVar.copyOnWrite();
        etwi etwiVar = (etwi) etwhVar.instance;
        etwkVar.getClass();
        etwiVar.c = etwkVar;
        etwiVar.b |= 1;
        etwhVar.copyOnWrite();
        ((etwi) etwhVar.instance).d = i;
        etwi etwiVar2 = (etwi) etwhVar.build();
        etyv etyvVar = (etyv) etyw.a.createBuilder();
        etyx etyxVar = (etyx) etyy.a.createBuilder();
        etyxVar.copyOnWrite();
        ((etyy) etyxVar.instance).b = etysVar.a();
        etyxVar.copyOnWrite();
        ((etyy) etyxVar.instance).c = i2;
        etyy etyyVar = (etyy) etyxVar.build();
        etyvVar.copyOnWrite();
        etyw etywVar = (etyw) etyvVar.instance;
        etyyVar.getClass();
        etywVar.c = etyyVar;
        etywVar.b |= 1;
        etyvVar.copyOnWrite();
        ((etyw) etyvVar.instance).d = 32;
        etyw etywVar2 = (etyw) etyvVar.build();
        etvx etvxVar = (etvx) etvy.a.createBuilder();
        etvxVar.copyOnWrite();
        etvy etvyVar = (etvy) etvxVar.instance;
        etwiVar2.getClass();
        etvyVar.c = etwiVar2;
        etvyVar.b |= 1;
        etvxVar.copyOnWrite();
        etvy etvyVar2 = (etvy) etvxVar.instance;
        etywVar2.getClass();
        etvyVar2.d = etywVar2;
        etvyVar2.b |= 2;
        etvy etvyVar3 = (etvy) etvxVar.build();
        etzo etzoVar = (etzo) etzp.a.createBuilder();
        eyee byteString = etvyVar3.toByteString();
        etzoVar.copyOnWrite();
        ((etzp) etzoVar.instance).c = byteString;
        etsv etsvVar = ethb.a;
        etzoVar.copyOnWrite();
        ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        euag euagVar = euag.TINK;
        etzoVar.copyOnWrite();
        ((etzp) etzoVar.instance).d = euagVar.a();
        return (etzp) etzoVar.build();
    }

    public static void c(int i) {
        etwn etwnVar = (etwn) etwo.a.createBuilder();
        etwnVar.copyOnWrite();
        ((etwo) etwnVar.instance).d = i;
        etwp etwpVar = (etwp) etwq.a.createBuilder();
        etwpVar.copyOnWrite();
        ((etwq) etwpVar.instance).b = 16;
        etwq etwqVar = (etwq) etwpVar.build();
        etwnVar.copyOnWrite();
        etwo etwoVar = (etwo) etwnVar.instance;
        etwqVar.getClass();
        etwoVar.c = etwqVar;
        etwoVar.b |= 1;
        etwo etwoVar2 = (etwo) etwnVar.build();
        etzo etzoVar = (etzo) etzp.a.createBuilder();
        eyee byteString = etwoVar2.toByteString();
        etzoVar.copyOnWrite();
        ((etzp) etzoVar.instance).c = byteString;
        etsv etsvVar = ethk.a;
        etzoVar.copyOnWrite();
        ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.AesEaxKey";
        euag euagVar = euag.TINK;
        etzoVar.copyOnWrite();
        ((etzp) etzoVar.instance).d = euagVar.a();
    }
}
