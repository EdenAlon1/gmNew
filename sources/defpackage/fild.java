package defpackage;

import android.content.Context;
import org.chromium.net.CronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fild extends filc {
    private filp q;

    public fild(Context context) {
        super(context);
    }

    @Override // defpackage.fihq
    public final filp e() {
        return this.q;
    }

    @Override // defpackage.fihq
    public final void i(CronetEngine.Builder.LibraryLoader libraryLoader) {
        this.q = new filp(libraryLoader);
    }

    @Override // defpackage.filc, defpackage.fihq, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        i(libraryLoader);
        return this;
    }
}
