package defpackage;

import android.util.Log;
import android.util.SparseArray;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekyt implements elcg, edyw {
    private final ekwg a;

    public ekyt(ekwg ekwgVar) {
        this.a = ekwgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void c(eldq eldqVar, int i) {
        String concat;
        if ((eldqVar.b & 32) != 0) {
            ekxg ekxgVar = eldqVar.i;
            if (ekxgVar == null) {
                ekxgVar = ekxg.a;
            }
            if ((ekxgVar.b & 2) != 0) {
                Locale locale = Locale.US;
                String str = ((ekzx) eldqVar.e.get(0)).c;
                ekxd ekxdVar = ekxgVar.d;
                if (ekxdVar == null) {
                    ekxdVar = ekxd.a;
                }
                Log.println(i, "trace_manager", String.format(locale, "Trace %s timed out before completion. %s spans remaining", str, Integer.valueOf(ekxdVar.d)));
            }
            if ((ekxgVar.b & 1) != 0) {
                Locale locale2 = Locale.US;
                String str2 = ((ekzx) eldqVar.e.get(0)).c;
                ekxf ekxfVar = ekxgVar.c;
                if (ekxfVar == null) {
                    ekxfVar = ekxf.a;
                }
                Log.println(i, "trace_manager", String.format(locale2, "Trace %s tried to log too many spans. %s spans dropped", str2, Integer.valueOf(ekxfVar.c)));
            }
        }
        cno cnoVar = new cno();
        Iterator<E> it = eldqVar.e.iterator();
        while (it.hasNext()) {
            cnoVar.h(r5.d, (ekzx) it.next());
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < cnoVar.b(); i2++) {
            ekzx ekzxVar = (ekzx) cnoVar.e(i2);
            long j = ekzxVar.d;
            String str3 = (ekzxVar.b & 32) != 0 ? ekzxVar.h + " ms" : "unfinished";
            while (true) {
                ekzx ekzxVar2 = (ekzx) cnoVar.d(j);
                if (ekzxVar2 == null) {
                    concat = "Orphaned Root > ".concat(str3);
                    break;
                }
                long j2 = ekzxVar2.e;
                str3 = ekzxVar2.c + " > " + str3;
                if (j2 == -1) {
                    concat = str3;
                    break;
                }
                j = j2;
            }
            arrayList.add(String.format(Locale.US, "%06d\t%s", Long.valueOf(ekzxVar.f), concat));
        }
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Log.println(i, "trace_manager", (String) arrayList.get(i3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.edyw
    public final ListenableFuture a() {
        if (this.a.a().isEmpty()) {
            return erre.a;
        }
        if (Log.isLoggable("trace_manager", 4)) {
            Log.i("trace_manager", "The following traces were active when the app crashed:");
            enqv it = ((engw) this.a.a()).iterator();
            int i = 0;
            while (it.hasNext()) {
                eldu elduVar = (eldu) it.next();
                Log.println(4, "trace_manager", a.h(i, "Trace: "));
                c(elduVar.c(), 4);
                i++;
            }
        }
        return erre.a;
    }

    @Override // defpackage.elcg
    public final void b(eldq eldqVar, SparseArray sparseArray) {
        if (Log.isLoggable("trace_manager", 2)) {
            c(eldqVar, 2);
        }
    }
}
