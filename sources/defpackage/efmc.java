package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efmc implements efma {
    public static final String a = "efmc";
    public static final String[] b = {ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "chset"};
    public static final String[] c = {"_id"};
    public static final ContentValues d;
    public static final ContentValues e;
    public static final ContentValues f;
    public final ContentResolver g;
    public final efmd h;
    public final enhk i;
    public final efln j;

    static {
        ContentValues contentValues = new ContentValues(6);
        d = contentValues;
        contentValues.put("read", (Integer) 1);
        contentValues.put("seen", (Integer) 1);
        contentValues.put("sub_id", (Integer) (-1));
        contentValues.put("msg_box", (Integer) 0);
        contentValues.put("text_only", (Integer) 1);
        ContentValues contentValues2 = new ContentValues(2);
        e = contentValues2;
        contentValues2.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, (Integer) 0);
        contentValues2.put("charset", (Integer) 106);
        f = new ContentValues(2);
    }

    public efmc(ContentResolver contentResolver, efmd efmdVar, efln eflnVar, enhk enhkVar) {
        this.g = contentResolver;
        this.h = efmdVar;
        this.j = eflnVar;
        this.i = enhkVar;
        d.put("thread_id", Long.valueOf(efmdVar.a(Collections.EMPTY_SET)));
    }
}
