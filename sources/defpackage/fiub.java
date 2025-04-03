package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fiub implements fiuq, fiuo {
    private static final Map a = new ConcurrentHashMap();
    private final firf b;
    private final boolean c;

    public fiub(firf firfVar, boolean z) {
        this.b = firfVar;
        this.c = z;
    }

    @Override // defpackage.fiuo
    public final int a() {
        return b();
    }

    @Override // defpackage.fiuq
    public final int b() {
        return this.c ? 6 : 20;
    }

    @Override // defpackage.fiuo
    public final int c(fiuk fiukVar, CharSequence charSequence, int i) {
        int intValue;
        Map map;
        Map map2 = a;
        Locale locale = fiukVar.b;
        Map map3 = (Map) map2.get(locale);
        if (map3 == null) {
            map3 = new ConcurrentHashMap();
            map2.put(locale, map3);
        }
        Object[] objArr = (Object[]) map3.get(this.b);
        if (objArr == null) {
            map = new ConcurrentHashMap(32);
            firr firrVar = new firr(firk.a);
            firf firfVar = this.b;
            fird a2 = firfVar.a(firrVar.b);
            if (!a2.u()) {
                throw new IllegalArgumentException("Field '" + firfVar.y + "' is not supported");
            }
            firq firqVar = new firq(firrVar, a2);
            int d = firqVar.b.d();
            int c = firqVar.b.c();
            if (c - d <= 32) {
                intValue = firqVar.b.b(locale);
                while (d <= c) {
                    firr firrVar2 = firqVar.a;
                    long h = firqVar.b.h(firrVar2.a, d);
                    firb firbVar = firrVar2.b;
                    firrVar2.a = h;
                    map.put(firqVar.e(locale), Boolean.TRUE);
                    map.put(firqVar.e(locale).toLowerCase(locale), Boolean.TRUE);
                    map.put(firqVar.e(locale).toUpperCase(locale), Boolean.TRUE);
                    map.put(firqVar.f(locale), Boolean.TRUE);
                    map.put(firqVar.f(locale).toLowerCase(locale), Boolean.TRUE);
                    map.put(firqVar.f(locale).toUpperCase(locale), Boolean.TRUE);
                    d++;
                }
                if ("en".equals(locale.getLanguage()) && this.b == firf.b) {
                    map.put("BCE", Boolean.TRUE);
                    map.put("bce", Boolean.TRUE);
                    map.put("CE", Boolean.TRUE);
                    map.put("ce", Boolean.TRUE);
                    intValue = 3;
                }
                map3.put(this.b, new Object[]{map, Integer.valueOf(intValue)});
            }
            return ~i;
        }
        Map map4 = (Map) objArr[0];
        intValue = ((Integer) objArr[1]).intValue();
        map = map4;
        for (int min = Math.min(charSequence.length(), i + intValue); min > i; min--) {
            String charSequence2 = charSequence.subSequence(i, min).toString();
            if (map.containsKey(charSequence2)) {
                firf firfVar2 = this.b;
                fiui c2 = fiukVar.c();
                c2.a = firfVar2.a(fiukVar.a);
                c2.b = 0;
                c2.c = charSequence2;
                c2.d = locale;
                return min;
            }
        }
        return ~i;
    }

    @Override // defpackage.fiuq
    public final void d(Appendable appendable, long j, firb firbVar, int i, firk firkVar, Locale locale) {
        try {
            fird a2 = this.b.a(firbVar);
            appendable.append(this.c ? a2.l(j, locale) : a2.n(j, locale));
        } catch (RuntimeException unused) {
            appendable.append((char) 65533);
        }
    }
}
