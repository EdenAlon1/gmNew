package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class couy {
    public static final String[] a = {"_id", "mid", "chset", "ct", ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "name"};
    public String b;
    public long c;
    public long d;
    public String e;
    public String f;
    public int g;
    public long h;
    public String i;
    private final Context j;
    private final csuu k;

    public couy(Context context, csuu csuuVar) {
        this.j = context;
        this.k = csuuVar;
    }

    public final Uri a() {
        return Uri.parse("content://mms/part/" + this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.database.Cursor r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.couy.b(android.database.Cursor, boolean):void");
    }

    public final boolean c() {
        return le.q(this.e);
    }

    public final boolean d() {
        return RbmSpecificMessage.CONTENT_TYPE.equals(this.e);
    }

    public final boolean e() {
        return "text/plain".equals(this.e) || "text/html".equals(this.e) || "application/vnd.wap.xhtml+xml".equals(this.e);
    }
}
