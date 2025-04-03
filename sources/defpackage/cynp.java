package defpackage;

import android.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cynp implements eivv {
    final /* synthetic */ cynq a;

    public cynp(cynq cynqVar) {
        this.a = cynqVar;
    }

    @Override // defpackage.eivv
    public final void aa(eivt eivtVar) {
        final eisx a = eivtVar.a();
        a.getClass();
        final cynq cynqVar = this.a;
        Optional optional = (Optional) cynqVar.b.b();
        final ffji ffjiVar = new ffji() { // from class: cynl
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((cynk) obj).getClass();
                cynv cynvVar = new cynv();
                fbae.e(cynvVar);
                ekky.b(cynvVar, eisx.this);
                cg cgVar = new cg(cynqVar.a.a());
                cgVar.x(R.id.content, cynvVar, "ConversationDetailsFragment");
                cgVar.c();
                return ffcu.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: cynm
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.eivv
    public final void ac(eiup eiupVar) {
    }
}
