package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeol implements aeoe {
    private final elbx a;
    private final aeoj b;

    public aeol(Context context, elbx elbxVar, final aeot aeotVar, final aeot aeotVar2) {
        this.a = elbxVar;
        this.b = new aeoh(context, aeotVar, aeotVar2, new Function() { // from class: aeok
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((SelectedConversation) obj).r ? aeot.this : aeotVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.aeoe
    public final aeoj a() {
        return this.b;
    }

    @Override // defpackage.aeoe
    public final void b(wr wrVar, SelectedConversation selectedConversation) {
        ekzm b = this.a.b("SwipeMarkAsUnreadHandler");
        try {
            ellj.g(new czyh(selectedConversation.a, !selectedConversation.r), wrVar.a);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
