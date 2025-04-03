package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duqt implements duqj {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/emoji/data/StickyVariantsPreferences");
    public static volatile duqt b;
    public final dupm c;
    public final Map d = new ConcurrentHashMap();
    public final Executor e = dunl.a().f;
    public final duqk f;
    public ListenableFuture g;
    public ListenableFuture h;

    public duqt(Context context) {
        this.c = dupm.e(context);
        this.f = new dupa(context);
    }

    public final dupq a() {
        dupp duppVar = (dupp) dupq.a.createBuilder();
        duppVar.a(this.d);
        return (dupq) duppVar.build();
    }

    @Override // defpackage.duqj
    public final ListenableFuture b() {
        return this.g;
    }

    @Override // defpackage.duqj
    public final String c(String str) {
        throw null;
    }

    @Override // defpackage.duqj
    public final boolean d(String str) {
        dupm dupmVar = this.c;
        Map map = this.d;
        String d = dupmVar.d(str);
        if (str.equals((String) map.get(d))) {
            return false;
        }
        this.d.put(d, str);
        ((dupa) this.f).b(a());
        return true;
    }

    @Override // defpackage.duqj
    public final int e() {
        return 1;
    }
}
