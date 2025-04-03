package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eewg extends eewk {
    final /* synthetic */ Exception a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eewg(Exception exc) {
        super("error");
        this.a = exc;
    }

    @Override // defpackage.eewl
    public final String c(Context context, String[] strArr) {
        return String.valueOf(this.a.toString()).concat("\n");
    }
}
