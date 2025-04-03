package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ydp implements Runnable {
    final /* synthetic */ ydq a;
    final /* synthetic */ ffji b;
    final /* synthetic */ ffji c;

    public ydp(ydq ydqVar, ffji ffjiVar, ffji ffjiVar2) {
        this.a = ydqVar;
        this.b = ffjiVar;
        this.c = ffjiVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] strArr = bsyb.a;
        bsxy bsxyVar = new bsxy();
        bsxyVar.ap("ConversationDraftPersistence.updateSync");
        this.b.invoke(bsxyVar);
        ConversationIdType b = bdgq.b(this.a.b.b());
        bsya bsyaVar = new bsya();
        bsyaVar.b(b);
        if (bsxyVar.aj(new bsxz(bsyaVar), "drafts-buildAndUpdateForConversationId")) {
            return;
        }
        if (dtub.c.r()) {
            this.a.a(this.c).k(4);
            return;
        }
        bswn a = this.a.a(this.c);
        final dtve b2 = bsyb.b();
        dtub.b(bsyb.b(), "drafts", a, new Function() { // from class: bswk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.S("drafts", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bswl
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
