package defpackage;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qua implements qud {
    private final String a;
    private final AssetManager b;
    private Object c;

    public qua(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    protected abstract Object c(AssetManager assetManager, String str);

    @Override // defpackage.qud
    public final void e() {
        Object obj = this.c;
        if (obj == null) {
            return;
        }
        try {
            f(obj);
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.qud
    public final qsy eV() {
        return qsy.LOCAL;
    }

    protected abstract void f(Object obj);

    @Override // defpackage.qud
    public final void g(qqe qqeVar, quc qucVar) {
        try {
            Object c = c(this.b, this.a);
            this.c = c;
            qucVar.c(c);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            qucVar.f(e);
        }
    }

    @Override // defpackage.qud
    public final void d() {
    }
}
