package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewuu {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("^[^|]*\\|([^|]*)\\|[^|]*$");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(int i, List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        enqv it = ((engw) list).iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((emxc) it.next()).b(new emwl() { // from class: ewus
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return ((ewut) obj).a;
                }
            }).e(""));
        }
        return String.format(Locale.US, "%s|%s|%d", "androidtc", new emww(";").b(arrayList), Integer.valueOf(i));
    }
}
