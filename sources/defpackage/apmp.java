package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class apmp {
    public static boolean a(apmq apmqVar) {
        return !apmqVar.e().equals(Uri.EMPTY) && Objects.equals(apmqVar.e().getAuthority(), "mms");
    }
}
