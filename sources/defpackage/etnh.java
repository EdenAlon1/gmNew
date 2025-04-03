package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etnh {
    public static final etso a;
    public static final etsl b;
    public static final etro c;
    public static final etrl d;
    private static final eujt e;
    private static final Map f;
    private static final Map g;

    static {
        eujt b2 = ettp.b("type.googleapis.com/google.crypto.tink.AesSivKey");
        e = b2;
        a = new etsm(etmt.class, ette.class, new etsn() { // from class: etnd
            @Override // defpackage.etsn
            public final etti a(etgf etgfVar) {
                etmt etmtVar = (etmt) etgfVar;
                etso etsoVar = etnh.a;
                etzo etzoVar = (etzo) etzp.a.createBuilder();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.AesSivKey";
                etxh etxhVar = (etxh) etxi.a.createBuilder();
                int i = etmtVar.a;
                etxhVar.copyOnWrite();
                ((etxi) etxhVar.instance).b = i;
                eyee byteString = ((etxi) etxhVar.build()).toByteString();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).c = byteString;
                euag b3 = etnh.b(etmtVar.b);
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).d = b3.a();
                return ette.b((etzp) etzoVar.build());
            }
        });
        b = new etsj(b2, ette.class, new etsk() { // from class: etne
            @Override // defpackage.etsk
            public final etgf a(etti ettiVar) {
                etso etsoVar = etnh.a;
                ette etteVar = (ette) ettiVar;
                if (!etteVar.b.b.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters: ".concat(String.valueOf(etteVar.b.b)));
                }
                try {
                    eyee eyeeVar = ((ette) ettiVar).b.c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etxi etxiVar = (etxi) eyfy.parseFrom(etxi.a, eyeeVar, eyfc.a);
                    if (etxiVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    etmr etmrVar = new etmr();
                    etmrVar.b(etxiVar.b);
                    euag b3 = euag.b(etteVar.b.d);
                    if (b3 == null) {
                        b3 = euag.UNRECOGNIZED;
                    }
                    etmrVar.a = etnh.a(b3);
                    return etmrVar.a();
                } catch (eygu e2) {
                    throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e2);
                }
            }
        });
        c = new etrm(etmm.class, ettd.class, new etrn() { // from class: etnf
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                etmm etmmVar = (etmm) etfsVar;
                etso etsoVar = etnh.a;
                etxf etxfVar = (etxf) etxg.a.createBuilder();
                eyee x = eyee.x(etmmVar.b.d());
                etxfVar.copyOnWrite();
                ((etxg) etxfVar.instance).c = x;
                eyee byteString = ((etxg) etxfVar.build()).toByteString();
                etms etmsVar = etmmVar.a.b;
                return ettd.a("type.googleapis.com/google.crypto.tink.AesSivKey", byteString, 3, etnh.b(etmsVar), etmmVar.d);
            }
        });
        d = new etrj(b2, ettd.class, new etrk() { // from class: etng
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = etnh.a;
                if (!((ettd) ettiVar).a.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etxg etxgVar = (etxg) eyfy.parseFrom(etxg.a, eyeeVar, eyfc.a);
                    if (etxgVar.b != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    etmr etmrVar = new etmr();
                    etmrVar.b(etxgVar.c.d());
                    etmrVar.a = etnh.a(((ettd) ettiVar).d);
                    return etml.a(etmrVar.a(), eujv.c(etxgVar.c.I()), ((ettd) ettiVar).e);
                } catch (eygu unused) {
                    throw new GeneralSecurityException("Parsing AesSivKey failed");
                }
            }
        });
        HashMap hashMap = new HashMap();
        hashMap.put(etms.c, euag.RAW);
        hashMap.put(etms.a, euag.TINK);
        hashMap.put(etms.b, euag.CRUNCHY);
        f = DesugarCollections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(euag.class);
        enumMap.put((EnumMap) euag.RAW, (euag) etms.c);
        enumMap.put((EnumMap) euag.TINK, (euag) etms.a);
        enumMap.put((EnumMap) euag.CRUNCHY, (euag) etms.b);
        enumMap.put((EnumMap) euag.LEGACY, (euag) etms.b);
        g = DesugarCollections.unmodifiableMap(enumMap);
    }

    public static etms a(euag euagVar) {
        Map map = g;
        if (map.containsKey(euagVar)) {
            return (etms) map.get(euagVar);
        }
        throw new GeneralSecurityException(a.P(euagVar, "Unable to parse OutputPrefixType: "));
    }

    public static euag b(etms etmsVar) {
        Map map = f;
        if (map.containsKey(etmsVar)) {
            return (euag) map.get(etmsVar);
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(etmsVar))));
    }
}
