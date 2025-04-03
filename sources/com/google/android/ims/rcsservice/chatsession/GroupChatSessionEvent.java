package com.google.android.ims.rcsservice.chatsession;

import android.os.Parcel;
import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.rcsservice.group.UserInfo;
import com.google.android.rcs.client.messaging.GroupInformation;
import defpackage.dkmq;
import defpackage.dktx;
import j$.util.Objects;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class GroupChatSessionEvent extends ChatSessionEvent {
    public String b;
    public GroupInfo c;
    public GroupInformation d;
    private UserInfo e;
    private String f;
    private String k;

    public GroupChatSessionEvent(Parcel parcel) {
        super(parcel);
    }

    @Override // com.google.android.ims.rcsservice.chatsession.ChatSessionEvent, com.google.android.ims.rcsservice.events.Event
    public final void a(Parcel parcel) {
        super.a(parcel);
        this.e = (UserInfo) parcel.readParcelable(getClass().getClassLoader());
        this.b = parcel.readString();
        this.c = (GroupInfo) parcel.readParcelable(getClass().getClassLoader());
        this.f = parcel.readString();
        this.k = parcel.readString();
        this.d = (GroupInformation) parcel.readParcelable(getClass().getClassLoader());
    }

    @Override // com.google.android.ims.rcsservice.chatsession.ChatSessionEvent, com.google.android.ims.rcsservice.events.Event
    protected final void b(Parcel parcel) {
        parcel.writeString(getClass().getName());
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupChatSessionEvent) || !super.equals(obj)) {
            return false;
        }
        GroupChatSessionEvent groupChatSessionEvent = (GroupChatSessionEvent) obj;
        return Objects.equals(this.e, groupChatSessionEvent.e) && Objects.equals(this.b, groupChatSessionEvent.b) && Objects.equals(this.c, groupChatSessionEvent.c) && Objects.equals(this.f, groupChatSessionEvent.f) && Objects.equals(this.k, groupChatSessionEvent.k) && Objects.equals(this.d, groupChatSessionEvent.d);
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.e, this.b, this.c, this.f, this.k, this.d);
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    public final String toString() {
        return "GroupChatSessionEvent [UserInfo (" + dktx.USER_ID.c(this.e) + "), Referrer  (" + dktx.USER_ID.c(this.b) + "), GroupInfo  (" + String.valueOf(this.c) + "), GroupInformation  (" + String.valueOf(this.d) + ")]\n" + super.toString();
    }

    @Override // com.google.android.ims.rcsservice.chatsession.ChatSessionEvent, com.google.android.ims.rcsservice.events.Event, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.e, 0);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeString(this.f);
        parcel.writeString(this.k);
        parcel.writeParcelable(this.d, 0);
    }

    public GroupChatSessionEvent(dkmq dkmqVar) {
        super(dkmqVar.a, dkmqVar.b, dkmqVar.c, (String) dkmqVar.d.map(new Function() { // from class: dkmp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((UserInfo) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null));
        this.e = (UserInfo) dkmqVar.d.orElse(null);
        this.b = (String) dkmqVar.e.orElse(null);
        this.c = (GroupInfo) dkmqVar.f.orElse(null);
        this.f = (String) dkmqVar.g.orElse(null);
        this.k = (String) dkmqVar.h.orElse(null);
        this.d = (GroupInformation) dkmqVar.i.orElse(null);
    }
}
