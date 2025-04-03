package defpackage;

import android.content.ContentUris;
import android.database.Cursor;
import android.provider.Telephony;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class covb extends couz {
    private static String[] o;
    public final ffbr a;
    public String b;
    public aoku c;
    public String d;
    public String e;
    public long f;
    public long g;
    public int h;
    public long i;
    public int j;
    public boolean k;
    public boolean l;
    public int m;
    public String n;
    private final cpza p;
    private long q;
    private Optional r;

    public covb(cpza cpzaVar) {
        this.p = cpzaVar;
        this.a = cpzaVar.a;
    }

    public static String[] h(coxk coxkVar) {
        if (o == null) {
            String[] strArr = {"_id", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, "address", "body", "date", "thread_id", "status", "read", "seen", "date_sent", "sub_id", "subject"};
            if (!coxkVar.V()) {
                strArr[9] = "date";
            }
            o = strArr;
        }
        return o;
    }

    @Override // defpackage.cout
    public final int a() {
        return 0;
    }

    @Override // defpackage.cout
    public final int b() {
        return this.j;
    }

    @Override // defpackage.cout
    public final long c() {
        return this.f;
    }

    @Override // defpackage.cout
    public final String d() {
        return this.b;
    }

    @Override // defpackage.couz
    public final long e() {
        return this.i;
    }

    public final Optional f() {
        return covc.a(this.r);
    }

    public final void g(Cursor cursor, int i) {
        this.q = cursor.getLong(0);
        int i2 = cursor.getInt(10);
        if (i2 >= 0) {
            i = i2;
        }
        this.m = i;
        final String string = cursor.getString(2);
        this.c = this.p.a(string, this.m, new ffbr() { // from class: cova
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                covb covbVar = covb.this;
                return ((aolr) covbVar.a.b()).x(((aolr) covbVar.a.b()).u(string, covbVar.m));
            }
        });
        this.d = string;
        this.e = cursor.getString(3);
        this.f = cursor.getLong(4);
        this.g = cursor.getLong(9);
        this.h = cursor.getInt(1);
        this.i = cursor.getLong(5);
        this.j = cursor.getInt(6);
        this.k = cursor.getInt(7) != 0;
        this.l = cursor.getInt(8) != 0;
        this.b = ContentUris.withAppendedId(Telephony.Sms.CONTENT_URI, this.q).toString();
        this.n = cursor.getString(11);
        this.r = auxd.a() ? Optional.ofNullable(ckey.c(this.n)) : Optional.empty();
    }
}
