package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbzh {
    public final Executor a;
    public final cfyt b;
    private final ejtr c;

    public dbzh(ejtr ejtrVar, Executor executor, cfyt cfytVar) {
        this.c = ejtrVar;
        this.a = executor;
        this.b = cfytVar;
    }

    public final elfj a(long j, String str, String[] strArr) {
        return new elfj(this.c.b(ContactsContract.Data.CONTENT_URI, strArr, a.a(str, "contact_id=? AND mimetype='", "'"), new String[]{String.valueOf(j)}, null));
    }

    public final elfl b(elfl elflVar) {
        return elflVar.f(Throwable.class, new eroh() { // from class: dbzc
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dbzh dbzhVar = dbzh.this;
                return dbzhVar.b.b((Throwable) obj).h(new emwl() { // from class: dbza
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return enpd.a;
                    }
                }, dbzhVar.a);
            }
        }, this.a);
    }

    public final elfl c(Uri uri) {
        final elfl h = new elfj(this.c.b(uri, new String[]{"_id", "display_name"}, null, null, null)).f(new erow() { // from class: dbzd
            @Override // defpackage.erow
            public final Object a(erpc erpcVar, Object obj) {
                Cursor cursor = (Cursor) obj;
                cursor.getClass();
                cursor.moveToNext();
                return new dbyc(cursor.getLong(0), cursor.getString(1));
            }
        }, this.a).h();
        final elfl i = h.i(new eroh() { // from class: dbze
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                long a = ((dbzg) obj).a();
                dbzh dbzhVar = dbzh.this;
                return dbzhVar.b(dbzhVar.a(a, "vnd.android.cursor.item/phone_v2", new String[]{"data1", "data2", "data3"}).f(new erow() { // from class: dbyz
                    @Override // defpackage.erow
                    public final Object a(erpc erpcVar, Object obj2) {
                        Cursor cursor = (Cursor) obj2;
                        cursor.getClass();
                        enin eninVar = new enin();
                        while (cursor.moveToNext()) {
                            eninVar.c(new dbyd(cursor.getString(0), cursor.getInt(1), cursor.getString(2)));
                        }
                        return eninVar.g();
                    }
                }, dbzhVar.a).h());
            }
        }, this.a);
        final elfl i2 = h.i(new eroh() { // from class: dbzf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                long a = ((dbzg) obj).a();
                dbzh dbzhVar = dbzh.this;
                return dbzhVar.b(dbzhVar.a(a, "vnd.android.cursor.item/email_v2", new String[]{"data1", "data2", "data3"}).f(new erow() { // from class: dbyu
                    @Override // defpackage.erow
                    public final Object a(erpc erpcVar, Object obj2) {
                        Cursor cursor = (Cursor) obj2;
                        cursor.getClass();
                        enin eninVar = new enin();
                        while (cursor.moveToNext()) {
                            eninVar.c(new dbyd(cursor.getString(0), cursor.getInt(1), cursor.getString(2)));
                        }
                        return eninVar.g();
                    }
                }, dbzhVar.a).h());
            }
        }, this.a);
        final elfl i3 = h.i(new eroh() { // from class: dbyn
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                long a = ((dbzg) obj).a();
                dbzh dbzhVar = dbzh.this;
                return dbzhVar.b(dbzhVar.a(a, "vnd.android.cursor.item/postal-address_v2", new String[]{"data1", "data2", "data3"}).f(new erow() { // from class: dbyx
                    @Override // defpackage.erow
                    public final Object a(erpc erpcVar, Object obj2) {
                        Cursor cursor = (Cursor) obj2;
                        cursor.getClass();
                        enin eninVar = new enin();
                        while (cursor.moveToNext()) {
                            eninVar.c(new dbyd(cursor.getString(0), cursor.getInt(1), cursor.getString(2)));
                        }
                        return eninVar.g();
                    }
                }, dbzhVar.a).h());
            }
        }, this.a);
        final elfl i4 = h.i(new eroh() { // from class: dbyo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                long a = ((dbzg) obj).a();
                dbzh dbzhVar = dbzh.this;
                return dbzhVar.b(dbzhVar.a(a, "vnd.android.cursor.item/im", new String[]{"data1", "data5", "data6"}).f(new erow() { // from class: dbym
                    @Override // defpackage.erow
                    public final Object a(erpc erpcVar, Object obj2) {
                        Cursor cursor = (Cursor) obj2;
                        cursor.getClass();
                        enin eninVar = new enin();
                        while (cursor.moveToNext()) {
                            eninVar.c(new dbyd(cursor.getString(0), cursor.getInt(1), cursor.getString(2)));
                        }
                        return eninVar.g();
                    }
                }, dbzhVar.a).h());
            }
        }, this.a);
        final elfl i5 = h.i(new eroh() { // from class: dbyp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                long a = ((dbzg) obj).a();
                dbzh dbzhVar = dbzh.this;
                return dbzhVar.b(dbzhVar.a(a, "vnd.android.cursor.item/organization", new String[]{"data1", "data4"}).f(new erow() { // from class: dbyw
                    @Override // defpackage.erow
                    public final Object a(erpc erpcVar, Object obj2) {
                        Cursor cursor = (Cursor) obj2;
                        cursor.getClass();
                        enin eninVar = new enin();
                        while (cursor.moveToNext()) {
                            eninVar.c(new dbyd(cursor.getString(0), 0, cursor.getString(1)));
                        }
                        return eninVar.g();
                    }
                }, dbzhVar.a).h());
            }
        }, this.a);
        final elfl i6 = h.i(new eroh() { // from class: dbyq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                long a = ((dbzg) obj).a();
                dbzh dbzhVar = dbzh.this;
                return dbzhVar.b(dbzhVar.a(a, "vnd.android.cursor.item/website", new String[]{"data1", "data2", "data3"}).f(new erow() { // from class: dbyv
                    @Override // defpackage.erow
                    public final Object a(erpc erpcVar, Object obj2) {
                        Cursor cursor = (Cursor) obj2;
                        cursor.getClass();
                        enin eninVar = new enin();
                        while (cursor.moveToNext()) {
                            eninVar.c(new dbyd(cursor.getString(0), cursor.getInt(1), cursor.getString(2)));
                        }
                        return eninVar.g();
                    }
                }, dbzhVar.a).h());
            }
        }, this.a);
        final elfl i7 = h.i(new eroh() { // from class: dbyr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                long a = ((dbzg) obj).a();
                dbzh dbzhVar = dbzh.this;
                return dbzhVar.b(dbzhVar.a(a, "vnd.android.cursor.item/contact_event", new String[]{"data1", "data2", "data3"}).f(new erow() { // from class: dbzb
                    @Override // defpackage.erow
                    public final Object a(erpc erpcVar, Object obj2) {
                        Cursor cursor = (Cursor) obj2;
                        cursor.getClass();
                        enin eninVar = new enin();
                        while (cursor.moveToNext()) {
                            eninVar.c(new dbyd(cursor.getString(0), cursor.getInt(1), cursor.getString(2)));
                        }
                        return eninVar.g();
                    }
                }, dbzhVar.a).h());
            }
        }, this.a);
        final elfl i8 = h.i(new eroh() { // from class: dbys
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                long a = ((dbzg) obj).a();
                dbzh dbzhVar = dbzh.this;
                return dbzhVar.b(dbzhVar.a(a, "vnd.android.cursor.item/note", new String[]{"data1"}).f(new erow() { // from class: dbyy
                    @Override // defpackage.erow
                    public final Object a(erpc erpcVar, Object obj2) {
                        Cursor cursor = (Cursor) obj2;
                        cursor.getClass();
                        enin eninVar = new enin();
                        while (cursor.moveToNext()) {
                            eninVar.c(new dbyd(cursor.getString(0), 0, null));
                        }
                        return eninVar.g();
                    }
                }, dbzhVar.a).h());
            }
        }, this.a);
        return elfo.k(i, i2, i3, i4, i5, i6, i7, i8).a(new Callable() { // from class: dbyt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                try {
                    dbzg dbzgVar = (dbzg) erqt.q(elfl.this);
                    elfl elflVar = i;
                    String b = dbzgVar.b();
                    enip enipVar = (enip) erqt.q(elflVar);
                    if (enipVar == null) {
                        throw new NullPointerException("Null phones");
                    }
                    enip enipVar2 = (enip) erqt.q(i2);
                    if (enipVar2 == null) {
                        throw new NullPointerException("Null emails");
                    }
                    enip enipVar3 = (enip) erqt.q(i3);
                    if (enipVar3 == null) {
                        throw new NullPointerException("Null addresses");
                    }
                    enip enipVar4 = (enip) erqt.q(i4);
                    if (enipVar4 == null) {
                        throw new NullPointerException("Null ims");
                    }
                    enip enipVar5 = (enip) erqt.q(i5);
                    if (enipVar5 == null) {
                        throw new NullPointerException("Null organizations");
                    }
                    enip enipVar6 = (enip) erqt.q(i6);
                    if (enipVar6 == null) {
                        throw new NullPointerException("Null websites");
                    }
                    enip enipVar7 = (enip) erqt.q(i7);
                    if (enipVar7 == null) {
                        throw new NullPointerException("Null events");
                    }
                    enip enipVar8 = (enip) erqt.q(i8);
                    if (enipVar8 != null) {
                        return new dbyb(b, enipVar, enipVar2, enipVar3, enipVar4, enipVar5, enipVar6, enipVar7, enipVar8);
                    }
                    throw new NullPointerException("Null notes");
                } catch (ExecutionException unused) {
                    return null;
                }
            }
        }, this.a);
    }
}
