package com.google.android.apps.messaging.replies.snippet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.ajso;
import defpackage.ajsq;
import defpackage.bdhb;
import defpackage.ffbz;
import defpackage.ffca;
import defpackage.ffix;
import defpackage.ffji;
import defpackage.ffkj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RepliedToDataAdapter implements Parcelable {
    public static final Parcelable.Creator<RepliedToDataAdapter> CREATOR = new ajsq();
    public final ajso a;
    public final MessageIdType b;
    private final ffbz c;

    public RepliedToDataAdapter(ajso ajsoVar) {
        ajsoVar.getClass();
        this.a = ajsoVar;
        this.b = bdhb.b(ajsoVar.c);
        this.c = ffca.a(new ffix() { // from class: ajsp
            @Override // defpackage.ffix
            public final Object invoke() {
                RepliedToDataAdapter repliedToDataAdapter = RepliedToDataAdapter.this;
                ajrt ajrtVar = repliedToDataAdapter.a.e;
                if (ajrtVar == null) {
                    ajrtVar = ajrt.a;
                }
                ajrw ajrwVar = ajrtVar.c;
                if (ajrwVar == null) {
                    ajrwVar = ajrw.a;
                }
                if (ajrwVar.b != 3) {
                    return null;
                }
                ajrt ajrtVar2 = repliedToDataAdapter.a.e;
                if (ajrtVar2 == null) {
                    ajrtVar2 = ajrt.a;
                }
                ajrw ajrwVar2 = ajrtVar2.c;
                if (ajrwVar2 == null) {
                    ajrwVar2 = ajrw.a;
                }
                return (ajrwVar2.b == 3 ? (ajsm) ajrwVar2.c : ajsm.a).c;
            }
        });
    }

    public final String a() {
        return (String) this.c.a();
    }

    public final void b(ffji ffjiVar) {
        ffjiVar.invoke(this.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof RepliedToDataAdapter) && ffkj.e(this.a, ((RepliedToDataAdapter) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        ProtoParsers.i(parcel, this.a);
    }
}
