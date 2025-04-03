package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.database.ContentObserver;
import com.google.android.apps.messaging.R;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cujj {
    static final cfup a = cfvl.e(cfvl.b, "spam_auto_reply_time_seconds", 600);
    static final cfup b = cfvl.i(cfvl.b, "disable_logging_spam_auto_reply_conversation_observer", false);
    public final ffbr c;
    public final Context d;
    public final bbfb e;
    public final cqoh f;
    public final akzt g;
    public final byzp h;
    public final Object i = new Object();
    public ContentObserver j = null;
    public long k;
    public final Pattern l;

    public cujj(ffbr ffbrVar, Context context, bbfb bbfbVar, cqoh cqohVar, akzt akztVar, byzp byzpVar) {
        this.c = ffbrVar;
        this.d = context;
        this.e = bbfbVar;
        this.f = cqohVar;
        this.g = akztVar;
        this.h = byzpVar;
        Resources resources = context.getResources();
        this.l = Pattern.compile("(?=.*" + resources.getString(R.string.spam_auto_reply_heuristic_reply) + ")((?=.*" + resources.getString(R.string.spam_auto_reply_heuristic_number) + ")|(?=.*#)).+", 2);
    }

    public final void a(ContentObserver contentObserver) {
        this.d.getContentResolver().unregisterContentObserver(contentObserver);
    }
}
