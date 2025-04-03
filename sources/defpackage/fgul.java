package defpackage;

import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgul implements Serializable {
    private static final long serialVersionUID = 81383256078213569L;
    private List a = new CopyOnWriteArrayList();

    public fgul() {
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            String f = fhev.f(it.next());
            int i = fhex.a;
            stringBuffer.append(fhev.c(f));
            if (it.hasNext()) {
                stringBuffer.append(',');
            }
        }
        return stringBuffer.toString();
    }

    public fgul(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreTokens()) {
            try {
                this.a.add(new URI(fhex.a(fhev.e(stringTokenizer.nextToken()))));
            } catch (URISyntaxException e) {
                if (!fhel.b("ical4j.parsing.relaxed")) {
                    throw e;
                }
            }
        }
    }
}
