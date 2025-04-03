package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deds {
    private static final entd a = entd.c("BugleVideoTrimmer");

    public static Intent a(Uri uri, long j, int i, int i2) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(ComponentName.unflattenFromString("com.samsung.app.newtrim/com.samsung.app.newtrim.trimactivity.TrimActivity"));
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(131);
        intent.putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
        intent.putExtra("VIDEO_OUTPUT_SIZE", j);
        if (i > ((Integer) dedt.d.e()).intValue() || i2 > ((Integer) dedt.d.e()).intValue()) {
            double intValue = ((Integer) dedt.d.e()).intValue() / Math.max(i, i2);
            i2 = (int) (i2 * intValue);
            i = (int) (i * intValue);
        }
        int max = ((Integer) dedt.b.e()).intValue() == -1 ? Math.max(i, i2) : ((Integer) dedt.b.e()).intValue();
        intent.putExtra("VIDEO_OUTPUT_WIDTH", max);
        int min = ((Integer) dedt.c.e()).intValue() == -1 ? Math.min(i, i2) : ((Integer) dedt.c.e()).intValue();
        intent.putExtra("VIDEO_OUTPUT_HEIGHT", min);
        intent.setDataAndType(uri, "video/*");
        if (((Boolean) dedt.e.e()).booleanValue()) {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/videotrimmer/VideoTrimmerIntents", "getVideoTrimmerIntent", 71, "VideoTrimmerIntents.java")).K("Intent extras: Width:%s, Height:%s, OutputFileSize:%s, Uri:%s", Integer.valueOf(max), Integer.valueOf(min), Long.valueOf(j), uri);
        }
        return intent;
    }
}
