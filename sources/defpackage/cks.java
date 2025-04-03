package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cks implements AutoCloseable {
    public final ArrayDeque a;
    private String[] b;

    private cks(Object obj, String str, ArrayDeque arrayDeque) {
        this.a = arrayDeque;
        if (obj != null) {
            ckr ckrVar = new ckr(obj, str);
            arrayDeque.addFirst(ckrVar);
            if (Log.isLoggable("CarApp.Bun", 2)) {
                int size = arrayDeque.size();
                int i = 11;
                int min = Math.min(size, 11);
                if (this.b == null) {
                    this.b = new String[12];
                }
                String str2 = this.b[min];
                if (str2 == null) {
                    char[] cArr = new char[min];
                    Arrays.fill(cArr, ' ');
                    String str3 = new String(cArr);
                    if (min == 11) {
                        str2 = str3.concat("...");
                    } else {
                        i = min;
                        str2 = str3;
                    }
                    this.b[i] = str2;
                }
                Log.v("CarApp.Bun", str2.concat(cku.e(ckrVar.a.getClass()) + " " + ckrVar.b));
            }
        }
    }

    static cks a() {
        return new cks(null, "", new ArrayDeque());
    }

    static cks b(Object obj, String str, cks cksVar) {
        return new cks(obj, str, cksVar.a);
    }

    final String c() {
        StringBuilder sb = new StringBuilder();
        int min = Math.min(this.a.size(), 8);
        Iterator descendingIterator = this.a.descendingIterator();
        while (descendingIterator.hasNext()) {
            int i = min - 1;
            if (min <= 0) {
                break;
            }
            sb.append(((ckr) descendingIterator.next()).a());
            min = i;
        }
        if (descendingIterator.hasNext()) {
            sb.append("[...]");
        }
        return sb.toString();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.removeFirst();
    }
}
