package defpackage;

import android.media.MediaFormat;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bxj implements byc {
    public static bxi f() {
        bxl bxlVar = new bxl();
        bxlVar.f(-1);
        return bxlVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    @Override // defpackage.byc
    public final MediaFormat e() {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(g(), d(), b());
        createAudioFormat.setInteger("bitrate", a());
        if (c() != -1) {
            if (g().equals("audio/mp4a-latm")) {
                createAudioFormat.setInteger("aac-profile", c());
                return createAudioFormat;
            }
            createAudioFormat.setInteger("profile", c());
        }
        return createAudioFormat;
    }

    @Override // defpackage.byc
    public abstract String g();

    @Override // defpackage.byc
    public abstract int h();
}
