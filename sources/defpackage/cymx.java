package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cymx implements cymq {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/conversation/conversationscale/ConversationScaleDataServiceImpl");
    public final ffbr b;
    public final errm c;
    private final ffbr d;
    private final ejvb e;
    private final ffbr f;
    private comc g;

    public cymx(ffbr ffbrVar, ffbr ffbrVar2, ejvb ejvbVar, ffbr ffbrVar3, errm errmVar) {
        this.d = ffbrVar;
        this.b = ffbrVar2;
        this.e = ejvbVar;
        this.f = ffbrVar3;
        this.c = errmVar;
    }

    @Override // defpackage.cymq
    public final ejuh a() {
        return ((Boolean) ((cfup) cymy.a.get()).e()).booleanValue() ? new ejuy(this.e, new eros() { // from class: cyms
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                cymx cymxVar = cymx.this;
                return new erph(cymxVar.d().h().h(new emwl() { // from class: cymv
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        cymp cympVar = (cymp) obj;
                        if (cympVar.d) {
                            return cympVar;
                        }
                        cymo builder = cympVar.toBuilder();
                        float floatValue = ((Float) cync.b.e()).floatValue();
                        builder.copyOnWrite();
                        cymp cympVar2 = (cymp) builder.instance;
                        cympVar2.b |= 1;
                        cympVar2.c = floatValue;
                        return builder.build();
                    }
                }, cymxVar.c));
            }
        }, "CONVERSATION_SCALE_CONTENT_KEY") : new ejuy(this.e, new eros() { // from class: cymt
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                return new erph(cymx.this.d().h());
            }
        }, "CONVERSATION_SCALE_CONTENT_KEY");
    }

    @Override // defpackage.cymq
    public final void b(final float f) {
        d().j(new emwl() { // from class: cymw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cymp cympVar = (cymp) obj;
                cympVar.getClass();
                cymo builder = cympVar.toBuilder();
                builder.copyOnWrite();
                cymp cympVar2 = (cymp) builder.instance;
                cympVar2.b |= 1;
                cympVar2.c = f;
                return builder.build();
            }
        }).k(axnw.c(new Consumer() { // from class: cymr
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ensk e = cymx.a.e();
                e.Y(ente.a, "Bugle");
                ((enrr) ((enrr) e).h("com/google/android/apps/messaging/ui/conversation/conversationscale/ConversationScaleDataServiceImpl", "saveConversationScaleState", 85, "ConversationScaleDataServiceImpl.java")).q("Conversation scale saved");
                ((akzt) cymx.this.b.b()).c("Bugle.ConversationScale.ConversationScaleSaveFailed.Count");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), this.c);
    }

    @Override // defpackage.cymq
    public final void c(final boolean z) {
        ((ejvp) this.f.b()).a(d().j(new emwl() { // from class: cymu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cymp cympVar = (cymp) obj;
                cymo builder = cympVar.toBuilder();
                builder.copyOnWrite();
                cymp cympVar2 = (cymp) builder.instance;
                cympVar2.b |= 2;
                boolean z2 = z;
                cympVar2.d = z2;
                float f = cympVar.c;
                builder.copyOnWrite();
                cymp cympVar3 = (cymp) builder.instance;
                cympVar3.b |= 1;
                cympVar3.c = f;
                cymp build = builder.build();
                cymx cymxVar = cymx.this;
                if (z2) {
                    ((akzt) cymxVar.b.b()).c("Bugle.ConversationScale.ConversationScaleEnableCount.Count");
                    return build;
                }
                ((akzt) cymxVar.b.b()).c("Bugle.ConversationScale.ConversationScaleDisableCount.Count");
                return build;
            }
        }), "CONVERSATION_SCALE_CONTENT_KEY");
    }

    public final comc d() {
        if (this.g == null) {
            comy comyVar = (comy) this.d.b();
            comu c = comv.c();
            c.d(comb.CONVERSATION_SCALE);
            c.f(cymp.a);
            this.g = comyVar.a(c.a());
        }
        return this.g;
    }
}
