package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.diagnostics.DumpDatabaseAction;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbjc {
    public final Context a;
    public final ffbr b;
    private final errl c;

    public dbjc(Context context, errl errlVar, ffbr ffbrVar) {
        context.getClass();
        errlVar.getClass();
        ffbrVar.getClass();
        this.a = context;
        this.c = errlVar;
        this.b = ffbrVar;
    }

    public static final void c(Context context, Uri uri, boolean z) {
        knt kntVar = new knt(context);
        kntVar.c("Share Messages db");
        kntVar.d("application/sql");
        kntVar.b(uri);
        Intent a = kntVar.a();
        a.setFlags(1);
        if (z) {
            a.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        }
        a.getClass();
        eldl.p(context, a);
    }

    private final void d(final Context context, DumpDatabaseAction dumpDatabaseAction) {
        axnw.i(elfl.g(dumpDatabaseAction.t()), new Consumer() { // from class: dbjb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                dbjc.c(context, (Uri) obj, false);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, this.c);
    }

    public final void a(Context context, aceq aceqVar) {
        aceqVar.getClass();
        acer acerVar = (acer) this.b.b();
        Context context2 = (Context) acerVar.a.b();
        context2.getClass();
        ffbr ffbrVar = acerVar.b;
        Map map = (Map) acerVar.c.b();
        map.getClass();
        d(context, new DumpDatabaseAction(context2, ffbrVar, map, aceqVar));
    }

    public final void b(Context context, boolean z) {
        d(context, ((acer) this.b.b()).b(z));
    }
}
