package defpackage;

import j$.util.DesugarCollections;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ror {
    public final Map a;
    public final roy b;
    public final fhon c;

    public ror(Iterable iterable) {
        fhoe fhoeVar = new fhoe();
        HashMap hashMap = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            rot rotVar = (rot) it.next();
            hashMap.put(rotVar.a(), rotVar);
        }
        this.a = DesugarCollections.unmodifiableMap(hashMap);
        this.c = fhoeVar;
        this.b = new roy();
    }

    public final void a(PrintStream printStream) {
        String property = System.getProperty("line.separator");
        fhof fhofVar = new fhof();
        printStream.println("Usage: dumpapp [options] <plugin> [plugin-options]");
        PrintWriter printWriter = new PrintWriter(printStream);
        try {
            fhol fholVar = this.b.d;
            StringBuffer stringBuffer = new StringBuffer();
            String a = fhog.a(1);
            String a2 = fhog.a(3);
            ArrayList arrayList = new ArrayList();
            List a3 = fholVar.a();
            Collections.sort(a3, fhofVar);
            Iterator it = a3.iterator();
            int i = 0;
            while (it.hasNext()) {
                fhoj fhojVar = (fhoj) it.next();
                StringBuffer stringBuffer2 = new StringBuffer();
                Iterator it2 = it;
                String str = fhojVar.a;
                stringBuffer2.append(a);
                stringBuffer2.append("-");
                stringBuffer2.append(fhojVar.a);
                if (fhojVar.b()) {
                    stringBuffer2.append(',');
                    stringBuffer2.append("--");
                    stringBuffer2.append(fhojVar.b);
                }
                if (fhojVar.a()) {
                    fhojVar.b();
                    stringBuffer2.append(" ");
                    stringBuffer2.append("<");
                    stringBuffer2.append("arg");
                    stringBuffer2.append(">");
                }
                arrayList.add(stringBuffer2);
                if (stringBuffer2.length() > i) {
                    i = stringBuffer2.length();
                }
                it = it2;
            }
            Iterator it3 = a3.iterator();
            int i2 = 0;
            while (it3.hasNext()) {
                fhoj fhojVar2 = (fhoj) it3.next();
                int i3 = i2 + 1;
                StringBuilder sb = new StringBuilder(((StringBuffer) arrayList.get(i2)).toString());
                if (sb.length() < i) {
                    sb.append(fhog.a(i - sb.length()));
                }
                sb.append(a2);
                int i4 = i + 3;
                String str2 = fhojVar2.c;
                if (str2 != null) {
                    sb.append(str2);
                }
                String sb2 = sb.toString();
                int c = fhog.c(sb2);
                int i5 = -1;
                if (c == -1) {
                    stringBuffer.append(fhog.b(sb2));
                } else {
                    stringBuffer.append(fhog.b(sb2.substring(0, c)));
                    stringBuffer.append(property);
                    if (i4 >= 74) {
                        i4 = 1;
                    }
                    String a4 = fhog.a(i4);
                    while (true) {
                        sb2 = a4.concat(String.valueOf(sb2.substring(c).trim()));
                        c = fhog.c(sb2);
                        if (c == i5) {
                            break;
                        }
                        if (sb2.length() > 74 && c == i4 - 1) {
                            c = 74;
                        }
                        stringBuffer.append(fhog.b(sb2.substring(0, c)));
                        stringBuffer.append(property);
                        i5 = -1;
                    }
                    stringBuffer.append(sb2);
                }
                if (it3.hasNext()) {
                    stringBuffer.append(property);
                }
                i2 = i3;
            }
            printWriter.println(stringBuffer.toString());
        } finally {
            printWriter.flush();
        }
    }
}
