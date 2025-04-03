package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvob implements dvmx {
    private final dvna a;

    public dvob(dvna dvnaVar) {
        this.a = dvnaVar;
    }

    public static final void f(efko efkoVar, ewan ewanVar) {
        efkoVar.b("(node_id = ?");
        efkoVar.d(String.valueOf(enjk.j(ewanVar.c)));
        efkoVar.b(" AND action = ?)");
        ewal b = ewal.b(ewanVar.d);
        if (b == null) {
            b = ewal.UNKNOWN;
        }
        efkoVar.d(String.valueOf(b.e));
    }

    public static final String g(String str) {
        return str != null ? str : "signedout";
    }

    private final ListenableFuture h(final efkl efklVar) {
        return this.a.d.d(new efkq() { // from class: dvnz
            @Override // defpackage.efkq
            public final Object a(efks efksVar) {
                return Integer.valueOf(efksVar.a(efkl.this));
            }
        });
    }

    private final ListenableFuture i(emwl emwlVar) {
        efko efkoVar = new efko();
        efkoVar.b("SELECT node_id_path,action, COUNT(*) as event_count");
        efkoVar.b(" FROM visual_element_events_table");
        efkoVar.b(" GROUP BY node_id_path,action");
        return this.a.d.a(efkoVar.a()).e(new erow() { // from class: dvny
            @Override // defpackage.erow
            public final Object a(erpc erpcVar, Object obj) {
                Cursor cursor = (Cursor) obj;
                enhd enhdVar = new enhd();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(cursor.getColumnIndexOrThrow("node_id_path"));
                    int i = cursor.getInt(cursor.getColumnIndexOrThrow(GroupManagementRequest.ACTION_TAG));
                    int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("event_count"));
                    ewam ewamVar = (ewam) ewan.a.createBuilder();
                    ewal b = ewal.b(i);
                    ewamVar.copyOnWrite();
                    ewan ewanVar = (ewan) ewamVar.instance;
                    ewanVar.d = b.e;
                    ewanVar.b |= 1;
                    String[] split = TextUtils.split(string, ",");
                    ArrayList arrayList = new ArrayList();
                    for (String str : split) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(str)));
                    }
                    ewamVar.a(arrayList);
                    enhdVar.k((ewan) ewamVar.build(), Integer.valueOf(i2));
                }
                return enhdVar.c();
            }
        }, erpp.a).g();
    }

    @Override // defpackage.dvmx
    public final ListenableFuture a(long j) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        sb.append("timestamp_ms <= ?");
        arrayList.add(String.valueOf(j));
        return h(efkm.a("visual_element_events_table", sb, arrayList));
    }

    @Override // defpackage.dvmx
    public final ListenableFuture b(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        arrayList.add("signedout");
        return h(dvng.a("visual_element_events_table", arrayList));
    }

    @Override // defpackage.dvmx
    public final ListenableFuture c() {
        return h(efkm.a("visual_element_events_table", new StringBuilder(), new ArrayList()));
    }

    @Override // defpackage.dvmx
    public final ListenableFuture d(final String str) {
        return i(new emwl() { // from class: dvoa
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                efko efkoVar = (efko) obj;
                efkoVar.b(" WHERE (account = ?");
                efkoVar.d(dvob.g(str));
                efkoVar.b(")");
                return null;
            }
        });
    }

    @Override // defpackage.dvmx
    public final ListenableFuture e(Iterable iterable) {
        final Iterator it = iterable.iterator();
        return !it.hasNext() ? erqt.i(enoz.a) : i(new emwl() { // from class: dvnx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Iterator it2 = it;
                efko efkoVar = (efko) obj;
                if (it2.hasNext()) {
                    efkoVar.b(" WHERE (account = ?");
                    efkoVar.d(dvob.g(null));
                    efkoVar.b(" AND (");
                    dvob.f(efkoVar, (ewan) it2.next());
                    while (it2.hasNext()) {
                        efkoVar.b(" OR ");
                        dvob.f(efkoVar, (ewan) it2.next());
                    }
                    efkoVar.b("))");
                }
                return null;
            }
        });
    }
}
