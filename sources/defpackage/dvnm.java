package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvnm implements dvmq {
    private final dvna a;
    private final dlpw b;

    public dvnm(dvna dvnaVar, dlpw dlpwVar) {
        this.a = dvnaVar;
        this.b = dlpwVar;
    }

    public static String g(String str) {
        return str != null ? str : "signedout";
    }

    public static final void h(efko efkoVar, evwj evwjVar) {
        efkoVar.b("(log_source = ?");
        efkoVar.d(String.valueOf(evwjVar.c));
        efkoVar.b(" AND event_code = ?");
        efkoVar.d(String.valueOf(evwjVar.d));
        efkoVar.b(" AND package_name = ?)");
        efkoVar.d(evwjVar.e);
    }

    private final ListenableFuture i(final efkl efklVar) {
        return this.a.d.d(new efkq() { // from class: dvnh
            @Override // defpackage.efkq
            public final Object a(efks efksVar) {
                return Integer.valueOf(efksVar.a(efkl.this));
            }
        });
    }

    private final ListenableFuture j(emwl emwlVar) {
        efko efkoVar = new efko();
        efkoVar.b("SELECT log_source,event_code, package_name, COUNT(*) as event_count");
        efkoVar.b(" FROM clearcut_events_table");
        efkoVar.b(" GROUP BY log_source,event_code, package_name");
        return this.a.d.a(efkoVar.a()).e(new erow() { // from class: dvnk
            @Override // defpackage.erow
            public final Object a(erpc erpcVar, Object obj) {
                Cursor cursor = (Cursor) obj;
                HashMap h = ennc.h(cursor.getCount());
                while (cursor.moveToNext()) {
                    int i = cursor.getInt(cursor.getColumnIndexOrThrow("log_source"));
                    int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("event_code"));
                    String string = cursor.getString(cursor.getColumnIndexOrThrow("package_name"));
                    int i3 = cursor.getInt(cursor.getColumnIndexOrThrow("event_count"));
                    evwi evwiVar = (evwi) evwj.a.createBuilder();
                    evwiVar.copyOnWrite();
                    evwj evwjVar = (evwj) evwiVar.instance;
                    evwjVar.b |= 1;
                    evwjVar.c = i;
                    evwiVar.copyOnWrite();
                    evwj evwjVar2 = (evwj) evwiVar.instance;
                    evwjVar2.b |= 2;
                    evwjVar2.d = i2;
                    evwiVar.copyOnWrite();
                    evwj evwjVar3 = (evwj) evwiVar.instance;
                    string.getClass();
                    evwjVar3.b |= 4;
                    evwjVar3.e = string;
                    h.put((evwj) evwiVar.build(), Integer.valueOf(i3));
                }
                return DesugarCollections.unmodifiableMap(h);
            }
        }, erpp.a).g();
    }

    @Override // defpackage.dvmq
    public final ListenableFuture a(long j) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        sb.append("timestamp_ms <= ?");
        arrayList.add(String.valueOf(j));
        return i(efkm.a("clearcut_events_table", sb, arrayList));
    }

    @Override // defpackage.dvmq
    public final ListenableFuture b(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        arrayList.add("signedout");
        return i(dvng.a("clearcut_events_table", arrayList));
    }

    @Override // defpackage.dvmq
    public final ListenableFuture c() {
        return i(efkm.a("clearcut_events_table", new StringBuilder(), new ArrayList()));
    }

    @Override // defpackage.dvmq
    public final ListenableFuture d(final String str) {
        return j(new emwl() { // from class: dvnj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                efko efkoVar = (efko) obj;
                efkoVar.b(" WHERE (account = ?");
                efkoVar.d(dvnm.g(str));
                efkoVar.b(")");
                return null;
            }
        });
    }

    @Override // defpackage.dvmq
    public final ListenableFuture e(evwj evwjVar) {
        final dvph dvphVar = new dvph(evwjVar.c, evwjVar.d, evwjVar.e, this.b.f().toEpochMilli());
        return this.a.d.e(new efkr() { // from class: dvni
            @Override // defpackage.efkr
            public final void a(efks efksVar) {
                ContentValues contentValues = new ContentValues(5);
                contentValues.put("account", dvnm.g(null));
                dvph dvphVar2 = (dvph) dvpj.this;
                contentValues.put("timestamp_ms", Long.valueOf(dvphVar2.d));
                contentValues.put("log_source", Integer.valueOf(dvphVar2.a));
                contentValues.put("event_code", Integer.valueOf(dvphVar2.b));
                contentValues.put("package_name", dvphVar2.c);
                efksVar.c("clearcut_events_table", contentValues, 0);
            }
        });
    }

    @Override // defpackage.dvmq
    public final ListenableFuture f(Iterable iterable) {
        final Iterator it = iterable.iterator();
        return !it.hasNext() ? erqt.i(Collections.EMPTY_MAP) : j(new emwl() { // from class: dvnl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Iterator it2 = it;
                efko efkoVar = (efko) obj;
                if (it2.hasNext()) {
                    efkoVar.b(" WHERE (account = ?");
                    efkoVar.d(dvnm.g(null));
                    efkoVar.b(" AND (");
                    dvnm.h(efkoVar, (evwj) it2.next());
                    while (it2.hasNext()) {
                        efkoVar.b(" OR ");
                        dvnm.h(efkoVar, (evwj) it2.next());
                    }
                    efkoVar.b("))");
                }
                return null;
            }
        });
    }
}
