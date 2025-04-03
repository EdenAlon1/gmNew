package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsve extends dtup {
    public static final String[] a = {"desktop._id", "desktop.desktop_id", "desktop.last_connection_time", "desktop.last_wakeup_time", "desktop.wakeup_attempts_count", "desktop.fingerprint", "desktop.force_refresh", "desktop.client_info", "desktop.operating_system", "desktop.operating_system_version", "desktop.browser_type", "desktop.encryption_key", "desktop.hmac_key", "desktop.backend_type", "desktop.is_active", "desktop.request_id", "desktop.is_persistent", "desktop.desktop_type", "desktop.pairing_type", "desktop.destination_registration_id", "desktop.gaia_email", "desktop.creation_time", "desktop.get_updates_request_time_millis"};
    public static final enhk b;
    public static final bstr c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("desktop.operating_system", 22040);
        enhdVar.k("desktop.operating_system_version", 22040);
        enhdVar.k("desktop.browser_type", 18020);
        enhdVar.k("desktop.encryption_key", 21030);
        enhdVar.k("desktop.hmac_key", 21030);
        enhdVar.k("desktop.backend_type", 41010);
        enhdVar.k("desktop.is_active", 58010);
        enhdVar.k("desktop.request_id", 58010);
        enhdVar.k("desktop.is_persistent", 58010);
        enhdVar.k("desktop.desktop_type", 58010);
        enhdVar.k("desktop.pairing_type", 58960);
        enhdVar.k("desktop.destination_registration_id", 59290);
        enhdVar.k("desktop.gaia_email", 59560);
        enhdVar.k("desktop.creation_time", 59870);
        enhdVar.k("desktop.get_updates_request_time_millis", 60540);
        b = enhdVar.c();
        new enhd().c();
        c = new bstr();
        d = new int[]{15020, 18020, 20020, 21030, 22040, 41010, 58010, 58960, 59290, 59560, 59870, 60540};
    }

    public static final bsuz a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("desktop._id");
            engrVar.h("desktop.desktop_id");
            engrVar.h("desktop.last_connection_time");
            engrVar.h("desktop.last_wakeup_time");
            engrVar.h("desktop.wakeup_attempts_count");
            engrVar.h("desktop.fingerprint");
            engrVar.h("desktop.force_refresh");
            engrVar.h("desktop.client_info");
            if (c2.intValue() >= 22040) {
                engrVar.h("desktop.operating_system");
            }
            if (c2.intValue() >= 22040) {
                engrVar.h("desktop.operating_system_version");
            }
            if (c2.intValue() >= 18020) {
                engrVar.h("desktop.browser_type");
            }
            if (c2.intValue() >= 21030) {
                engrVar.h("desktop.encryption_key");
            }
            if (c2.intValue() >= 21030) {
                engrVar.h("desktop.hmac_key");
            }
            if (c2.intValue() >= 41010) {
                engrVar.h("desktop.backend_type");
            }
            if (c2.intValue() >= 58010) {
                engrVar.h("desktop.is_active");
            }
            if (c2.intValue() >= 58010) {
                engrVar.h("desktop.request_id");
            }
            if (c2.intValue() >= 58010) {
                engrVar.h("desktop.is_persistent");
            }
            if (c2.intValue() >= 58010) {
                engrVar.h("desktop.desktop_type");
            }
            if (c2.intValue() >= 58960) {
                engrVar.h("desktop.pairing_type");
            }
            if (c2.intValue() >= 59290) {
                engrVar.h("desktop.destination_registration_id");
            }
            if (c2.intValue() >= 59560) {
                engrVar.h("desktop.gaia_email");
            }
            if (c2.intValue() >= 59870) {
                engrVar.h("desktop.creation_time");
            }
            if (c2.intValue() >= 60540) {
                engrVar.h("desktop.get_updates_request_time_millis");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bsuz(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(e().a());
    }

    public static void d(dtve dtveVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("desktop_id TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_connection_time INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_wakeup_time INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("wakeup_attempts_count INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("fingerprint TEXT DEFAULT('') NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("force_refresh INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("client_info BLOB");
        if (i >= 22040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("operating_system TEXT DEFAULT('') NOT NULL");
        }
        if (i >= 22040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("operating_system_version TEXT DEFAULT('') NOT NULL");
        }
        if (i >= 18020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("browser_type INT DEFAULT(0)");
        }
        if (i >= 20020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("needs_unpairing INT DEFAULT(0)");
        }
        if (i >= 21030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("encryption_key BLOB");
        }
        if (i >= 21030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("hmac_key BLOB");
        }
        if (i >= 41010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("backend_type INT");
        }
        if (i >= 58010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_active INT DEFAULT(0)");
        }
        if (i >= 58010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("request_id TEXT DEFAULT('')");
        }
        if (i >= 58010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_persistent INT DEFAULT(0)");
        }
        if (i >= 58010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("desktop_type INT DEFAULT(0)");
        }
        if (i >= 58960) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("pairing_type INT DEFAULT(0)");
        }
        if (i >= 59290) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("destination_registration_id BLOB");
        }
        if (i >= 59560) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("gaia_email TEXT");
        }
        if (i >= 59870) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("creation_time INT DEFAULT(0)");
        }
        if (i >= 60540) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("get_updates_request_time_millis INT DEFAULT(0)");
        }
        sb.insert(0, "CREATE TABLE desktop (");
        sb.append(");");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf e() {
        return b().P();
    }
}
