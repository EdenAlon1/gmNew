package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dktx;
import defpackage.eiau;
import defpackage.eijb;
import defpackage.engw;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public abstract class GroupInformation implements Parcelable {
    public static final Parcelable.Creator<GroupInformation> CREATOR = new eiau();

    public abstract engw a();

    public abstract Optional b();

    public abstract Optional c();

    public abstract String d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract String e();

    public abstract String f();

    public final String toString() {
        return String.format("GroupInformation {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", e()), String.format("subject=%s", dktx.MESSAGE_CONTENT.c(f())), String.format("conferenceUri=%s", d()), String.format("groupMembers=%s", a()), String.format("groupRemoteCapabilities=%s", b()), String.format("subjectExtension=%s", c()))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(final Parcel parcel, final int i) {
        eijb.r(parcel, 1, e());
        eijb.r(parcel, 2, f());
        eijb.r(parcel, 3, d());
        engw a = a();
        parcel.writeInt(4);
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        int dataPosition2 = parcel.dataPosition();
        parcel.writeInt(a.size());
        if (Parcelable.class.isAssignableFrom(GroupMember.class)) {
            Collection.EL.stream(a).forEach(new Consumer() { // from class: eiix
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Parcelable parcelable = (Parcelable) obj;
                    if (parcelable != null) {
                        parcelable.writeToParcel(parcel, i);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else if (String.class.equals(GroupMember.class)) {
            Collection.EL.stream(a).forEach(new Consumer() { // from class: eiiy
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    parcel.writeString((String) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else if (Integer.class.equals(GroupMember.class)) {
            Collection.EL.stream(a).forEach(new Consumer() { // from class: eiiz
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Integer num = (Integer) obj;
                    if (num != null) {
                        parcel.writeInt(num.intValue());
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        eijb.k(parcel, dataPosition, dataPosition2);
        b().ifPresent(new Consumer() { // from class: eiar
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                eiiv eiivVar = new eiiv() { // from class: eiaq
                    @Override // defpackage.eiiv
                    public final void a(Parcel parcel2, Object obj2, int i2) {
                        eijb.o(parcel2, 1, ((eibd) obj2).a() ? 1 : 0);
                        eijb.l(parcel2);
                    }
                };
                eijb.p(parcel, 5, (eibd) obj, eiivVar, i);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        c().ifPresent(new Consumer() { // from class: eias
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                eiiv eiivVar = new eiiv() { // from class: eiat
                    @Override // defpackage.eiiv
                    public final void a(final Parcel parcel2, Object obj2, final int i2) {
                        eict eictVar = (eict) obj2;
                        eictVar.a().ifPresent(new Consumer() { // from class: eijf
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj3) {
                                eiiv eiivVar2 = new eiiv() { // from class: eije
                                    @Override // defpackage.eiiv
                                    public final void a(Parcel parcel3, Object obj4, int i3) {
                                        eijd.a(parcel3, (eica) obj4);
                                    }
                                };
                                eijb.p(parcel2, 1, (eica) obj3, eiivVar2, i2);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        eictVar.b().ifPresent(new Consumer() { // from class: eijg
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj3) {
                                eijb.n(parcel2, 2, (Instant) obj3);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        eijb.l(parcel2);
                    }
                };
                eijb.p(parcel, 6, (eict) obj, eiivVar, i);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        eijb.l(parcel);
    }
}
