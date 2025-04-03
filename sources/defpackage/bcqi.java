package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcqi extends lov implements bcqe {
    private final String j;
    private final String k;
    private final csqw l;

    public bcqi(Context context, csqw csqwVar, String str) {
        super(context);
        this.j = "ditto_contacts_loader";
        this.k = str;
        this.l = csqwVar;
        k();
    }

    @Override // defpackage.lox
    protected final void m() {
        if (q()) {
            f();
        }
    }

    @Override // defpackage.lox
    protected final void n() {
        h();
    }

    @Override // defpackage.lov
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final Cursor a() {
        Cursor a = TextUtils.isEmpty(this.k) ? this.l.e().a() : ((csqm) this.l.i(this.k, null)).a;
        if (a == null) {
            return null;
        }
        return csqw.a(a);
    }

    @Override // defpackage.bcqe
    public final String t() {
        return this.j;
    }
}
