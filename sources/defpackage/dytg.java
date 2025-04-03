package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import java.security.KeyPair;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dytg implements dzwz {
    public final dyti a;
    private final Context b;

    public dytg(Context context, dyti dytiVar) {
        this.b = context;
        this.a = dytiVar;
    }

    private final Cursor l(String[] strArr, String str, String[] strArr2) {
        return this.a.h(d("reachability INNER JOIN registration ON " + dytn.b("reachability", "registration_id") + " = " + dytn.b("registration", "registration_id")), strArr, str, strArr2, null, null);
    }

    private final void m(long j, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            dzpg dzpgVar = (dzpg) it.next();
            try {
                this.a.a(d("reachability"), "registration_id =? AND reachability_normalized_id =? ", new String[]{Long.toString(j), dzpgVar.b() == dzpf.EMAIL ? dyhm.a(dzpgVar.d()) : dzpgVar.d()});
            } catch (SQLException e) {
                dyhr.d("SQLiteRegStore", "Failed to delete Registration.", e);
            }
        }
    }

    public final Cursor a() {
        return this.a.h(d("registration"), new String[]{"registration_id"}, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Cursor b(dzjd dzjdVar) {
        Cursor c = c(dzjdVar.f());
        engw g = dzjdVar.g();
        int i = ((enou) g).c;
        for (int i2 = 0; i2 < i; i2++) {
            dzpg dzpgVar = (dzpg) g.get(i2);
            if (c.moveToFirst()) {
                break;
            }
            c.close();
            c = c(dzpgVar);
        }
        return c;
    }

    public final Cursor c(dzpg dzpgVar) {
        return l(dytn.i("registration", dywv.a), "reachability_normalized_id =? AND reachability_type =? AND tachyon_app_name =?", new String[]{dzpgVar.b() == dzpf.EMAIL ? dyhm.a(dzpgVar.d()) : dzpgVar.d(), String.valueOf(dzpgVar.b().f), dzpgVar.e()});
    }

    public final Uri d(String str) {
        return dytn.a(String.valueOf(this.b.getPackageName()).concat(".lighter.data"), "REGISTRATION", str, new String[0]);
    }

    @Override // defpackage.dzwz
    public final emxc e(final dzpg dzpgVar) {
        try {
            if (fdpn.c()) {
                return (emxc) dytm.a(this.a, new Callable() { // from class: dytb
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        dytg dytgVar = dytg.this;
                        dzpg dzpgVar2 = dzpgVar;
                        emxc emxcVar = emux.a;
                        Cursor c = dytgVar.c(dzpgVar2);
                        try {
                            if (c.moveToFirst()) {
                                emxcVar = dytgVar.f(c.getInt(dywu.a(1)));
                            }
                            if (c != null) {
                                c.close();
                            }
                            return emxcVar;
                        } catch (Throwable th) {
                            if (c != null) {
                                try {
                                    c.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                });
            }
            try {
                this.a.d();
                emxc emxcVar = emux.a;
                Cursor c = c(dzpgVar);
                try {
                    if (c.moveToFirst()) {
                        emxcVar = f(c.getInt(dywu.a(1)));
                    }
                    if (c != null) {
                        c.close();
                    }
                    this.a.f();
                    return emxcVar;
                } catch (Throwable th) {
                    if (c != null) {
                        try {
                            c.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Exception e) {
                throw new SQLException("Error when executing transaction!!", e);
            }
        } finally {
            this.a.e();
        }
    }

    public final emxc f(long j) {
        emxf.l(this.a.g());
        Cursor l = l(dytn.h(dytn.i("registration", dywv.a), dytn.i("reachability", dywt.a)), "registration.registration_id =? ", new String[]{Long.toString(j)});
        try {
            if (!l.moveToFirst()) {
                if (l != null) {
                    l.close();
                }
                return emux.a;
            }
            String string = l.getString(l.getColumnIndex("tachyon_app_name"));
            long j2 = l.getLong(l.getColumnIndex("registration_id"));
            byte[] blob = l.getBlob(l.getColumnIndex("server_registration_id"));
            final int i = l.getInt(l.getColumnIndex("server_registration_status"));
            dzij dzijVar = new dzij();
            dzijVar.d(string);
            HashSet hashSet = new HashSet();
            do {
                String string2 = l.getString(l.getColumnIndex("reachability_id"));
                int ordinal = dzpf.a(l.getInt(l.getColumnIndex("reachability_type"))).ordinal();
                if (ordinal == 1) {
                    hashSet.add(string2);
                } else if (ordinal == 2) {
                    dzijVar.b(string2);
                } else if (ordinal == 4) {
                    dzijVar.a(string2);
                }
            } while (l.moveToNext());
            dzijVar.c(hashSet);
            dzix e = dzja.e();
            e.c(j2);
            e.d(eyee.x(blob));
            e.f(dzijVar);
            e.e((dziz) enfc.e(dziz.values()).a(new emxg() { // from class: dziy
                @Override // defpackage.emxg
                public final boolean a(Object obj) {
                    return ((dziz) obj).c == i;
                }
            }).e(dziz.VALID));
            emxc j3 = emxc.j(e.a());
            if (l != null) {
                l.close();
            }
            return j3;
        } catch (Throwable th) {
            if (l != null) {
                try {
                    l.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.dzwz
    public final emxc g(dzja dzjaVar) {
        Cursor b = b(dzjaVar.c());
        try {
            if (!b.moveToFirst()) {
                emux emuxVar = emux.a;
                if (b != null) {
                    b.close();
                }
                return emuxVar;
            }
            dzjo a = dzjq.a();
            ((dzmh) a).a = Long.valueOf(b.getLong(dywu.a(4)));
            ((dzmh) a).b = Long.valueOf(b.getLong(dywu.a(10)));
            a.c(dyhv.a(b.getBlob(dywu.a(3))));
            emxc b2 = dyut.b(b.getBlob(dywu.a(6)), b.getBlob(dywu.a(7)));
            if (b2.g()) {
                a.d((KeyPair) b2.c());
            }
            emxc j = emxc.j(a.a());
            if (b != null) {
                b.close();
            }
            return j;
        } catch (Throwable th) {
            if (b != null) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.dzwz
    public final engw h() {
        if (fdpn.c()) {
            return (engw) dytm.a(this.a, new Callable() { // from class: dytd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    dytg dytgVar = dytg.this;
                    Cursor a = dytgVar.a();
                    try {
                        engr engrVar = new engr();
                        while (a != null && a.moveToNext()) {
                            emxc f = dytgVar.f(a.getLong(0));
                            if (f.g()) {
                                engrVar.h(f.c());
                            }
                        }
                        engw g = engrVar.g();
                        if (a != null) {
                            a.close();
                        }
                        return g;
                    } catch (Throwable th) {
                        if (a != null) {
                            try {
                                a.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            });
        }
        engr engrVar = new engr();
        try {
            try {
                this.a.d();
                Cursor a = a();
                while (a != null) {
                    try {
                        if (!a.moveToNext()) {
                            break;
                        }
                        emxc f = f(a.getLong(0));
                        if (f.g()) {
                            engrVar.h(f.c());
                        }
                    } catch (Throwable th) {
                        try {
                            a.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (a != null) {
                    a.close();
                }
                this.a.f();
                this.a.e();
                return engrVar.g();
            } catch (Exception e) {
                throw new SQLException("Error when executing transaction!!", e);
            }
        } catch (Throwable th3) {
            this.a.e();
            throw th3;
        }
    }

    public final void i(long j, dzjd dzjdVar) {
        emxc f = f(j);
        HashSet<dzpg> e = enpw.e(dzjdVar.g());
        if (f.g()) {
            Set e2 = enpw.e(((dzii) f.c()).b.g());
            e2.removeAll(e);
            m(j, e2);
        }
        for (dzpg dzpgVar : e) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("reachability_id", dzpgVar.d());
            contentValues.put("reachability_normalized_id", dzpgVar.b() == dzpf.EMAIL ? dyhm.a(dzpgVar.d()) : dzpgVar.d());
            contentValues.put("reachability_type", Integer.valueOf(dzpgVar.b().f));
            contentValues.put("registration_id", Long.valueOf(j));
            this.a.c(d("reachability"), contentValues, 5);
        }
    }

    @Override // defpackage.dzwz
    public final boolean j(dzja dzjaVar) {
        dzpg f = dzjaVar.c().f();
        try {
            this.a.a(d("registration"), "registration.registration_id IN (SELECT registration.registration_id FROM reachability INNER JOIN registration ON " + dytn.b("reachability", "registration_id") + " = " + dytn.b("registration", "registration_id") + " WHERE reachability_normalized_id =? AND reachability_type =? AND tachyon_app_name =?)", new String[]{((dzim) f).c == dzpf.EMAIL ? dyhm.a(((dzim) f).a) : ((dzim) f).a, String.valueOf(((dzim) f).c.f), ((dzim) f).b});
            return true;
        } catch (SQLException e) {
            dyhr.d("SQLiteRegStore", "Failed to delete Registration.", e);
            return false;
        }
    }

    public final boolean k(final dzpg dzpgVar, final ContentValues contentValues) {
        return ((Boolean) dytm.a(this.a, new Callable() { // from class: dytc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                long j;
                dytg dytgVar = dytg.this;
                ContentValues contentValues2 = contentValues;
                dzpg dzpgVar2 = dzpgVar;
                Cursor c = dytgVar.c(dzpgVar2);
                try {
                    if (c.moveToFirst()) {
                        j = c.getInt(dywu.a(1));
                        dytgVar.a.b(dytgVar.d("registration"), contentValues2, "registration_id =? AND tachyon_app_name =?", new String[]{Long.toString(j), dzpgVar2.e()});
                    } else {
                        j = -1;
                    }
                    if (c != null) {
                        c.close();
                    }
                    return Boolean.valueOf(j != -1);
                } catch (Throwable th) {
                    if (c != null) {
                        try {
                            c.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        })).booleanValue();
    }
}
