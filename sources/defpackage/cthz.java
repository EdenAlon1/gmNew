package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cthz {
    public static final entd a = entd.c("BugleNotifications");
    public static final cfup b = cfvl.r(162850086, "enable_bugle_audio_player_for_notification");
    public final ctht c;
    public final ctcy d;
    public final AudioManager e;
    public final cqoh f;
    public final errm g;
    public final AtomicLong h = new AtomicLong(0);
    private final Context i;
    private final ctyx j;

    public cthz(Context context, ctyx ctyxVar, ctht cthtVar, ctcy ctcyVar, AudioManager audioManager, cqoh cqohVar, errm errmVar) {
        this.i = context;
        this.j = ctyxVar;
        this.c = cthtVar;
        this.d = ctcyVar;
        this.e = audioManager;
        this.f = cqohVar;
        this.g = errmVar;
    }

    public final Uri a(String str) {
        if (str == null) {
            str = this.j.f(this.i.getString(R.string.notification_sound_pref_key), null);
        }
        if (!TextUtils.isEmpty(str)) {
            return Uri.parse(str);
        }
        if (str != null) {
            return null;
        }
        return Settings.System.DEFAULT_NOTIFICATION_URI;
    }
}
