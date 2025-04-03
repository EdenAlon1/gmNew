package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abln {
    private final azzw a;

    public abln(azzw azzwVar) {
        azzwVar.getClass();
        this.a = azzwVar;
    }

    public final List a(String str, String str2, boolean z) {
        ArrayList arrayList = new ArrayList();
        azzw azzwVar = this.a;
        String[] b = azzwVar.b(str);
        azzv a = azzv.a();
        Matcher a2 = azzwVar.a(b, str2, a.a, a.b);
        if (true != a.b.isEmpty()) {
            a2 = null;
        }
        if (a2 != null) {
            int i = 0;
            while (a2.find(i)) {
                int start = a2.start();
                int end = a2.end();
                arrayList.add(new dlto(z ? dlus.b : dlus.a, start, end, (ffji) null, 24));
                i = end;
            }
        }
        return arrayList;
    }
}
