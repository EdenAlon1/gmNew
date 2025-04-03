package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.eibm;
import defpackage.eibp;
import defpackage.eiiv;
import defpackage.eijb;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public abstract class MessageNotification implements Parcelable {
    public static final Parcelable.Creator<MessageNotification> CREATOR = new eibp();

    public abstract Conversation a();

    public abstract eibm b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        eijb.q(parcel, 1, a(), i);
        eijb.p(parcel, 2, b(), new eiiv() { // from class: eibo
            @Override // defpackage.eiiv
            public final void a(final Parcel parcel2, Object obj, final int i2) {
                eibm eibmVar = (eibm) obj;
                eijb.r(parcel2, 1, eibmVar.f());
                eijb.p(parcel2, 2, eibmVar.b(), new eiiv() { // from class: eiip
                    @Override // defpackage.eiiv
                    public final void a(Parcel parcel3, Object obj2, int i3) {
                        eijd.a(parcel3, (eica) obj2);
                    }
                }, i2);
                eijb.o(parcel2, 3, eibmVar.a().b() - 1);
                eibk a = eibmVar.a();
                int b = a.b() - 1;
                if (b == 0) {
                    eijb.p(parcel2, 4, a.c(), new eiiv() { // from class: eiij
                        @Override // defpackage.eiiv
                        public final void a(Parcel parcel3, Object obj2, int i3) {
                            ehzv ehzvVar = (ehzv) obj2;
                            eijb.p(parcel3, 1, ehzvVar.a(), new eiiv() { // from class: eihq
                                @Override // defpackage.eiiv
                                public final void a(Parcel parcel4, Object obj3, int i4) {
                                    eihu.a(parcel4, (ehzx) obj3);
                                }
                            }, i3);
                            byte[] I = ehzvVar.b().I();
                            parcel3.writeInt(2);
                            int dataPosition = parcel3.dataPosition();
                            parcel3.writeInt(0);
                            int dataPosition2 = parcel3.dataPosition();
                            parcel3.writeByteArray(I);
                            eijb.k(parcel3, dataPosition, dataPosition2);
                            eijb.l(parcel3);
                        }
                    }, i2);
                } else if (b == 1) {
                    eijb.p(parcel2, 4, a.e(), new eiiv() { // from class: eiik
                        @Override // defpackage.eiiv
                        public final void a(Parcel parcel3, Object obj2, int i3) {
                            eibe eibeVar = (eibe) obj2;
                            eijb.o(parcel3, 1, eibeVar.c() - 1);
                            Object obj3 = eibeVar.a().get();
                            parcel3.writeInt(2);
                            int dataPosition = parcel3.dataPosition();
                            parcel3.writeInt(0);
                            int dataPosition2 = parcel3.dataPosition();
                            parcel3.writeLong(((Duration) obj3).getSeconds());
                            eijb.k(parcel3, dataPosition, dataPosition2);
                            if (eibeVar.b().isPresent()) {
                                eijb.n(parcel3, 3, (Instant) eibeVar.b().get());
                            }
                            eijb.l(parcel3);
                        }
                    }, i2);
                } else if (b == 2) {
                    eijb.p(parcel2, 4, a.g(), new eiiv() { // from class: eiin
                        @Override // defpackage.eiiv
                        public final void a(Parcel parcel3, Object obj2, int i3) {
                            eibs eibsVar = (eibs) obj2;
                            eijb.o(parcel3, 1, eibsVar.a().ordinal());
                            eijb.r(parcel3, 2, eibsVar.c());
                            eijb.n(parcel3, 3, eibsVar.b());
                            eijb.r(parcel3, 4, eibsVar.d());
                            eijb.l(parcel3);
                        }
                    }, i2);
                } else if (b == 3) {
                    eijb.p(parcel2, 4, a.d(), new eiiv() { // from class: eiil
                        @Override // defpackage.eiiv
                        public final void a(Parcel parcel3, Object obj2, int i3) {
                            eiah eiahVar = (eiah) obj2;
                            eijb.p(parcel3, 1, eiahVar.a(), new eiiv() { // from class: eihy
                                @Override // defpackage.eiiv
                                public final void a(Parcel parcel4, Object obj3, int i4) {
                                    eiag eiagVar = (eiag) obj3;
                                    if (eiagVar.e().isPresent()) {
                                        eijb.r(parcel4, 1, (String) eiagVar.e().get());
                                    }
                                    eijb.o(parcel4, 2, eiagVar.a());
                                    eijb.p(parcel4, 3, eiagVar.b(), new eiiv() { // from class: eihv
                                        @Override // defpackage.eiiv
                                        public final void a(Parcel parcel5, Object obj4, int i5) {
                                            eihu.a(parcel5, (ehzx) obj4);
                                        }
                                    }, i4);
                                    eijb.r(parcel4, 4, eiagVar.f());
                                    eijb.n(parcel4, 5, eiagVar.c());
                                    eijb.l(parcel4);
                                }
                            }, i3);
                            if (eiahVar.b().isPresent()) {
                                eijb.p(parcel3, 2, eiahVar.b().get(), new eiiv() { // from class: eihy
                                    @Override // defpackage.eiiv
                                    public final void a(Parcel parcel4, Object obj3, int i4) {
                                        eiag eiagVar = (eiag) obj3;
                                        if (eiagVar.e().isPresent()) {
                                            eijb.r(parcel4, 1, (String) eiagVar.e().get());
                                        }
                                        eijb.o(parcel4, 2, eiagVar.a());
                                        eijb.p(parcel4, 3, eiagVar.b(), new eiiv() { // from class: eihv
                                            @Override // defpackage.eiiv
                                            public final void a(Parcel parcel5, Object obj4, int i5) {
                                                eihu.a(parcel5, (ehzx) obj4);
                                            }
                                        }, i4);
                                        eijb.r(parcel4, 4, eiagVar.f());
                                        eijb.n(parcel4, 5, eiagVar.c());
                                        eijb.l(parcel4);
                                    }
                                }, i3);
                            }
                            eijb.l(parcel3);
                        }
                    }, i2);
                } else if (b != 4) {
                    eijb.p(parcel2, 4, a.a(), new eiiv() { // from class: eiio
                        @Override // defpackage.eiiv
                        public final void a(Parcel parcel3, Object obj2, int i3) {
                            eijb.r(parcel3, 1, ((ehzu) obj2).a());
                            eijb.l(parcel3);
                        }
                    }, i2);
                } else {
                    eijb.p(parcel2, 4, a.f(), new eiiv() { // from class: eiim
                        @Override // defpackage.eiiv
                        public final void a(Parcel parcel3, Object obj2, int i3) {
                            eibj eibjVar = (eibj) obj2;
                            eijb.r(parcel3, 1, eibjVar.i());
                            if (eibjVar.h().isPresent()) {
                                eijb.n(parcel3, 2, (Instant) eibjVar.h().get());
                            }
                            if (eibjVar.d().isPresent()) {
                                eijb.n(parcel3, 3, (Instant) eibjVar.d().get());
                            }
                            if (eibjVar.e().isPresent()) {
                                eijb.r(parcel3, 4, (String) eibjVar.e().get());
                            }
                            if (eibjVar.f().isPresent()) {
                                eijb.r(parcel3, 5, (String) eibjVar.f().get());
                            }
                            eijb.m(parcel3, 6, eibjVar.b());
                            eijb.m(parcel3, 7, eibjVar.a());
                            if (eibjVar.g().isPresent()) {
                                eijb.m(parcel3, 8, ((Double) eibjVar.g().get()).doubleValue());
                            }
                            if (eibjVar.c().isPresent()) {
                                eijb.r(parcel3, 9, (String) eibjVar.c().get());
                            }
                            eijb.l(parcel3);
                        }
                    }, i2);
                }
                if (eibmVar.d().isPresent()) {
                    eijb.p(parcel2, 5, eibmVar.d().get(), new eiiv() { // from class: eiip
                        @Override // defpackage.eiiv
                        public final void a(Parcel parcel3, Object obj2, int i3) {
                            eijd.a(parcel3, (eica) obj2);
                        }
                    }, i2);
                }
                if (eibmVar.e().isPresent()) {
                    eijb.n(parcel2, 7, (Instant) eibmVar.e().get());
                }
                engw c = eibmVar.c();
                final eiiv eiivVar = new eiiv() { // from class: eiiq
                    @Override // defpackage.eiiv
                    public final void a(Parcel parcel3, Object obj2, int i3) {
                        eibn eibnVar = (eibn) obj2;
                        eijb.r(parcel3, 1, eibnVar.b());
                        eijb.r(parcel3, 2, eibnVar.a());
                        eijb.r(parcel3, 3, eibnVar.c());
                        eijb.l(parcel3);
                    }
                };
                parcel2.writeInt(6);
                int dataPosition = parcel2.dataPosition();
                parcel2.writeInt(0);
                int dataPosition2 = parcel2.dataPosition();
                parcel2.writeInt(c.size());
                Collection.EL.stream(c).forEach(new Consumer() { // from class: eija
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        eiiv.this.a(parcel2, obj2, i2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                eijb.k(parcel2, dataPosition, dataPosition2);
                eijb.l(parcel2);
            }
        }, i);
        eijb.l(parcel);
    }
}
