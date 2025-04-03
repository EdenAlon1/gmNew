package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import j$.time.Duration;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxm implements abqq {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/AudioPlayerProvider");
    public final HashMap b;
    private final zyr c;

    public zxm(Context context, zyr zyrVar) {
        context.getClass();
        this.c = zyrVar;
        this.b = new HashMap();
    }

    public final zxl a(Uri uri, Duration duration, int i) {
        zxl zxlVar = (zxl) this.b.get(uri);
        if (zxlVar != null) {
            ((enrr) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/AudioPlayerProvider", "getOrCreateAudioPlayer", 80, "AudioPlayerProvider.kt")).t("createAudioPlayer found cached AudioPlayer with uri: %s", uri);
            return zxlVar;
        }
        ((enrr) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/AudioPlayerProvider", "getOrCreateAudioPlayer", 84, "AudioPlayerProvider.kt")).t("createAudioPlayer creating new AudioPlayer with uri: %s", uri);
        zyr zyrVar = this.c;
        AudioManager audioManager = (AudioManager) zyrVar.a.b();
        audioManager.getClass();
        Context context = (Context) zyrVar.b.b();
        context.getClass();
        ffsk ffskVar = (ffsk) zyrVar.c.b();
        ffskVar.getClass();
        ffsk ffskVar2 = (ffsk) zyrVar.d.b();
        ffskVar2.getClass();
        alcg alcgVar = (alcg) zyrVar.e.b();
        alcgVar.getClass();
        elbx elbxVar = (elbx) zyrVar.f.b();
        elbxVar.getClass();
        zyq zyqVar = new zyq(audioManager, context, ffskVar, ffskVar2, alcgVar, elbxVar, uri, duration, i);
        this.b.put(uri, zyqVar);
        return zyqVar;
    }

    @Override // defpackage.abqq, java.lang.AutoCloseable
    public final void close() {
        for (Object obj : this.b.values()) {
            obj.getClass();
            ((zxl) obj).i();
        }
        this.b.clear();
    }
}
