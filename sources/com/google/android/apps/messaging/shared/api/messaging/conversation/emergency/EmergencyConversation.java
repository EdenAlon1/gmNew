package com.google.android.apps.messaging.shared.api.messaging.conversation.emergency;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation;
import defpackage.alxs;
import defpackage.alxu;
import defpackage.alye;
import defpackage.amhs;
import defpackage.amra;
import defpackage.amrc;
import defpackage.amrg;
import defpackage.amrq;
import defpackage.apeq;
import defpackage.apld;
import defpackage.aple;
import defpackage.aprl;
import defpackage.aprm;
import defpackage.aqgc;
import defpackage.aqge;
import defpackage.axol;
import defpackage.cfsm;
import defpackage.cfzm;
import defpackage.enru;
import defpackage.ffbr;
import defpackage.ffbz;
import defpackage.ffca;
import defpackage.ffix;
import defpackage.ffsk;
import defpackage.ffud;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class EmergencyConversation implements Conversation {
    public final aqgc b;
    public final aprl c;
    public final amrq d;
    public final ffbr e;
    public final ffbr f;
    public final aple g;
    public final BugleConversation h;
    public final EmergencyConversationId i;
    private final ffsk j;
    private final ffbz k;
    private final ffbz l;
    private final ffbz m;
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/conversation/emergency/EmergencyConversation");

    @UsedByReflection
    public static final Parcelable.Creator<Conversation> CREATOR = new amra();

    public EmergencyConversation(ffsk ffskVar, aqgc aqgcVar, aprl aprlVar, amrq amrqVar, ffbr<cfsm> ffbrVar, ffbr<amhs> ffbrVar2, aple apleVar, BugleConversation bugleConversation) {
        ffskVar.getClass();
        aqgcVar.getClass();
        aprlVar.getClass();
        amrqVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        apleVar.getClass();
        bugleConversation.getClass();
        this.j = ffskVar;
        this.b = aqgcVar;
        this.c = aprlVar;
        this.d = amrqVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = apleVar;
        this.h = bugleConversation;
        String conversationIdType = bugleConversation.l().a.toString();
        conversationIdType.getClass();
        this.i = amrg.a(conversationIdType);
        this.k = ffca.a(new ffix() { // from class: amqx
            @Override // defpackage.ffix
            public final Object invoke() {
                EmergencyConversation emergencyConversation = EmergencyConversation.this;
                amrq amrqVar2 = emergencyConversation.d;
                ffsk ffskVar2 = (ffsk) amrqVar2.a.b();
                ffskVar2.getClass();
                ffsk ffskVar3 = (ffsk) amrqVar2.b.b();
                ffskVar3.getClass();
                ctbk ctbkVar = (ctbk) amrqVar2.c.b();
                ctbkVar.getClass();
                return emergencyConversation.b.a(new amrp(ffskVar2, ffskVar3, ctbkVar, emergencyConversation.h));
            }
        });
        this.l = ffca.a(new ffix() { // from class: amqy
            @Override // defpackage.ffix
            public final Object invoke() {
                EmergencyConversation emergencyConversation = EmergencyConversation.this;
                aple apleVar2 = emergencyConversation.g;
                ffbr ffbrVar3 = apleVar2.a;
                aqge m = emergencyConversation.m();
                ffsk ffskVar2 = (ffsk) ffbrVar3.b();
                ffskVar2.getClass();
                ctbk ctbkVar = (ctbk) apleVar2.d.b();
                ctbkVar.getClass();
                return new apld(ffskVar2, apleVar2.b, apleVar2.c, ctbkVar, emergencyConversation.i, m);
            }
        });
        this.m = ffca.a(new ffix() { // from class: amqz
            @Override // defpackage.ffix
            public final Object invoke() {
                EmergencyConversation emergencyConversation = EmergencyConversation.this;
                ffbr ffbrVar3 = emergencyConversation.c.a;
                alye c = emergencyConversation.h.c();
                apld l = emergencyConversation.l();
                aqge i = emergencyConversation.i();
                apip apipVar = (apip) ffbrVar3.b();
                apipVar.getClass();
                c.getClass();
                i.getClass();
                return new aprk(apipVar, c, l, i);
            }
        });
    }

    private final aprm n() {
        Object a2 = this.m.a();
        a2.getClass();
        return (aprm) a2;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final alxs a() {
        alxs a2 = n().a();
        a2.getClass();
        return a2;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final alxu b() {
        return this.h.b();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final alye c() {
        return n();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation, java.lang.AutoCloseable
    public final void close() {
        apld l = l();
        synchronized (l.e) {
            for (ffud ffudVar : l.e.values()) {
                if (ffudVar.v()) {
                    ffudVar.t(null);
                }
            }
            l.e.clear();
        }
        this.h.close();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ConversationId d() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.h.describeContents();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final apeq e() {
        return this.h.e();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final aqge f() {
        return this.h.f();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final aqge g() {
        return this.h.g();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final aqge h() {
        return m();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final aqge i() {
        return this.h.i();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final cfzm j() {
        return this.h.j();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final void k() {
        this.h.k();
        axol.k(this.j, null, new amrc(this, null), 3);
    }

    public final apld l() {
        Object a2 = this.l.a();
        a2.getClass();
        return (apld) a2;
    }

    public final aqge m() {
        Object a2 = this.k.a();
        a2.getClass();
        return (aqge) a2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.h.writeToParcel(parcel, i);
    }
}
