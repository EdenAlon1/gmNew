package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eexb extends PrintWriter {
    public eexb() {
        super(new StringWriter());
    }

    public final void a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            print(' ');
        }
    }

    public final String toString() {
        return this.out.toString();
    }
}
