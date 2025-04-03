package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbst {
    public static final Integer a = 8;

    public static String a(String str) {
        return String.format("%s/%s/%s", "content://com.google.android.apps.messaging", "annotations", str);
    }

    public static String b(ConversationIdType conversationIdType) {
        return String.format("%s/%s/%s", "content://com.google.android.apps.messaging", "conversations", conversationIdType);
    }

    public static String c(MessageIdType messageIdType) {
        return String.format("%s/%s/%s", "content://com.google.android.apps.messaging", "messages", Long.valueOf(messageIdType.a));
    }

    public static String d(String str) {
        return String.format("%s/%s/%s", "content://com.google.android.apps.messaging", "participants", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String e(String str, String str2) {
        engw engwVar;
        String str3 = "";
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str)) {
                int i = engw.d;
                engwVar = enou.a;
            } else {
                Stream map = DesugarArrays.stream(str.split("\\s+")).map(new Function() { // from class: cbss
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        Integer num = cbst.a;
                        return ((String) obj).replace("\"", "\\\"");
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i2 = engw.d;
                engwVar = (engw) map.collect(endq.a);
            }
            int size = engwVar.size();
            for (int i3 = 0; i3 < size; i3++) {
                String format = String.format(Locale.US, "(Q_PREFIX \"%s\" %s)", (String) engwVar.get(i3), str2);
                str3 = !TextUtils.isEmpty(str3) ? String.format(Locale.US, "(AND %s %s)", format, str3) : format;
            }
        }
        return str3;
    }

    public static String f(String str, String str2) {
        return !TextUtils.isEmpty(str2) ? String.format(Locale.US, "(OR %s %s)", str, str2) : str;
    }
}
