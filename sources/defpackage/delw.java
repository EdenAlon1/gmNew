package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class delw implements fbba {
    public static ejok a(final Context context, eivc eivcVar, Map map, Executor executor, Executor executor2) {
        return new ejpe(context, eivcVar, map, executor, executor2, new emwl() { // from class: delv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((delu) ekhv.a(context, delu.class, (eisx) obj)).fx();
            }
        }, "com.google.android.apps.messaging.welcome.v1.consent.ProfilesConsentWorker");
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
