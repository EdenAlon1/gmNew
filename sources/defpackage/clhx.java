package defpackage;

import android.content.Intent;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clhx implements clhc {
    private static final enru c = enru.c("com/google/android/apps/messaging/shared/rcs/messaging/SendMessageMethod");
    public final clha a;
    public final clie b;
    private final errl d;

    public clhx(clha clhaVar, clie clieVar, errl errlVar) {
        this.a = clhaVar;
        this.b = clieVar;
        this.d = errlVar;
    }

    @Override // defpackage.clhc
    public final elfl a(final Intent intent) {
        Predicate mo439negate;
        emxf.a("com.google.android.apps.messaging.messaging_service_send_message_response".equals(intent.getAction()));
        ((enrr) ((enrr) c.h()).h("com/google/android/apps/messaging/shared/rcs/messaging/SendMessageMethod", "processIntent", 106, "SendMessageMethod.java")).t("SendMessageMethod received intent: %s", intent.getAction());
        Optional ofNullable = Optional.ofNullable(intent.getStringExtra(RcsIntents.EXTRA_TRACE_ID));
        mo439negate = Predicate$CC.isEqual(axad.a.c).mo439negate();
        String str = (String) ofNullable.filter(mo439negate).orElse(cslr.a().b);
        intent.putExtra(RcsIntents.EXTRA_TRACE_ID, str);
        final axac createBuilder = axad.a.createBuilder();
        Optional ofNullable2 = Optional.ofNullable(str);
        createBuilder.getClass();
        ofNullable2.ifPresent(new Consumer() { // from class: clhq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                axac axacVar = axac.this;
                String str2 = (String) obj;
                axacVar.copyOnWrite();
                axad axadVar = (axad) axacVar.instance;
                axad axadVar2 = axad.a;
                str2.getClass();
                axadVar.b |= 1;
                axadVar.c = str2;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return this.a.b(intent).h(new emwl() { // from class: clhr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Void r5 = (Void) obj;
                if (((Boolean) ((cfup) clie.d.get()).e()).booleanValue()) {
                    Intent intent2 = intent;
                    axac axacVar = createBuilder;
                    clhx clhxVar = clhx.this;
                    clhxVar.b.a(axacVar.build(), bdhg.a(intent2.getStringExtra(RcsIntents.EXTRA_MESSAGE_ID)));
                }
                return r5;
            }
        }, this.d);
    }

    @Override // defpackage.clhc
    public final String b() {
        return "Bugle.MessagingService.SendMessageResponse.Latency";
    }
}
