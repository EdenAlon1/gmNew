package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpfr {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/suggestions/SuggestionTypeCombinationsConfig");
    public static final emye b = emye.b(';').a();
    public static final emyb c = new emyb(emye.b(',').a(), emye.b('|'));
    public static final Pattern d = Pattern.compile("\\[(\\d?):(\\d*)]");
    public final emyl e;

    public cpfr() {
        emyl a2 = emys.a(new emyl() { // from class: cpfp
            @Override // defpackage.emyl
            public final Object get() {
                enru enruVar = cpfr.a;
                String str = (String) cpfl.a.e();
                engr engrVar = new engr();
                try {
                    for (String str2 : cpfr.b.g(str)) {
                        str2.getClass();
                        engrVar.h(new cpfq(str2));
                    }
                } catch (Exception e) {
                    ensk j = cpfr.a.j();
                    j.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/shared/suggestions/SuggestionTypeCombinationsConfig", "parseConfigString", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "SuggestionTypeCombinationsConfig.kt")).t("Error while parsing config string %s", str);
                }
                engw g = engrVar.g();
                g.getClass();
                return g;
            }
        });
        a2.getClass();
        this.e = a2;
    }
}
