package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cube implements cuay {
    public final ffsk b;
    public final Context c;
    private final ffbr f;
    private static final enip d = enip.r("com.google.android.apps.messaging.ui.conversationlist.SHARE_TARGET_CATEGORY", "com.google.android.apps.messaging.ui.conversationlist.VIDEO_SHARE_TARGET_CATEGORY");
    private static final cskc e = cskc.g("Bugle", "ShortcutManagerWrapperImpl");
    public static final fgjb a = new fgjf();

    public cube(ffsk ffskVar, Context context, ffbr ffbrVar, ffbr ffbrVar2) {
        ffskVar.getClass();
        context.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.b = ffskVar;
        this.c = context;
        this.f = ffbrVar2;
        int i = kox.a;
        kox$$ExternalSyntheticApiModelOutline0.m471m(context.getSystemService(kox$$ExternalSyntheticApiModelOutline0.m())).getMaxShortcutCountPerActivity();
    }

    @Override // defpackage.cuay
    public final String a(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        String a2 = conversationIdType.a();
        a2.getClass();
        return a2;
    }

    @Override // defpackage.cuay
    public final boolean b(final String str) {
        try {
            Stream stream = Collection.EL.stream(kox.c(this.c, true != ctid.d ? 7 : 15));
            final ffji ffjiVar = new ffji() { // from class: cuaz
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    kou kouVar = (kou) obj;
                    fgjb fgjbVar = cube.a;
                    kouVar.getClass();
                    return kouVar.b;
                }
            };
            Stream map = stream.map(new Function() { // from class: cuba
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    fgjb fgjbVar = cube.a;
                    return ffji.this.invoke(obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final ffji ffjiVar2 = new ffji() { // from class: cubb
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    fgjb fgjbVar = cube.a;
                    return Boolean.valueOf(ffkj.e(str, (String) obj));
                }
            };
            return map.anyMatch(new Predicate() { // from class: cubc
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo439negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    fgjb fgjbVar = cube.a;
                    return ((Boolean) ffji.this.invoke(obj)).booleanValue();
                }
            });
        } catch (RuntimeException e2) {
            e.s("Failed to get shortcuts: ", e2);
            return false;
        }
    }

    @Override // defpackage.cuay
    public final kou c(Context context, ConversationId conversationId, String str, IconCompat iconCompat, String str2, int i, boolean z) {
        context.getClass();
        conversationId.getClass();
        str.getClass();
        Integer valueOf = Integer.valueOf(i);
        Intent l = ((ayfg) this.f.b()).l(context, conversationId, null, false, z);
        l.getClass();
        l.setFlags(0);
        l.setAction("android.intent.action.MAIN");
        l.putExtra("via_shortcut", true);
        knx knxVar = new knx(context);
        knxVar.e(l);
        PersistableBundle persistableBundle = new PersistableBundle(1);
        if (TextUtils.isEmpty(str)) {
            str = context.getString(R.string.unknown_shortcut_label);
        }
        kou kouVar = new kou();
        kouVar.a = context;
        kouVar.b = str2;
        kouVar.e = str;
        kouVar.c = knxVar.c();
        kouVar.g = context.getText(R.string.shortcut_disabled_text);
        kouVar.m = 2147483646;
        kouVar.n = persistableBundle;
        valueOf.getClass();
        if (i != 2147483646) {
            valueOf.getClass();
            kouVar.m = i;
            enip enipVar = d;
            cmj cmjVar = new cmj();
            cmjVar.addAll(enipVar);
            kouVar.j = cmjVar;
        }
        if (iconCompat != null) {
            kouVar.h = iconCompat;
        }
        if (ctid.d) {
            kouVar.l = true;
        }
        kot.a(kouVar, null, null);
        return kouVar;
    }
}
