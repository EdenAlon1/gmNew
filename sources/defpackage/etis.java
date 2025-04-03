package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etis {
    public static final etft a;
    public static final etrx b;
    public static final etsv c;

    static {
        euad.a.getParserForType();
        a = new etrq("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", etfk.class, 3);
        b = new etrx() { // from class: etiq
            @Override // defpackage.etrx
            public final etfs a(etgf etgfVar, Integer num) {
                etft etftVar = etis.a;
                return etjb.b((etje) etgfVar, num);
            }
        };
        c = new etst(etjb.class, etfk.class, new etsu() { // from class: etir
            @Override // defpackage.etsu
            public final Object a(etfs etfsVar) {
                etjb etjbVar = (etjb) etfsVar;
                etje etjeVar = etjbVar.a;
                String str = etjeVar.b;
                etgr etgrVar = etjeVar.c;
                etft etftVar = etis.a;
                etfk a2 = etgd.a(str).a(str);
                int i = etip.a;
                try {
                    byte[] b2 = etgm.b(etgrVar);
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    return etlt.c(new etip((etzp) eyfy.parseFrom(etzp.a, b2, eyfc.a), a2), etjbVar.b);
                } catch (eygu e) {
                    throw new GeneralSecurityException(e);
                }
            }
        });
    }
}
