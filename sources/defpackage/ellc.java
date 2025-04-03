package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ellc {
    public int a = -1;
    private final aeo b;
    private final ellq c;
    private final elky d;
    private CharSequence e;

    public ellc(Context context, ellq ellqVar, emxc emxcVar) {
        this.b = new aeo(context, context.getTheme());
        this.c = ellqVar;
        this.d = (elky) emxcVar.e(new elkz());
    }

    public final iv a() {
        iu a = this.d.a(this.b);
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            a.c(charSequence);
        }
        int i = this.a;
        if (i != -1) {
            a.setPositiveButton(i, new elll(this.c, new ellb()));
        }
        return a.create();
    }

    public final void b(CharSequence charSequence) {
        emxf.m(this.e == null, "Cannot set message multiple times.");
        emxf.b(!TextUtils.isEmpty(charSequence), "Cannot set an empty message.");
        this.e = charSequence;
    }
}
