package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aezw {
    private static final entd a = entd.c("BugleSuperSort");
    private String b = "";
    private enhk c = enoz.a;
    private final Object d = new Object();

    public final SuperSortLabel a(String str) {
        enhk c;
        synchronized (this.d) {
            String str2 = (String) aewg.g.e();
            if (this.b.equals(str2)) {
                c = this.c;
            } else {
                enhd enhdVar = new enhd();
                if (str2 == null) {
                    c = enhdVar.c();
                    this.c = c;
                    this.b = "";
                } else {
                    for (String str3 : str2.split(";", -1)) {
                        if (!str3.isEmpty()) {
                            String[] split = str3.split(":", -1);
                            if (split.length != 2) {
                                ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/label/data/classification/IntentToLabelFlagMapper", "loadIfNeeded", 58, "IntentToLabelFlagMapper.java")).t("malformed class mapping flag value, expecting comma separated pairs, found %s", str3);
                            } else {
                                try {
                                    String str4 = split[0];
                                    String str5 = split[1];
                                    SuperSortLabel superSortLabel = SuperSortLabel.UNKNOWN;
                                    enhdVar.k(str4, (SuperSortLabel) Enum.valueOf(SuperSortLabel.class, str5));
                                } catch (IllegalArgumentException e) {
                                    ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/apps/messaging/label/data/classification/IntentToLabelFlagMapper", "loadIfNeeded", 67, "IntentToLabelFlagMapper.java")).t("malformed class mapping flag value, expecting known label, found %s", split[1]);
                                }
                            }
                        }
                    }
                    c = enhdVar.c();
                    this.c = c;
                    this.b = str2;
                }
            }
        }
        SuperSortLabel superSortLabel2 = (SuperSortLabel) c.get(str);
        return superSortLabel2 == null ? SuperSortLabel.UNKNOWN : superSortLabel2;
    }
}
