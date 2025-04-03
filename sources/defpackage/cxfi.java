package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxfi {
    public static final Uri a = Uri.parse("content://sms/icc");
    public static final String[] b = {"address", "body", "date", "index_on_icc"};
    public final ejvp c;
    public final ejtr d;
    public final cqoh e;
    public final ctwb f;
    public final errl g;
    public final ffbr h;
    public final ejuj i = new ejtz("SIM_MESSAGES_DATA_SOURCE");
    private final csrh j;

    public cxfi(ejvp ejvpVar, ejtr ejtrVar, cqoh cqohVar, csrh csrhVar, errl errlVar, ctwb ctwbVar, ffbr ffbrVar) {
        this.c = ejvpVar;
        this.d = ejtrVar;
        this.e = cqohVar;
        this.j = csrhVar;
        this.f = ctwbVar;
        this.g = errlVar;
        this.h = ffbrVar;
    }

    public final String a(long j) {
        if (j > 0) {
            return this.j.d(j).toString();
        }
        return null;
    }
}
