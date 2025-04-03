package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czti implements czrq {
    public final Context a;
    public final ffhd b;
    public final ffbr c;
    public final Optional d;
    public final ffbr e;
    public final ecrj f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final cskc m;
    private final ffsk n;

    public czti(Context context, ffsk ffskVar, ffhd ffhdVar, ffbr ffbrVar, Optional optional, ffbr ffbrVar2, ecrj ecrjVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8) {
        context.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        ffbrVar2.getClass();
        ecrjVar.getClass();
        ffbrVar3.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        this.a = context;
        this.n = ffskVar;
        this.b = ffhdVar;
        this.c = ffbrVar;
        this.d = optional;
        this.e = ffbrVar2;
        this.f = ecrjVar;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ffbrVar5;
        this.j = ffbrVar6;
        this.k = ffbrVar7;
        this.l = ffbrVar8;
        this.m = cskc.f("BuglePenpal", czti.class);
    }

    @Override // defpackage.czrq
    public final void a(final ConversationIdType conversationIdType, final ffji ffjiVar) {
        final dris drisVar = (dris) this.k.b();
        drisVar.a();
        drisVar.m();
        drisVar.h(new ffix() { // from class: czrt
            @Override // defpackage.ffix
            public final Object invoke() {
                dris.this.a();
                czti cztiVar = this;
                cztiVar.b(conversationIdType, ffjiVar);
                Optional optional = (Optional) cztiVar.h.b();
                final ffji ffjiVar2 = new ffji() { // from class: czrr
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        wmf wmfVar = (wmf) obj;
                        wmfVar.getClass();
                        wmfVar.i();
                        return ffcu.a;
                    }
                };
                optional.ifPresent(new Consumer() { // from class: czrs
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ffji.this.invoke(obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return ffcu.a;
            }
        });
        drisVar.q(new ffix() { // from class: czru
            @Override // defpackage.ffix
            public final Object invoke() {
                czti cztiVar = czti.this;
                ((ddzb) cztiVar.j.b()).h(R.string.feedback_confirmation);
                if (((Optional) cztiVar.h.b()).isPresent()) {
                    ((wmf) ((Optional) cztiVar.h.b()).get()).m();
                }
                return ffcu.a;
            }
        });
        drisVar.p(new ffix() { // from class: czrv
            @Override // defpackage.ffix
            public final Object invoke() {
                czti cztiVar = czti.this;
                if (((Optional) cztiVar.h.b()).isPresent()) {
                    ((wmf) ((Optional) cztiVar.h.b()).get()).k();
                }
                if (((Optional) cztiVar.i.b()).isPresent()) {
                    ((wha) ((Optional) cztiVar.i.b()).get()).a();
                }
                return ffcu.a;
            }
        });
        drisVar.e(new ffix() { // from class: czrw
            @Override // defpackage.ffix
            public final Object invoke() {
                czti cztiVar = czti.this;
                if (((Optional) cztiVar.i.b()).isPresent()) {
                    ((wha) ((Optional) cztiVar.i.b()).get()).b();
                }
                return ffcu.a;
            }
        });
        drisVar.c(ctjd.a());
        b(conversationIdType, ffjiVar);
    }

    public final void b(ConversationIdType conversationIdType, ffji ffjiVar) {
        axol.k(this.n, null, new czsl(this, this.f.d(), conversationIdType, ffjiVar, null), 3);
    }
}
