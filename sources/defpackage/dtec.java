package defpackage;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtec extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ MediaPlayer c;
    final /* synthetic */ dtee d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtec(MediaPlayer mediaPlayer, dtee dteeVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = mediaPlayer;
        this.d = dteeVar;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtec) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            try {
                if (this.b != 0) {
                    ffci.b(obj);
                } else {
                    ffci.b(obj);
                    MediaPlayer mediaPlayer = this.c;
                    dtee dteeVar = this.d;
                    int i = this.e;
                    this.a = mediaPlayer;
                    this.b = 1;
                    ffrh ffrhVar = new ffrh(ffhi.c(this), 1);
                    ffrhVar.B();
                    ffrhVar.d(new dtea(mediaPlayer));
                    mediaPlayer.setOnCompletionListener(new dteb(ffrhVar));
                    mediaPlayer.setAudioAttributes(dtee.b);
                    AssetFileDescriptor openRawResourceFd = dteeVar.c.getResources().openRawResourceFd(i);
                    try {
                        mediaPlayer.setDataSource(openRawResourceFd);
                        ffig.a(openRawResourceFd, null);
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        if (ffrhVar.m() == ffhhVar) {
                            return ffhhVar;
                        }
                    } finally {
                    }
                }
            } catch (Exception e) {
                ((enrr) ((enrr) dtee.a.j()).g(e).h("com/google/android/libraries/compose/voice/audioplayer/DefaultSoundEffectPlayer$play$2", "invokeSuspend", 56, "DefaultSoundEffectPlayer.kt")).q("Exception occurred while playing sound effect.");
            }
            this.c.release();
            return ffcu.a;
        } catch (Throwable th) {
            this.c.release();
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dtec(this.c, this.d, this.e, ffguVar);
    }
}
