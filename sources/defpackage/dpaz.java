package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpaz extends ffhv implements ffjm {
    final /* synthetic */ dpbd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpaz(dpbd dpbdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dpbdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpaz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (this.a.e != null) {
            throw new IllegalStateException("This instance has already been prepared");
        }
        ensk h = dpbd.a.h();
        h.Y(ente.a, "HugoAudio");
        ((enrr) h.h("com/google/android/libraries/compose/audio/codec/AmrEncoder$prepare$2", "invokeSuspend", 53, "AmrEncoder.kt")).t("Preparing AmrEncoder with configuration: %s", this.a.d.toString());
        dpbe dpbeVar = this.a.d;
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/3gpp", dpbeVar.c, 1);
        createAudioFormat.setInteger("bitrate", dpbeVar.e);
        createAudioFormat.setInteger("pcm-encoding", 2);
        createAudioFormat.getClass();
        dpbd dpbdVar = this.a;
        MediaCodec a = dpbn.a(createAudioFormat);
        a.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
        dpbdVar.e = a;
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpaz(this.a, ffguVar);
    }
}
