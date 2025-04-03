package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emwv {
    private final emww a;
    private final String b;

    public emwv(emww emwwVar, String str) {
        this.a = emwwVar;
        this.b = str;
    }

    public final void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append(this.a.a(entry.getKey()));
                sb.append((CharSequence) this.b);
                sb.append(this.a.a(entry.getValue()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.a.c);
                    Map.Entry entry2 = (Map.Entry) it.next();
                    sb.append(this.a.a(entry2.getKey()));
                    sb.append((CharSequence) this.b);
                    sb.append(this.a.a(entry2.getValue()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void b(StringBuilder sb, Iterable iterable) {
        a(sb, iterable.iterator());
    }
}
