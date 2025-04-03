package com.google.android.apps.messaging.shared.api.messaging.conversation.penpal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversation;
import defpackage.alxl;
import defpackage.alxs;
import defpackage.alxu;
import defpackage.alye;
import defpackage.amhs;
import defpackage.amvp;
import defpackage.amvq;
import defpackage.amvt;
import defpackage.amvu;
import defpackage.amvx;
import defpackage.amvy;
import defpackage.apeq;
import defpackage.aqgb;
import defpackage.aqgc;
import defpackage.aqge;
import defpackage.cfzm;
import defpackage.emyl;
import defpackage.emys;
import defpackage.ffbr;
import defpackage.ffsk;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class PenpalBotConversation implements Conversation {
    public static final Parcelable.Creator<Conversation> CREATOR = new amvp();
    public final BugleConversation a;
    private final emyl b;
    private final PenpalBotConversationId c;
    private final amvt d;
    private final aqge e;

    /* compiled from: PG */
    public interface a {
        amhs ai();

        amvq am();
    }

    public PenpalBotConversation(aqgc aqgcVar, amvy amvyVar, amvu amvuVar, BugleConversation bugleConversation, alxl alxlVar) {
        PenpalBotConversationId penpalBotConversationId = new PenpalBotConversationId(bugleConversation.l().a);
        this.c = penpalBotConversationId;
        this.a = bugleConversation;
        ffsk ffskVar = (ffsk) amvyVar.a.b();
        ffskVar.getClass();
        aqgb a2 = aqgcVar.a(new amvx(ffskVar, penpalBotConversationId, bugleConversation));
        this.e = a2;
        this.b = emys.a(new emyl() { // from class: amvo
            @Override // defpackage.emyl
            public final Object get() {
                return new apwg(PenpalBotConversation.this.a.m());
            }
        });
        ffsk ffskVar2 = (ffsk) amvuVar.a.b();
        ffskVar2.getClass();
        ffbr ffbrVar = amvuVar.b;
        a2.getClass();
        this.d = new amvt(ffskVar2, ffbrVar, bugleConversation, alxlVar, a2);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final alxs a() {
        return this.a.a();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final alxu b() {
        return this.a.b();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final alye c() {
        return (alye) this.b.get();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ConversationId d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.a.describeContents();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final apeq e() {
        return this.a.e();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final aqge f() {
        return this.a.f();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final aqge g() {
        return this.d;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final aqge h() {
        return this.e;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final aqge i() {
        return this.a.i();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final cfzm j() {
        return this.a.j();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final void k() {
        this.a.k();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
    }
}
