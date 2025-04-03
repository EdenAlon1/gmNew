package defpackage;

import android.database.Cursor;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elji implements ejuh {
    final /* synthetic */ eljl a;

    public elji(eljl eljlVar) {
        this.a = eljlVar;
    }

    @Override // defpackage.ejuh
    public final erph a() {
        eljg eljgVar = this.a.a;
        return new erph(eljgVar.c.b("SELECT rowid, name, start_time, end_time FROM tracing WHERE start_time!=end_time ORDER BY start_time DESC", new String[0]).e(new erow() { // from class: eljc
            @Override // defpackage.erow
            public final Object a(erpc erpcVar, Object obj) {
                Cursor cursor = (Cursor) obj;
                int i = eljg.d;
                int i2 = engw.d;
                engr engrVar = new engr();
                int columnIndexOrThrow = cursor.getColumnIndexOrThrow("rowid");
                int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("name");
                int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("start_time");
                int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("end_time");
                while (cursor.moveToNext()) {
                    eljx createBuilder = eljy.a.createBuilder();
                    int i3 = cursor.getInt(columnIndexOrThrow);
                    createBuilder.copyOnWrite();
                    eljy eljyVar = (eljy) createBuilder.instance;
                    eljyVar.b |= 1;
                    eljyVar.c = i3;
                    String string = cursor.getString(columnIndexOrThrow2);
                    createBuilder.copyOnWrite();
                    eljy eljyVar2 = (eljy) createBuilder.instance;
                    string.getClass();
                    eljyVar2.b |= 2;
                    eljyVar2.d = string;
                    long j = cursor.getLong(columnIndexOrThrow3);
                    createBuilder.copyOnWrite();
                    eljy eljyVar3 = (eljy) createBuilder.instance;
                    eljyVar3.b |= 4;
                    eljyVar3.e = j;
                    long j2 = cursor.getLong(columnIndexOrThrow4);
                    createBuilder.copyOnWrite();
                    eljy eljyVar4 = (eljy) createBuilder.instance;
                    eljyVar4.b |= 8;
                    eljyVar4.f = j2;
                    engrVar.h(createBuilder.build());
                }
                return engrVar.g();
            }
        }, eljgVar.a).g()).e(new erow() { // from class: eljh
            @Override // defpackage.erow
            public final Object a(erpc erpcVar, Object obj) {
                return ejug.a((engw) obj, elji.this.a.b.f());
            }
        }, erpp.a);
    }

    @Override // defpackage.ejuh
    public final ListenableFuture b() {
        Runtime.getRuntime().gc();
        Runtime.getRuntime().runFinalization();
        return erqt.i(null);
    }

    @Override // defpackage.ejuh
    public final /* synthetic */ Object c() {
        return "DebugTraceRow";
    }
}
