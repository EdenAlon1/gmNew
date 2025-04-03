package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alas {
    public final Map a;
    public final Map b;
    public final faxs c;
    private final alan d;

    public alas(alan alanVar) {
        epyw epywVar;
        epyw epywVar2;
        eolt eoltVar;
        eolt eoltVar2;
        alanVar.getClass();
        this.d = alanVar;
        ffga ffgaVar = new ffga();
        for (akzq akzqVar : alanVar.e) {
            for (akzl akzlVar : akzqVar.c) {
                if (akzlVar.b == 1) {
                    eolt b = eolt.b(((Integer) akzlVar.c).intValue());
                    if (ffgaVar.containsKey(b == null ? eolt.UNKNOWN_BUGLE_EVENT_TYPE : b)) {
                        if (akzlVar.b == 1) {
                            eoltVar = eolt.b(((Integer) akzlVar.c).intValue());
                            if (eoltVar == null) {
                                eoltVar = eolt.UNKNOWN_BUGLE_EVENT_TYPE;
                            }
                        } else {
                            eoltVar = eolt.UNKNOWN_BUGLE_EVENT_TYPE;
                        }
                        Objects.toString(eoltVar);
                        throw new IllegalArgumentException("Multiple QoS tiers found for event type: ".concat(String.valueOf(eoltVar)));
                    }
                    if (akzlVar.b == 1) {
                        eoltVar2 = eolt.b(((Integer) akzlVar.c).intValue());
                        if (eoltVar2 == null) {
                            eoltVar2 = eolt.UNKNOWN_BUGLE_EVENT_TYPE;
                        }
                    } else {
                        eoltVar2 = eolt.UNKNOWN_BUGLE_EVENT_TYPE;
                    }
                    eoltVar2.getClass();
                    faxs b2 = faxs.b(akzqVar.b);
                    b2 = b2 == null ? faxs.DEFAULT : b2;
                    b2.getClass();
                    ffgaVar.put(eoltVar2, b2);
                }
            }
        }
        this.a = ffew.b(ffgaVar);
        ffga ffgaVar2 = new ffga();
        for (akzq akzqVar2 : this.d.e) {
            for (akzl akzlVar2 : akzqVar2.c) {
                if (akzlVar2.b == 2) {
                    epyw b3 = epyw.b(((Integer) akzlVar2.c).intValue());
                    if (ffgaVar2.containsKey(b3 == null ? epyw.UNKNOWN_BUGLE_EVENT_CODE : b3)) {
                        if (akzlVar2.b == 2) {
                            epywVar = epyw.b(((Integer) akzlVar2.c).intValue());
                            if (epywVar == null) {
                                epywVar = epyw.UNKNOWN_BUGLE_EVENT_CODE;
                            }
                        } else {
                            epywVar = epyw.UNKNOWN_BUGLE_EVENT_CODE;
                        }
                        Objects.toString(epywVar);
                        throw new IllegalArgumentException("Multiple QoS tiers found for event code: ".concat(String.valueOf(epywVar)));
                    }
                    if (akzlVar2.b == 2) {
                        epywVar2 = epyw.b(((Integer) akzlVar2.c).intValue());
                        if (epywVar2 == null) {
                            epywVar2 = epyw.UNKNOWN_BUGLE_EVENT_CODE;
                        }
                    } else {
                        epywVar2 = epyw.UNKNOWN_BUGLE_EVENT_CODE;
                    }
                    epywVar2.getClass();
                    faxs b4 = faxs.b(akzqVar2.b);
                    b4 = b4 == null ? faxs.DEFAULT : b4;
                    b4.getClass();
                    ffgaVar2.put(epywVar2, b4);
                }
            }
        }
        this.b = ffew.b(ffgaVar2);
        eygr eygrVar = this.d.e;
        eygrVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : eygrVar) {
            if (((akzq) obj).c.size() == 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            faxs b5 = faxs.b(((akzq) it.next()).b);
            if (b5 == null) {
                b5 = faxs.DEFAULT;
            }
            arrayList2.add(b5);
        }
        this.c = (faxs) enjk.m(arrayList2, faxs.DEFAULT);
    }
}
