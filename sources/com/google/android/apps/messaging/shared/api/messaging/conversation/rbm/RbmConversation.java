package com.google.android.apps.messaging.shared.api.messaging.conversation.rbm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversation;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import defpackage.alxs;
import defpackage.alxu;
import defpackage.alye;
import defpackage.amhs;
import defpackage.amxr;
import defpackage.amxs;
import defpackage.amxv;
import defpackage.amxw;
import defpackage.amyi;
import defpackage.amyj;
import defpackage.apeq;
import defpackage.apxj;
import defpackage.apxk;
import defpackage.apxn;
import defpackage.aqgb;
import defpackage.aqgc;
import defpackage.aqge;
import defpackage.avjw;
import defpackage.becj;
import defpackage.cfup;
import defpackage.cfzm;
import defpackage.ctbk;
import defpackage.ctjd;
import defpackage.emwl;
import defpackage.emyl;
import defpackage.emys;
import defpackage.errl;
import defpackage.ffbr;
import defpackage.ffsk;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class RbmConversation implements Conversation {
    public static final Parcelable.Creator<Conversation> CREATOR = new amxr();
    public final RbmConversationId a;
    public final BugleConversation b;
    public final ffbr c;
    public final ffbr d;
    private final errl e;
    private final errl f;
    private final emyl g;
    private final aqge h;
    private final amxv i;
    private final emyl j;

    /* compiled from: PG */
    public interface a {
        amhs ai();

        amxs an();
    }

    public RbmConversation(errl errlVar, errl errlVar2, aqgc aqgcVar, amyj amyjVar, final apxj apxjVar, ffbr ffbrVar, ffbr ffbrVar2, amxw amxwVar, final apxn apxnVar, BugleConversation bugleConversation) {
        this.e = errlVar;
        this.f = errlVar2;
        RbmConversationId rbmConversationId = new RbmConversationId(bugleConversation.l().a);
        this.a = rbmConversationId;
        this.b = bugleConversation;
        ffsk ffskVar = (ffsk) amyjVar.a.b();
        ffskVar.getClass();
        ffsk ffskVar2 = (ffsk) amyjVar.b.b();
        ffskVar2.getClass();
        ctbk ctbkVar = (ctbk) amyjVar.c.b();
        ctbkVar.getClass();
        becj becjVar = (becj) amyjVar.d.b();
        becjVar.getClass();
        avjw avjwVar = (avjw) amyjVar.e.b();
        avjwVar.getClass();
        aqgb a2 = aqgcVar.a(new amyi(ffskVar, ffskVar2, ctbkVar, becjVar, avjwVar, bugleConversation));
        this.h = a2;
        this.g = emys.a(new emyl() { // from class: amxp
            @Override // defpackage.emyl
            public final Object get() {
                apxj apxjVar2 = apxjVar;
                ffbr ffbrVar3 = apxjVar2.a;
                alye c = RbmConversation.this.b.c();
                ffsk ffskVar3 = (ffsk) ffbrVar3.b();
                ffskVar3.getClass();
                ffsk ffskVar4 = (ffsk) apxjVar2.b.b();
                ffskVar4.getClass();
                csuu csuuVar = (csuu) apxjVar2.d.b();
                csuuVar.getClass();
                c.getClass();
                return new apxi(ffskVar3, ffskVar4, apxjVar2.c, csuuVar, c);
            }
        });
        this.c = ffbrVar;
        this.d = ffbrVar2;
        aqge g = bugleConversation.g();
        ffsk ffskVar3 = (ffsk) amxwVar.a.b();
        ffskVar3.getClass();
        ffbr ffbrVar3 = amxwVar.b;
        g.getClass();
        a2.getClass();
        this.i = new amxv(ffskVar3, ffbrVar3, rbmConversationId, g, a2);
        this.j = emys.a(new emyl() { // from class: amxq
            @Override // defpackage.emyl
            public final Object get() {
                RbmConversation rbmConversation = RbmConversation.this;
                BugleConversation bugleConversation2 = rbmConversation.b;
                alxs a3 = bugleConversation2.a();
                aqge i = bugleConversation2.i();
                aqge h = bugleConversation2.h();
                a3.getClass();
                i.getClass();
                h.getClass();
                return new apxm(apxnVar.a, a3, rbmConversation.a.b, i, h);
            }
        });
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final alxs a() {
        return ((Boolean) ((cfup) ctjd.by.get()).e()).booleanValue() ? (alxs) this.j.get() : this.b.a();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final alxu b() {
        return this.b.b();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final alye c() {
        return (alye) this.g.get();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ConversationId d() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.b.describeContents();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final apeq e() {
        return this.b.e();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final aqge f() {
        return this.b.f();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final aqge g() {
        return this.i;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final aqge h() {
        return this.h;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final aqge i() {
        return this.b.i();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final cfzm j() {
        return this.b.j();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final void k() {
        this.b.k();
        ((apxk) this.g.get()).y();
        i().b().h(new emwl() { // from class: amxo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Optional findFirst = Collection.EL.stream((engw) obj).filter(new Predicate() { // from class: amxl
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo439negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        return ((ResolvedRecipient) obj2).D();
                    }
                }).findFirst();
                final RbmConversation rbmConversation = RbmConversation.this;
                findFirst.ifPresent(new Consumer() { // from class: amxm
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        String o = ((ResolvedRecipient) obj2).g().o();
                        cero ceroVar = (cero) cerr.a.createBuilder();
                        ceroVar.copyOnWrite();
                        ((cerr) ceroVar.instance).b = o;
                        ceroVar.copyOnWrite();
                        ((cerr) ceroVar.instance).d = cerq.a(4);
                        ceroVar.copyOnWrite();
                        ((cerr) ceroVar.instance).c = cerp.a(4);
                        cerr cerrVar = (cerr) ceroVar.build();
                        cetp cetpVar = new cetp();
                        cetpVar.a = o;
                        cetpVar.b = o;
                        ((cers) RbmConversation.this.c.b()).b(cerrVar, cetpVar.a());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return null;
            }
        }, this.e);
        this.h.b().h(new emwl() { // from class: amxn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int ordinal = ((amxx) obj).y().ordinal();
                RbmConversation rbmConversation = RbmConversation.this;
                if (ordinal == 0) {
                    ((avjw) rbmConversation.d.b()).c(bdgq.b(rbmConversation.a.b()));
                    return null;
                }
                if (ordinal != 1) {
                    return null;
                }
                ((avjw) rbmConversation.d.b()).h(4, bdgq.b(rbmConversation.a.b()));
                return null;
            }
        }, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
    }
}
