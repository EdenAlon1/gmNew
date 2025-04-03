package defpackage;

import android.media.MediaPlayer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtea implements ffji {
    final /* synthetic */ MediaPlayer a;

    public dtea(MediaPlayer mediaPlayer) {
        this.a = mediaPlayer;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.release();
        return ffcu.a;
    }
}
