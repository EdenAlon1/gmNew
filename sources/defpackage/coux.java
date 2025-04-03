package defpackage;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.provider.Telephony;
import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coux extends couz {
    private static String[] z;
    private int A;
    public String a;
    public long b;
    public int c;
    public String d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public String n;
    public String o;
    public long p;
    public int q;
    public aoku r;
    public coxj s;
    public int t;
    public int u;
    public String v;
    public Optional w;
    public final List x = new ArrayList();
    public boolean y = false;

    private coux() {
    }

    public static coux g(Cursor cursor, int i) {
        coux couxVar = new coux();
        couxVar.b = cursor.getLong(0);
        couxVar.c = cursor.getInt(1);
        couxVar.d = cursor.getString(2);
        couxVar.e = cursor.getInt(3);
        if (!TextUtils.isEmpty(couxVar.d)) {
            couxVar.d = covc.b(covc.c(couxVar.d, 4), couxVar.e);
        }
        couxVar.f = cursor.getLong(4);
        couxVar.g = cursor.getLong(5) * 1000;
        couxVar.h = cursor.getLong(6) * 1000;
        couxVar.i = cursor.getLong(7);
        couxVar.j = cursor.getInt(8);
        couxVar.k = cursor.getInt(9);
        couxVar.l = cursor.getInt(10) != 0;
        couxVar.m = cursor.getInt(11) != 0;
        couxVar.n = cursor.getString(12);
        couxVar.o = cursor.getString(13);
        couxVar.A = cursor.getInt(14);
        couxVar.p = cursor.getLong(15) * 1000;
        couxVar.t = cursor.getInt(16);
        couxVar.u = cursor.getInt(17);
        couxVar.v = cursor.getString(18);
        if (((Boolean) ((cfup) cpze.h.get()).e()).booleanValue() || auxd.a()) {
            couxVar.w = Optional.ofNullable(ckey.c(couxVar.o));
        } else {
            couxVar.w = Optional.empty();
        }
        couxVar.x.clear();
        couxVar.y = false;
        couxVar.a = ContentUris.withAppendedId(Telephony.Mms.CONTENT_URI, couxVar.b).toString();
        int i2 = cursor.getInt(21);
        if (i2 >= 0) {
            i = i2;
        }
        couxVar.q = i;
        return couxVar;
    }

    public static String[] n() {
        if (z == null) {
            z = new String[]{"_id", "msg_box", "sub", "sub_cs", "m_size", "date", "date_sent", "thread_id", "pri", "st", "read", "seen", "ct_l", "tr_id", "m_type", "exp", "resp_st", "retr_st", "retr_txt", "m_id", "ct_cls", "sub_id"};
        }
        return z;
    }

    @Override // defpackage.cout
    public final int a() {
        return 1;
    }

    @Override // defpackage.cout
    public final int b() {
        return this.k;
    }

    @Override // defpackage.cout
    public final long c() {
        return this.g;
    }

    @Override // defpackage.cout
    public final String d() {
        return this.a;
    }

    @Override // defpackage.couz
    public final long e() {
        return this.i;
    }

    public final Uri f() {
        String str = this.a;
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    public final Optional h() {
        return covc.a(this.w);
    }

    public final void i(couy couyVar) {
        this.x.add(couyVar);
    }

    public final boolean j() {
        return this.A == 130;
    }

    public final boolean k() {
        return this.c != 1;
    }

    public final boolean l() {
        Optional optional = this.w;
        if (optional == null || !optional.isPresent()) {
            return false;
        }
        return ((ckex) this.w.get()).f().isPresent();
    }

    public final boolean m() {
        return this.x.size() == 1 && ((couy) this.x.get(0)).d();
    }
}
