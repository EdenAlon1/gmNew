package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class iyb implements iyg {
    protected String a;
    private final int[] b = new int[2];

    protected final String a() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        ffkj.c(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        return null;
    }

    protected final int[] b(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }
}
