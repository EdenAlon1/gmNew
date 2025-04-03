package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efgj {
    public final Context a;
    public final Executor b;
    public String c;
    public Set d;
    public efgi f;
    private boolean g = false;
    public emyl e = new emyl() { // from class: efgh
        @Override // defpackage.emyl
        public final Object get() {
            return false;
        }
    };

    public efgj(Context context, Executor executor) {
        this.a = context;
        this.b = executor;
    }

    public final efgm a() {
        boolean z = true;
        if (!this.g && this.d == null) {
            z = false;
        }
        emxf.b(z, "Must specify either forKeys(...) or forAllKeys() before calling build().");
        return new efgm(this);
    }

    public final void b() {
        this.d = null;
        this.g = true;
    }

    public final void c(String... strArr) {
        emxf.b(true, "Cannot call forKeys() with null argument");
        enin eninVar = new enin();
        eninVar.i(strArr);
        enip g = eninVar.g();
        emxf.b(g.size() == strArr.length, "Duplicate keys specified");
        this.d = g;
        this.g = false;
    }

    public final void d(efgk efgkVar) {
        this.f = new efgi(efgkVar);
    }
}
