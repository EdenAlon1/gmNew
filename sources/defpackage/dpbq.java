package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpbq extends ffhv implements ffjm {
    final /* synthetic */ dpbu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpbq(dpbu dpbuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dpbuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpbq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (this.a.d != null) {
            throw new IllegalStateException("This instance has already been prepared");
        }
        ensk h = dpbu.a.h();
        h.Y(ente.a, "HugoAudio");
        ((enrr) h.h("com/google/android/libraries/compose/audio/codec/Mpeg4Encoder$prepare$2", "invokeSuspend", 61, "Mpeg4Encoder.kt")).t("Preparing Mpeg4Encoder with configuration: %s", this.a.c.toString());
        dpbv dpbvVar = this.a.c;
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", dpbvVar.c, 1);
        createAudioFormat.setInteger("bitrate", dpbvVar.e);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("pcm-encoding", 2);
        createAudioFormat.getClass();
        dpbu dpbuVar = this.a;
        MediaCodec a = dpbn.a(createAudioFormat);
        a.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
        dpbuVar.d = a;
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpbq(this.a, ffguVar);
    }
}
