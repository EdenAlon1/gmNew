package defpackage;

import android.content.Context;
import java.io.File;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class duoj implements Supplier {
    public final /* synthetic */ duml a;

    public /* synthetic */ duoj(duml dumlVar) {
        this.a = dumlVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        duml dumlVar = this.a;
        String str = dumlVar.a;
        if (str.length() == 0 || str.length() > 32) {
            ((enrr) dumo.a.a(duwj.a).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory$Builder", "checkLength", 455, "AutoCleanableDirectory.java")).B("The length of key (%s) must be >0 and <=%d", dumlVar.a, 32);
        }
        Context context = dumlVar.b;
        EnumMap enumMap = dumlVar.c;
        File cacheDir = context.getCacheDir();
        enhk c = ennc.c(enumMap);
        StringBuilder sb = new StringBuilder();
        sb.append(duml.b("BundledEmojiListLoader"));
        enqu listIterator = c.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            sb.append('|');
            sb.append(emuz.c(((dumn) entry.getKey()).toString()));
            sb.append('>');
            sb.append(duml.b((String) entry.getValue()));
        }
        String a = duml.a(duml.a(sb.toString(), '%'), '/');
        enru enruVar = dval.a;
        String[] strArr = {"auto_clean", a};
        int i = 0;
        while (i < 2) {
            File file = new File(cacheDir, strArr[i]);
            i++;
            cacheDir = file;
        }
        return new dumo(cacheDir, "BundledEmojiListLoader", c);
    }
}
