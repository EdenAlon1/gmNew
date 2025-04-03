package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wwb implements wqq {
    public final ConversationId a;
    public final aigz b;
    public final Optional c;
    private final aawu d;
    private final ffbr e;
    private final ffxx f;
    private final ajjc g;
    private final ffxx h;
    private final Set i;

    public wwb(Context context, ConversationId conversationId, aawu aawuVar, aigz aigzVar, ffbr ffbrVar, ffxx ffxxVar, Optional optional, ajjc ajjcVar) {
        context.getClass();
        conversationId.getClass();
        aawuVar.getClass();
        aigzVar.getClass();
        ffbrVar.getClass();
        ffxxVar.getClass();
        ajjcVar.getClass();
        this.a = conversationId;
        this.d = aawuVar;
        this.b = aigzVar;
        this.e = ffbrVar;
        this.f = ffxxVar;
        this.c = optional;
        this.g = ajjcVar;
        this.h = ((aspy) ffbrVar.b()).a() ? new wwa(aawuVar.a(), this, context) : new fgch(ffxxVar, aawuVar.a(), new wvx(context, this, null));
        this.i = fffi.b(aaxf.b);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.i;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.h;
    }

    public final void c(final alxr alxrVar) {
        alxrVar.getClass();
        if (!alxrVar.t()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (cubs.f()) {
            String b = alxrVar.g().b();
            b.getClass();
            if (ffpc.t(b, "image")) {
                this.c.isPresent();
                if (((appq) alxrVar.g()).n() != 1) {
                    this.g.e(new ffji() { // from class: wvs
                        /* JADX WARN: Type inference failed for: r1v1, types: [abke, java.lang.Object] */
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            final ajiy ajiyVar = (ajiy) obj;
                            ajiyVar.getClass();
                            final wwb wwbVar = wwb.this;
                            ?? r1 = wwbVar.c.get();
                            ffix ffixVar = new ffix() { // from class: wvt
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    ajiy.this.a();
                                    return ffcu.a;
                                }
                            };
                            final alxr alxrVar2 = alxrVar;
                            return r1.a(ffixVar, new ffix() { // from class: wvu
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    ajiy.this.a();
                                    wwbVar.b.h(new aikw(alxrVar2));
                                    return ffcu.a;
                                }
                            });
                        }
                    });
                    return;
                } else {
                    this.b.h(new aikw(alxrVar));
                    return;
                }
            }
        }
        this.b.h(new aikw(alxrVar));
    }
}
