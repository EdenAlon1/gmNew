package defpackage;

import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.Section;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ambp {
    public static final entd a = entd.c("Bugle");
    public static final QuerySpecification b;
    public final ffsk c;
    public final ffbr d;
    public final aolr e;
    public final dhou f;

    static {
        dewf dewfVar = new dewf();
        dewfVar.a = true;
        dewfVar.b();
        dewfVar.c(new Section("thing_proto", true, 16));
        b = dewfVar.a();
    }

    public ambp(ffsk ffskVar, ffbr ffbrVar, aolr aolrVar, dhou dhouVar) {
        this.c = ffskVar;
        this.d = ffbrVar;
        this.e = aolrVar;
        this.f = dhouVar;
    }

    public static final String a(faxo faxoVar, String str) {
        eygr eygrVar = faxoVar.b;
        eygrVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : eygrVar) {
            faxm faxmVar = (faxm) obj;
            if (faxmVar.b().equals(str) && faxmVar.a() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((faxm) it.next()).d());
        }
        String str2 = (String) ffdx.M(arrayList2);
        return str2 == null ? "" : str2;
    }
}
