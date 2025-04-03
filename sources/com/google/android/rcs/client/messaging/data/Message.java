package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dfxk;
import defpackage.dktx;
import defpackage.eieo;
import defpackage.eigh;
import defpackage.eigi;
import defpackage.eigj;
import defpackage.eigk;
import defpackage.eigl;
import defpackage.eihh;
import defpackage.engw;
import defpackage.enjk;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class Message implements Parcelable {
    public static final Parcelable.Creator<Message> CREATOR = new eigh();

    /* compiled from: PG */
    public static abstract class MessageContent implements Parcelable {
        public static final Parcelable.Creator<MessageContent> CREATOR = new eigk();

        public abstract eigl a();

        public abstract ChatMessage b();

        public abstract FileTransferInformation c();

        public abstract IsComposingMessage d();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public abstract LocationInformation e();

        public abstract MessageReceipt f();

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = dfxk.a(parcel);
            eihh.c(parcel, 1, a());
            int ordinal = a().ordinal();
            if (ordinal == 0) {
                dfxk.k(parcel, 2, b(), i, false);
            } else if (ordinal == 1) {
                dfxk.k(parcel, 2, d(), i, false);
            }
            dfxk.c(parcel, a);
        }
    }

    public static eigi i() {
        eieo eieoVar = new eieo();
        eieoVar.g(false);
        return eieoVar;
    }

    public abstract RcsDestinationId a();

    public abstract engw b();

    public abstract engw c();

    public abstract Optional d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract Optional e();

    public abstract Optional f();

    public abstract Optional g();

    public abstract String h();

    public final String toString() {
        return String.format("Message {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", h()), String.format("sender=%s", dktx.PHONE_NUMBER.c(a())), String.format("contents=%s", dktx.MESSAGE_CONTENT.b(b())), String.format("sentTime=%s", g()), String.format("receiver=%s", dktx.PHONE_NUMBER.c(f())), String.format("extensionHeaders=%s", c()), String.format("dispositionNotifications=%s", d()))));
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Iterable, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, h(), false);
        dfxk.k(parcel, 2, a(), i, false);
        dfxk.n(parcel, 3, b(), false);
        if (f().isPresent()) {
            dfxk.k(parcel, 4, f().get(), i, false);
        }
        if (g().isPresent()) {
            eihh.d(parcel, 6, (Instant) g().get());
        }
        dfxk.n(parcel, 5, c(), false);
        if (e().isPresent()) {
            dfxk.d(parcel, 7, ((Boolean) e().get()).booleanValue());
        }
        if (d().isPresent()) {
            ?? r6 = d().get();
            EnumSet noneOf = EnumSet.noneOf(eigj.class);
            enjk.o(noneOf, r6);
            dfxk.D(parcel, 8, (List) Collection.EL.stream(noneOf).map(new Function() { // from class: eihg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((Enum) obj).name();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList()));
        }
        dfxk.c(parcel, a);
    }
}
