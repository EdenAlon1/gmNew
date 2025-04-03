package com.google.android.apps.messaging.shared.api.messaging.conversation.bugle;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.akjh;
import defpackage.akjw;
import defpackage.akjx;
import defpackage.akkp;
import defpackage.alxs;
import defpackage.alxu;
import defpackage.alye;
import defpackage.amhp;
import defpackage.amiy;
import defpackage.amiz;
import defpackage.amor;
import defpackage.amwm;
import defpackage.amwn;
import defpackage.amwu;
import defpackage.aorw;
import defpackage.aotl;
import defpackage.aotm;
import defpackage.apeq;
import defpackage.aptx;
import defpackage.aqgb;
import defpackage.aqgc;
import defpackage.aqgd;
import defpackage.aqge;
import defpackage.aqkp;
import defpackage.aqvh;
import defpackage.axnw;
import defpackage.cfzm;
import defpackage.ctbt;
import defpackage.ctbx;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emyl;
import defpackage.emys;
import defpackage.endq;
import defpackage.engw;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.errl;
import defpackage.ffbr;
import defpackage.ffsk;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class DefaultConversation implements BugleConversation {
    public final BugleConversationId a;
    public final errl b;
    public final aqge c;
    public final aqge d;
    public final aqge e;
    public final aqge f;
    public final aqge g;
    private final boolean i;
    private final emyl j;
    private final ffbr k;
    private final emyl l;
    private final emyl m;
    private final AtomicBoolean n = new AtomicBoolean(false);
    private ctbx o;
    private final ffbr p;
    private static final enru h = enru.c("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversation");
    public static final Parcelable.Creator<Conversation> CREATOR = new amiy();

    /* compiled from: PG */
    public interface a {
        amiz aj();
    }

    public DefaultConversation(errl errlVar, aqkp aqkpVar, aqvh aqvhVar, amhp amhpVar, ffbr ffbrVar, final aotm aotmVar, aqgc aqgcVar, ffbr ffbrVar2, ffbr ffbrVar3, final ffbr ffbrVar4, final ffbr ffbrVar5, ffbr ffbrVar6, final BugleConversationId bugleConversationId, final boolean z) {
        this.a = bugleConversationId;
        this.b = errlVar;
        this.i = z;
        this.p = ffbrVar6;
        aqgb a2 = aqgcVar.a(aqkpVar.d(bugleConversationId));
        this.c = a2;
        this.e = aqgcVar.a(aqvhVar.c());
        aqgb a3 = aqgcVar.a(amhpVar.a(bugleConversationId));
        this.f = a3;
        this.j = emys.a(new emyl() { // from class: amil
            @Override // defpackage.emyl
            public final Object get() {
                aorw aorwVar = new aorw() { // from class: amiw
                    @Override // defpackage.aorw
                    public final void a(engw engwVar) {
                    }
                };
                boolean booleanValue = ((Boolean) aoyx.a.e()).booleanValue();
                aotm aotmVar2 = aotmVar;
                BugleConversationId bugleConversationId2 = bugleConversationId;
                DefaultConversation defaultConversation = DefaultConversation.this;
                return aotmVar2.a(bugleConversationId2, defaultConversation.f, defaultConversation.c, defaultConversation.e, aorwVar, z, booleanValue);
            }
        });
        this.k = ffbrVar2;
        this.g = aqgcVar.a(((akjh) ffbrVar.b()).a(a2, a3, aqvhVar.a(), bugleConversationId));
        this.d = aqgcVar.a(((akjw) ffbrVar3.b()).a(a3, a2));
        this.l = emys.a(new emyl() { // from class: amip
            @Override // defpackage.emyl
            public final Object get() {
                return ((aper) ffbr.this.b()).a(bugleConversationId);
            }
        });
        this.m = emys.a(new emyl() { // from class: amiq
            @Override // defpackage.emyl
            public final Object get() {
                return ((amoq) ffbr.this.b()).a(bugleConversationId);
            }
        });
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final alxs a() {
        return ((aotl) this.j.get()).a();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final alxu b() {
        return ((aotl) this.j.get()).d();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final alye c() {
        return (alye) this.j.get();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation, java.lang.AutoCloseable
    public final void close() {
        if (this.j.get() != null) {
            ((aotl) this.j.get()).close();
        }
        ctbx ctbxVar = this.o;
        if (ctbxVar != null) {
            ctbxVar.close();
            this.o = null;
        }
        ensk h2 = h.h();
        h2.Y(ente.a, "BugleConversation");
        ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversation", "close", 349, "DefaultConversation.java")).t("Conversation closed: %s.", this.a.b());
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ConversationId d() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final apeq e() {
        return (apeq) this.l.get();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final aqge f() {
        return ((amor) this.m.get()).a;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final aqge g() {
        return this.g;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final aqge h() {
        return this.f;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final aqge i() {
        return this.d;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final cfzm j() {
        akjx akjxVar = (akjx) this.p.b();
        ffsk ffskVar = (ffsk) akjxVar.a.a.a.p.b();
        akkp akkpVar = akjxVar.a.a.a;
        return new amwu(this, ffskVar, akkpVar.wI, akkpVar.wJ);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final void k() {
        if (this.n.compareAndSet(false, true)) {
            Stream map = Collection.EL.stream((Set) this.k.b()).map(new Function() { // from class: amiv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    final amlb amlbVar = (amlb) obj;
                    ekzz a2 = amlbVar.a();
                    final DefaultConversation defaultConversation = DefaultConversation.this;
                    try {
                        elfl h2 = elfo.h(new erog() { // from class: amio
                            @Override // defpackage.erog
                            public final ListenableFuture a() {
                                return amlbVar.b(DefaultConversation.this, alxk.FOR_DISPLAY);
                            }
                        }, defaultConversation.b);
                        a2.b(h2);
                        a2.close();
                        return h2;
                    } catch (Throwable th) {
                        try {
                            a2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = engw.d;
            engw engwVar = (engw) map.collect(endq.a);
            if (engwVar.isEmpty()) {
                return;
            }
            ekzz f = eleg.f("notifyIsInteractive");
            try {
                elfl a2 = elfo.a(engwVar);
                f.b(a2);
                axnw.h(a2);
                f.close();
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation
    public final BugleConversationId l() {
        return this.a;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation
    public final aotl m() {
        return (aotl) this.j.get();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation
    public final aqge n() {
        return this.f;
    }

    public final void o() {
        ensk h2 = h.h();
        h2.Y(ente.a, "BugleConversation");
        ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversation", "startPreload", 318, "DefaultConversation.java")).t("Conversation preloading: %s.", this.a.b());
        this.o = ctbt.b(this.f.a(new aqgd() { // from class: amir
            @Override // defpackage.aqgd
            public final elfl a() {
                return elfo.e(null);
            }
        }), this.c.a(new aqgd() { // from class: amis
            @Override // defpackage.aqgd
            public final elfl a() {
                return elfo.e(null);
            }
        }), this.e.a(new aqgd() { // from class: amit
            @Override // defpackage.aqgd
            public final elfl a() {
                return elfo.e(null);
            }
        }), this.g.a(new aqgd() { // from class: amiu
            @Override // defpackage.aqgd
            public final elfl a() {
                return elfo.e(null);
            }
        }));
        this.c.b();
        this.e.b();
        this.g.b();
        alye alyeVar = (alye) this.j.get();
        if (alyeVar instanceof aptx) {
            ((aptx) alyeVar).an();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        amwm amwmVar = (amwm) amwn.a.createBuilder();
        String bugleConversationId = this.a.toString();
        amwmVar.copyOnWrite();
        amwn amwnVar = (amwn) amwmVar.instance;
        bugleConversationId.getClass();
        amwnVar.b = bugleConversationId;
        amwmVar.copyOnWrite();
        ((amwn) amwmVar.instance).c = this.i;
        Bundle bundle = new Bundle();
        bundle.putParcelable("proto", new ProtoParsers.InternalDontUse(null, (amwn) amwmVar.build()));
        parcel.writeBundle(bundle);
    }

    public DefaultConversation(errl errlVar, aqkp aqkpVar, aqvh aqvhVar, amhp amhpVar, ffbr ffbrVar, final aotm aotmVar, aqgc aqgcVar, ffbr ffbrVar2, ffbr ffbrVar3, final ffbr ffbrVar4, final ffbr ffbrVar5, ffbr ffbrVar6, final BugleConversationId bugleConversationId, final boolean z, final aorw aorwVar) {
        this.a = bugleConversationId;
        this.b = errlVar;
        this.i = z;
        this.p = ffbrVar6;
        aqgb a2 = aqgcVar.a(aqkpVar.d(bugleConversationId));
        this.c = a2;
        this.e = aqgcVar.a(aqvhVar.c());
        aqgb a3 = aqgcVar.a(amhpVar.a(bugleConversationId));
        this.f = a3;
        this.j = emys.a(new emyl() { // from class: amix
            @Override // defpackage.emyl
            public final Object get() {
                DefaultConversation defaultConversation = DefaultConversation.this;
                return aotmVar.a(bugleConversationId, defaultConversation.f, defaultConversation.c, defaultConversation.e, aorwVar, z, false);
            }
        });
        this.k = ffbrVar2;
        this.g = aqgcVar.a(((akjh) ffbrVar.b()).a(a2, a3, aqvhVar.a(), bugleConversationId));
        this.d = aqgcVar.a(((akjw) ffbrVar3.b()).a(a3, a2));
        this.l = emys.a(new emyl() { // from class: amim
            @Override // defpackage.emyl
            public final Object get() {
                return ((aper) ffbr.this.b()).a(bugleConversationId);
            }
        });
        this.m = emys.a(new emyl() { // from class: amin
            @Override // defpackage.emyl
            public final Object get() {
                return ((amoq) ffbr.this.b()).a(bugleConversationId);
            }
        });
    }
}
