package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class adn {
    public final Map b = new LinkedHashMap();
    public final Map c = new LinkedHashMap();
    private final Map a = new LinkedHashMap();
    public final List d = new ArrayList();
    public final transient Map e = new LinkedHashMap();
    public final Map f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    private final void g(String str) {
        if (((Integer) this.c.get(str)) == null) {
            Iterator a = ffno.d(adk.a).a();
            while (a.hasNext()) {
                Number number = (Number) a.next();
                if (!this.b.containsKey(Integer.valueOf(number.intValue()))) {
                    d(number.intValue(), str);
                    return;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    }

    public abstract void a(int i, adu aduVar, Object obj, kli kliVar);

    public final adg b(String str, adu aduVar, adf adfVar) {
        str.getClass();
        aduVar.getClass();
        g(str);
        this.e.put(str, new adi(adfVar, aduVar));
        if (this.f.containsKey(str)) {
            Object obj = this.f.get(str);
            this.f.remove(str);
            adfVar.a(obj);
        }
        ade adeVar = (ade) ih.a(this.g, str, ade.class);
        if (adeVar != null) {
            this.g.remove(str);
            adfVar.a(aduVar.b(adeVar.a, adeVar.b));
        }
        return new adm(this, str, aduVar);
    }

    public final adg c(final String str, lkr lkrVar, final adu aduVar, final adf adfVar) {
        aduVar.getClass();
        adfVar.getClass();
        lkk P = lkrVar.P();
        if (P.a().a(lkj.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + lkrVar + " is attempting to register while current state is " + P.a() + ". LifecycleOwners must call register before they are STARTED.");
        }
        g(str);
        adj adjVar = (adj) this.a.get(str);
        if (adjVar == null) {
            adjVar = new adj(P);
        }
        lkp lkpVar = new lkp() { // from class: adh
            @Override // defpackage.lkp
            public final void hg(lkr lkrVar2, lki lkiVar) {
                adn adnVar = adn.this;
                String str2 = str;
                if (lki.ON_START != lkiVar) {
                    if (lki.ON_STOP == lkiVar) {
                        adnVar.e.remove(str2);
                        return;
                    } else {
                        if (lki.ON_DESTROY == lkiVar) {
                            adnVar.e(str2);
                            return;
                        }
                        return;
                    }
                }
                adu aduVar2 = aduVar;
                adf adfVar2 = adfVar;
                adnVar.e.put(str2, new adi(adfVar2, aduVar2));
                if (adnVar.f.containsKey(str2)) {
                    Object obj = adnVar.f.get(str2);
                    adnVar.f.remove(str2);
                    adfVar2.a(obj);
                }
                ade adeVar = (ade) ih.a(adnVar.g, str2, ade.class);
                if (adeVar != null) {
                    adnVar.g.remove(str2);
                    adfVar2.a(aduVar2.b(adeVar.a, adeVar.b));
                }
            }
        };
        adjVar.a.c(lkpVar);
        adjVar.b.add(lkpVar);
        this.a.put(str, adjVar);
        return new adl(this, str, aduVar);
    }

    public final void d(int i, String str) {
        Map map = this.b;
        Integer valueOf = Integer.valueOf(i);
        map.put(valueOf, str);
        this.c.put(str, valueOf);
    }

    public final void e(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.c.remove(str)) != null) {
            this.b.remove(num);
        }
        this.e.remove(str);
        if (this.f.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f.get(str));
            this.f.remove(str);
        }
        if (this.g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((ade) ih.a(this.g, str, ade.class)));
            this.g.remove(str);
        }
        adj adjVar = (adj) this.a.get(str);
        if (adjVar != null) {
            Iterator it = adjVar.b.iterator();
            while (it.hasNext()) {
                adjVar.a.d((lkp) it.next());
            }
            adjVar.b.clear();
            this.a.remove(str);
        }
    }

    public final boolean f(int i, int i2, Intent intent) {
        String str = (String) this.b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        adi adiVar = (adi) this.e.get(str);
        if ((adiVar != null ? adiVar.a : null) == null || !this.d.contains(str)) {
            this.f.remove(str);
            this.g.putParcelable(str, new ade(i2, intent));
            return true;
        }
        adiVar.a.a(adiVar.b.b(i2, intent));
        this.d.remove(str);
        return true;
    }
}
