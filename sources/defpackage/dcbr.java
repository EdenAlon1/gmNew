package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcbr implements dcak {
    protected static final String[] a = {"1F600", "263A FE0F", "1F60D", "1F602", "1F61B", "1F61E", "1F609", "1F60A", "1F618", "1F601", "2764 FE0F", "1F60F"};
    public List b;
    public final czex c;
    public boolean d = true;
    private final int e;
    private final czdp f;

    public dcbr(Context context, czex czexVar, czdp czdpVar) {
        this.e = context.getResources().getInteger(R.integer.c2o_emoji_content_category_max_count);
        this.c = czexVar;
        this.f = czdpVar;
    }

    @Override // defpackage.dcak
    public final int a() {
        return this.b.size();
    }

    public final void b(List list) {
        String[] strArr = a;
        int i = this.e;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < Math.min(i, list.size()); i2++) {
            String str = (String) list.get(i2);
            if (this.f.b(str)) {
                arrayList.add(new dcbo(str));
            }
        }
        for (int i3 = 0; i3 < 12 && arrayList.size() < i; i3++) {
            String str2 = strArr[i3];
            if (!list.contains(str2)) {
                arrayList.add(new dcbo(str2));
            }
        }
        this.b = arrayList;
        this.d = false;
    }
}
