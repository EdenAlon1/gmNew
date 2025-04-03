package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctdf extends ctdb {
    public static final cskc a = cskc.g("Bugle", "MediaUtilImpl");
    private final errl b;

    public ctdf(errl errlVar) {
        this.b = errlVar;
    }

    @Override // defpackage.ctdb
    public final void a(final Context context) {
        final MediaPlayer a2 = ctef.a();
        elfo.f(new Runnable() { // from class: ctdc
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                MediaPlayer mediaPlayer = a2;
                try {
                    mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(13).build());
                    AssetFileDescriptor openRawResourceFd = context2.getResources().openRawResourceFd(R.raw.message_sent_v2);
                    mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                    openRawResourceFd.close();
                    mediaPlayer.setOnPreparedListener(new ctdd());
                    mediaPlayer.setOnCompletionListener(new ctde());
                    mediaPlayer.prepareAsync();
                } catch (Exception e) {
                    csjb e2 = ctdf.a.e();
                    e2.I("Error playing sound id:");
                    e2.G(R.raw.message_sent_v2);
                    e2.s(e);
                    ctef.b(mediaPlayer);
                }
            }
        }, this.b).k(axnw.b(), erpp.a);
    }
}
