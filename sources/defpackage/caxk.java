package defpackage;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.sqlite.SQLiteDiskIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class caxk extends CursorWrapper {
    final /* synthetic */ caxl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public caxk(caxl caxlVar, Cursor cursor) {
        super(cursor);
        this.a = caxlVar;
    }

    private final Object a(emyl emylVar) {
        int i;
        SQLiteDiskIOException sQLiteDiskIOException = null;
        int i2 = 0;
        while (true) {
            try {
                Object obj = emylVar.get();
                if (i2 > 0) {
                    ((akzt) this.a.e.b()).e("Bugle.Datamodel.CursorDiskIOExceptionRecovery.Counts", i2);
                }
                return obj;
            } catch (SQLiteDiskIOException e) {
                if (sQLiteDiskIOException != null) {
                    e.addSuppressed(sQLiteDiskIOException);
                }
                caxl.a.s("got SQLiteDiskIOException", e);
                if (i2 == 0) {
                    ((akzt) this.a.e.b()).c("Bugle.Datamodel.CursorDiskIOException.Counts");
                    i = 0;
                    i2 = 0;
                } else {
                    i = i2;
                }
                if (i2 >= ((Integer) ((cfup) caxl.b.get()).e()).intValue()) {
                    throw new IllegalStateException("unable to perform cursor operation", e);
                }
                ersn.c(((Long) ((cfup) caxl.c.get()).e()).longValue(), TimeUnit.MILLISECONDS);
                i2 = i + 1;
                sQLiteDiskIOException = e;
            }
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final void deactivate() {
        throw new IllegalStateException("deactivate is deprecated");
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getCount() {
        return ((Integer) a(new emyl() { // from class: caxi
            @Override // defpackage.emyl
            public final Object get() {
                return Integer.valueOf(caxk.this.getWrappedCursor().getCount());
            }
        })).intValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getPosition() {
        return ((Integer) a(new emyl() { // from class: caxg
            @Override // defpackage.emyl
            public final Object get() {
                return Integer.valueOf(caxk.this.getWrappedCursor().getPosition());
            }
        })).intValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isAfterLast() {
        return ((Boolean) a(new emyl() { // from class: caxf
            @Override // defpackage.emyl
            public final Object get() {
                return Boolean.valueOf(caxk.this.getWrappedCursor().isAfterLast());
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isBeforeFirst() {
        return ((Boolean) a(new emyl() { // from class: caxj
            @Override // defpackage.emyl
            public final Object get() {
                return Boolean.valueOf(caxk.this.getWrappedCursor().isBeforeFirst());
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isFirst() {
        return ((Boolean) a(new emyl() { // from class: caxb
            @Override // defpackage.emyl
            public final Object get() {
                return Boolean.valueOf(caxk.this.getWrappedCursor().isFirst());
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isLast() {
        return ((Boolean) a(new emyl() { // from class: caxc
            @Override // defpackage.emyl
            public final Object get() {
                return Boolean.valueOf(caxk.this.getWrappedCursor().isLast());
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToFirst() {
        return ((Boolean) a(new emyl() { // from class: caxh
            @Override // defpackage.emyl
            public final Object get() {
                return Boolean.valueOf(caxk.this.getWrappedCursor().moveToFirst());
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToLast() {
        return ((Boolean) a(new emyl() { // from class: caxe
            @Override // defpackage.emyl
            public final Object get() {
                return Boolean.valueOf(caxk.this.getWrappedCursor().moveToLast());
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPosition(final int i) {
        return ((Boolean) a(new emyl() { // from class: caxd
            @Override // defpackage.emyl
            public final Object get() {
                return Boolean.valueOf(caxk.this.getWrappedCursor().moveToPosition(i));
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean requery() {
        throw new IllegalStateException("requery is deprecated");
    }
}
