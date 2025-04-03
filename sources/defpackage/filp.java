package defpackage;

import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class filp extends CronetEngine.Builder.LibraryLoader {
    private final CronetEngine.Builder.LibraryLoader a;

    public filp(CronetEngine.Builder.LibraryLoader libraryLoader) {
        this.a = libraryLoader;
    }

    @Override // org.chromium.net.CronetEngine.Builder.LibraryLoader
    public final void loadLibrary(String str) {
        this.a.loadLibrary(str);
    }
}
