package defpackage;

import android.net.Uri;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cozk {
    public static final Uri a = Uri.parse("content://mms-sms/threadID");
    public static final Pattern b = Pattern.compile("\\s*(\"[^\"]*\"|[^<>\"]+)\\s*<([^<>]+)>\\s*");
    public final cpdg c;

    public cozk(cpdg cpdgVar) {
        this.c = cpdgVar;
    }
}
