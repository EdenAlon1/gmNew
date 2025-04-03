package defpackage;

import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class am extends ad {
    public Map b;
    public Map c;
    private final Map e = new HashMap();
    private static final ResourceBundle d = new s();
    public static final am a = new am();

    private am() {
    }

    public final al a(String str) {
        boolean containsKey;
        aj ajVar;
        al alVar;
        Object[][] objArr;
        boolean z;
        synchronized (this.e) {
            containsKey = this.e.containsKey(str);
            ajVar = null;
            alVar = containsKey ? (al) this.e.get(str) : null;
        }
        if (containsKey) {
            return alVar;
        }
        try {
            Object[][] objArr2 = (Object[][]) d.getObject("rules");
            int length = objArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    objArr = null;
                    break;
                }
                Object[] objArr3 = objArr2[i];
                if (str.equals(objArr3[0])) {
                    objArr = (Object[][]) objArr3[1];
                    break;
                }
                i++;
            }
            StringBuilder sb = new StringBuilder();
            for (Object[] objArr4 : objArr) {
                if (sb.length() > 0) {
                    sb.append("; ");
                }
                sb.append((String) objArr4[0]);
                sb.append(": ");
                sb.append((String) objArr4[1]);
            }
            String sb2 = sb.toString();
            al alVar2 = al.a;
            String trim = sb2.trim();
            if (trim.length() == 0) {
                alVar = al.a;
            } else {
                ak akVar = new ak();
                if (trim.endsWith(";")) {
                    trim = trim.substring(0, trim.length() - 1);
                }
                for (String str2 : al.g.split(trim)) {
                    aj a2 = al.a(str2.trim());
                    boolean z2 = akVar.a;
                    if (a2.c == null && a2.d == null) {
                        z = false;
                        akVar.a = z2 | z;
                        akVar.a(a2);
                    }
                    z = true;
                    akVar.a = z2 | z;
                    akVar.a(a2);
                }
                Iterator it = akVar.b.iterator();
                while (it.hasNext()) {
                    aj ajVar2 = (aj) it.next();
                    if ("other".equals(ajVar2.a)) {
                        it.remove();
                        ajVar = ajVar2;
                    }
                }
                if (ajVar == null) {
                    ajVar = al.a("other:");
                }
                akVar.b.add(ajVar);
                alVar = new al(akVar);
            }
        } catch (ParseException | MissingResourceException unused) {
        }
        synchronized (this.e) {
            if (this.e.containsKey(str)) {
                alVar = (al) this.e.get(str);
            } else {
                this.e.put(str, alVar);
            }
        }
        return alVar;
    }

    public final void b() {
        Map map;
        Map map2;
        Map map3;
        synchronized (this) {
            map = this.b;
        }
        if (map == null) {
            try {
                ResourceBundle resourceBundle = d;
                Object[][] objArr = (Object[][]) resourceBundle.getObject("locales");
                map2 = new TreeMap();
                for (Object[] objArr2 : objArr) {
                    map2.put((String) objArr2[0], (String) objArr2[1]);
                }
                Object[][] objArr3 = (Object[][]) resourceBundle.getObject("locales_ordinals");
                map3 = new TreeMap();
                for (Object[] objArr4 : objArr3) {
                    map3.put((String) objArr4[0], (String) objArr4[1]);
                }
            } catch (MissingResourceException unused) {
                map2 = Collections.EMPTY_MAP;
                map3 = Collections.EMPTY_MAP;
            }
            synchronized (this) {
                if (this.b == null) {
                    this.b = map2;
                    this.c = map3;
                }
            }
        }
    }
}
