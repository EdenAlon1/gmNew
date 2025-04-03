package defpackage;

import android.content.Context;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbil {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;

    public cbil(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
        ffbrVar4.getClass();
        this.d = ffbrVar4;
    }

    public final cbik a(cbiy cbiyVar, ContentType contentType) {
        Context context = (Context) this.a.b();
        context.getClass();
        errl errlVar = (errl) this.c.b();
        errlVar.getClass();
        cbiyVar.getClass();
        return new cbik(context, this.b, errlVar, this.d, cbiyVar, contentType);
    }
}
