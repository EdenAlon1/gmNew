package defpackage;

import android.content.Context;
import com.google.android.libraries.geller.portable.Geller;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgol implements fbba {
    public static dufc a(Context context, Geller geller, String str, String str2, final dubz dubzVar, dybe dybeVar, final dufq dufqVar, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, Map map) {
        eyev eyevVar = cgok.a;
        dufb dufbVar = new dufb(geller, str2, dybeVar, enpd.a, executorService, executorService3, executorService2);
        dufbVar.m = context;
        dufbVar.l = enhk.j(map);
        dufbVar.h = new emwl() { // from class: duez
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return dubz.this;
            }
        };
        dufbVar.k = str;
        dufbVar.i = cgok.a;
        dufbVar.c = new emwl() { // from class: dufa
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return dufq.this;
            }
        };
        emxf.m(dufbVar.c != null, "A SyncContextGenerator must be set for Geller");
        return new dufc(dufbVar);
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
