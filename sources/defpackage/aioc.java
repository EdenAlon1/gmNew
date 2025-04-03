package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aioc implements aigt {
    public final Context a;
    private final ffbr b;

    public aioc(Context context, ffbr ffbrVar) {
        this.a = context;
        this.b = ffbrVar;
    }

    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        ainz ainzVar = (ainz) aihsVar;
        final ResolvedRecipient resolvedRecipient = ainzVar.a;
        final aqux aquxVar = ainzVar.b;
        Optional optional = (Optional) this.b.b();
        final ffji ffjiVar = new ffji() { // from class: aioa
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ajjp ajjpVar = (ajjp) obj;
                ajjpVar.getClass();
                Context context = aioc.this.a;
                eldl.p(context, ajjpVar.b(context, resolvedRecipient, aquxVar));
                return ffcu.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: aiob
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return ffcu.a;
    }
}
