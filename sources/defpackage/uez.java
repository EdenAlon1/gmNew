package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class uez {
    public abstract ufa a();

    public abstract eohh b();

    public abstract Optional c();

    public abstract Optional d();

    public abstract void e(epsw epswVar);

    public abstract void f(eohh eohhVar);

    public abstract void g(String str);

    public abstract void h(long j);

    public abstract void i(boolean z);

    public abstract void j(long j);

    public abstract void k(boolean z);

    public abstract void l(Uri uri);

    public final ufa m() {
        eohh b = b();
        i(((Boolean) c().orElse(Boolean.valueOf(b != eohh.FILE_CHOOSER))).booleanValue());
        k(((Boolean) d().orElse(Boolean.valueOf(b == eohh.CAMERA || b == eohh.MINI_CAMERA || b == eohh.FULLSCREEN_CAMERA))).booleanValue());
        return a();
    }
}
