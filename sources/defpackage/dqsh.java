package defpackage;

import android.content.Context;
import android.os.LocaleList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqsh implements dxxz {
    private final Context a;

    public dqsh(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.dxxz
    public final ListenableFuture a(dwqb dwqbVar) {
        LocaleList locales;
        int size;
        Locale locale;
        dwqbVar.getClass();
        locales = this.a.getResources().getConfiguration().getLocales();
        locales.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        size = locales.size();
        for (int i = 0; i < size; i++) {
            locale = locales.get(i);
            locale.getClass();
            linkedHashMap.put(dqks.a(locale), locale);
        }
        eygr eygrVar = dwqbVar.c;
        eygrVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : eygrVar) {
            dwpx dwpxVar = ((dwpy) obj).c;
            if (dwpxVar == null) {
                dwpxVar = dwpx.a;
            }
            eygr eygrVar2 = dwpxVar.b;
            eygrVar2.getClass();
            if (!eygrVar2.isEmpty()) {
                Iterator<E> it = eygrVar2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (linkedHashMap.containsKey((String) it.next())) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            dwpj dwpjVar = ((dwpy) it2.next()).d;
            if (dwpjVar == null) {
                dwpjVar = dwpj.a;
            }
            arrayList2.add(dwpjVar);
        }
        return erqt.i(ffdx.am(arrayList2));
    }
}
