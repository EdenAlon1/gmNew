package defpackage;

import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jwp {
    private LocaleList a;
    private jws b;
    private final jxl c = new jxl();

    public final jws a() {
        LocaleList localeList;
        int size;
        Locale locale;
        jxl jxlVar = this.c;
        localeList = LocaleList.getDefault();
        synchronized (jxlVar) {
            jws jwsVar = this.b;
            if (jwsVar != null && localeList == this.a) {
                return jwsVar;
            }
            size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                locale = localeList.get(i);
                arrayList.add(new jwq(locale));
            }
            jws jwsVar2 = new jws(arrayList);
            this.a = localeList;
            this.b = jwsVar2;
            return jwsVar2;
        }
    }
}
