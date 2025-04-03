package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnco {
    public static final /* synthetic */ int a = 0;
    private static final emye b = emye.e("_");

    public static epdo a(String str) {
        List i = b.i(str);
        if (i.size() > 3) {
            epdo epdoVar = (epdo) epdq.a.createBuilder();
            try {
                eoqi eoqiVar = (eoqi) eoqk.a.createBuilder();
                int parseInt = Integer.parseInt((String) i.get(1));
                eoqiVar.copyOnWrite();
                eoqk eoqkVar = (eoqk) eoqiVar.instance;
                eoqkVar.b |= 1;
                eoqkVar.c = parseInt;
                int parseInt2 = Integer.parseInt((String) i.get(2));
                eoqiVar.copyOnWrite();
                eoqk eoqkVar2 = (eoqk) eoqiVar.instance;
                eoqkVar2.b |= 2;
                eoqkVar2.d = parseInt2;
                epdoVar.copyOnWrite();
                epdq epdqVar = (epdq) epdoVar.instance;
                eoqk eoqkVar3 = (eoqk) eoqiVar.build();
                eoqkVar3.getClass();
                epdqVar.c = eoqkVar3;
                epdqVar.b |= 1;
                int parseInt3 = Integer.parseInt((String) i.get(3));
                epdoVar.copyOnWrite();
                epdq epdqVar2 = (epdq) epdoVar.instance;
                epdqVar2.b |= 2;
                epdqVar2.d = parseInt3;
                if (i.size() <= 4) {
                    epdoVar.copyOnWrite();
                    epdq epdqVar3 = (epdq) epdoVar.instance;
                    epdqVar3.b |= 4;
                    epdqVar3.e = 0;
                    return epdoVar;
                }
                if (!((String) i.get(4)).equals(emyk.b("X", ((String) i.get(4)).length()))) {
                    epdoVar.copyOnWrite();
                    epdq epdqVar4 = (epdq) epdoVar.instance;
                    epdqVar4.b |= 4;
                    epdqVar4.e = -1;
                    return epdoVar;
                }
                int length = ((String) i.get(4)).length();
                epdoVar.copyOnWrite();
                epdq epdqVar5 = (epdq) epdoVar.instance;
                epdqVar5.b = 4 | epdqVar5.b;
                epdqVar5.e = length;
                return epdoVar;
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static epdo b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        String str = new String(bArr);
        if (str.endsWith(".xml")) {
            return a(str.substring(0, str.length() - 4));
        }
        return null;
    }
}
