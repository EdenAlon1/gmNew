package com.google.android.ims.rcsservice.chatsession;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.eyqp;
import defpackage.eyqq;
import defpackage.eyqr;
import defpackage.eyqy;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ChatSessionReportEvent extends ChatSessionEvent implements Parcelable {
    public String b;
    public int c;
    private String d;

    public ChatSessionReportEvent(int i, int i2, String str, String str2, int i3) {
        this(i, 0L, i2);
        this.b = str;
        this.d = str2;
        this.c = i3;
    }

    @Override // com.google.android.ims.rcsservice.chatsession.ChatSessionEvent, com.google.android.ims.rcsservice.events.Event
    public final void a(Parcel parcel) {
        super.a(parcel);
        this.b = parcel.readString();
        this.d = parcel.readString();
        this.c = parcel.readInt();
    }

    @Override // com.google.android.ims.rcsservice.chatsession.ChatSessionEvent, com.google.android.ims.rcsservice.events.Event
    protected final void b(Parcel parcel) {
        parcel.writeString(getClass().getName());
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    public final void e(eyqr eyqrVar) {
        String str = this.b;
        if (str != null) {
            eyqp eyqpVar = (eyqp) eyqq.a.createBuilder();
            eyqpVar.copyOnWrite();
            eyqq eyqqVar = (eyqq) eyqpVar.instance;
            eyqqVar.b |= 1;
            eyqqVar.c = str;
            eyqq eyqqVar2 = (eyqq) eyqpVar.build();
            eyqrVar.copyOnWrite();
            eyqy eyqyVar = (eyqy) eyqrVar.instance;
            eyqy eyqyVar2 = eyqy.a;
            eyqqVar2.getClass();
            eyqyVar.d = eyqqVar2;
            eyqyVar.c = 4;
        }
    }

    @Override // com.google.android.ims.rcsservice.chatsession.ChatSessionEvent, com.google.android.ims.rcsservice.events.Event, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.b);
        parcel.writeString(this.d);
        parcel.writeInt(this.c);
    }

    public ChatSessionReportEvent(int i, long j, long j2) {
        super(i, j, j2);
    }

    public ChatSessionReportEvent(int i, String str, String str2, int i2) {
        this(i, 0, str, str2, i2);
    }

    public ChatSessionReportEvent(Parcel parcel) {
        super(parcel);
    }
}
