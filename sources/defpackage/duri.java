package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.duzk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duri implements duqz {
    private final List a;
    private final duzk b;
    private final Context c;
    private final dusj d;

    public duri(Context context, dusj dusjVar) {
        duzk duzkVar;
        this.c = context;
        this.d = dusjVar;
        duzk.a aVar = duzk.a;
        if (!dvaj.a()) {
            throw new IllegalStateException("Private preferences should not be used before user unlocked");
        }
        String str = true == TextUtils.isEmpty(null) ? "_private" : null;
        synchronized (duzk.class) {
            duzkVar = (duzk) duzk.d.get(str);
            if (duzkVar == null) {
                duzkVar = new duzk(context.getApplicationContext(), str);
                duzkVar.g();
                duzk.d.put(str, duzkVar);
            }
        }
        this.b = duzkVar;
        String o = duzkVar.o("pref_key_recent_emoji");
        this.a = TextUtils.isEmpty(o) ? new ArrayList() : new ArrayList(emye.b(',').i(o));
    }

    @Override // defpackage.duqz
    public final ListenableFuture a() {
        return erqt.i(engw.n(this.a));
    }

    @Override // defpackage.dura
    public final /* synthetic */ ListenableFuture b() {
        return duqy.a(this);
    }

    @Override // defpackage.dura
    public final String c() {
        enru enruVar = duoo.a;
        return this.c.getString(R.string.emoji_category_recent);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        String sb;
        List list = this.a;
        if (list.isEmpty()) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append(',');
            }
            sb2.deleteCharAt(sb2.length() - 1);
            sb = sb2.toString();
        }
        this.b.i("pref_key_recent_emoji", sb);
    }

    @Override // defpackage.dura
    public final /* synthetic */ void d(duvw duvwVar) {
        duqy.b(this, duvwVar);
    }

    @Override // defpackage.duqz
    public final void e(String str) {
        this.a.remove(str);
        this.a.add(0, str);
        this.d.a.S();
    }
}
