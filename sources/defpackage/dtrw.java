package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtrw extends dtsf {
    public final boolean a;
    public final Iterable b;
    public final int c;

    public dtrw(String str, int i, Iterable iterable, boolean z) {
        super(str);
        this.c = i;
        this.b = iterable;
        this.a = z;
    }

    private final boolean h(String str) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals((String) it.next(), str)) {
                return true;
            }
        }
        return false;
    }

    private final boolean i(Iterable iterable) {
        return !enpw.c(enpw.e(this.b), enpw.e(iterable)).isEmpty();
    }

    @Override // defpackage.duaw
    public final void a(dtzu dtzuVar, StringBuilder sb, List list) {
        b(dtzuVar, sb);
    }

    @Override // defpackage.duaw
    public final void b(dtzu dtzuVar, StringBuilder sb) {
        sb.append(String.format(Locale.US, "(%s %s (%s))", f(dtzuVar.a()), g(this.c), new emww(",").b(enjk.f(this.b, new emwl() { // from class: dtrv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                String str = (String) obj;
                return str == null ? "NULL" : dtrw.this.a ? str : DatabaseUtils.sqlEscapeString(str);
            }
        }))));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    @Override // defpackage.duaw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean c(defpackage.dtyl r4, defpackage.duaw r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof defpackage.dtsf
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r5
            dtsf r0 = (defpackage.dtsf) r0
            java.lang.String r2 = r3.d
            java.lang.String r4 = r4.a(r2)
            java.lang.String r0 = r0.d
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L9a
            boolean r4 = r5 instanceof defpackage.dtrt
            r0 = 2
            r2 = 1
            if (r4 == 0) goto L47
            dtrt r5 = (defpackage.dtrt) r5
            int r4 = r5.b
            int r4 = r4 + (-1)
            if (r4 == 0) goto L38
            if (r4 == r2) goto L28
            goto L72
        L28:
            java.lang.String r4 = r5.a
            boolean r4 = r3.h(r4)
            r4 = r4 ^ r2
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            j$.util.Optional r4 = j$.util.Optional.of(r4)
            goto L76
        L38:
            java.lang.String r4 = r5.a
            boolean r4 = r3.h(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            j$.util.Optional r4 = j$.util.Optional.of(r4)
            goto L76
        L47:
            boolean r4 = r5 instanceof defpackage.dtrw
            if (r4 == 0) goto L72
            dtrw r5 = (defpackage.dtrw) r5
            int r4 = r5.c
            int r4 = r4 + (-1)
            if (r4 == r0) goto L63
            java.lang.Iterable r4 = r5.b
            boolean r4 = r3.i(r4)
            r4 = r4 ^ r2
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            j$.util.Optional r4 = j$.util.Optional.of(r4)
            goto L76
        L63:
            java.lang.Iterable r4 = r5.b
            boolean r4 = r3.i(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            j$.util.Optional r4 = j$.util.Optional.of(r4)
            goto L76
        L72:
            j$.util.Optional r4 = j$.util.Optional.empty()
        L76:
            boolean r5 = r4.isPresent()
            if (r5 == 0) goto L9a
            int r5 = r3.c
            int r5 = r5 + (-1)
            if (r5 == r0) goto L8d
            java.lang.Object r4 = r4.get()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L8d:
            java.lang.Object r4 = r4.get()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L9a
            return r2
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtrw.c(dtyl, duaw):boolean");
    }

    @Override // defpackage.duaw
    protected final boolean d(String str, ContentValues contentValues) {
        String str2 = this.e;
        String asString = contentValues.getAsString(this.f);
        if (TextUtils.equals(str, str2) && asString != null) {
            return this.c + (-1) != 2 ? h(asString) : !h(asString);
        }
        return false;
    }
}
