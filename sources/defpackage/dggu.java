package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dggu implements dghb {
    @Override // defpackage.dghb
    public final dgha a(Context context, String str, dggz dggzVar) {
        dgha dghaVar = new dgha();
        int b = dggzVar.b(context, str, true);
        dghaVar.b = b;
        if (b != 0) {
            dghaVar.c = 1;
            return dghaVar;
        }
        int a = dggzVar.a(context, str);
        dghaVar.a = a;
        if (a != 0) {
            dghaVar.c = -1;
        }
        return dghaVar;
    }
}
