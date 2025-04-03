package com.google.android.apps.messaging.ui.mediapicker.c2o.contact;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import defpackage.bcqk;
import defpackage.bcwz;
import defpackage.bcxb;
import defpackage.bcxc;
import defpackage.dbzk;
import defpackage.dbzl;
import defpackage.eohh;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class VCardContentItem extends MediaContentItem {
    public static final Parcelable.Creator<VCardContentItem> CREATOR = new dbzk();
    private final bcwz a;

    /* compiled from: PG */
    public interface a {
        dbzl de();
    }

    public VCardContentItem(bcwz bcwzVar, Uri uri, eohh eohhVar) {
        super(uri, "text/x-vCard", eohhVar);
        this.a = bcwzVar;
    }

    public final MessagePartCoreData a() {
        bcxb C = bcxc.C();
        bcqk bcqkVar = (bcqk) C;
        bcqkVar.c = this.c;
        Uri uri = this.b;
        bcqkVar.d = uri;
        bcqkVar.e = uri;
        C.q(-1);
        C.i(-1);
        C.o(this.d);
        return this.a.c(C.r());
    }

    public VCardContentItem(bcwz bcwzVar, Parcel parcel) {
        super(parcel);
        this.a = bcwzVar;
    }
}
