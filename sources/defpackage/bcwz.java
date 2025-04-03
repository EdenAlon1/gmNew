package defpackage;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.message.rbm.RbmSpecificMessage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bcwz {
    public abstract MessagePartData a(Parcel parcel);

    public abstract MessagePartData b(MessagePartData messagePartData);

    public abstract MessagePartData c(bcxc bcxcVar);

    public abstract MessagePartData d(bjvm bjvmVar);

    public abstract MessagePartData e(PartsTable.BindData bindData);

    public final MessagePartData f(bwav bwavVar) {
        return e((PartsTable.BindData) bwavVar.cO());
    }

    public final MessagePartData g(String str, Uri uri, int i, Long l, eohh eohhVar, byzh byzhVar) {
        bcxb C = bcxc.C();
        bcqk bcqkVar = (bcqk) C;
        bcqkVar.c = str;
        bcqkVar.e = uri;
        C.p(l != null ? l.longValue() : -1L);
        C.f(i);
        C.o(eohhVar);
        C.m(byzhVar);
        return c(C.r());
    }

    public final MessagePartData h(String str, eohh eohhVar) {
        bcxb C = bcxc.C();
        bcqk bcqkVar = (bcqk) C;
        bcqkVar.b = str;
        bcqkVar.c = RbmSpecificMessage.CONTENT_TYPE;
        C.o(eohhVar);
        return c(C.r());
    }

    public final MessagePartData i(String str) {
        bcxb C = bcxc.C();
        bcqk bcqkVar = (bcqk) C;
        bcqkVar.b = str;
        bcqkVar.c = "text/plain";
        C.o(eohh.TEXT_PART);
        return c(C.r());
    }
}
