package defpackage;

import android.content.Context;
import android.os.Build;
import j$.util.Optional;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cguc {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor");
    public final enhk b;
    public final ffbr c;
    private final Context d;
    private final ffbr e;

    public cguc(Map map, ffbr ffbrVar, Context context, ffbr ffbrVar2) {
        this.d = context;
        this.b = enhk.j(map);
        this.c = ffbrVar;
        this.e = ffbrVar2;
    }

    private static ewgy b(Context context, ewgz ewgzVar) {
        ewhe ewheVar = (ewhe) ewhf.a.createBuilder();
        String str = Build.DEVICE;
        ewheVar.copyOnWrite();
        ewhf ewhfVar = (ewhf) ewheVar.instance;
        str.getClass();
        ewhfVar.b = str;
        ewhf ewhfVar2 = (ewhf) ewheVar.build();
        ewgt ewgtVar = (ewgt) ewgu.a.createBuilder();
        ewgtVar.copyOnWrite();
        ((ewgu) ewgtVar.instance).b = "com.google.android.apps.messaging";
        long a2 = dkvy.a(context);
        ewgtVar.copyOnWrite();
        ((ewgu) ewgtVar.instance).c = a2;
        ewgu ewguVar = (ewgu) ewgtVar.build();
        ewgx ewgxVar = (ewgx) ewgy.a.createBuilder();
        ewgxVar.copyOnWrite();
        ((ewgy) ewgxVar.instance).d = ewgzVar.a();
        ewgxVar.copyOnWrite();
        ewgy ewgyVar = (ewgy) ewgxVar.instance;
        ewhfVar2.getClass();
        ewgyVar.e = ewhfVar2;
        ewgyVar.b |= 1;
        ewgxVar.a(ewguVar);
        return (ewgy) ewgxVar.build();
    }

    private static String c(String str) {
        try {
            return str.substring(0, 8);
        } catch (StringIndexOutOfBoundsException e) {
            ensk j = a.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", "getImsiPrefix", (char) 249, "MobileConfigurationBugleAccessor.java")).q("MobileConfigurationBugleAccessor: failed to obtain imsiPrefix");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(engw engwVar) {
        enqu enquVar;
        enpx enpxVar;
        int i;
        int i2;
        String str;
        String d;
        Context context;
        cosz coszVar;
        String str2;
        String str3;
        cguc cgucVar = this;
        emxf.a(!engwVar.isEmpty());
        enhd enhdVar = new enhd();
        enip t = enip.t(ewgz.CONFIGURATION_TYPE_RCS_ONBOARDING_FLAGS, ewgz.CONFIGURATION_TYPE_MESSAGES_XMS_CARRIER_CONFIG_FLAGS, ewgz.CONFIGURATION_TYPE_RCS_UPI_POLICY_FLAGS, ewgz.CONFIGURATION_TYPE_RENUMBERINGS_CONFIGURATION_WITH_VERSION);
        enpx enpxVar2 = new enpx(ewgz.CONFIGURATION_TYPE_RENUMBERINGS_CONFIGURATION_WITH_VERSION);
        enqu listIterator = t.listIterator();
        while (listIterator.hasNext()) {
            ewgz ewgzVar = (ewgz) listIterator.next();
            if (enpxVar2.contains(ewgzVar)) {
                enhdVar.k(cgue.c(ewgzVar.name(), ewgzVar).d(), b(cgucVar.d, ewgzVar));
            } else {
                int size = engwVar.size();
                int i3 = 0;
                while (i3 < size) {
                    String str4 = (String) engwVar.get(i3);
                    try {
                        d = cgue.c(str4, ewgzVar).d();
                        context = cgucVar.d;
                        enquVar = listIterator;
                    } catch (NoSuchElementException e) {
                        e = e;
                        enquVar = listIterator;
                    }
                    try {
                        coszVar = (cosz) ((cort) cgucVar.e.b()).j(new djro(str4)).orElseThrow();
                        str2 = coszVar.k;
                        enpxVar = enpxVar2;
                        try {
                            str3 = coszVar.l;
                            i = size;
                        } catch (NoSuchElementException e2) {
                            e = e2;
                            i = size;
                            i2 = i3;
                            str = str4;
                            ensk j = a.j();
                            j.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", "registerParametersInternal", 121, "MobileConfigurationBugleAccessor.java")).t("MobileConfigurationBugleAccessor: No SimSubscriptionInfo found for simId: %s", cskt.b(str));
                            i3 = i2 + 1;
                            cgucVar = this;
                            listIterator = enquVar;
                            enpxVar2 = enpxVar;
                            size = i;
                        }
                    } catch (NoSuchElementException e3) {
                        e = e3;
                        enpxVar = enpxVar2;
                        i = size;
                        i2 = i3;
                        str = str4;
                        ensk j2 = a.j();
                        j2.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) ((enrr) j2).g(e)).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", "registerParametersInternal", 121, "MobileConfigurationBugleAccessor.java")).t("MobileConfigurationBugleAccessor: No SimSubscriptionInfo found for simId: %s", cskt.b(str));
                        i3 = i2 + 1;
                        cgucVar = this;
                        listIterator = enquVar;
                        enpxVar2 = enpxVar;
                        size = i;
                    }
                    try {
                        String c = c(coszVar.f);
                        i2 = i3;
                        try {
                            String str5 = coszVar.t;
                            boolean z = coszVar.o;
                            int i4 = coszVar.m;
                            str = str4;
                            try {
                                ewih ewihVar = (ewih) ewii.a.createBuilder();
                                ewihVar.copyOnWrite();
                                ewii ewiiVar = (ewii) ewihVar.instance;
                                str5.getClass();
                                ewiiVar.d = str5;
                                ewihVar.copyOnWrite();
                                ewii ewiiVar2 = (ewii) ewihVar.instance;
                                str2.getClass();
                                ewiiVar2.b = str2;
                                ewihVar.copyOnWrite();
                                ewii ewiiVar3 = (ewii) ewihVar.instance;
                                str3.getClass();
                                ewiiVar3.c = str3;
                                ewihVar.copyOnWrite();
                                ((ewii) ewihVar.instance).f = i4;
                                ewihVar.copyOnWrite();
                                ((ewii) ewihVar.instance).g = z;
                                if (c.startsWith(String.valueOf(str2).concat(String.valueOf(str3)))) {
                                    ewihVar.copyOnWrite();
                                    ewii ewiiVar4 = (ewii) ewihVar.instance;
                                    c.getClass();
                                    ewiiVar4.e = c;
                                }
                                ewii ewiiVar5 = (ewii) ewihVar.build();
                                ewgx ewgxVar = (ewgx) b(context, ewgzVar).toBuilder();
                                ewgxVar.copyOnWrite();
                                ewgy ewgyVar = (ewgy) ewgxVar.instance;
                                ewiiVar5.getClass();
                                ewgyVar.f = ewiiVar5;
                                ewgyVar.b |= 2;
                                enhdVar.k(d, (ewgy) ewgxVar.build());
                            } catch (NoSuchElementException e4) {
                                e = e4;
                                ensk j22 = a.j();
                                j22.Y(ente.a, "Bugle");
                                ((enrr) ((enrr) ((enrr) j22).g(e)).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", "registerParametersInternal", 121, "MobileConfigurationBugleAccessor.java")).t("MobileConfigurationBugleAccessor: No SimSubscriptionInfo found for simId: %s", cskt.b(str));
                                i3 = i2 + 1;
                                cgucVar = this;
                                listIterator = enquVar;
                                enpxVar2 = enpxVar;
                                size = i;
                            }
                        } catch (NoSuchElementException e5) {
                            e = e5;
                            str = str4;
                            ensk j222 = a.j();
                            j222.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) ((enrr) j222).g(e)).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", "registerParametersInternal", 121, "MobileConfigurationBugleAccessor.java")).t("MobileConfigurationBugleAccessor: No SimSubscriptionInfo found for simId: %s", cskt.b(str));
                            i3 = i2 + 1;
                            cgucVar = this;
                            listIterator = enquVar;
                            enpxVar2 = enpxVar;
                            size = i;
                        }
                    } catch (NoSuchElementException e6) {
                        e = e6;
                        i2 = i3;
                        str = str4;
                        ensk j2222 = a.j();
                        j2222.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) ((enrr) j2222).g(e)).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", "registerParametersInternal", 121, "MobileConfigurationBugleAccessor.java")).t("MobileConfigurationBugleAccessor: No SimSubscriptionInfo found for simId: %s", cskt.b(str));
                        i3 = i2 + 1;
                        cgucVar = this;
                        listIterator = enquVar;
                        enpxVar2 = enpxVar;
                        size = i;
                    }
                    i3 = i2 + 1;
                    cgucVar = this;
                    listIterator = enquVar;
                    enpxVar2 = enpxVar;
                    size = i;
                }
                cgucVar = this;
            }
        }
        if (((Optional) cgucVar.c.b()).isEmpty()) {
            ensk j3 = a.j();
            j3.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j3).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", "registerParametersInternal", 129, "MobileConfigurationBugleAccessor.java")).q("MobileConfigurationBugleAccessor: Could not access MobileConfigurationApi");
        } else {
            enhk c2 = enhdVar.c();
            ensk e7 = a.e();
            e7.Y(ente.a, "Bugle");
            ((enrr) ((enrr) e7).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", "registerParametersInternal", 136, "MobileConfigurationBugleAccessor.java")).t("MobileConfigurationBugleAccessor: Registered configuration: %s", c2.keySet());
            ((dlqm) ((Optional) cgucVar.c.b()).get()).d(c2);
        }
    }
}
