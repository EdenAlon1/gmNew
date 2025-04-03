package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.privacy.etouffeetoggle.EtouffeeToggleActivity;
import com.google.android.apps.messaging.privacy.identitydetails.IdentityDetailsActivity;
import com.google.android.apps.messaging.privacy.settings.PrivacySettingsActivity;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.protobuf.contrib.android.ProtoParsers;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajjr implements ajjp {
    private final bzqa a;
    private final ffbr b;

    public ajjr(ffbr ffbrVar, bzqa bzqaVar) {
        this.b = ffbrVar;
        this.a = bzqaVar;
    }

    @Override // defpackage.ajjp
    public final Intent a(Context context, ajkn ajknVar) {
        if (!this.a.p()) {
            throw new UnsupportedOperationException("Configuration disabled for etouffee");
        }
        Intent intent = new Intent(context, (Class<?>) IdentityDetailsActivity.class);
        ProtoParsers.j(intent, "arguments", ajknVar);
        return intent;
    }

    @Override // defpackage.ajjp
    public final Intent b(Context context, ResolvedRecipient resolvedRecipient, aqux aquxVar) {
        awui awuiVar = (awui) aquxVar.m().flatMap(new Function() { // from class: ajjq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aoku) obj).e();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseThrow();
        String str = resolvedRecipient.F().a;
        int d = ((ctwb) this.b.b()).h(aquxVar.b()).d() + 1;
        ajlc ajlcVar = (ajlc) ajld.a.createBuilder();
        ajlcVar.copyOnWrite();
        ajld ajldVar = (ajld) ajlcVar.instance;
        ajldVar.b |= 1;
        ajldVar.c = d;
        int a = aquxVar.a();
        ajlcVar.copyOnWrite();
        ajld ajldVar2 = (ajld) ajlcVar.instance;
        ajldVar2.b |= 2;
        ajldVar2.d = a;
        String p = aquxVar.p();
        ajlcVar.copyOnWrite();
        ajld ajldVar3 = (ajld) ajlcVar.instance;
        ajldVar3.b |= 4;
        ajldVar3.e = p;
        ajld ajldVar4 = (ajld) ajlcVar.build();
        ajkm createBuilder = ajkn.a.createBuilder();
        createBuilder.copyOnWrite();
        ajkn ajknVar = (ajkn) createBuilder.instance;
        str.getClass();
        ajknVar.b |= 2;
        ajknVar.d = str;
        createBuilder.copyOnWrite();
        ajkn ajknVar2 = (ajkn) createBuilder.instance;
        awuiVar.getClass();
        ajknVar2.c = awuiVar;
        ajknVar2.b |= 1;
        createBuilder.copyOnWrite();
        ajkn ajknVar3 = (ajkn) createBuilder.instance;
        ajldVar4.getClass();
        ajknVar3.e = ajldVar4;
        ajknVar3.b |= 4;
        return a(context, createBuilder.build());
    }

    @Override // defpackage.ajjp
    public final Intent c(Context context) {
        if (this.a.o()) {
            return new Intent(context, (Class<?>) PrivacySettingsActivity.class);
        }
        throw new UnsupportedOperationException("Configuration disabled for etouffee");
    }

    @Override // defpackage.ajjp
    public final Intent d(Context context) {
        if (this.a.t()) {
            return new Intent(context, (Class<?>) EtouffeeToggleActivity.class);
        }
        throw new UnsupportedOperationException("Configuration disabled for etouffee toggle");
    }
}
