package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etgn {
    public static final /* synthetic */ int a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static etzx a(etzt etztVar) {
        etzu etzuVar = (etzu) etzx.a.createBuilder();
        int i = etztVar.b;
        etzuVar.copyOnWrite();
        ((etzx) etzuVar.instance).b = i;
        for (etzs etzsVar : etztVar.c) {
            etzv etzvVar = (etzv) etzw.a.createBuilder();
            etzm etzmVar = etzsVar.c;
            if (etzmVar == null) {
                etzmVar = etzm.a;
            }
            String str = etzmVar.b;
            etzvVar.copyOnWrite();
            etzw etzwVar = (etzw) etzvVar.instance;
            str.getClass();
            etzwVar.b = str;
            int b = etzn.b(etzsVar.d);
            if (b == 0) {
                b = 1;
            }
            etzvVar.copyOnWrite();
            ((etzw) etzvVar.instance).c = etzn.a(b);
            euag b2 = euag.b(etzsVar.f);
            if (b2 == null) {
                b2 = euag.UNRECOGNIZED;
            }
            etzvVar.copyOnWrite();
            ((etzw) etzvVar.instance).e = b2.a();
            int i2 = etzsVar.e;
            etzvVar.copyOnWrite();
            ((etzw) etzvVar.instance).d = i2;
            etzw etzwVar2 = (etzw) etzvVar.build();
            etzuVar.copyOnWrite();
            etzx etzxVar = (etzx) etzuVar.instance;
            etzwVar2.getClass();
            eygr eygrVar = etzxVar.c;
            if (!eygrVar.c()) {
                etzxVar.c = eyfy.mutableCopy(eygrVar);
            }
            etzxVar.c.add(etzwVar2);
        }
        return (etzx) etzuVar.build();
    }
}
