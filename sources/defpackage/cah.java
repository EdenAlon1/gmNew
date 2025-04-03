package defpackage;

import android.media.MediaFormat;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cah implements byc {
    public static cag l() {
        bxn bxnVar = new bxn();
        bxnVar.f(-1);
        bxnVar.c = 1;
        bxnVar.a = 2130708361;
        bxnVar.b = cai.a;
        return bxnVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    @Override // defpackage.byc
    public final MediaFormat e() {
        Size i = i();
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(g(), i.getWidth(), i.getHeight());
        createVideoFormat.setInteger("color-format", b());
        createVideoFormat.setInteger("bitrate", a());
        createVideoFormat.setInteger("frame-rate", c());
        createVideoFormat.setInteger("i-frame-interval", d());
        if (f() != -1) {
            createVideoFormat.setInteger("profile", f());
        }
        cai k = k();
        if (k.b() != 0) {
            createVideoFormat.setInteger("color-standard", k.b());
        }
        if (k.c() != 0) {
            createVideoFormat.setInteger("color-transfer", k.c());
        }
        if (k.a() != 0) {
            createVideoFormat.setInteger("color-range", k.a());
        }
        return createVideoFormat;
    }

    public abstract int f();

    @Override // defpackage.byc
    public abstract String g();

    @Override // defpackage.byc
    public abstract int h();

    public abstract Size i();

    public abstract cag j();

    public abstract cai k();
}
