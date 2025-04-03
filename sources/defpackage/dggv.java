package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dggv implements dghb {
    @Override // defpackage.dghb
    public final dgha a(Context context, String str, dggz dggzVar) {
        int b;
        dgha dghaVar = new dgha();
        int a = dggzVar.a(context, str);
        dghaVar.a = a;
        int i = 1;
        int i2 = 0;
        if (a != 0) {
            b = dggzVar.b(context, str, false);
            dghaVar.b = b;
        } else {
            b = dggzVar.b(context, str, true);
            dghaVar.b = b;
        }
        int i3 = dghaVar.a;
        if (i3 != 0) {
            i2 = i3;
        } else if (b == 0) {
            i = 0;
            dghaVar.c = i;
            return dghaVar;
        }
        if (i2 >= b) {
            i = -1;
        }
        dghaVar.c = i;
        return dghaVar;
    }
}
