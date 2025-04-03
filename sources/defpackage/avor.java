package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avor {
    public static final entd a = entd.c("BugleRcsCapabilities");
    public final avoq b;
    public final ajnh c;

    public avor(avoq avoqVar, ajnh ajnhVar) {
        this.b = avoqVar;
        this.c = ajnhVar;
    }

    public static avoi a(Iterable iterable) {
        avoh avohVar = (avoh) avoi.a.createBuilder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            avoj avojVar = (avoj) avok.a.createBuilder();
            String[] split = str.split("=", -1);
            if (dktk.d(split[0])) {
                ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/chatapi/capabilities/converter/RcsCapabilitiesConverter", "convertToRcsCapabilities", 111, "RcsCapabilitiesConverter.java")).t("Unable to convert empty or malformed capability {%s}", str);
            } else {
                String str2 = split[0];
                avojVar.copyOnWrite();
                avok avokVar = (avok) avojVar.instance;
                str2.getClass();
                avokVar.b |= 1;
                avokVar.c = str2;
                String str3 = split.length > 1 ? split[1] : "";
                avojVar.copyOnWrite();
                avok avokVar2 = (avok) avojVar.instance;
                str3.getClass();
                avokVar2.b |= 2;
                avokVar2.d = str3;
                avohVar.a((avok) avojVar.build());
            }
        }
        return (avoi) avohVar.build();
    }
}
