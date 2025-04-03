package defpackage;

import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.os.Bundle;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cazd extends CursorWrapper {
    final /* synthetic */ cazg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cazd(cazg cazgVar, Cursor cursor) {
        super(cursor);
        this.a = cazgVar;
    }

    public final /* synthetic */ void A() {
        super.close();
    }

    public final /* synthetic */ void B(int i, CharArrayBuffer charArrayBuffer) {
        super.copyStringToBuffer(i, charArrayBuffer);
    }

    public final /* synthetic */ void C(Bundle bundle) {
        super.setExtras(bundle);
    }

    public final /* synthetic */ byte[] D(int i) {
        return super.getBlob(i);
    }

    public final /* synthetic */ String[] E() {
        return super.getColumnNames();
    }

    public final /* synthetic */ Bundle a() {
        return super.getExtras();
    }

    public final /* synthetic */ Boolean b() {
        return Boolean.valueOf(super.isAfterLast());
    }

    public final /* synthetic */ Boolean c() {
        return Boolean.valueOf(super.isBeforeFirst());
    }

    @Override // android.database.CursorWrapper, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.i(new Runnable() { // from class: cayi
            @Override // java.lang.Runnable
            public final void run() {
                cazd.this.A();
            }
        });
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final void copyStringToBuffer(final int i, final CharArrayBuffer charArrayBuffer) {
        this.a.i(new Runnable() { // from class: caym
            @Override // java.lang.Runnable
            public final void run() {
                cazd.this.B(i, charArrayBuffer);
            }
        });
    }

    public final /* synthetic */ Boolean d() {
        return Boolean.valueOf(super.isClosed());
    }

    public final /* synthetic */ Boolean e() {
        return Boolean.valueOf(super.isFirst());
    }

    public final /* synthetic */ Boolean f() {
        return Boolean.valueOf(super.isLast());
    }

    public final /* synthetic */ Boolean g(int i) {
        return Boolean.valueOf(super.isNull(i));
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final byte[] getBlob(final int i) {
        return (byte[]) this.a.f(new Supplier() { // from class: cayw
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.D(i);
            }
        });
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getColumnCount() {
        return ((Integer) this.a.f(new Supplier() { // from class: caya
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.p();
            }
        })).intValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getColumnIndex(final String str) {
        return ((Integer) this.a.f(new Supplier() { // from class: cayf
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.q(str);
            }
        })).intValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getColumnIndexOrThrow(final String str) {
        return ((Integer) this.a.f(new Supplier() { // from class: cayd
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.r(str);
            }
        })).intValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final String getColumnName(final int i) {
        return (String) this.a.f(new Supplier() { // from class: cayv
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.y(i);
            }
        });
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final String[] getColumnNames() {
        return (String[]) this.a.f(new Supplier() { // from class: cayx
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.E();
            }
        });
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getCount() {
        return ((Integer) this.a.f(new Supplier() { // from class: cayj
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.s();
            }
        })).intValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final double getDouble(final int i) {
        return ((Double) this.a.f(new Supplier() { // from class: cayh
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.n(i);
            }
        })).doubleValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final Bundle getExtras() {
        return (Bundle) this.a.f(new Supplier() { // from class: cayc
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.a();
            }
        });
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final float getFloat(final int i) {
        return ((Float) this.a.f(new Supplier() { // from class: cayg
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.o(i);
            }
        })).floatValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getInt(final int i) {
        return ((Integer) this.a.f(new Supplier() { // from class: cayk
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.t(i);
            }
        })).intValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final long getLong(final int i) {
        return ((Long) this.a.f(new Supplier() { // from class: cayo
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.w(i);
            }
        })).longValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getPosition() {
        return ((Integer) this.a.f(new Supplier() { // from class: cayb
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.u();
            }
        })).intValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final short getShort(final int i) {
        return ((Short) this.a.f(new Supplier() { // from class: cayp
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.x(i);
            }
        })).shortValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final String getString(final int i) {
        return (String) this.a.f(new Supplier() { // from class: caxy
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.z(i);
            }
        });
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getType(final int i) {
        return ((Integer) this.a.f(new Supplier() { // from class: cays
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.v(i);
            }
        })).intValue();
    }

    public final /* synthetic */ Boolean h(int i) {
        return Boolean.valueOf(super.move(i));
    }

    public final /* synthetic */ Boolean i() {
        return Boolean.valueOf(super.moveToFirst());
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isAfterLast() {
        return ((Boolean) this.a.f(new Supplier() { // from class: cayl
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.b();
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isBeforeFirst() {
        return ((Boolean) this.a.f(new Supplier() { // from class: cayy
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.c();
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isClosed() {
        return ((Boolean) this.a.f(new Supplier() { // from class: caxz
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.d();
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isFirst() {
        return ((Boolean) this.a.f(new Supplier() { // from class: cayu
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.e();
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isLast() {
        return ((Boolean) this.a.f(new Supplier() { // from class: cayt
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.f();
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isNull(final int i) {
        return ((Boolean) this.a.f(new Supplier() { // from class: cayq
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.g(i);
            }
        })).booleanValue();
    }

    public final /* synthetic */ Boolean j() {
        return Boolean.valueOf(super.moveToLast());
    }

    public final /* synthetic */ Boolean k() {
        return Boolean.valueOf(super.moveToNext());
    }

    public final /* synthetic */ Boolean l(int i) {
        return Boolean.valueOf(super.moveToPosition(i));
    }

    public final /* synthetic */ Boolean m() {
        return Boolean.valueOf(super.moveToPrevious());
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean move(final int i) {
        return ((Boolean) this.a.f(new Supplier() { // from class: caye
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.h(i);
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToFirst() {
        return ((Boolean) this.a.f(new Supplier() { // from class: cayn
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.i();
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToLast() {
        return ((Boolean) this.a.f(new Supplier() { // from class: cazb
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.j();
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToNext() {
        return ((Boolean) this.a.f(new Supplier() { // from class: cazc
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.k();
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPosition(final int i) {
        return ((Boolean) this.a.f(new Supplier() { // from class: cayr
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.l(i);
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPrevious() {
        return ((Boolean) this.a.f(new Supplier() { // from class: cayz
            @Override // java.util.function.Supplier
            public final Object get() {
                return cazd.this.m();
            }
        })).booleanValue();
    }

    public final /* synthetic */ Double n(int i) {
        return Double.valueOf(super.getDouble(i));
    }

    public final /* synthetic */ Float o(int i) {
        return Float.valueOf(super.getFloat(i));
    }

    public final /* synthetic */ Integer p() {
        return Integer.valueOf(super.getColumnCount());
    }

    public final /* synthetic */ Integer q(String str) {
        return Integer.valueOf(super.getColumnIndex(str));
    }

    public final /* synthetic */ Integer r(String str) {
        return Integer.valueOf(super.getColumnIndexOrThrow(str));
    }

    public final /* synthetic */ Integer s() {
        return Integer.valueOf(super.getCount());
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final void setExtras(final Bundle bundle) {
        this.a.i(new Runnable() { // from class: caza
            @Override // java.lang.Runnable
            public final void run() {
                cazd.this.C(bundle);
            }
        });
    }

    public final /* synthetic */ Integer t(int i) {
        return Integer.valueOf(super.getInt(i));
    }

    public final /* synthetic */ Integer u() {
        return Integer.valueOf(super.getPosition());
    }

    public final /* synthetic */ Integer v(int i) {
        return Integer.valueOf(super.getType(i));
    }

    public final /* synthetic */ Long w(int i) {
        return Long.valueOf(super.getLong(i));
    }

    public final /* synthetic */ Short x(int i) {
        return Short.valueOf(super.getShort(i));
    }

    public final /* synthetic */ String y(int i) {
        return super.getColumnName(i);
    }

    public final /* synthetic */ String z(int i) {
        return super.getString(i);
    }
}
