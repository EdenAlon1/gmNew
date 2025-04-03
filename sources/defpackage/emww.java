package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class emww {
    public final String c;

    public emww(emww emwwVar) {
        this.c = emwwVar.c;
    }

    public static emww d(char c) {
        return new emww(String.valueOf(c));
    }

    public CharSequence a(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public String b(Iterable iterable) {
        return e(iterable.iterator());
    }

    public void c(Appendable appendable, Iterator it) {
        if (it.hasNext()) {
            appendable.append(a(it.next()));
            while (it.hasNext()) {
                appendable.append(this.c);
                appendable.append(a(it.next()));
            }
        }
    }

    public final String e(Iterator it) {
        StringBuilder sb = new StringBuilder();
        h(sb, it);
        return sb.toString();
    }

    public final String f(Object[] objArr) {
        return b(Arrays.asList(objArr));
    }

    public final String g(Object obj, Object obj2, Object... objArr) {
        return b(new emwu(objArr, obj, obj2));
    }

    public final void h(StringBuilder sb, Iterator it) {
        try {
            c(sb, it);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void i(StringBuilder sb, Iterable iterable) {
        h(sb, iterable.iterator());
    }

    public emww(String str) {
        str.getClass();
        this.c = str;
    }
}
