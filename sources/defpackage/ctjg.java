package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctjg {
    static final /* synthetic */ ctjg a = new ctjg();

    private ctjg() {
    }

    public static final String a(List list) {
        SuggestionData suggestionData;
        return (dkta.a(list) || (suggestionData = (SuggestionData) list.get(0)) == null) ? "" : suggestionData.c();
    }

    public static final String b(long j) {
        String format = String.format(Locale.US, "%019d", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
        format.getClass();
        return format;
    }

    public static final String c(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        return b(messageCoreData.t());
    }
}
