package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dxbb {
    public abstract dxbc a();

    public abstract emxc b();

    public abstract String c();

    public abstract void d(eydq eydqVar);

    public abstract void e(dxba dxbaVar);

    public abstract void f(engw engwVar);

    public abstract void g(Uri uri);

    public abstract void h(int i);

    public abstract void i(String str);

    public final dxbc j() {
        if (c().startsWith("inlinefile")) {
            emxf.b(b().g(), "InlineDownloadParams must be set when using inlinefile: scheme");
            e(dxba.a);
        }
        return a();
    }
}
