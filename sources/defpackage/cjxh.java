package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjxh implements fbba {
    public static ejok a(final Context context, eivc eivcVar, Map map, Executor executor, Executor executor2) {
        return new ejpe(context, eivcVar, map, executor, executor2, new emwl() { // from class: cjxg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((cjxf) ekhv.a(context, cjxf.class, (eisx) obj)).dR();
            }
        }, "com.google.android.apps.messaging.shared.profile.workers.ProfilesRefreshWorker");
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
