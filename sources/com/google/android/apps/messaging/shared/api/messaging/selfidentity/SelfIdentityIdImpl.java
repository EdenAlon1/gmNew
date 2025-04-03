package com.google.android.apps.messaging.shared.api.messaging.selfidentity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.aqve;
import defpackage.aqxt;
import defpackage.aqxw;
import defpackage.aqxx;
import defpackage.aqxy;
import defpackage.azsu;
import defpackage.ffbs;
import defpackage.ffji;
import defpackage.ffkd;
import defpackage.ffkj;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class SelfIdentityIdImpl implements SelfIdentityId {
    public static final Parcelable.Creator<SelfIdentityIdImpl> CREATOR = new aqve();
    public final String a;
    private final Optional b;

    public SelfIdentityIdImpl(String str, Optional<azsu> optional) {
        str.getClass();
        optional.getClass();
        this.a = str;
        this.b = optional;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId
    public final azsu a() {
        return (azsu) this.b.get();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId
    public final String b() {
        return this.a;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId
    @ffbs
    public final String c() {
        return this.a;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId
    public final boolean d() {
        return this.b.isEmpty();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SelfIdentityId) {
            return ffkj.e(this.a, ((SelfIdentityId) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        final aqxy a = aqxx.a((aqxt) aqxw.a.createBuilder());
        aqxt aqxtVar = a.a;
        aqxtVar.copyOnWrite();
        aqxw aqxwVar = (aqxw) aqxtVar.instance;
        aqxwVar.b |= 1;
        aqxwVar.c = this.a;
        final ffji ffjiVar = new ffji() { // from class: aqvc
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                azsu azsuVar = (azsu) obj;
                azsuVar.getClass();
                aqxu aqxuVar = (aqxu) aqxv.a.createBuilder();
                aqxuVar.getClass();
                String b = azsuVar.b();
                b.getClass();
                aqxuVar.copyOnWrite();
                ((aqxv) aqxuVar.instance).b = b;
                eyfy build = aqxuVar.build();
                build.getClass();
                aqxt aqxtVar2 = aqxy.this.a;
                aqxtVar2.copyOnWrite();
                aqxw aqxwVar2 = (aqxw) aqxtVar2.instance;
                aqxw aqxwVar3 = aqxw.a;
                aqxwVar2.d = (aqxv) build;
                aqxwVar2.b |= 2;
                return ffcu.a;
            }
        };
        this.b.ifPresent(new Consumer() { // from class: aqvd
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        parcel.writeParcelable(new ProtoParsers.InternalDontUse(null, a.a()), 0);
    }

    public /* synthetic */ SelfIdentityIdImpl(String str, Optional optional, int i, ffkd ffkdVar) {
        this(str, (i & 2) != 0 ? Optional.empty() : optional);
    }
}
