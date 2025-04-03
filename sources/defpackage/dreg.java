package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dreg {
    public static int b(dren drenVar) {
        String host = Uri.parse(drenVar.f()).getHost();
        return (host == null || !ffpc.n(host, "tenor.com")) ? 2 : 1;
    }
}
