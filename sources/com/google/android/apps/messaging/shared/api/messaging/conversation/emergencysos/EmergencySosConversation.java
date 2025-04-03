package com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import defpackage.alxs;
import defpackage.alxu;
import defpackage.alye;
import defpackage.amhs;
import defpackage.amrx;
import defpackage.amry;
import defpackage.amsc;
import defpackage.amsd;
import defpackage.apeq;
import defpackage.aplh;
import defpackage.apli;
import defpackage.aqgc;
import defpackage.aqge;
import defpackage.arek;
import defpackage.axnw;
import defpackage.cfzm;
import defpackage.cnuh;
import defpackage.cnvc;
import defpackage.cnvq;
import defpackage.ffbr;
import defpackage.ffsk;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class EmergencySosConversation implements Conversation, cnvq {
    public static final Parcelable.Creator<Conversation> CREATOR = new amrx();
    private final EmergencySosConversationId a;
    private final BugleConversation b;
    private final aqge c;
    private final ffbr d;
    private final ffbr e;
    private final apli f;

    /* compiled from: PG */
    public interface a {
        amhs ai();

        amry al();
    }

    public EmergencySosConversation(aqgc aqgcVar, amsd amsdVar, ffbr ffbrVar, apli apliVar, ffbr ffbrVar2, BugleConversation bugleConversation) {
        EmergencySosConversationId emergencySosConversationId = new EmergencySosConversationId(bugleConversation.l().a);
        this.a = emergencySosConversationId;
        this.b = bugleConversation;
        aqge n = bugleConversation.n();
        ffsk ffskVar = (ffsk) amsdVar.a.b();
        ffskVar.getClass();
        n.getClass();
        this.c = aqgcVar.a(new amsc(ffskVar, emergencySosConversationId, n));
        this.d = ffbrVar;
        this.f = apliVar;
        this.e = ffbrVar2;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final alxs a() {
        alxs a2 = this.b.a();
        aqge i = i();
        a2.getClass();
        i.getClass();
        aqge aqgeVar = this.c;
        aqgeVar.getClass();
        return new aplh(this.f.a, a2, this.a, i, aqgeVar);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final alxu b() {
        return this.b.b();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final alye c() {
        return this.b.m();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation, java.lang.AutoCloseable
    public final void close() {
        if (((arek) this.e.b()).a()) {
            ((cnvc) this.d.b()).f(this);
        }
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
        return this.b.g();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final aqge h() {
        return this.c;
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
        axnw.f(((cnvc) this.d.b()).a(), "Failed to retrieve current session status on emergency sos conversation displayed.");
        this.b.k();
        if (((arek) this.e.b()).a()) {
            ((cnvc) this.d.b()).e(this);
        }
    }

    @Override // defpackage.cnvq
    public final void l(cnuh cnuhVar) {
        if (cnuhVar == cnuh.SESSION_STATUS_ENDING_EMERGENCY) {
            this.b.m().Y();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
    }
}
