package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgyy implements Serializable {
    private static final long serialVersionUID = -417427815871330636L;
    private List a = new CopyOnWriteArrayList();

    public fgyy() {
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            stringBuffer.append(fhev.a((String) it.next()));
            if (it.hasNext()) {
                stringBuffer.append(',');
            }
        }
        return stringBuffer.toString();
    }

    public fgyy(String str) {
        Matcher matcher = Pattern.compile("([^\\\\](?:\\\\{2})),|([^\\\\]),").matcher(str);
        String[] split = matcher.find() ? matcher.replaceAll("$1$2&quot;").split("&quot;") : str.split("(?<!\\\\),");
        for (String str2 : split) {
            this.a.add(fhev.d(str2));
        }
    }
}
